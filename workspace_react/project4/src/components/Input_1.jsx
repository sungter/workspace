import React, { useState } from "react";

const Input_1 = () => {
  //input 태그의 value 속성값을 저장할 state 변수를 생성
  const [data, setdata] = useState('');

  return (
    <>
      <h2>input 태그에 데이터 입력 받기</h2>

      
      <input type="text" value={data} onChange={(e) => {
        console.log(e.target.value)
        setdata(e.target.value)
      }} />

      <div>
        input 태그에 입력한 내용 : {data}
      </div>

    </>
  );
};

export default Input_1;
