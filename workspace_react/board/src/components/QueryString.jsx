
import axios from 'axios';
import React, { useState } from 'react'
import { useSearchParams } from 'react-router-dom'

const QueryString = () => {
  //쿼리 스트링으로 넘어오는 데이터 받기
  //배열의 첫 번째 인자 : 쿼리 스트링으로 넘어오는 데이터 (객체 형식)
  //배열의 두 번째 인자 : 전달받은 데이터를 변경하는 함수 -> 쓰는 일 거의 없음.
  const [params, setParams] = useSearchParams();
  console.log(params);
  const age = params.get('age');
  console.log(age);
  const name = params.get('name');
  console.log(name);

  const [boardList, setBoardList] = useState([]);

  const sendData1 = () => {
    axios.get(`/api/replys/test?age=${age}&name=${name}`)
        .then(res => {})
        .catch(error => console.log(error));
  };

  return (
    <div>
      <div>QueryString 연습</div>
      <button type='button' onClick={(e) => {sendData1()}}>데이터 전송</button>
    </div>
  )
}

export default QueryString