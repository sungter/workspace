import { useEffect, useState } from 'react'
import './App.css'
import Effect_1 from './Effect_1';

function App() {
  const [cnt, setCnt] = useState(0);
  //useEffect : 컴포넌트의 생애주기에 맞춰 특정 기능을 실행하기 위해 사용한다.
  //uesEffect는 매개변수로 2개의 데이터를 가진다.
  //첫번째 매개변수 : 실행할 내용을 작성, 화살표 함수로 표현
  //두번째 매개변수 : 의존성 배열, 필요할때만 사용한다.
  //useEffect 안의 코드는 html로 화면을 다 그린 후 실행한다.

  //useEffect의 두번째 매개변수를 사용하지 않으면
  //컴포넌트가 mount될 때 + update될 때 실행하는 코드
  //console에 나타나는 순서 : 1 -> 2 -> 111
  // console.log(1)
  // useEffect(() => {
  //   console.log(111);
  // });
  // console.log(2)


  return (
    <>
      <div>Hello world</div>      
      <button type='button' onClick={(e) => {
        setCnt(cnt +1)
      }}>버튼</button>
      <hr />

      <Effect_1 />

    </>
  )
}

export default App
