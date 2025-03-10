
-- EMP 테이블에서 급여가 300이상이면서, 700이하인 
-- 사원들의 사번, 사원명, 급여를 조회
SELECT EMPNO 사번
, ENAME 사원명
, SAL 급여
FROM emp
WHERE SAL >= 300 
AND SAL <= 700;

-- 위와 같이 특정 범위를 조건으로 작성할 때는 BETWEEN 연산자를 사용!
-- WHERE 컬럼 A BETWEEN B (포함할때)
SELECT EMPNO 사번, ENAME 사원명, SAL 급여
FROM emp
WHERE SAL BETWEEN 300 AND 700;

-- EMP 테이블에 저장된 직원 정보 중 사번이 1003번 1007번 사이이고,
-- 커미션은 NULL이 아닌 직원들의
-- 사번, 사원명, 급여, 커미션 조회
SELECT EMPNO, ENAME, SAL, COMM
FROM emp
WHERE EMPNO BETWEEN 1003 AND 1007
AND COMM IS NOT NULL;

-- EMP 테이블에 저장된 직원 정보 중
-- 급여가 300, 400, 500인 사원들의 모든 정보 조회
SELECT *
FROM emp
WHERE SAL = 300 OR SAL = 400 OR SAL = 500;

-- 위의 쿼리문은 아래처럼 IN 연산자를 사용하여 작성할 수 있다.
-- IN연산자 : WHERE 컬럼 IN(값 1, 값 2, 값 3, ....);
SELECT *
FROM emp
WHERE SAL IN (300, 400, 500);

-- EMP 테이블에 저장된 직원 정보 중
-- 사번이 1003, 1005, 1007번인 사원들의
-- 사번, 사원명, 입사일을 조회
SELECT EMPNO, ENAME, HIREDATE
FROM emp
WHERE EMPNO IN (1003, 1005, 1007);

-- 조회데이터 정렬하기
-- 정렬 문법 : ORDER BY 정렬기준컬럼 정렬방법; // (오름차순, 내림차순)
-- 오름차순 : ASC, 생량 | 내림차순 : DESC
-- 정렬을 위한 ORDER BY 는 무조건 조회 쿼리문의 가장 마지막에 작성.

-- 급여 기준 오름차순 정렬 조회
SELECT * FROM emp
ORDER BY SAL ASC;
-- 같다
SELECT * FROM emp
ORDER BY SAL ;

-- 급여 기준 내림차순 정렬 조회
SELECT * FROM emp
ORDER BY SAL DESC;

-- 사원명 기준 오름차순으로 정렬 조회(사전편찬 순)
SELECT * FROM emp
ORDER BY ENAME;

-- EMP 테이블에 저장된 직원 정보 중
-- 부서번호가 10번이 아닌 직원들의 사번, 사원명, 부서번호 조회
-- 부서번호 기준 오름차순 정렬 후 사번기준 내림차순 정렬
SELECT EMPNO, ENAME, DEPTNO
FROM emp
WHERE DEPTNO != 10
ORDER BY DEPTNO ASC, EMPNO DESC;

-- EMP 테이블에서 직급이 사원, 과장, 부장인 사람들의
-- 사원명, 직급, 급여를 조회,
-- 정렬 직급 내림차순, 급여 오름차순
SELECT ENAME, JOB, SAL
FROM emp
WHERE JOB IN ('사원', '과장', '부장')
ORDER BY JOB DESC, SAL;

-- 사원명에 '이'라는 글자가 포함된 사원들의 모든 컬럼 조회
-- 컬럼에 특정한 값이 포함된 데이터를 조회할 때는
-- LIKE 연산자와 와일드카드를 사용
-- 와일드 카드는 '%' , '_' 두개가 존재.
-- '%' : 0개 이상의 어떤 글자
-- '_' : 1개의 어떤 글자
-- <예시>
-- '김_' : 김으로 시작하는 두 글자를 찾음 (김 = X, 김1 = O, 김나 = O , 김자바 = X)
-- '_나__' : 두번째 글자가 '나'인 네 글자 찾음
-- '박%' : 박으로 시작하는 모든 글자 (박 = O , 박아무개 = O ...)
-- '_이%' : 두번째 글자가 '이'인 모든 글자 찾음
SELECT * FROM emp
WHERE ENAME LIKE '%이%';

-- 직급 조회시 데이터에서 중복 제거하기
-- 조회시 컬럼명 앞에 DISTINCT 키워드 작성시 중복 데이터 제거
SELECT DISTINCT JOB FROM emp;

-- DISTINCT 키워드 사용시 모든 컬럼에서 중복을 제거
-- 중복 : 조회되는 모든 컬럼의 값이 같을 경우만 중복으로 판단
SELECT DISTINCT JOB, DEPTNO FROM emp WHERE JOB = '과장';


-- Q1
SELECT ENAME, SAL, COMM
FROM emp
WHERE COMM IS NOT NULL
AND SAL BETWEEN 350 AND 650;

-- Q2
SELECT EMPNO, ENAME, JOB
FROM emp
WHERE JOB IN('과장', '차장', '부장')
ORDER BY JOB ASC;

-- Q3
SELECT EMPNO, ENAME, DEPTNO, SAL
FROM emp 
WHERE DEPTNO IN (10, 20)
AND  ENAME LIKE '%이%'
ORDER BY DEPTNO DESC, SAL ASC;

-- Q4
SELECT * FROM emp
WHERE ENAME LIKE '%기'
AND COMM IS NULL
AND SAL BETWEEN 400 AND 800;

-- Q5
-- 3개
