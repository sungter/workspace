import './App.css'
import Header from './components/Header'
import Counter from './components/Counter'
import RandomNum from './components/RandomNum'
import Lotto from './components/Lotto'

function App() {
  // let hobby = 'react'; 와 밑의 props와 같다.

  // 구조분해할당 (배열, 객체)
  // const arr = [1,2,3];
  // const [a,b,c] = arr;

  // const person = {
  //   name : 'kim',
  //   age : 20,
  //   addr : '울산'
  // };
  // function aaa({name, age}){
  //   console.log(name);
  //   console.log(age);
  // };


  return (
    <>
      {/* <h2>hello</h2> */}

      {/* hobby는 속성이 아니라 변수 이름으로 component에 props이다. */}
      {/* 부모컴포넌트 App에서 자식컴포넌트 Header로 hobby 전달 */}
      {/* <Header hobby={'react'} age={20} /> */}

      {/* <Counter /> */}

      {/* <RandomNum /> */}

      <Lotto />

    </>
  )
}

export default App


