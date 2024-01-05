create table card(
    cardNumber NUMBER(10) NOT NULL PRIMARY KEY,
    accountNumber NUMBER(12) NOT NULL,
    cardKInd VARCHAR2(8),
    orderDate DATE,
    limitAmount NUMBER(15),
    paymentData DATE
);

INSERT INTO card VALUES(1001,556671,'VISA',sysdate,5000,'2024/01/27');
INSERT INTO card VALUES(1002,556678,'VISA',sysdate,5000,'2024/01/27');
INSERT INTO card VALUES(1003,556679,'MASTER',sysdate,5000,'2024/01/27');
INSERT INTO card VALUES(1004,556677,'CHECK',sysdate,null,null);
INSERT INTO card VALUES(1005,556681,'CHECK',sysdate,null,null);
commit;

drop table userTbl; --���̺�����ϱ�
drop table buyTbl;
drop table deAcc;
drop table custom;


-- �����̺�
create table userTbl(
    userName varchar2(10) NOT NULL PRIMARY KEY,
    birthyear date not null,
    addr varchar2(20) not null,
    mobile varchar2(15)
);

-- �������̺�
create table buyTbl(
    userName varchar2(10) not null primary key,
    prodName VARCHAR2(20) not null,
    price number(10) not null,
    amount number(5) not null,
    CONSTRAINT userName_fk foreign key(userName) REFERENCES userTbl(userName)
);
-- �����̺� �������߰�
INSERT INTO userTbl VALUES('�̽±�','97/12/10','����','011-111-1111');
INSERT INTO userTbl VALUES('���ȣ','71/12/10','����','011-111-1111');

-- �������̺� �������߰�
INSERT INTO  buyTbl VALUES('�̽±�','�ȭ',10000,1);
INSERT INTO  buyTbl VALUES('���ȣ','��Ʈ��',100000,2);

-- ���� ���̺�
create table bank(
    bankName varchar2(20) not null PRIMARY KEY,
    jijum VARCHAR2(20) not null
);

INSERT INTO bank VALUES('����','����');
INSERT INTO bank VALUES('����','����');
INSERT INTO bank VALUES('�츮','����');

-- ���ݰ��� ���̺� 
CREATE TABLE deAcc(
    bankname VARCHAR2(20) not null primary key,-- �θ�Ű�� ������ �ڷ����� name �� �������Ѵ�.
    accKind VARCHAR2(20),
    CONSTRAINT bankName_fk foreign key(bankname) references bank(bankname)
);

INSERT INTO deAcc VALUES('�츮','�Ϲݰ���');
INSERT INTO deAcc VALUES('����','�������');
INSERT INTO deAcc VALUES('����','���ǰ���');
commit;

-- �����̺� (�θ�)
CREATE TABLE custom(
    cardNumber NUMBER(10) NOT NULL PRIMARY KEY,
    cName VARCHAR2(20)
);

CREATE TABLE cardTbl(
    cardNumber NUMBER(10) NOT NULL PRIMARY KEY,
    limitPrice NUMBER(10),
    CONSTRAINT cardNumber_fk FOREIGN KEY(cardNumber) REFERENCES custom(cardNumber)
);

INSERT INTO custom VALUES(1234,'ȫ�浿');
INSERT INTO custom VALUES(1235,'�̼���');
INSERT INTO custom VALUES(1236,'�����');

INSERT INTO cardTbl VALUES(1236, 9000);
INSERT INTO cardTbl VALUES(1234, 3000);
