
import React, { useState } from 'react'

const Input_3 = () => {
  //selectbox에서 선택한 데이터를 저장하기 위한 state 변수
  //초기값은 여러 option들 중에 최초로 화면에 표현하고 싶은 option태그의 value 속성값으로 지정
  //option에 value를 넣지 않으면 자동으로 적혀있는 값을 지정한다
  //ex> <option>사과</option> 의 value 는 '사과'
  const [fruit, setFruit] =useState('apple');



  return (
    <>
      <select value={fruit} onChange={(e) => {setFruit(e.target.value)}}>
        <option value='apple'>사과</option>
        <option value='banana'>바나나</option>
        <option value='orange'>오렌지</option>
      </select>

      {/* 예제 */}

      
      

    </>
  )
}

export default Input_3