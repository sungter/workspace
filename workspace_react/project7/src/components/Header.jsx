
import React from 'react'

// 자식 컴포넌트 Header 에서 매개변수 props로 '받아' 사용
// 구조분해할당으로 객체 props를 받아 사용 // {hobby, age} = props
const Header = ({hobby, age}) => {
  console.log({hobby, age});
  console.log(hobby);


  return (
    <>
      <div>Header</div>


    </>
  )
}

export default Header