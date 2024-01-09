use sqldb;
select * from usertbl;
select * from buytbl;

select * from usertbl where userID in ('bbk','jkw');
select * from usertbl where name like '김%';
select * from usertbl where name='김경호';
select * from usertbl where height>=177;
-- 합치기 [주쿼리 (서브쿼리)]
select * from usertbl where height>=(select height from usertbl where name='김경호');
-- 은지원 생일보다 나이가 어린사람
select * from usertbl where birthYear>=(select birthYear from usertbl where name='은지원');

select * from buytbl where groupName=(select groupName from buytbl where prodName='노트북');

select prodName from buytbl where userID =(select userID from usertbl where name = '김범수');

select * from usertbl where addr = '서울';
select * from usertbl where height <=any(select height from usertbl where addr = '서울');
-- any = 또는  
select * from usertbl where height <=all(select height from usertbl where addr = '서울');
-- all = and 
select * from usertbl where height <=some(select height from usertbl where addr = '서울');
-- some 또는  (any)랑같음
select * from usertbl where userID = any(select userID from buytbl where prodName = '운동화');

-- 키가 가장 큰사람 3명
select * from usertbl order by height desc limit 3;
-- 나이가 제일 많은 사람 5명
select * from usertbl order by birthYear asc limit 5;

-- 테이블 만들기 (usertbl과 동일한 테이블 만들기)
create table usertbl2 (select * from usertbl);
select * from usertbl2;

create table usertblSeoul(select * from usertbl where addr = '서울');
create table chosetbl(select userID, name, height from usertbl2 where height between 175 and 180);
select * from chosetbl;
-- 단 제약조건(pk,fk)은 만들어 지지 않는다.

-- group by 절
select userid, amount from buytbl order by userid;
select userid, sum(amount) , avg(amount), count(amount), max(amount), std(amount) from buytbl group by userid;
-- 총구매액이 1000원 이상의 사람의 사용자명과, 총구매액 구하기
select userid, sum(price) from buytbl group by userID having sum(price)>=300;
create table eventTbl(select userid, mobile1,mobile2,addr from usertbl 
						where userid = any(select userid from buytbl group by userid having sum(price)>=300));
select groupName, sum(amount), sum(price) from buytbl group by groupName;
-- 테이블 가장 높은 groupName, prodName, amont, price 만들기
-- 1단계
select groupName, max(price) from buytbl group by groupName having max(price)>=(select max(price)from buytbl);
-- 2단계
create table maxGroupTbl(
	select groupName, prodName,price from buytbl 
    where groupName =(select groupName 
    from buytbl group by groupName 
    having max(price)>=(select max(price)from buytbl)));

select*from maxGroupTbl;

-- with rollup 중간합계
-- 소합계 
select num, groupName, sum(price) from buytbl group by groupName, num with rollup;

-- 게시판에서 게시글번호 경우에 자동번호 설정
-- 학번 자동부여

create table if not exists testTbl2
( id int auto_increment primary key, -- auto_increment int 형이고 primary key/unique 야한다.
	userName char(3),
    age int
);


insert into testtbl2 values(null,'지민',25);
insert into testtbl2 (userName,age) values ('유나', 22);
insert into testtbl2 (userName,age) values ('유경', 21);

alter table testtbl2 auto_increment =100;
insert into testtbl2 (userName,age) values ('지수', 29);
insert into testtbl2 (userName,age) values ('은지', 25);
alter table testtbl2 auto_increment =240101;
insert into testtbl2 (userName,age) values ('소이', 27);
insert into testtbl2 (userName,age) values ('준형', 27);
insert into testtbl2 (userName,age) values ('서이', 23);


insert into employees values (1003,'05/01/01','정','현희','F','20/10/05');
insert into employees values (1004,'05/01/01','박','현희','M','20/10/05');
insert into employees values (1005,'05/01/01','이','현희','F','20/10/05');
insert into employees values (1006,'05/01/01','김','현희','M','20/10/05');

-- 증가치를 3씩 증가
set @@auto_increment_increment = 3;
insert into testtbl2 (userName,age) values ('서우', 23);
select * from testtbl2;

-- insert문을 select문을 이용해서 삽입하기
create table testtbl4 (id int, fname  varchar(50), lname varchar(50));
insert into testtbl4 select emp_no, first_name,last_name from employees.employees;

select * from testtbl4;

select * from buytbl order by price desc;

-- 테이블 copy 
create table copyBuyTbl(select * from buytbl);

-- 가격의 상위 3개 삭제하기
delete from copybuytbl order by price desc limit 3;

select * from copybuytbl order by amount desc;

-- 수량 하위 2개 삭제하기
delete from copybuytbl order by amount desc limit 2;

-- 운동화중 상위 1개 삭제하기
select *from copybuytbl where prodName='운동화';

insert into copybuytbl values(1,'SBS','운동화',null,60, 3);
update copybuytbl set price = 60 where prodName = 'KBS';

use employees;
use sqldb;
select * from employees;
select * from employees.employees;
--            데이터베이스명. 테이블명(다른 데이터베이스안에 있는 자료를 가져옴)







