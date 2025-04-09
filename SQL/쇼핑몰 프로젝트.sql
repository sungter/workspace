# 도서 쇼핑몰 프로젝트

# 도서 관련 테이블 (상품 카테고리, 상품 정보, 상품 이미지 정보)
# 1. 도서 카테고리 테이블(소설, 자기계발...)
CREATE TABLE BOOK_CATEGORY (
	CATE_CODE INT PRIMARY KEY AUTO_INCREMENT # 카테고리 코드(PK)
	, CATE_NAME VARCHAR(30) NOT NULL UNIQUE # 카테고리 이름
);
SELECT * FROM book_category;
INSERT INTO book_category VALUES(1, 'IT/인터넷');
INSERT INTO book_category VALUES(2, '소설');
INSERT INTO book_category VALUES(3, '자기계발');
COMMIT;

# 2. 도서 테이블
CREATE TABLE BOOK(
	BOOK_CODE INT PRIMARY KEY AUTO_INCREMENT
	, BOOK_NAME VARCHAR(30) NOT NULL
	, BOOK_PRICE INT NOT NULL
	, PUBLISHER VARCHAR(30) NOT NULL # 출판사
	, BOOK_INFO VARCHAR(100)
	, REG_DATE DATETIME DEFAULT SYSDATE()
	, BOOK_STOCK INT DEFAULT 10 #재고 수량
	, CATE_CODE INT NOT NULL REFERENCES book_category (CATE_CODE)
);

# 도서 테이블에 첨부된 이미지를 저장할 테이블
CREATE TABLE BOOK_IMG(
	IMG_CODE INT PRIMARY KEY AUTO_INCREMENT
	, ORIGIN_FILE_NAME VARCHAR(100) NOT NULL
	, ATTACHED_FILE_NAME VARCHAR(100) NOT NULL
	, IS_MAIN VARCHAR(3)	NOT NULL 		#'Y'  참, 'N' 거짓
	# ON DELETE CASCADE : 부모 테이블 외래키를 지우면 자식 테이블 데이터 지우는 명령어
	# ON DELETE SET NULL : 부모테이블 행에 대한 DELETE를 허용하고 외래키를 NULL값으로 변경하는 명령어
	, BOOK_CODE INT NOT NULL REFERENCES book(BOOK_CODE) ON DELETE CASCADE
);



# INSERT 쿼리 한 번에 여러 데이터 INSERT 하기(예시) - VALUES에 () 여러개 넣기
INSERT INTO BOOK_IMG (
	IMG_CODE
	, ORIGIN_FILE_NAME
	, ATTACHED_FILE_NAME
	, IS_MAIN
	, BOOK_CODE
) VALUES
	(1, 'AAA.jpg', '1111-2222.jpg', 'Y', 1),
	(2, 'AAA.jpg', '1111-2222.jpg', 'N', 1);

ROLLBACK;

SELECT * FROM book;
SELECT * FROM BOOK_IMG;
SELECT * FROM book_category;
DELETE FROM book;
COMMIT;

# 모든 상품에 대해서 첨부된 상품 이미지명, 상품명, 가격을 조회
# 메인 이미지만 조회
SELECT ATTACHED_FILE_NAME, BOOK_NAME, BOOK_PRICE
FROM book B
INNER JOIN book_img I
ON I.BOOK_CODE = B.BOOK_CODE
WHERE IS_MAIN = 'Y';

#BOOK 테이블에 저장된 BOOK_CODE 중 가장 큰 수 조회
SELECT IFNULL(MAX(BOOK_CODE) , 0) + 1 FROM book;






# 회원 관련 테이블 (회원 정보)


#회원가입 테이블
CREATE TABLE SHOP_USER(
	USER_ID VARCHAR(30) PRIMARY KEY
	, USER_PW VARCHAR(30) NOT NULL
	, USER_NAME VARCHAR(10) NOT NULL
	, USER_EMAIL VARCHAR(30)
	, USER_TEL VARCHAR(16) NOT NULL UNIQUE
	, USER_ROLL VARCHAR(10) DEFAULT 'USER' # 권한 : USER - 사용자, ADMIN-관리자
	, IS_USING VARCHAR(10) DEFAULT 'Y' # 상태 : Y - 사용 중, N - 탈퇴
	, JOIN_DATE DATETIME DEFAULT SYSDATE()
);

# 관리자 정보 INSERT
INSERT INTO shop_user VALUES(
	'admin',
	'1111',
	'관리자',
	'eroo@naver.com',
	'010-9874-1234',
	'ADMIN',
	'Y',
	NOW()
);

COMMIT;

SELECT * FROM SHOP_USER;


SELECT 
	B.BOOK_CODE
	, B.BOOK_NAME
	, B.BOOK_PRICE
	, I.ATTACHED_FILE_NAME
FROM book B INNER JOIN book_img I
ON B.BOOK_CODE = I.BOOK_CODE
WHERE IS_MAIN = 'Y';

SELECT * FROM book;
SELECT * FROM book_img;

DELETE FROM book WHERE BOOK_CODE = 6;
COMMIT;