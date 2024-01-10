use sqldb;
update copybuytbl set price = 60 where prodName = 'KBS';


drop table if exists testtbl4;
rollback;


select * from testtble4;
-- 요구사항 : 상품명, 가격 테이블 만들기
-- 1단계 테이블 만들기
create table if not exists testtble4(
	prodName varchar(40) not null,
    price int not null
);
select distinct prodname, price from buytbl;

-- 2단계 삽입한다
 
insert into testtble4 select distinct prodname, price from buytbl;
update testtble4 set price = 100 where prodname = '청바지';
select * from testtble4 where price = (select max(price) from testtble4);
select price from testtble4 where price =(select max(price) from testtble4);
-- updete 대상 테이블과 where 절에 사용된 서브 쿼리에는 동일한 테이블명이 있으면 안된다
-- ex) update testtble4 set price = price *0.9  where price = (select t.testtble4 from (select price from testtble4 where max(price)));
update testtble4 set price = price *0.9  where price = (select price from (select max(price) from testtble4)as t);



create table if not exists copybuy
	select * from buytbl;
 select * from copybuy;
 -- copybuy 테이블중 amount가 제일 작은 것 찾아서 삭제하기
 select amount from copybuy order by amount asc limit 1;
 delete from copybuy where amount = (select amount from( select amount from copybuy order by amount asc limit 1)as t);
 
 -- with 절 사용하기
 -- 뷰, 파생테이블, 임시테이블, 가상테이블
 select * from usertbl;
 select * from buytbl;
 select userID from buytbl group by userID;
 select userid, sum(price)*sum(amount) as '총구매액' from buytbl group by userID;
 select name from usertbl;
 
 with t(tid,total)
 as(
 select userid, sum(price*amount) from buytbl group by userID
 )
 
 select * from t;
 select usertbl.name, buytbl.price from usertbl,buytbl; -- usertbl 행과 buytbl 행이 곱해져 나온다
 select * from usertbl,buytbl where usertbl.userID = buytbl.userID; -- 교집합이 나온다
 
 -- userid, name, amount, price 두개 테이블에 각각 다른 항목 검색하기
 select usertbl.userID, usertbl.name, buytbl.amount,buytbl.price from usertbl,buytbl where usertbl.userID = buytbl.userID;
 
 -- 지역별로 가장큰키 출력
 select addr,max(height)from usertbl group by addr;
 -- 지역별로 가장큰키 의 평균값 출력
 with t (avgHeight)
 as
 (
 select max(height) from usertbl group by addr
 )
 select avg(avgHeight)  from t; -- *******가상테이블은 한번만 불러올수있다*******
 
 -- 각 groupname의 price에 최저를 구해서 그것의 평균을 구하기
  select groupName, min(price) from buytbl group by groupName;
  
  with t (minPrice)
  as
  (
  select min(price) from buytbl group by groupName
  )
  select avg(minprice) from t;
  
  -- ------------------------------ 7장 SQL 고급
  -- 238p 소리, 그림 2진수(blob) 저장해야한다
  -- 날짜형
  
  select cast('2020-10-19 12:35:29.123'as date); -- cast() 형변환 함수
  select cast('2020-10-19 12:35:29.123'as time);
  select cast('2020-10-19 12:35:29.123'as datetime);
  
  set @var1 =2.8;
  select cast(@var1 as signed integer);  -- 반올림하여 정수형
  set @var2 = '제품판매처: 삼성';
  select @var1, @var2, prodname from buytbl;
  
  -- 데이터 형 변환 cast(), convert()
  select avg(amount) from buytbl;
  -- 실수를 정수형으로 변환하기
  select cast(avg(amount)as signed integer) from buytbl; 
  
  -- 정수형을 실수형으로 변환
  set @var4 = 3;
  select cast(@var4 as Float);
  select convert(@var4 , float);
  
  -- 정수형 문자로 변환
  select cast(@var4 as character);

-- 246p
select '100'+'200'; -- 연산
select concat('100','200'); -- '100200'
select concat (100,'200'); -- '100200'
select 1>'2mage'; -- 거짓 = 0 
select 3>1; -- 진실 1
select 0 = 'mega0'; -- 문자는 0으로 바뀌므로 0=0

-- if 함수 select i(조건,참,거짓)
set @v1 = 10;
set @v2 = 20;
set @v3 = 100;

-- 가장 큰수 구하기
select if(@v1>@v2, if(@v1>@v3,@v1,@v3),if(@v2>@v3,@v2,@v3));
-- 가장 작은 수 구하기
select if(@v1<@v2, if(@v1<@v3,@v1,@v3),if(@v2<@v3,@v2,@v3));
-- 중간수 구하기
select if(@v1>@v2, if(@v1<@v3,@v1,@v3),if(@v2<@v3,@v2,@v3));

-- ifnull(수식1, 수식2)
select ifnull(null,100);
select ifnull(200,null);
select ifnull(200,100);
select ifnull(null,ifnull(null,200));

-- nullif(수식1,수식2)
select nullif(100,100);
select nullif(200,100);
select nullif(100,200);

-- case when else end = 자바 switch 문
select case 1
	when 1 then '일'
    when 2 then '이'
    when 3 then '삼'
    else '123이 아님'
end as 'case 연습';
select * from buytbl;
-- userid KBS 김범수 ...
select case userid
	when 'KBS' then '김범수'
    when 'JYP' then '조용필'
    else '모름'
	end as '이름',
    userid
from buytbl;

-- concat_ws (구분자,문자열1,문자열2)
select concat_ws(',','100','200');
select elt(3,'하나','둘','삼'); -- 앞에 숫자에 해당하는 열 입력
select field('김','이','박','최','김'); -- 처음 위치에 문자를 리스트에서 위치 찾아줌
select find_in_set('김','이,박,최,김,송'); -- 처음위치 문자를 문자열에서 위치 찾아줌(,포함x)
select instr('이,박,최,김,송','김'); -- 앞에 문자열중 뒤에있는 문자 위치찾기(,포함)
select locate('둘','하나둘셋');

select format(123456.123456,4); -- 소수점 n번째까지 표현
select hex(10); -- 16진수
select bin(31); -- 2진수
select oct(20); -- 8진수

select insert('abcdefghi',3,4,'@@@@');-- 문자열을 n번째에서부터 n+m번째 까지 지우고 문자열넣기
select left('abcdefg',3); -- 왼쪽부터 3개
select trim('    abc      '); -- 공백제거
select substring('대한민국만세',3,3);
select substring_index('cafe.naver.com.co.kr', '.',2);
select substring_index('cafe.naver.com.co.kr', '.',-2);

select substring_index(substring_index('cafe.naver.com.co', '.',-2),'.',1);

set @v10 = 'a,b,c,d,e';

select substring_index(substring_index(@v10,',',2),',',-1);

-- 숫자 함수
select ceiling(4.1), floor(4.7), round(4.7); -- 올림 버림 반올림

select mdate, adddate(mate, interval 31 day) from usertbl;
select date(now()),time(now()),now();
select sysdate();

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