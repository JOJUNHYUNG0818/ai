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

drop table userTbl; --테이블삭제하기
drop table buyTbl;
drop table deAcc;
drop table custom;


-- 고객테이블
create table userTbl(
    userName varchar2(10) NOT NULL PRIMARY KEY,
    birthyear date not null,
    addr varchar2(20) not null,
    mobile varchar2(15)
);

-- 구매테이블
create table buyTbl(
    userName varchar2(10) not null primary key,
    prodName VARCHAR2(20) not null,
    price number(10) not null,
    amount number(5) not null,
    CONSTRAINT userName_fk foreign key(userName) REFERENCES userTbl(userName)
);
-- 고객테이블 데이터추가
INSERT INTO userTbl VALUES('이승기','97/12/10','서울','011-111-1111');
INSERT INTO userTbl VALUES('김경호','71/12/10','전남','011-111-1111');

-- 구매테이블 데이터추가
INSERT INTO  buyTbl VALUES('이승기','운동화',10000,1);
INSERT INTO  buyTbl VALUES('김경호','노트북',100000,2);

-- 은행 테이블
create table bank(
    bankName varchar2(20) not null PRIMARY KEY,
    jijum VARCHAR2(20) not null
);

INSERT INTO bank VALUES('국민','강동');
INSERT INTO bank VALUES('신한','강남');
INSERT INTO bank VALUES('우리','송파');

-- 예금계좌 테이블 
CREATE TABLE deAcc(
    bankname VARCHAR2(20) not null primary key,-- 부모키와 동일한 자료형과 name 을 가져야한다.
    accKind VARCHAR2(20),
    CONSTRAINT bankName_fk foreign key(bankname) references bank(bankname)
);

INSERT INTO deAcc VALUES('우리','일반계좌');
INSERT INTO deAcc VALUES('신한','대출계좌');
INSERT INTO deAcc VALUES('국민','증권계좌');
commit;

-- 고객테이블 (부모)
CREATE TABLE custom(
    cardNumber NUMBER(10) NOT NULL PRIMARY KEY,
    cName VARCHAR2(20)
);

CREATE TABLE cardTbl(
    cardNumber NUMBER(10) NOT NULL PRIMARY KEY,
    limitPrice NUMBER(10),
    CONSTRAINT cardNumber_fk FOREIGN KEY(cardNumber) REFERENCES custom(cardNumber)
);

INSERT INTO custom VALUES(1234,'홍길동');
INSERT INTO custom VALUES(1235,'이순신');
INSERT INTO custom VALUES(1236,'김명자');

INSERT INTO cardTbl VALUES(1236, 9000);
INSERT INTO cardTbl VALUES(1234, 3000);
