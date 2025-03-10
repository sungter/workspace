
-- 주석 (하이픈 2개 + spacebar 후 사용)

-- 실행 : 현재 열려있는 쿼리 탭의 모든 쿼리를 일괄 실행
-- 선택실행 : 마우스로 드래그한 쿼리만 실행
-- 현재쿼리실행 : 현재 커서가 올라가 있는 쿼리만 실행

-- 데이터 조회
-- SELECT 컬럼명 FORM 테이블명 WHERE 조건;

-- EMP 테이블의 사원들 사번 조회
SELECT EMPNO FROM emp;

-- EMP 테이블에서 모든 사원의 사번, 사원명, 급여를 조회
SELECT EMPNO,ENAME,SAL FROM emp;

-- 별칭사용, 조회시 조회되는 컬럼명을 변경하여 조회 / AS 키워드 생략이 가능
SELECT EMPNO AS 사번,ENAME AS 이름,SAL 급여 FROM emp;

-- EMP 테이블의 모든 컬럼을 조회
SELECT * FROM emp;

-- SELECT로 조회 가능한 것(쓸일 없음)
SELECT 5 FROM emp;
SELECT 5, 'JAVA', 3 + 3 FROM dept;
-- 문법 확인용
SELECT 'DB', 3+5;
-- SELECT EMPNO; 컬럼명 조회시 반드시 테이블명 명시! 오류!

-- 조회에 조건 사용하기 (WHERE)
-- 크기비교 : > , < , >= , <= , =, !=, <> 같지않다. , 
-- 급여가 300 이상인 사원들의 사번, 사원명, 급여를 조회
SELECT EMPNO 사번, ENAME 사원명, SAL 급여 FROM emp 
WHERE SAL >= 300;

-- 직급이 대리인 사원들의 사번, 사원명, 직급, 입사일을 조회
SELECT EMPNO 사번, ENAME 사원명, JOB 직급, HIREDATE 입사일 FROM emp
WHERE JOB = '대리';

-- 동시에 만족 : AND, 둘 중 하나 만족 : OR
-- 급여가 400 이상이고, 직급이 '과장'인 사원들의 모든 컬럼 조회
SELECT * FROM emp WHERE SAL >= 400 AND JOB = '과장';

-- EMP 테이블의 모든 사원들 중 급여가 400이하이거나 700 이상인 사원들의 사번, 사원명, 급여 조회
SELECT EMPNO 사번, ENAME 사원명, SAL 급여 FROM emp
WHERE SAL <= 400 OR SAL >= 700;

-- 조건절을 작성할 때는 NULL 체크 문법에 주의 !
-- 조건 : COMM이 NULL인 데이터만 조회
SELECT EMPNO, ENAME, SAL, COMM FROM emp
WHERE COMM IS NOT NULL;

-- Q1
SELECT EMPNO
 , ENAME
 , SAL
 , COMM 
FROM emp;

-- Q2
SELECT EMPNO
 , ENAME NAME
 , JOB 
FROM emp
WHERE EMPNO >= 1005; 

-- Q3
SELECT ENAME 
 , JOB
 , SAL
 FROM emp
WHERE JOB = '대리'
OR JOB = '과장';

-- Q4
SELECT * 
FROM emp
WHERE SAL >= 300
AND COMM >= 300;

-- Q5
SELECT ENAME 
 , JOB
 , SAL
 , COMM 
FROM emp
WHERE SAL <= 900 
AND (JOB ='대리' OR JOB = '과장') 
AND COMM IS NOT NULL;

DROP TABLE board;
