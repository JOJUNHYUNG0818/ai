use sqldb;
select * from usertbl;
select * from buytbl;

select userid, name from usertbl
union all
select userid,prodName from buytbl; -- 열의 개수가 같아야한다. (중복포함)

select userid, name from usertbl
union 
select userid,prodName from buytbl; -- (중복된건 1개만)

-- null 인사람 출력
select name  from usertbl where mobile1 is null;

-- null 이 아닌사람 출력
select  mobile1, mobile2 , name from usertbl where mobile1 is not null;

-- SQL 구문을 프로그래밍처럼 만들 수 있다.
drop procedure if exists ifProc;
-- 스트어드 프로스저
delimiter $$
create procedure ifProc()
begin
	declare var1 int;
    set var1 = 100;
    if var1 = 100 then 
		select '100입니다';
	else
		select '아닙니다';
	end if;
end$$
delimiter ;
call ifProc();

select * from employees;
drop procedure if exists ifProc2;
use employees;

delimiter $$
create procedure ifProc2()
begin
	declare hiredate date;
    declare cur_date date;
    declare days int;
    select hire_date into hiredate
		from employees.employees
        where emp_no =1005;
        
	set cur_date = current_date();
    set days = datediff(cur_date, hiredate);
    
    if (days/365) >= 5 then
			select concat('입사한지', days ,'일이나 지났습니다. 축하합니다!');
	else
			select concat('입사한지' , days , '일밖에 안되었네요.');
	end if;
end $$
delimiter ;

call ifProc2();

drop procedure if exists ifProc3;

delimiter $$
create procedure ifProc3()
begin
	declare point int;
    declare credit char(1);
    set point = 77;
    
    if point >=90 then
			set credit = 'A';
	elseif point >=80 then
			set credit = 'B';
	elseif point >=80 then
			set credit = 'C';
	elseif point >=80 then
			set credit = 'D';
	else	
			set credit = 'F';
	end if;
    select concat('취득점수==>', point), concat('학점==>', credit);
end $$
delimiter ;
call ifproc3();

drop procedure if exists caseProc;

delimiter $$
create procedure caseProc()
begin
	declare point int;
    declare credit char(1);
    set point = 77;
    
    case
		when point >=90 then
			set credit = 'A';
		when point >=80 then
			set credit = 'B';
		when point >=80 then
			set credit = 'C';
		when point >=80 then
			set credit = 'D';
		else	
			set credit = 'F';
	end case;
    select concat('취득점수==>', point), concat('학점==>', credit);
end $$
delimiter ;
call caseProc();

use sqldb;
select * from usertbl;

create view vuser
as
select * from usertbl;

select * from vuser;

-- 뷰 사용하는 이유 ? 1. 보안 2. 복잡한 쿼리문 단수화 시키기
create view v1
as
	select u.userid as 'user id', u.name 'user name', b.prodName as 'product Name'	
		from usertbl u
		inner join buytbl b
        on u.userid = b.userid ;

select * from v1 ;
    
select `user id`, `user name`, `product name` from v1 where `user id` = "KBS"; -- 백틱 ~키와 같이 있는 것

-- view 를 수정하기
alter view v1
as
	select
		u.name as 'name', u.addr as 'addr', concat_ws('-',u.mobile1,u.mobile2) as 'tel'
    from usertbl u 
		inner join buytbl b
        on u.userid = b.userid;

select * from v1;
select name,tel from v1;

create or replace view v1
as 
	select name, birthyear from usertbl where name = '김범수';

select* from v1;

-- 뷰 삽입
create table cUsertbl
as
select * from usertbl;

create or replace view v2
as
select userid, name, birthyear, addr , height from cUsertbl;

-- view 에 먼저 놓고 원래 테이블 확인
select * from v2; -- 뷰에는 삽입이 된다
insert into v2 values('HKD','홍길동',2020,'서울',175);
select * from cusertbl; -- 기존 테이블에도 삽입이 된다

-- 테이블에 먼저 삽입후 view 확인
insert into cusertbl (userid,name,birthyear,addr)
	values("ADM",'관리자',2021,'인천');

-- 뷰 수정
update v2 set birthyear = 2019 where  name = '홍길동'; -- 가능 (삽입이랑 같은결과)

-- 뷰 삭제 
delete from v2 where name = '관리자'; -- 가능 (삽입이랑 같은결과)

-- 뷰 삭제 
drop view v2;

-- ---------------------------
-- 테이블스페이스: 물리적 공간
-- DBA 데이터베이스 관리 - 서버계정, 공간할당

-- ----------------
-- 인덱스
-- 자료를 찾을 때 색인표 붙여 두는 것
-- 목적 빠르게 검색하기위함
-- B-tree

-- 장점 : 검색 속도 빠르다. 시스템의 성능이 향상된다.
-- 단점 : 추가적인 공간이 필요해짐, 처음인덱스 생성시 시간이 오래걸림, 데이터변경이 번거로움

-- 인덱스를 생성해야하는 경우
-- 인덱스는 열단위에 생성한다
-- where 절에서 사용 되는 열에 인덱스를 만들어야 한다
-- 자주 사용하는 열에 생성한다
-- 조인을 자주하는 열에 생성한다

-- primary key, unique 지정한 열은 자동으로 인덱스 처리됨

-- 스토어드 프로그램
-- 고급 SQL문 상위레벨

-- 종류 : 1. 스토어드 프로시저 2. 스토어드 함수 3. 커서 4. 트리거
/* 1. 스토어드 프로시저 형식
delimiter $$
	create procedure 이름 (입력 또는 출력 파라미터 (매개변수))
	begin
		 내용
    end $$
delimiter ;
call 이름 (실제값);
*/
drop procedure if exists p2;

delimiter $$
create procedure p1()
	begin
		select * from usertbl;
    end$$
delimiter ;

call p1();

-- -------------

delimiter $$
create procedure p2(in birth int, in h int )
	begin
		select * from usertbl where birthyear >= birth and height >=h ;
    end$$
delimiter ;

call p2(1973,170);

select * from usertbl;
select * from testtbl;

create table testtbl
	(id int auto_increment primary key, name char(10));
insert into testtbl values(null,'홍길동');

delimiter $$
create procedure p4(in inVar varchar(10), out outVar int)
	begin
		insert into testTbl values(null,inVar);
        select count(id) into outVar from testtbl;
    end$$
delimiter ;

drop procedure p4;

call p2(1973,170);
call p4('이순신',@countVar);
select @countVar;
select*from testtbl;

drop procedure ifelseProc;

delimiter $$
create procedure ifelseProc(
	in userName varchar(10),
    out bYear int
)
begin
    select birthYear into bYear from usertbl
		where name = userName;
        if(bYear >= 1980) then
			select '아직 젊다';
		else 
			select '나이가 지긋';
		end if;
end $$
delimiter ;
select * from usertbl;
call ifelseProc('조용필',@yearOut);
select @yearOut;