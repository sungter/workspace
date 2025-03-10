
#수치 관련 함수
#CEIL : 올림
#FLOOR : 내림
#ROUND : 반올림 / 인자 2개 사용시 2번째 인자는 소수점 자릿수 표기
SELECT CEIL(70.1), FLOOR(70.1), ROUND(70.1);

SELECT ROUND(123.456 , 1), ROUND(123.456 , 2);

#TRUNCATE : 버림  // FLOOR는 소수점 두번째 자리가 안됨
SELECT TRUNCATE(123.456 , 1), TRUNCATE(123.456 , 2);

#MOD : 나머지 / JAVA에서 % 와 같다.
SELECT MOD(10, 4);

#EMP테이블에서 사번이 짝수인 사원들의 모든 컬럼값 조회
SELECT * FROM emp
WHERE MOD(EMPNO , 2) = 0;


#----------------------------------------------------------------#

#문자 관련 함수
#SUBSTR , SUBSTRING : 문자열 추출 // 3번째 인자는 글자 수 의미.
SELECT SUBSTR('ABCDEF' , 3) #CDEF
	, SUBSTRING('ABCDEF' , 3) #CDEF
	, SUBSTR('ABCDEF' , 3 , 2) #CD
	, SUBSTRING('ABCDEF' , 3 , 2); #CD

#UPPER : 대문자 변경
#LOWER : 소문자 변경
SELECT 'MariaDB' , UPPER('MariaDB'), LOWER('MariaDB');

#데이터의 글자수를 맞추는 함수
#LPAD(원본문자 , 완성할 글자수 , 채워줄 문자)
#RPAD(원본문자 , 완성할 글자수 , 채워줄 문자)
SELECT LPAD('DB' , 5 , '@') , RPAD('DB' , 5 , '@');

#L,R, TRIM : 공백 제거 / 앞뒤로 스페이스바 3번
SELECT LTRIM('   DB   '), RTRIM('   DB   '), TRIM('   DB   ');

#영어, 숫자 한 글자 : 1byte
#국어, 한자 한 글자 : 3byte
#CHAR_LENGTH : 글자 길이
#LENGTHB : B(BYTE) 크기
SELECT CHAR_LENGTH('디비'), LENGTHB('디비');

#CONCAT(문자, 문자, 문자...) : 문자 나열 / JAVA와 같다
SELECT CONCAT('A', 'B', 'C');
SELECT CONCAT(JOB, ENAME) AS '나열값' FROM emp; #예시

#REPLACE : 일부문자 대체 / JAVASCRIPT와 같다.
SELECT REPLACE('나는 HOME에 있고 싶다.' , 'HOME' , '집');

#IF() : 논리연산 / 삼항연산자와 비슷
SELECT IF(10 > 2 , '참' , '거짓');

#IFNULL(컬럼, 대체 값) : 첫번째 인자로 주어진 데이터가 NULL이 아니면 데이터 조회
#첫번째 인자로 주어진 데이터가 NULL이면 대체값으로 데이터 조회
#NULL은 COUNT 함수 사용시 갯수 포함 안하기 때문에 IFNULL로 바꿔 사용
SELECT COMM, IFNULL(COMM, 0) FROM emp; 

