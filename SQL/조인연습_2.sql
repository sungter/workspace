

#회원정보 테이블
CREATE TABLE BOARD_MEMBER(
	MEM_ID VARCHAR(20) PRIMARY KEY,	#회원ID
	MEM_NAME VARCHAR(20),				#회원명
	MEM_AGE INT								#회원나이
);

#게시글 정보 테이블
CREATE TABLE FREE_BOARD(
	BOARD_NUM INT PRIMARY KEY,		#글번호
	TITLE VARCHAR(20),				#글제목
	MEM_ID VARCHAR(20),				#작성자(회원ID)
	CREATE_DATE DATETIME				#작성일
);

#회원정보 데이터 삽입
INSERT INTO BOARD_MEMBER VALUES ('aaa', 'kim', 20);
INSERT INTO BOARD_MEMBER VALUES ('abc', 'lee', 30);
INSERT INTO BOARD_MEMBER VALUES ('bbb', 'park', 35);

#게시글 데이터 삽입
INSERT INTO FREE_BOARD VALUES (1, '제목1', 'aaa', '2025-01-02');
INSERT INTO FREE_BOARD VALUES (2, '제목2', 'abc', '2025-01-05');
INSERT INTO FREE_BOARD VALUES (3, '제목3', 'bbb', '2025-01-10');
INSERT INTO FREE_BOARD VALUES (4, '제목4', 'aaa', '2025-01-11');
INSERT INTO FREE_BOARD VALUES (5, '제목5', 'abc', '2025-01-20');
INSERT INTO FREE_BOARD VALUES (6, '제목6', 'aaa', '2025-01-25');

COMMIT;

#1. 작성자ID에 'a'가 포함된 작성자가 쓴 게시글의
# 게시글 제목, 작성자ID, 작성자명을 조회하시오.
SELECT TITLE , F.MEM_ID , MEM_NAME
FROM free_board F INNER JOIN board_member B
ON F.MEM_ID = B.MEM_ID
WHERE F.MEM_ID LIKE '%a%';

#2. 2025-01-07일 이후에 작성된 게시글의
# 글번호, 제목, 작성일, 작성자ID, 작성자의 나이를 조회하되,
# 작성일이 최신인 글부터 조회하시오.
SELECT BOARD_NUM , TITLE , CREATE_DATE , F.MEM_ID , MEM_AGE
FROM free_board F INNER JOIN board_member B
ON F.MEM_ID = B.MEM_ID
WHERE CREATE_DATE > '2025-01-07'
ORDER BY CREATE_DATE DESC;