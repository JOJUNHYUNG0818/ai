-- stroed procedure program
-- 설계 --> 인스턴스화 --> 사용

use sqldb;

-- 기본 형식
delimiter $$
create procedure userProc()
begin
	select * from usertbl;
end $$
delimiter ;

call userProc();
desc usertbl;

-- 파라미터(매개변수) 형태
 delimiter $$
create procedure userProc2(in _addr char(2))
begin
	select * from usertbl where addr = _addr; 
end $$
delimiter ;

call userProc2('서울');
 
-- userid BBK 또는 LJB 검색하기

 delimiter $$
create procedure userProc3(in _id1 char(8),in _id2 char(8))
begin
	select * from usertbl where userid = _id1 or userid =_id2;
end $$
delimiter ;

call userProc3('BBK','LJB');
select * from usertbl;


-- 서울에 사는 사람이 몇명인지 변수에 담아서 외부로 보내기
 delimiter $$
create procedure userProc4(in _addr char(2),out _result int)
begin
	select count(addr) into _result from usertbl where addr =_addr ;
end $$
delimiter ;

call userProc4('서울',@_result);
select @_result;

-- 문제 groupName을 입력하면 price 값이 가장 큰 것을 찾아 변수로 받기 

delimiter $$
create procedure userProc5(in _groupName char(4),out _result int)
begin
	select max(price) into _result from buytbl where groupName = _groupName ;
end $$
delimiter ;

call userProc5('전자',@_result);
select @_result as '가장비싼 금액' ;
select * from buytbl;
desc buytbl;

drop procedure if exists userProc6;

delimiter $$
create procedure userProc6(in _groupName char(4),out _result int,out _prodName char(6))
begin
	select max(price) into _result from buytbl where groupName = _groupName ;
    select prodName into _prodName from buytbl where groupName = _groupName group by prodName order by max(price) desc limit 1 ;
end $$
delimiter ;

select * from buytbl;


call userProc6('전자',@_result,@_prodName);
select @_result,@_prodName;




-- 함수
-- 함수 생성권한 제한 풀어주기
set global log_bin_trust_function_creators = 1;

-- 함수만들기
delimiter $$
create function userFun1 (v1 int , v2 int)
	returns int
    begin
		return v1+v2;
	end $$;
delimiter $$

select userFun1(100,200);


-- 출생연도 구하기

delimiter $$
create function userFun2 ( birthYear int)
	returns int
begin
	declare age int;
    set age = year(curdate())-birthYear;
		return age;
	end $$;
delimiter $$

select userFun2(2020);

