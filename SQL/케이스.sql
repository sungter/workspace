
# CASE
SELECT * FROM emp;

SELECT SAL
	, CASE
		WHEN SAL > 500 THEN '500초과'
		WHEN SAL < 500 THEN '500미만'
		ELSE '=='
		END AS AAA # 별칭 안넣으면 조건으로 나옴
FROM emp;

