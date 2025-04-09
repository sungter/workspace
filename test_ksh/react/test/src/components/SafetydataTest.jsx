import axios from 'axios';
import React, { useEffect, useState } from 'react'

const SafetydataTest = () => {
  const [data, setData] = useState(null);
  const [error, setError] = useState(null);

  useEffect(() => {
    const apiKey = 'R48UF0HJOIUF67UD'; // 서비스 키
    const apiUrl = 'https://api.safedata.go.kr//V2/api/DSSP-IF-00247'; // 예시 API URL (실제 URL을 확인 필요)

    const fetchData = async () => {
      try {
        // API 호출
        const response = await axios.get(apiUrl, {
          headers: {
            'Authorization': `Bearer ${apiKey}`, // 또는 'X-Api-Key': apiKey
            'Content-Type': 'application/json'
          },
          params: {
            // 추가적인 파라미터가 필요할 경우
            // 예시: 예를 들어 'page=1&size=10'
            page: 1,  // 페이지 번호 예시
            size: 10  // 한 번에 가져올 데이터의 개수 예시
          }
        });

        setData(response.data); // 응답 데이터를 상태에 저장
      } catch (error) {
        setError(error.message); // 에러 발생 시 에러 메시지 상태에 저장
      }
    };

    fetchData();
  }, []);

  return (
    <div>
      {error && <p>Error: {error}</p>}
      {data ? <pre>{JSON.stringify(data, null, 2)}</pre> : <p>Loading...</p>}
    </div>
  );
};

export default SafetydataTest