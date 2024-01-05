select*from emp;
select*from student;
select * from dept;
select dname from dept;

select empno, ename ,sal job from emp;
/* 여러줄 주석 */
-- 한줄 주석
--stu_id , stu_name, sex 컬럼만 검색
select stu_id, stu_name, sex from student;

--산술연산자
select empno, ename ,sal, job from emp;
select empno, ename ,sal, sal*12, sal*12*0.33, job from emp;
select empno as 사원번호, ename as 사원명, sal as 급여, sal*12 as 연봉, job as 직급 from emp;
--컬럼명 as 별칭 
select empno 사원번호, ename  사원명, sal  급여, sal*12 연봉, job 직급 from emp;
--as 생략가능

select * from salgrade;
select grade, losal+1500, hisal+1000 from salgrade;
-- 별칭(애칭)붙여 주기
--등급 , 최저금액, 인상 최저금액, 최대금액, 인상최대금액
select grade 등급, losal 최저금액, losal+1000 인상최저금액, hisal 최대금액,hisal+1500 인상최대금액 from salgrade;

--null 이란? 0아님, 빈공간이 아닌 미확정 (연산불가)

select * from emp;

--comm 보너스를 +100씩 지급하자
select comm, comm+100 from emp; -- null인 culum은 연산불가....
select comm, nvl(comm,0)+100 from emp; -- null인애들은 0으로 초기값주고 연산

--별칭에 띄어쓰기 쓰려면 ""안에
select ename"사원 성함",comm "사원 월급" from emp;

select ename ||'의 직급은'|| job||'입니다' 직급 from emp;

-- ''와 culum값 사이에 || 넣어 문장 연결
select * from student;
select stu_name ||'의 나이는 ' || age ||'입니다.' 나이 from student;

SELECT cou_id from student;
--전체 코스는?(중복 제거)
select DISTINCT cou_id from student;

SELECT * from emp;
select DISTINCT deptno from emp;

--where 조건문

select * from emp where deptno = 20;


select * from emp where job = '사원';

select * from emp where job = '사원' or job = '과장';

select empno 사원번호, ename 이름, sal 급여 from emp where sal>=400;

select empno 사원번호, ename 이름, sal 급여, job 직급 from emp where sal>=400 and job='부장';

select * from emp where hiredate < '05/01/01';

select * from emp where hiredate > '05/01/01';

select * from emp where hiredate>='06/01/01' and  hiredate<='07/12/31';

--김씨만 출력
select * from emp where ename like '이%';
--또는
select * from emp where ename like '이%' or ename like '오%';
--not (아닌것)
select * from emp where ename not like '이%';
--중간이름
select * from emp where ename like '%예%';

--합집합
select * from group_star
UNION
select * from single_star;

--교집합
select * from group_star
INTERSECT
select * from single_star;

--차집합
select * from group_star
minus
select * from single_star;

--1.
select * from emp;
select empno 사원번호, ename 사원이름, sal from emp where sal<=300;
--2
select ename 사원이름,empno 사원번호, sal from emp where ename like '오%';
--3
select empno 사원번호, ename 사원이름, sal from emp where sal=200 or sal=300 or sal=500;--sal(200,300,500)
--4
select ename 사원이름 from emp where sal!=250 or sal!=300 or sal!=500; -- sal not in(250,300,500)
--5
select empno 사원번호, ename 사원이름 from emp where ename like '김%' or ename like '기%' or ename like'%기';
--6
select * from emp where mgr is null;
--7   조건문 다음 순서순
select * from emp where sal>=300 order by empno asc ;
SELECT * from usertbl;
SELECT * from deAcc;
SELECT * from bank;
