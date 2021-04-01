DROP TABLE customer;
DROP TABLE BANK;

CREATE TABLE bank
(
    bank_code VARCHAR2(20),
    bank_name VARCHAR2(30)
);

--CREATE TABLE bank
--(
   -- bank_code VARCHAR2(20),
    --bank_name VARCHAR2(30),
    --CONSTRAINT bank_pk PRIMARY KEY (bank_code)
--);

CREATE TABLE customer
(
    no NUMBER,
    name VARCHAR2(30) Not Null,
    phone VARCHAR2(30),
    age NUMBER,
    bank_code VARCHAR2(20)
);


--CREATE TABLE customer
--(
    --no NUMBER,
    --name VARCHAR2(30) Not Null,
    --phone VARCHAR2(30),
    --age NUMBER,
    --bank_code VARCHAR2(20)
    --CONSTRAINT customer_pk PRIMARY KEY (no),
    --CONSTRAINT customer_phone_uq UNIQUE (phone),
    --CONSTRAINT customer_age_ck CHECK(age BETWEEN 0 AND 100),
    --CONSTRAINT customer_bank_fk FOREIGN KEY(bank_code) REFERENCES bank(bank_code)
--);

--테이블변경
--ALTER TABLE 테이블 (ADD, REMOVE, MODIFY등)
ALTER TABLE bank ADD CONSTRAINT bank_pk PRIMARY KEY(bank_code);
ALTER TABLE customer ADD CONSTRAINT customer_pk PRIMARY KEY(no);
ALTER TABLE customer ADD CONSTRAINT customer_phone_uq UNIQUE(phone);
ALTER TABLE customer ADD CONSTRAINT customer_age_check CHECK(age BETWEEN 0 AND 100);
ALTER TABLE customer ADD CONSTRAINT customer_bank_fk FOREIGN KEY(bank_code) REFERENCES bank(bank_code);


