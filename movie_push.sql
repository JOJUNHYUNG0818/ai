-- ---------------------261 대용량 파일 처리하기 - 파일 올리고(업로드) 내리기(다운로드)
create database moviedb;
create table movietbl
(	movie_id int,
	movie_title varchar(30),
    movie_director varchar(20),
    movie_star varchar(20),
    movie_script longtext,
    movie_film longblob
) default charset = utf8mb4;

insert into movietbl values(1,'쉰들러 리스트','스필버그','리암 니슨',
							load_file('D:\ai\study\temp\Schindler.txt'),
                            load_file('D:\ai\study\temp\Schindler.mp4')
);

select * from movietbl;
show variables like 'max_allowed_packet';
show variables like 'secure_file_priv'; -- mysql 이 지정한경로

truncate movietbl;
insert into movietbl values(1,'쉰들러 리스트','스필버그','리암 니슨',
							load_file('D:/ai/study/temp/Schindler.txt'),
                            load_file('D:/ai/study/temp/Schindler.mp4')
);

select * from movietbl;

-- 내려받기 데이터베이스 --> 개인 컴퓨터로 다운로드 
-- 1단계 내릴 txt 확인하기
select movie_script from movietbl where movie_id = 1;
-- 2단계 txt 내리기
select movie_script from movietbl where movie_id = 1
into outfile 'D:/ai/study/temp/Schindler_copy.txt'
lines terminated by '\\n';

-- 1단계 내릴 영상확인
select movie_film from movietbl where movie_id = 1;
-- 2단계 영상 내리기
select movie_film from movietbl where movie_id = 1
into outfile 'D:/ai/study/temp/Schindler_copy.mp4';

-- 피벗의 구현
use sqldb;
drop table pivotTest;
create table pivotTest
(
	uName char(3),
    season char(2),
    amount int
);

insert into pivotTest values('김범수','겨울',10), ('윤종신','여름',11),('김범수','가을',11),('윤종신','봄',12),
('김범수','겨울',16),('윤종신','가을',13),('김범수','여름',20),('김범수','봄',19);
select * from pivotTest;
-- 피벗 : 함수 상용해서 보기 편하게 만들기
select uname '이름', sum(if(season='봄', amount,0)) '봄', 
				  sum(if(season='여름', amount,0)) '여름',
                  sum(if(season='가을', amount,0)) '가을', 
                  sum(if(season='겨울', amount,0)) '겨울', 
                  sum(amount) '합계'
from pivotTest group by uname;

create table pivotTest2
(
	uName char(3),
    season char(2),
    amount int
);

insert into pivotTest2 values('김범수','겨울',10), ('윤종신','여름',11),('김범수','가을',11),('윤종신','봄',12),
('김범수','겨울',16),('윤종신','가을',13),('김범수','여름',20),('김범수','봄',19);

select season '계절', sum(if(uname='김범수', amount,0)) '김범수', 
				  sum(if(uname='윤종신', amount,0)) '윤종신',
                  sum(amount) '합계'
from pivotTest2 group by season;

-- json 파일 처리
-- 1. json 만들기
-- json.array()
select json_array(1,"abc",NULL,true,curtime()); -- []배열 , 리스트
-- json_object()
select json_object("score",87,"name","hong","age",25);
set @jsonData = json_object("score",87,"name","hong","age",25);
select @jsonData;

select * from usertbl;
-- 키 userid, addr 값 json을 만들기
select json_object(userid,addr)from usertbl;

-- 키 userid,
-- 외부로 내보내기 json 파일로 만들기
select json_object(userid,json_array(mobile1,mobile2))from usertbl
into outfile 'D:/ai/study/temp/jsonOutput.json';

-- 자료형이 json 인지 판단하기
-- json_vaild()
set @jsondata = json_object("score",87,"name","hong","age",25);
select json_vaild(@jsondata);

select
	if( json_vaild(@jsondata) =1,
		'json자료다',
        'json자료가 아니다.'
        )
;

-- json 자료안에 값을 검색하기
set @j = '["abc",[{"k":"10"}, "def"], {"x1":"abc1"},{"x2":"abc2"},{"x5":"abc5"},{"y":"bcd"}]';

select json_search(@j,'all','abc5');

-- json extract
SELECT JSON_EXTRACT('[10, 20, [30, 40]]', '$[2][1]'); -- 

-- json insert
SET @j = '{ "a": 1, "b": [2, 3]}';
SELECT JSON_INSERT(@j, '$.a', 10, '$.c', '[true, false]');  -- 키가 있을때는 사입x 없을때만 삽입 $=키값
select @j;

-- json replace
SELECT JSON_REPLACE(@j, '$.a', 10, '$.c', '[true, false]'); -- 키가있는것만 교체
select* from  usertbl;
select * from buytbl;

-- json join 
select usertbl.name, buytbl.prodname from usertbl 
	inner join buytbl
    on usertbl.userid = buytbl.userid
    where birthyear between 1970 and 1980 order by usertbl.name ;

create table stdtbl
( stdName varchar(10) not null primary key,
addr char(4)not null
);

create table clubtbl
( 
	clubName varchar(10) not null primary key,
    roomNo char(4) not null
);
drop table clubtbl;
create table stdclubtbl
(	num int auto_increment not null primary key,
	stdName varchar(10) not null,
    clubName varchar(10) not null,
	foreign key(stdName) references stdtbl(stdName),
    foreign key(clubName) references clubtbl(clubName)
);
select *from stdclubtbl;
insert into stdtbl values('김범수','경남'),('성시경','서울'),('조용필','경기'),('은지원','경북'),('바비킴','서울');
insert into clubtbl values('수영','101호'),('바둑','102호'),('축구','103호'),('봉사','104호');
insert into stdclubtbl values(null,'김범수','바둑'),(null,'김범수','축구'),(null,'조용필','축구'),
							(null,'은지원','축구'),(null,'은지원','봉사'),(null,'바비킴','봉사');

select * from stdclubtbl;
-- 1. 요구사항 학생을 기준으로 학생이름, 지역 ,가입한 동아리, 동아리방 보기
select s.stdName, s.addr, c.clubName,c.roomNo
from stdtbl s
	inner join stdclubtbl sc
    on s.stdName = sc.stdName
    inner join clubtbl c
    on sc.clubName = c.clubName;
    
-- 2. 요구사항 축구를 선택하신 분의 이름과 지역은?
select s.stdName, s.addr
from stdtbl s
	inner join stdclubtbl sc
    on s.stdName = sc.stdName
    where clubName = '축구';
    
-- 3. 은지원이 선택한 동아리와 동아리방
select c.clubName, c.roomNo
from clubtbl c
	inner join stdclubtbl sc
    on c.clubName = sc.clubName
    where sc.stdName='은지원';
    
-- 4. 서울 지역에 사는 사람이 선택한 동아리명은?
select sc.clubName
from stdtbl s
		inner join stdclubtbl sc
        on s.stdName = sc.stdName
        where addr = '서울';

-- 5 101호와 102호를 사용하는 사람들의 이름 구하기
select sc.stdName
from clubtbl c
	inner join stdclubtbl sc
    on c.clubName = sc.clubName
    where roomNo = '101호' or  roomNo ='102호';

-- outer join
select *
from stdtbl s
	left outer join stdclubtbl sc
    on s.stdName = sc.stdName; -- 왼쪽것이 다나옴
-- 비교
select *
from stdtbl s
	inner join stdclubtbl sc
    on s.stdName = sc.stdName; -- 일반 inner
    
select *
from stdtbl s
	right outer join stdclubtbl sc
    on s.stdName = sc.stdName; -- 오른쪽것이 다나옴

-- cross join 
select * from stdtbl, stdclubtbl , clubtbl;

select * from stdtbl
	cross join stdclubtbl
    cross join clubtbl; -- 위에꺼랑 같음

-- self join
USE sqldb;
CREATE TABLE empTbl (emp CHAR(3), manager CHAR(3), empTel VARCHAR(8));

INSERT INTO empTbl VALUES('나사장',NULL,'0000');
INSERT INTO empTbl VALUES('김재무','나사장','2222');
INSERT INTO empTbl VALUES('김부장','김재무','2222-1');
INSERT INTO empTbl VALUES('이부장','김재무','2222-2');
INSERT INTO empTbl VALUES('우대리','이부장','2222-2-1');
INSERT INTO empTbl VALUES('지사원','이부장','2222-2-2');
INSERT INTO empTbl VALUES('이영업','나사장','1111');
INSERT INTO empTbl VALUES('한과장','이영업','1111-1');
INSERT INTO empTbl VALUES('최정보','나사장','3333');
INSERT INTO empTbl VALUES('윤차장','최정보','3333-1');
INSERT INTO empTbl VALUES('이주임','윤차장','3333-1-1');

select*
from emptbl e 
	inner join emptbl e1
    on e.manager = e1.emp
    where e.emp= '우대리';

-- 이주임의 매니저의 매니저
select*
from emptbl e 
	inner join emptbl e1
    on e.manager = e1.emp
    where e.emp= '이주임';

-- 이주임의 매니저의 매니저의 전화번호
-- self join을 2단계한다.
select e2.emptel
from emptbl e 
	inner join emptbl e1
    on e.manager = e1.emp
    inner join emptbl e2
    on e1.manager = e2.emp
    where e.emp= '이주임';