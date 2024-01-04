SELECT 24*60 계산 from dual; -- 오라클 연산 테이블
SELECT *from dual;
SELECT sign(10) from dual;
SELECT round(3.456,2) from dual;--(x,y)반올림 x에 y번째 자리 반올림
SELECT trunc(5352.2451, -2) from dual; -- x까지 출력 -1 0 1 기준
SELECT trunc(5352.2451, 2) from dual; -- 정수(-), 소수(+)
SELECT mod(25,4)from dual;  -- 나머지 구하는 함수

select * from student;
SELECT upper(stu_email) from student;
SELECT lower(stu_email) from student;
SELECT initcap(stu_email) from student;

SELECT length('oracle'),length('오라클') from dual;

--substr ( 대상 , 시작위치, 추출할 갯수)
SELECT substr('Welcome to Oralce',4,3) from dual; -- 첫위치 1번
SELECT substr(stu_email,1,4) from student where stu_name = '문종헌';
SELECT substr(stu_email,-3,3) from student where stu_id between 101 and 110;
SELECT instr('Welcome to Oralce','e',3) from dual; -- (문장,찾는 문자, 시작지점)
SELECT instr('Welcome to Oralce','e',3,2) from dual; -- (문장,찾는 문자,시작지점,그후 몇번째)

SELECT instr(stu_email,'@') "@POSITION" from student;
SELECT substr(stu_email,1,instr(stu_email,'@')-1)id from student;

SELECT lpad('oracle',20,'#') from dual;
SELECT rpad('oracle',10,'@') from dual;
SELECT lpad(job,10,' ')from emp;

--현재시간 
SELECT sysdate from dual;

select sysdate, to_char(sysdate,'YYYY-MM-DD am hh:mi:ss')from dual;
SELECT * from emp;
SELECT hiredate, to_char(hiredate,'YYYY-mm-dd-dy')from emp;
SELECT to_char(12345678,'000,000,000')from dual;
SELECT to_char(12345678,'000,000')from dual;

SELECT to_char(12345678,'999,999,999')from dual;
SELECT to_char(12345678,'999,999')from dual;--#으로 채운다

SELECT to_char(12345678,'L999,999,999')from dual;

--to_date() 날짜형으로 바꾸기
--오라클에서 기본날짜형은 'mm/dd/yy'
--to_date('문자','형식') 문자가 형식을 바뀌어서 날짜형이 된다
SELECT * from emp;
select * from emp where hiredate = to_date(20070402,'yyyymmdd');
select * from emp where hiredate = to_date('20070402','yyyymmdd');

--오늘 날짜 -- 대출일
SELECT trunc(sysdate - to_date(20230818,'yyyymmdd'))from dual;
SELECT to_date('070321','yymmdd')-to_date('080321','yymmdd') from dual;
SELECT TO_NUMBER('20,000','99,999') - TO_NUMBER('10,000','99,999')from dual;

SELECT '20000'-'10000'from dual;

--날짜함수
--어제 오늘 내일
SELECT sysdate -1 어제, sysdate 오늘, sysdate+1 내일 from dual;
SELECT to_char(sysdate-1,'yyyy-mm-dd day') 어제 from dual;

--months_between
SELECT months_between(sysdate,'2023/12/4') from dual;
SELECT add_months('2023/10/01', 10 )from dual;
SELECT add_months('231001', 10 )from dual;
SELECT round(to_date('20/07/17','yy/mm/dd'),'month')from dual;

select hiredate,trunc(hiredate,'month') from emp;
select hiredate,trunc(hiredate,'year') from emp;

--근무 년수, 근무 달수
--오늘 날짜 - 입사일 년수 달수
SELECT ename, sysdate, hiredate from emp;
SELECT ename, sysdate, hiredate, trunc(months_between(sysdate,hiredate)/12,0) 근무년수 from emp;

--출력형식 입사일 현재날짜 근속년 근속월 근속일
SELECT hiredate 입사일, sysdate 현재날짜, trunc(months_between(sysdate,hiredate)/12)근무년수,
    trunc(months_between(sysdate,hiredate)) 근무월수,
    trunc(months_between(sysdate,hiredate))*30 근무일수
    from emp;
    
--오늘 날짜를 기준으로 최초로 도래하는 수요일의 날짜는?
SELECT to_char(next_day(sysdate,'수요일'),'yyyy/mm/dd') from dual;
SELECT last_day('24/01/01') from dual;

SELECT empno 사원번호, last_day(sysdate) 급여일 from emp;

SELECT * from emp;
SELECT nvl(comm, 0) from emp;
SELECT nvl(hiredate,sysdate)from emp;
SELECT nvl(hiredate,to_date('21/12/22','yy/mm/dd'))from emp;
SELECT nvl(ename,'무명') 이름, nvl(job,'사원') 직업 from emp;

-- null이 아니면 2번식 null이면 3번식
SELECT ename,sal,nvl2(comm , sal*12+comm, sal*12) 연봉 from emp;

-- coalesce(식1 , 식2 , ... 식n)
--식1이 null이 아니면 식1값 출력, 식2가 null이 아니면 식 2값출력, 모두다 null이면 식n출력
insert into emp values(1019,null,'대리',1003,sysdate,null,null,20);
insert into emp values(1020,null,'대리',1003,sysdate,null,100,20);
SELECT comm,sal,coalesce(comm,sal,0)from emp;

--선택을 위한 decode 함수(switch 문과 비슷함)
/*decode(표현식, 조건1, 결과1,
                조건2, 결과2,
                조건3, 결과3,
                기본결과n)
                */
                
SELECT deptno, decode(deptno,10,'경리부',
                            20,'입사부',
                            '전산부')from emp;

select * from student;
SELECT sex, decode(sex,'M','남자',
                        'F','여자',
                            '중성')
from student;


/*  표 = 테이블
    줄 = 행 = row = 레코드 = 튜플 = 입출력의 기본단위
    칸 = 열 = colum = 항목 = 필드 = item = 속성
    */
    
SELECT count(ename)from emp;
SELECT ename from emp;
SELECT sum(sal)"월급 합",avg(sal) "월급 평균", MAX(sal) "최고 월급", count(ename) "이름 갯수" from emp;
--그룹함수에서 sum,count에서는 null 값은 제외시킨다.
SELECT count(comm)from emp;
select DISTINCT(job) from emp;
SELECT * from emp order by deptno;
-- 각 부서별로 제일 높은 급여 출력하기
SELECT deptno, max(sal) from emp group by deptno order by deptno;
SELECT job, MIN(sal) from  emp group by job order by MIN(sal);

-- 사원 대리 과장 출력하기
SELECT * from emp where job in('사원','대리','과장');
--2단계 그룹으로 지정하기
SELECT job,round(avg(sal)) 월급평균 from emp where job in('사원','대리','과장') GROUP by job;

--최대 급여가 700 초과한 부서중 그중 최소급여랑 최대급여 구하기
SELECT deptno, max(sal),min(sal) from emp group by deptno having max(sal)>700;

--직급별로 급여의 평균이 500이상인 직급,급여 평균을 구하기
SELECT job, avg(sal) 급여평균 from emp group by job having avg(sal)>=500 order by 급여평균;

SELECT * from student;
SELECT avg(age) 평균나이, max(age) 늙은이,min(age) 젊은이 from student;
SELECT sex 성별,max(age) 최고령자 from student group by sex;
SELECT cou_id 코스아이디,max(age) 최고령자 from student group by cou_id;
SELECT cou_id 코스아이디,max(age) 최고령자 from student group by cou_id having avg(age)>=25;

--남자인 경우에 cou_id 별로 평균 나이가 25세 이상인 코스와 평균나이 오름차순으로 구하기
SELECT cou_id 코스, trunc(avg(age),1) 평균나이 from student where sex='M' group by cou_id having avg(age)>=25 order by avg(age);
