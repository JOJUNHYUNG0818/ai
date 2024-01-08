-- ���̺� �����
-- ���� create table tableName ( column int terms) 
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
    sal number(7,3)-- ���� 7�ڸ� �Ҽ���3�ڸ�
);

-- ���̺� ���� �����ϱ�
-- 1.���� ����� ���̺� �ش� �ڷᰡ �ִٸ� �ڷᰡ �����ȴ�.
alter table emp01 -- ���̺� ���� �߰��ϱ�
    add(birth date);
    
alter table emp01
    add(deptno number(4), addr varchar2(20));

alter table emp01 -- ���̺��� ���� �����ϱ�
    MODIFY ( ename varchar2(20));
alter table emp01 
    MODIFY (empno varchar2(6));

alter table emp01 -- ���̺��� ���� �����
    drop column birth;
alter table emp01
    drop column deptno;


-- ���̺� ���� ����
desc emp01;
desc emp_mi;

-- ���̺���� �̸� �����ϱ�
rename emp_mission to emp_mi;

--���̺� �����ϱ�
drop table emp_mi;

select * from emp;

create table emp_copy -- emp�� �˻����(select)�� ���� ���� ���̺�� �����
as
select* from emp;

desc emp;
desc emp_copy;

drop table emp_copy;
select * from emp_copy;

alter table emp_copy
    drop column comm;

-- ���̺� �Ӽ��� �ٲٱ�    
alter table emp_copy
    rename column hiredate to hire;

select * from emp_copy;

-- ��� ������ �� �����
delete from emp_copy;
SELECT * from emp_copy;

------------------------------

-- ��ųʸ�: �����ͺ��̽� �������� ������ �ִ� ���̺�
-- ��ųʸ��� ������ �ȵǰ� �б⸸ �����ϴ�
SELECT table_name from user_tables; -- �����ͺ��̽��ȿ� ���̺��� ��ϵ��� ��κ���.
SELECT * from user_tables;

SELECT * from all_tables; 
SELECT * from all_tables where table_name = 'EMP';

SELECT * from dba_tables;
-- �����ͺ��̽������ڴ� ����Ŭ���� �̸��� �����Ǿ� ���� sys(��ġ������, �ϵ����, ������ġ- ����Ʈ���� )
-- system = ������ġ�����ϴ»��(����Ʈ����)
-- �ʿ信 ���� ����� ����� �� �� �ִ�

-- DML�� insert,update,delete �� ���ڵ� ����, ����, �����ϱ�

alter table emp01
    drop column addr;
alter table emp01
    drop column hire;

-- ���ڵ� �����ϱ�
-- ��ü�࿡ �� �ִ´�
-- �࿡ Ư�� ���� �ִ´�
SELECT*from emp01;

INSERT INTO emp01 values(1000,'ȫ�浿',123.5); -- �÷����� ������ ���� ������� �־�����
INSERT INTO emp01 (ename, empno, sal ) values ('�̼���',1001,100);
INSERT INTO emp01 (ename,empno) values ('�����',1002);
INSERT INTO emp01 (sal) values (200.0);

INSERT INTO emp01 (empno,ename,sal) values (1004,'',200.0);
--����ֱ�
INSERT INTO emp01 (empno,ename,sal) values (1005,' ',320.0);
alter table emp01
    add hire date;

insert into emp01 values(1010,'�ڼ���',80,'230109');
insert into emp01 values(1011,'�ְ��',0,sysdate);

SELECT*from emp01;

-- �����ϱ�
-- UPDATE ���̺�� SET �÷��� = ���ο where ������
-- ȫ�浿�� �޿��� 200���� �ٲٱ�
UPDATE emp01 SET sal = 200 where ename = 'ȫ�浿';
-- ��ȣ 1004���� ����̸��� '������'��
update emp01 set ename = '������' where empno =1004;
-- ��ȣ�� 1010 ����� �޿��� ����޿����� 100 ���ϱ�, �Ի����� 22�� 10�� 25�Ϸ� �ٲٱ�
update emp01 set sal = sal + 100, hire = '221025' where empno=1010;

-- ��� ��� ���޿� 200 ���ϱ�
update emp01 set sal = nvl(sal + 200,200); -- null �ΰ�� ��ä�ϱ�

-- delete from ���̺�� where ������
-- �޿��� 500 �Ѵ� ����� ����
delete from emp01 where sal>500;

delete from emp01;
-- �ǵ�����
ROLLBACK;

select * from emp01;

commit;

update emp01 set sal = nvl(sal + 200,200);
rollback;

-- ��� ����� �Ի��� ���� ��¥ �����ϱ�
UPDATE  emp01 set hire = sysdate;
rollback; -- ������� �� update ��ҵ�
commit; -- Ʈ����ǿ� ������� DML (insert,update,delete) �� Ȯ����

-- ��������
select * from dept;
--insert into dept values (10,'test','test'); == primary key �ߺ� ������ ���� ����
--insert into dept values (null,'test','test'); == primary key null ������ ���� ����

create table pTable (
    code number(4) PRIMARY KEY,
    name varchar2(14)
);

select* from user_constraints where table_name = 'PTABLE';

--name �÷� ���������� not null �� ��ġ��
alter table pTable
    modify (name varchar2(14) not null);

select * from ptable;

insert into ptable (code, name) values(1010,'a'); 
--insert into ptable (code, name) values(1010,'b'); �ߺ��� ����
--insert into ptable (code, name) values(1030,null); null�� ����

alter table ptable 
    add id varchar(10);

desc ptable;

alter table ptable
    modify (id varchar2(10) unique);

insert into ptable values(1004,'������','jisu');
-- insert into ptable values(1005,'������','jisu'); (unique)=>id �� �ߺ�