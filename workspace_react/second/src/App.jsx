import "./App.css";

// return 안에 html문법은 반드시 하나의 태그에 감싸져야한다.
// 컴포넌트는 반드시 대문자로 시작 ! (소문자면 함수로 인식한다.)
function Header() {
  return (
    <div>
      <h3>header</h3>
    </div>
  );
}

const Footer = () => {
  return (
    <div>
      <h3>footer</h3>
    </div>
  );
};

function App() {
  return (
    <>
      <Header />

      <div>
        <h3>content</h3>
      </div>

      <Footer />
    </>
  );
}

export default App;
