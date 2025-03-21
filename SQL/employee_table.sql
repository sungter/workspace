
CREATE TABLE REACT_DEPT(
	DEPT_NO INT PRIMARY KEY AUTO_INCREMENT
	, DEPT_NAME VARCHAR(20) NOT NULL
);

INSERT INTO react_dept(DEPT_NAME) VALUES('인사부');
COMMIT;

SELECT * FROM REACT_DEPT;

CREATE TABLE REACT_JOB(
	JOB_NO INT PRIMARY KEY AUTO_INCREMENT
	, JOB_NAME VARCHAR(20) NOT NULL
);

INSERT INTO REACT_JOB(JOB_NAME) VALUES('대리');
COMMIT;

SELECT * FROM REACT_JOB;

CREATE TABLE REACT_EMP(
	EMP_NO INT PRIMARY KEY AUTO_INCREMENT
	, EMP_NAME VARCHAR(20) NOT NULL
	, GENDER VARCHAR(10)
	, HIRE_DATE DATETIME
	, DEPT_NO INT REFERENCES REACT_DEPT (DEPT_NO)
	, JOB_NO INT REFERENCES REACT_JOB (JOB_NO)
);




SELECT D.DEPT_NAME
   , J.JOB_NAME
   , E.EMP_NAME
   , E.GENDER
   , E.HIRE_DATE
FROM react_emp E
INNER JOIN react_dept D
ON E.DEPT_NO = D.DEPT_NO
INNER JOIN react_job J
ON E.JOB_NO = J.JOB_NO
WHERE E.EMP_NAME LIKE '%김성현%'
AND D.DEPT_NAME LIKE '%개발부%'
AND E.GENDER LIKE '%%'
AND E.HIRE_DATE BETWEEN '2025-01-01' AND '2025-12-31';

SELECT * FROM REACT_EMP;
