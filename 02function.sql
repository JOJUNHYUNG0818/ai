SELECT 24*60 ��� from dual; -- ����Ŭ ���� ���̺�
SELECT *from dual;
SELECT sign(10) from dual;
SELECT round(3.456,2) from dual;--(x,y)�ݿø� x�� y��° �ڸ� �ݿø�
SELECT trunc(5352.2451, -2) from dual; -- x���� ��� -1 0 1 ����
SELECT trunc(5352.2451, 2) from dual; -- ����(-), �Ҽ�(+)
SELECT mod(25,4)from dual;  -- ������ ���ϴ� �Լ�

select * from student;
SELECT upper(stu_email) from student;
SELECT lower(stu_email) from student;
SELECT initcap(stu_email) from student;

SELECT length('oracle'),length('����Ŭ') from dual;

--substr ( ��� , ������ġ, ������ ����)
SELECT substr('Welcome to Oralce',4,3) from dual; -- ù��ġ 1��
SELECT substr(stu_email,1,4) from student where stu_name = '������';
SELECT substr(stu_email,-3,3) from student where stu_id between 101 and 110;
SELECT instr('Welcome to Oralce','e',3) from dual; -- (����,ã�� ����, ��������)
SELECT instr('Welcome to Oralce','e',3,2) from dual; -- (����,ã�� ����,��������,���� ���°)

SELECT instr(stu_email,'@') "@POSITION" from student;
SELECT substr(stu_email,1,instr(stu_email,'@')-1)id from student;

SELECT lpad('oracle',20,'#') from dual;
SELECT rpad('oracle',10,'@') from dual;
SELECT lpad(job,10,' ')from emp;

--����ð� 
SELECT sysdate from dual;

select sysdate, to_char(sysdate,'YYYY-MM-DD am hh:mi:ss')from dual;
SELECT * from emp;
SELECT hiredate, to_char(hiredate,'YYYY-mm-dd-dy')from emp;
SELECT to_char(12345678,'000,000,000')from dual;
SELECT to_char(12345678,'000,000')from dual;

SELECT to_char(12345678,'999,999,999')from dual;
SELECT to_char(12345678,'999,999')from dual;--#���� ä���

SELECT to_char(12345678,'L999,999,999')from dual;

--to_date() ��¥������ �ٲٱ�
--����Ŭ���� �⺻��¥���� 'mm/dd/yy'
--to_date('����','����') ���ڰ� ������ �ٲ� ��¥���� �ȴ�
SELECT * from emp;
select * from emp where hiredate = to_date(20070402,'yyyymmdd');
select * from emp where hiredate = to_date('20070402','yyyymmdd');

--���� ��¥ -- ������
SELECT trunc(sysdate - to_date(20230818,'yyyymmdd'))from dual;
SELECT to_date('070321','yymmdd')-to_date('080321','yymmdd') from dual;
SELECT TO_NUMBER('20,000','99,999') - TO_NUMBER('10,000','99,999')from dual;

SELECT '20000'-'10000'from dual;

--��¥�Լ�
--���� ���� ����
SELECT sysdate -1 ����, sysdate ����, sysdate+1 ���� from dual;
SELECT to_char(sysdate-1,'yyyy-mm-dd day') ���� from dual;

--months_between
SELECT months_between(sysdate,'2023/12/4') from dual;
SELECT add_months('2023/10/01', 10 )from dual;
SELECT add_months('231001', 10 )from dual;
SELECT round(to_date('20/07/17','yy/mm/dd'),'month')from dual;

select hiredate,trunc(hiredate,'month') from emp;
select hiredate,trunc(hiredate,'year') from emp;

--�ٹ� ���, �ٹ� �޼�
--���� ��¥ - �Ի��� ��� �޼�
SELECT ename, sysdate, hiredate from emp;
SELECT ename, sysdate, hiredate, trunc(months_between(sysdate,hiredate)/12,0) �ٹ���� from emp;

--������� �Ի��� ���糯¥ �ټӳ� �ټӿ� �ټ���
SELECT hiredate �Ի���, sysdate ���糯¥, trunc(months_between(sysdate,hiredate)/12)�ٹ����,
    trunc(months_between(sysdate,hiredate)) �ٹ�����,
    trunc(months_between(sysdate,hiredate))*30 �ٹ��ϼ�
    from emp;
    
--���� ��¥�� �������� ���ʷ� �����ϴ� �������� ��¥��?
SELECT to_char(next_day(sysdate,'������'),'yyyy/mm/dd') from dual;
SELECT last_day('24/01/01') from dual;

SELECT empno �����ȣ, last_day(sysdate) �޿��� from emp;

SELECT * from emp;
SELECT nvl(comm, 0) from emp;
SELECT nvl(hiredate,sysdate)from emp;
SELECT nvl(hiredate,to_date('21/12/22','yy/mm/dd'))from emp;
SELECT nvl(ename,'����') �̸�, nvl(job,'���') ���� from emp;

-- null�� �ƴϸ� 2���� null�̸� 3����
SELECT ename,sal,nvl2(comm , sal*12+comm, sal*12) ���� from emp;

-- coalesce(��1 , ��2 , ... ��n)
--��1�� null�� �ƴϸ� ��1�� ���, ��2�� null�� �ƴϸ� �� 2�����, ��δ� null�̸� ��n���
insert into emp values(1019,null,'�븮',1003,sysdate,null,null,20);
insert into emp values(1020,null,'�븮',1003,sysdate,null,100,20);
SELECT comm,sal,coalesce(comm,sal,0)from emp;

--������ ���� decode �Լ�(switch ���� �����)
/*decode(ǥ����, ����1, ���1,
                ����2, ���2,
                ����3, ���3,
                �⺻���n)
                */
                
SELECT deptno, decode(deptno,10,'�渮��',
                            20,'�Ի��',
                            '�����')from emp;

select * from student;
SELECT sex, decode(sex,'M','����',
                        'F','����',
                            '�߼�')
from student;


/*  ǥ = ���̺�
    �� = �� = row = ���ڵ� = Ʃ�� = ������� �⺻����
    ĭ = �� = colum = �׸� = �ʵ� = item = �Ӽ�
    */
    
SELECT count(ename)from emp;
SELECT ename from emp;
SELECT sum(sal)"���� ��",avg(sal) "���� ���", MAX(sal) "�ְ� ����", count(ename) "�̸� ����" from emp;
--�׷��Լ����� sum,count������ null ���� ���ܽ�Ų��.
SELECT count(comm)from emp;
select DISTINCT(job) from emp;
SELECT * from emp order by deptno;
-- �� �μ����� ���� ���� �޿� ����ϱ�
SELECT deptno, max(sal) from emp group by deptno order by deptno;
SELECT job, MIN(sal) from  emp group by job order by MIN(sal);

-- ��� �븮 ���� ����ϱ�
SELECT * from emp where job in('���','�븮','����');
--2�ܰ� �׷����� �����ϱ�
SELECT job,round(avg(sal)) ������� from emp where job in('���','�븮','����') GROUP by job;

--�ִ� �޿��� 700 �ʰ��� �μ��� ���� �ּұ޿��� �ִ�޿� ���ϱ�
SELECT deptno, max(sal),min(sal) from emp group by deptno having max(sal)>700;

--���޺��� �޿��� ����� 500�̻��� ����,�޿� ����� ���ϱ�
SELECT job, avg(sal) �޿���� from emp group by job having avg(sal)>=500 order by �޿����;

SELECT * from student;
SELECT avg(age) ��ճ���, max(age) ������,min(age) ������ from student;
SELECT sex ����,max(age) �ְ���� from student group by sex;
SELECT cou_id �ڽ����̵�,max(age) �ְ���� from student group by cou_id;
SELECT cou_id �ڽ����̵�,max(age) �ְ���� from student group by cou_id having avg(age)>=25;

--������ ��쿡 cou_id ���� ��� ���̰� 25�� �̻��� �ڽ��� ��ճ��� ������������ ���ϱ�
SELECT cou_id �ڽ�, trunc(avg(age),1) ��ճ��� from student where sex='M' group by cou_id having avg(age)>=25 order by avg(age);
