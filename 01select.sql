select*from emp;
select*from student;
select * from dept;
select dname from dept;

select empno, ename ,sal job from emp;
/* ������ �ּ� */
-- ���� �ּ�
--stu_id , stu_name, sex �÷��� �˻�
select stu_id, stu_name, sex from student;

--���������
select empno, ename ,sal, job from emp;
select empno, ename ,sal, sal*12, sal*12*0.33, job from emp;
select empno as �����ȣ, ename as �����, sal as �޿�, sal*12 as ����, job as ���� from emp;
--�÷��� as ��Ī 
select empno �����ȣ, ename  �����, sal  �޿�, sal*12 ����, job ���� from emp;
--as ��������

select * from salgrade;
select grade, losal+1500, hisal+1000 from salgrade;
-- ��Ī(��Ī)�ٿ� �ֱ�
--��� , �����ݾ�, �λ� �����ݾ�, �ִ�ݾ�, �λ��ִ�ݾ�
select grade ���, losal �����ݾ�, losal+1000 �λ������ݾ�, hisal �ִ�ݾ�,hisal+1500 �λ��ִ�ݾ� from salgrade;

--null �̶�? 0�ƴ�, ������� �ƴ� ��Ȯ�� (����Ұ�)

select * from emp;

--comm ���ʽ��� +100�� ��������
select comm, comm+100 from emp; -- null�� culum�� ����Ұ�....
select comm, nvl(comm,0)+100 from emp; -- null�ξֵ��� 0���� �ʱⰪ�ְ� ����

--��Ī�� ���� ������ ""�ȿ�
select ename"��� ����",comm "��� ����" from emp;

select ename ||'�� ������'|| job||'�Դϴ�' ���� from emp;

-- ''�� culum�� ���̿� || �־� ���� ����
select * from student;
select stu_name ||'�� ���̴� ' || age ||'�Դϴ�.' ���� from student;

SELECT cou_id from student;
--��ü �ڽ���?(�ߺ� ����)
select DISTINCT cou_id from student;

SELECT * from emp;
select DISTINCT deptno from emp;

--where ���ǹ�

select * from emp where deptno = 20;


select * from emp where job = '���';

select * from emp where job = '���' or job = '����';

select empno �����ȣ, ename �̸�, sal �޿� from emp where sal>=400;

select empno �����ȣ, ename �̸�, sal �޿�, job ���� from emp where sal>=400 and job='����';

select * from emp where hiredate < '05/01/01';

select * from emp where hiredate > '05/01/01';

select * from emp where hiredate>='06/01/01' and  hiredate<='07/12/31';

--�达�� ���
select * from emp where ename like '��%';
--�Ǵ�
select * from emp where ename like '��%' or ename like '��%';
--not (�ƴѰ�)
select * from emp where ename not like '��%';
--�߰��̸�
select * from emp where ename like '%��%';

--������
select * from group_star
UNION
select * from single_star;

--������
select * from group_star
INTERSECT
select * from single_star;

--������
select * from group_star
minus
select * from single_star;

--1.
select * from emp;
select empno �����ȣ, ename ����̸�, sal from emp where sal<=300;
--2
select ename ����̸�,empno �����ȣ, sal from emp where ename like '��%';
--3
select empno �����ȣ, ename ����̸�, sal from emp where sal=200 or sal=300 or sal=500;--sal(200,300,500)
--4
select ename ����̸� from emp where sal!=250 or sal!=300 or sal!=500; -- sal not in(250,300,500)
--5
select empno �����ȣ, ename ����̸� from emp where ename like '��%' or ename like '��%' or ename like'%��';
--6
select * from emp where mgr is null;
--7   ���ǹ� ���� ������
select * from emp where sal>=300 order by empno asc ;
SELECT * from usertbl;
SELECT * from deAcc;
SELECT * from bank;
