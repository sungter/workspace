
CREATE TABLE board(
	BOARD_NUM INT PRIMARY KEY AUTO_INCREMENT
	, TITLE VARCHAR(30) NOT NULL
	, WRITER VARCHAR(30) NOT NULL
	, CONTENT VARCHAR(30)
	, READ_CNT INT DEFAULT 0
	, REG_DATE DATETIME DEFAULT SYSDATE()
);

INSERT INTO board(
	TITLE
	, WRITER
	, CONTENT
) VALUES(
	'첫번째 글'
	, '김자바'
	, '첫번째 게시글 내용입니다~'
);

INSERT INTO board(
	TITLE
	, WRITER
	, CONTENT
) VALUES(
	'두번째 글'
	, '이자바'
	, '두번째 게시글 내용입니다~'
);

INSERT INTO board(
	TITLE
	, WRITER
	, CONTENT
) VALUES(
	'세번째 글'
	, '김자바'
	, '세번째 게시글 내용입니다~'
);

INSERT INTO board(
	TITLE
	, WRITER
	, CONTENT
) VALUES(
	'제목입니다.'
	, '홍길동'
	, '게시글 내용입니다~'
);



DELETE FROM board
WHERE BOARD_NUM = 9;


UPDATE board
SET READ_CNT = 0
WHERE BOARD_NUM = 1;

COMMIT;

SELECT * FROM board
WHERE TITLE LIKE '%%'
AND WRITER LIKE '%이자바%';



SELECT * FROM board;















