-- 테이블 만들기
-- 형식 create table tableName ( column int terms) 
create table dept_mission(
    DNO NUMBER(2),
    DNAME VARCHAR2(14),
    LOC VARCHAR2(13)
);

create table emp_mission (
    ENO NUMBER(4),
    ENAME VARCHAR2(10),
    DNO NUMBER(2)
);

create table emp01(
    empno number(4),
    ename varchar2(14),
    sal number(7,3)-- 숫자 7자리 소숫점3자리
);

-- 테이블 구조 변경하기
-- 1.구조 변경시 테이블에 해당 자료가 있다면 자료가 삭제된다.
alter table emp01 -- 테이블에 구조 추가하기
    add(birth date);
    
alter table emp01
    add(deptno number(4), addr varchar2(20));

alter table emp01 -- 테이블에서 구조 수정하기
    MODIFY ( ename varchar2(20));
alter table emp01 
    MODIFY (empno varchar2(6));

alter table emp01 -- 테이블에서 구조 지우기
    drop column birth;
alter table emp01
    drop column deptno;


-- 테이블 구조 보기
desc emp01;
desc emp_mi;

-- 테이블명의 이름 변경하기
rename emp_mission to emp_mi;

--테이블 삭제하기
drop table emp_mi;

select * from emp;

create table emp_copy -- emp의 검색결과(select)로 나온 것을 테이블로 만들기
as
select* from emp;

desc emp;
desc emp_copy;

drop table emp_copy;
select * from emp_copy;

alter table emp_copy
    drop column comm;

-- 테이블 속성값 바꾸기    
alter table emp_copy
    rename column hiredate to hire;

select * from emp_copy;

-- 모든 데이터 다 지우기
delete from emp_copy;
SELECT * from emp_copy;

------------------------------

-- 딕셔너리: 데이터베이스 서버에서 제공해 주는 테이블
-- 딕셔너리는 수정은 안되고 읽기만 가능하다
SELECT table_name from user_tables; -- 데이터베이스안에 테이블의 목록들을 모두본다.
SELECT * from user_tables;

SELECT * from all_tables; 
SELECT * from all_tables where table_name = 'EMP';

SELECT * from dba_tables;
-- 데이터베이스관리자는 오라클에서 이름이 지정되어 있음 sys(장치관리자, 하드웨어, 논리적장치- 소프트웨어 )
-- system = 논리적장치관리하는사람(소프트웨어)
-- 필요에 따라서 사용자 만들어 쓸 수 있다

-- DML문 insert,update,delete 문 레코드 삽입, 수정, 삭제하기

alter table emp01
    drop column addr;
alter table emp01
    drop column hire;

-- 레코드 삽입하기
-- 전체행에 다 넣는다
-- 행에 특정 열만 넣는다
SELECT*from emp01;

INSERT INTO emp01 values(1000,'홍길동',123.5); -- 컬럼명을 생략시 구조 순서대로 넣어진다
INSERT INTO emp01 (ename, empno, sal ) values ('이순신',1001,100);
INSERT INTO emp01 (ename,empno) values ('김수민',1002);
INSERT INTO emp01 (sal) values (200.0);

INSERT INTO emp01 (empno,ename,sal) values (1004,'',200.0);
--공백넣기
INSERT INTO emp01 (empno,ename,sal) values (1005,' ',320.0);
alter table emp01
    add hire date;

insert into emp01 values(1010,'박수미',80,'230109');
insert into emp01 values(1011,'최경수',0,sysdate);

SELECT*from emp01;

-- 수정하기
-- UPDATE 테이블명 SET 컬럼명 = 새로운값 where 조건절
-- 홍길동의 급여를 200으로 바꾸기
UPDATE emp01 SET sal = 200 where ename = '홍길동';
-- 번호 1004번인 사람이름을 '이진수'로
update emp01 set ename = '이진수' where empno =1004;
-- 번호가 1010 사람의 급여를 현재급여에다 100 더하기, 입사일을 22년 10월 25일로 바꾸기
update emp01 set sal = sal + 100, hire = '221025' where empno=1010;

-- 모든 사람 월급에 200 더하기
update emp01 set sal = nvl(sal + 200,200); -- null 인경우 대채하기

-- delete from 테이블명 where 조건절
-- 급여가 500 넘는 사람은 삭제
delete from emp01 where sal>500;

delete from emp01;
-- 되돌리기
ROLLBACK;

select * from emp01;

commit;

update emp01 set sal = nvl(sal + 200,200);
rollback;

-- 모든 사람의 입사일 오늘 날짜 수정하기
UPDATE  emp01 set hire = sysdate;
rollback; -- 방금전에 한 update 취소됨
commit; -- 트랜잭션에 만들어진 DML (insert,update,delete) 가 확정됨

-- 제약조건
select * from dept;
--insert into dept values (10,'test','test'); == primary key 중복 값으로 인한 오류
--insert into dept values (null,'test','test'); == primary key null 값으로 인한 오류

create table pTable (
    code number(4) PRIMARY KEY,
    name varchar2(14)
);

select* from user_constraints where table_name = 'PTABLE';

--name 컬럼 제약조건을 not null 로 고치기
alter table pTable
    modify (name varchar2(14) not null);

select * from ptable;

insert into ptable (code, name) values(1010,'a'); 
--insert into ptable (code, name) values(1010,'b'); 중복값 오류
--insert into ptable (code, name) values(1030,null); null값 오류

alter table ptable 
    add id varchar(10);

desc ptable;

alter table ptable
    modify (id varchar2(10) unique);

insert into ptable values(1004,'김지수','jisu');
-- insert into ptable values(1005,'박지수','jisu'); (unique)=>id 값 중복