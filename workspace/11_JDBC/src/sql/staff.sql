--staff테이블 삭제
DROP TABLE staff;

--staff테이블 추가
CREATE TABLE staff
(
	no Number,
	name VARCHAR2(100),
	department VARCHAR2(100),
	hireDate DATE,
	PRIMARY KEY(no)
);

SELECT no, name, department, hireDate FROM staff;

SELECT MAX(no) FROM staff;