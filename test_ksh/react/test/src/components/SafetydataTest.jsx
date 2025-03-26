import React, { useEffect, useState } from 'react'

const SafetydataTest = () => {

  const [responseData, setResponseData] = useState(null);
  const [loading, setLoading] = useState(true);
  const [error, setError] = useState(null);

  useEffect(() => {
    // API 요청을 위한 기본 URL과 파라미터 설정
    const dataName = "데이터명";  // 필요시 설정
    const serviceKey = "서비스키";  // 실제 서비스키로 변경
    const pageNo = "1";
    const numOfRows = "10";

    const url = new URL("https://www.safetydata.go.kr/V2/api/DSSP-IF-00247");
    const params = {
      serviceKey: serviceKey,
      pageNo: pageNo,
      numOfRows: numOfRows,
    };

    // URL에 파라미터 추가
    Object.keys(params).forEach((key) => url.searchParams.append(key, params[key]));

    // API 호출
    const fetchData = async () => {
      try {
        const response = await fetch(url);
        if (response.ok) {
          const data = await response.json();  // 응답이 JSON이라 가정
          setResponseData(data);
        } else {
          throw new Error('API 요청에 실패했습니다.');
        }
      } catch (error) {
        setError(error.message);
      } finally {
        setLoading(false);
      }
    };

    fetchData();
  }, []);  // 컴포넌트 마운트 시 한 번 실행

  if (loading) {
    return <div>Loading...</div>;
  }

  if (error) {
    return <div>Error: {error}</div>;
  }

  return (
    <div>
      <h1>API 응답 데이터</h1>
      <pre>{JSON.stringify(responseData, null, 2)}</pre>
    </div>
  )
}

export default SafetydataTest