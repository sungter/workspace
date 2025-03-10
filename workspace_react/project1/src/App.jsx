import "./App.css";
import Footer from "./components/Footer";
import SideMenu from "./components/SideMenu";
import StateTest from "./components/StateTest";
//./components/SideMenu -> [./ 현재 열린 파일(App)기준으로..], [components/SideMenu 컴포넌트 파일 안 사이드메뉴 경로]


function Header() {
  return(
    <div>
      <div>header</div>
    </div>
  )
}

//return을 제외하면, 자바 스크립트(문법)와 동일
function App() {
  let title = '오늘의 제목';
  let arr = [1, 2, 3];
  let person = {
    name : 'kim',
    age : 20
  }

  //numdml 값이 3이상이면 div보이게!
  let num = 5;


  //return문 부터는 jsx문법
  return (
    <>

      <StateTest />

      {
        num >= 3 ? <div>3 이상입니다.</div> : ''
      }
      
      <Header/>

      {/* 리액트에선 class 대신 className을 써야한다. */}
      <div className="title">{title}</div>
      <div>{10} + {20}</div>
      <div>{10 + 20}</div>
      <div>{arr}</div>
      {/* <div>{person}</div> -> 오류) 객체 전체는 출력 안됨. */}
      <div>{person.name}</div>
      <div>hello</div>

      <SideMenu/>

      <Footer/>
    </>
  );
}

export default App;
