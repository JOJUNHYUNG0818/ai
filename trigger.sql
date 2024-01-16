use sqldb;
create table cUserTbl
as
select * from usertbl;

select* from cusertbl;

alter table cusertbl
	add column years int;
-- 요구사항 mDate를 이용해서 근무년수를 구하는 함수를 만들기
drop function if exists userFun3;
delimiter $$
create function userFun3 ( _mDate date)
	returns int
begin
	declare mDate int;
    set mDate = year(curdate())-year(_mDate);
		return mDate;
	end $$
delimiter ;

select mdate into @mDate from cusertbl where userid = 'KBS';
 
select userFun3(@mDate) into @years;
select @years;


update cUsertbl set years = @years where userID ='EJW';


-- 3) cursor 반복처리
-- 포인터: 가르키다. 자동으로 한행을 읽으면 아래(다음)로 내려간다.
-- 파일 시작 BOF : begin of File , EOF : end of file
-- 처리 순서 
-- 1단계) 파일을 연다.
-- 2단계) 파일을 읽는다 $행단위로 읽는다.
-- 3단계) 파일 끝.
-- 4단계) 파일을 닫는다.

/* 커서 형식
delimiter $$
	create procedure cursorProc()
    begin
		-- 변수 선언
        -- 커서 선언
        -- 반복 조건
        -- 커서 열기
        -- 반복문
        -- 결과 출력
        -- 커서 닫기
    end$$
delimiter ;
*/

-- 고객의 평균키를 구하는 프로시저 커서 이용하기
delimiter $$
	create procedure cursorProc()
    begin
		-- 변수 선언
        declare userHeight int;
        declare cnt int default 0;
        declare totalHeight int default 0;
        declare endOfRow boolean default false; -- 행의 끝 여부
        
        -- 커서 선언
        declare userCuror cursor for
        select height from usertbl;
        
        -- 반복 조건
        declare continue handler 
			for not found set endofrow = true;

        -- 커서 열기
        open usercuror;
        
        -- 반복문
        cursor_loop:LOOP
			fetch usercuror into userHeight;
            
            if endofrow then
				leave cursor_loop;
			End if;
            
            set cnt = cnt +1;
            set totalHeight = totalHeight+ userHeight;
		end loop cursor_loop;
        
		-- 결과 출력
        select concat('고객 키의 평균==> ',(totalheight/cnt));
        
        -- 커서 닫기
        close usercuror;
    end$$
delimiter ;

call cursorProc();

use sqldb;

create table rankUt
as
select * from usertbl;
alter table rankUt
	add column r1 varchar(10); -- 컬럼추가하기
    
select *from rankut;

delimiter $$
	create procedure gradeProc()
    begin
		-- 변수 선언
        declare id varchar(10);
        declare hap bigint;
        declare usergrade char(20);
        declare endofrow  boolean default false;
        -- 커서 선언
        declare userCursor cursor for 
			select u.userid, sum(b.price*b.amount)
            from buytbl b
				right outer join rankUt u
                on b.userid = u.userid
			group by u.userid , u.name;
            
        -- 반복 조건
        declare continue handler 
			for not found set endofrow = true;
        -- 커서 열기
        open userCursor;
          -- 반복문
        grade_loop:LOOP
        fetch userCursor into id , hap;
        if endofrow then
			leave grade_loop;
		end if;
		
        case
			when (hap>=1500)then set usergrade = '최우수고객';
            when (hap>=1000)then set usergrade = '우수고객';
            when (hap>=1)then set usergrade = '일반고객';
            else set usergrade = '유령고객';
		end case;
        
        -- 결과 출력
        update rankUt set r1 = usergrade where userid = id;
        end Loop grade_loop;
        -- 커서 닫기
        close userCursor;
    end$$
delimiter ;

call gradeProc();
select * from rankut;

-- 4) 트리거
-- 예) 사원테이블 삽입된 이후에 기본적인 인적사항이 자동 사입되면 좋겠다. 급여가 지급된 후에 세금 테이블에 자동 저장
-- 사용은  insert, update, delete 용으로
-- 직접 실행은 안됨 이벤트가 발생했을 때 자동 실행 됨

create database if not exists testDB;
use testdb;
drop table testtbl;
create table if not exists testtbl (id int , txt varchar(10));
insert into testtbl values(1,'레드벨벳');
insert into testtbl values(2,'잇지');
insert into testtbl values(3,'블랙핑크');

select * from testtbl;

drop trigger if exists testTrg; 
delimiter //
create trigger testTrg -- 트리거 만들기
	after delete  -- 
    on testTbl	  -- 트리거 적용할 요소
    for each row  --
begin
	set @msg = '가수 그룹이 삭제됨'; -- 트리거의 처리 내용
end//
delimiter ;

set @msg = '';
insert into testtbl values(4,'마마무');
select @msg;
update testtbl set txt = '블핑' where id =3;
select @msg;
delete from testtbl where id =4;
select @msg;

-- ------------------
-- 요구사항 : 회원테이블에서 update, delete 시도하면,
--          수정된 또는 삭제된 테이블을 별도의 테이블에 보관하고 변경일자, 변경한 사람을 기록하자.
use sqldb;
select * from backup_userTbl;

drop table backup_userTbl;
-- 트리거 테이블 생성
create table backup_userTbl
(
  userID     CHAR(8) NOT NULL PRIMARY KEY, -- 사용자 아이디(PK)
  name       VARCHAR(10) NOT NULL, -- 이름
  birthYear   INT NOT NULL,  -- 출생년도
  addr        CHAR(2) NOT NULL, -- 지역(경기,서울,경남 식으로 2글자만입력)
  mobile1   CHAR(3), -- 휴대폰의 국번(011, 016, 017, 018, 019, 010 등)
  mobile2   CHAR(8), -- 휴대폰의 나머지 전화번호(하이픈제외)
  height       SMALLINT,  -- 키
  mDate       DATE,  -- 회원 가입일
  modType char(2),
  modDate date,
  modUser varchar(256)
);

drop trigger if exists but;
-- 트리거 (수정) 작성하기
delimiter //
create trigger but
	after update
    on usertbl
    for each row 
begin
    insert into backup_userTbl values (OLD.userID,OLD.name,OLD.birthYear,
							OLD.addr,OLD.mobile1,OLD.mobile2,OLD.height,OLD.mDate,
                            '수정', curdate(), current_user() );
end //
delimiter ;

-- 트리거 (삭제) 작성하기
delimiter //
create trigger bud
	after delete
	on usertbl
    for each row
begin
	insert into backup_userTbl values(OLD.userID,OLD.name,OLD.birthYear,
							OLD.addr,OLD.mobile1,OLD.mobile2,OLD.height,OLD.mDate,
                            '삭제', curdate(), current_user() );
	end // 
delimiter ;

update usertbl set birthYear = 1977 where userid='BBK';
select * from backup_userTbl;
update usertbl set addr = '몽고' where userid = 'JKW';
delete from usertbl where userid = 'YJS';

drop trigger if exists uti;
-- 삽입후에 경고 오류 발생시키고 메세지 띄우기
delimiter //
create trigger uti
	after insert
	on usertbl
    for each row
begin
	signal sqlstate '45000' -- 강제 오류실행
		set message_text = '데이터의 입력을 시도했습니다. 귀하의 정보가 서버에 기록되었습니다.';
	end // 
delimiter ;	

insert into usertbl values('ABC','에비씨',1977,'서울','011','1111111',181,'2019-12-25');

-- Before 트리거
-- OLD는 변경되기전 자료, NEW 변경되고 난 후 자료
-- 요구사항 입력할 때 생일 잘못 입력되지 않도록 1900이전 입력이면 0 입력 또는 올해 년도보다 이후의 년도 입력 되었으면 0 입력
drop trigger if exists ubi;
delimiter // 
create trigger ubi
	before insert
    on usertbl
    for each row
begin
	if new.birthyear <1900 then
		set new.birthyear = 0;
	elseif new.birthyear > year(curdate())then
		set new.birthyear = year(curdate());
	end if ; 
    
end //
delimiter ;

insert into usertbl values('AAA','에이',1877,'서울','011','1112222',181,'2022-12-25');
insert into usertbl values('BBB','비비',2877,'경기','011','1113333',185,'2021-03-11');
select * from usertbl;

-- 주소가 '평양' 이면 '간첩'
-- 전화번호가 '9999'입력되면 '010'으로 입력
drop trigger if exists ubi2;
delimiter // 
create trigger ubi2
	before insert
    on usertbl
    for each row
begin
	if new.addr='평양' then
		set new.addr = '간첩';
	elseif new.mobile1 = '99'then
		set new.mobile1 = '010';
    
	end if ; 
    
end //
delimiter ;
insert into usertbl values('CCC','씨씨',1947,'평양','99','1112222',181,'2022-12-25');
select * from usertbl;

show triggers from sqldb;

drop database if exists triggerdb;
create database if not exists triggerdb;
use triggerdb;

-- 구매 테이블
create table ordertbl(
	orderNo int auto_increment primary key,
    userid varchar(5),
    prodName varchar(5),
    orderamount int);

-- 물품 테이블
select*from prodtbl;
create table prodtbl(
	prodName varchar(5),
    account int
);

drop table delibertbl;
-- 배송 테이블
create table delivertbl(
	deliberNo int auto_increment primary key,
    prodName varchar(5),
    account int);

-- 물품테이블에 물건을 삽입하기
insert into prodtbl values('사과',100);
insert into prodtbl values('배',100);
insert into prodtbl values('귤',100);

-- 물품 테이블에서 개수를 감소시크는 트리거
drop trigger ordertg; 
delimiter //
	create trigger ordertg
	after insert
    on ordertbl
    for each row
begin
	update prodtbl set account = account -new.orderamount
			where prodName = new.prodName;
end //
delimiter ;

drop trigger prodtg;
-- 배송 테이블에 새 배송 건을 입력하는 트리거
delimiter //
	create trigger prodtg
	after update
    on prodtbl
    for each row
begin
	declare orderAmount int;
    set orderAmount = OLD.account - NEW.account;
    insert into delivertbl(prodName, account)
		values (NEW.prodName, orderAmount);
end //
delimiter ;

select * from ordertbl;
select * from prodtbl;

insert into ordertbl values (null , 'JOHN', '배',5);
insert into ordertbl values (null , 'DANG', '사과',9);

