
# 단일행 함수 : 데이터의 갯수에 상관없이 무조건 1행의 데이터만 조회되는 함수

# 단일행 함수가 아닌 함수의 예시
# 이 함수들은 테이블에 저장된 데이터 수에 따라 조회 결과 갯수가 달라진다.
SELECT COMM
	, IFNULL(COMM, 0)
	, CONCAT(EMPNO, '_', ENAME)
	, SUBSTR(JOB, 1, 1)
FROM emp;

# 단일행 함수의 예시 : 모든 사원들 중 급여가 가장 높은 사원의 급여를 조회
# -> 이 예시의 경우 사원수가 달라져도 조회 결과는 무조건 1행만 조회된다.
SELECT MAX(SAL) FROM emp;
# 최소값
SELECT MIN(SAL) FROM emp;
# 평균
SELECT AVG(SAL) FROM emp;
# 갯수
SELECT COUNT(SAL) FROM emp;
# 합계
SELECT SUM(SAL) FROM emp;

# 단일행 함수 사용시 주의사항
# 1. COUNT와 AVG함수 사용 시에는 NULL 데이터에 유의!
# COUNT 함수에서 데이터의 갯수는 NULL데이터는 제외한 갯수를 알려줌
# 결론 1 : 만약, 테이블에 저장된 데이터의 갯수를 알고싶다면 NULL데이터가
#				들어간 컬럼으로 COUNT() 함수를 사용하는 것은 금지!
# 				-> COUNT() 함수는 PK 컬럼으로 사용
SELECT COUNT(SAL), COUNT(COMM) FROM emp;

# COUNT(*)를 사용해도 테이블의 테이터 갯수를 조회할 수 있지만,
# '*' 보다 PK 컬럼을 사용할 것을 권장함.
SELECT COUNT(EMPNO), COUNT(*) FROM emp;

# AVG 함수로 평균을 계산할 때도 NULL인 데이터의 갯수에서 제외되기 때문에 주의!!
# AVG(COMM) : 커미션을 받는 사람들의 평균, AVG(IFNULL(COMM, 0)) : 전체 사원의 커미션 평균
SELECT AVG(SAL), AVG(COMM), SUM(COMM), AVG(IFNULL(COMM, 0)) FROM emp;

# 단일행 함수 사용시 주의사항
# 2. 조회문의 각 컬럼은 조회 결과 데이터의 수가 일치하는 컬럼만 사용 가능!

# EX> 사원들 중 가장 높은 급여와 그 급여를 받는 사원명을 조회

# 결론 2 : 단일행 함수는 단일행 함수끼리만 사용 가능!!!
# 				, 행이 2개 이상인 함수와 같이 사용하면 쿼리 오류!
#				단, GROUP BY 절에 작성한 컬럼은 단일행 함수와 함께 사용 가능

SELECT MAX(SAL), ENAME FROM emp; #자료는 나오지만 다른 데이터 표시

# 조회 데이터 그룹화하기
# 모든 사원 정보에서 가장 높은 급여를 조회하시오.
SELECT MAX(SAL) FROM emp;

# 모든 사원 정보에서 부서별 가장 높은 급여를 조회하시오.(GROUP BY 사용)
SELECT DEPTNO, MAX(SAL), MIN(SAL), SUM(SAL), COUNT(SAL), AVG(SAL)
FROM emp
GROUP BY DEPTNO;

# 직급별 인원수 조회, 직급기준 내림차순
SELECT JOB , COUNT(EMPNO)
FROM emp
GROUP BY JOB
ORDER BY JOB DESC;

# 월별 입사자 수 조회
SELECT MONTH(HIREDATE), COUNT(EMPNO)
FROM EMP
GROUP BY MONTH(HIREDATE);

# 부서별 커미션의 평균을 조회
# 단, 10번 부서는 제외하고 평균은 전체 사원수를 기준으로 조회한다.
SELECT DEPTNO, AVG(IFNULL(COMM, 0))
FROM emp
WHERE DEPTNO != 10
GROUP BY DEPTNO;

# 부서별로 급여의 합을 조회
# 단, 급여의 합이 2000이상인 데이터만 조회
# -> 그룹화 후 적용되는 조건으로 WHERE 대신 HAVING절에 조건을 사용한다.
# 그룹화 전 조건 사용은 WHERE절, 그룹화 후 조건 사용은 HAVING절 사용
SELECT DEPTNO, SUM(SAL)
FROM emp
GROUP BY DEPTNO
HAVING SUM(SAL) >= 2000;

# 직급별 최소 급여를 조회하되, 사원 직급은 제외하며
# 직급별 최소 급여가 300 미만인 데이터도 제외한다.
# 조회 결과 데이터를 직급 기준 오름차순 정렬
SELECT JOB, MIN(SAL)
FROM emp
WHERE JOB != '사원'
GROUP BY JOB
HAVING MIN(SAL) >= 300
ORDER BY JOB ASC;




