import axios from "axios";
import React, { useEffect, useState } from "react";

const Axios_1 = () => {
  //서버에서 받은 데이터를 저장할 state 변수
  const [num, setNum] = useState(0);

  //마운트 될때만 서버에서 데이터를 받기 위해 useEffect 사용
  useEffect(()=>{
    //서버에서 데이터 받기
    //get 안에는 데이터를 요청할 url을 요청
    axios.get('/api/t2') //=== 'http://localhost:8080/t2'
        //통신 성공 후 실행 내용 작성
        //res : 통신 성공에 대한 모든 정보가 담겨있는 객체
        .then((res) => {
          console.log('통신 성공');
          console.log(res);
          setNum(res.data);
        })
        //통신 실패 시 실행 내용 작성
        //error : 통신 실패에 대한 모든 정보가 담겨있는 객체
        .catch((error) => {
          console.log('통신 실패');
          console.log(error);
          setNum(error.status);
        });
  }, []);


  return (
    <>
      <h3>Axios_1 데이터 받기</h3>

      <div>{num}</div>
    </>
  );
};

export default Axios_1;
