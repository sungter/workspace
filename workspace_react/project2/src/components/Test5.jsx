import "./Test5.css";
import React, { useState } from "react";

const Test5 = () => {
  const [person, setPerson] = useState({
    name : '이름 : 김자바',
    age : '나이 : 20',
    addr : '주소 : 울산시'
  });

  return (
    <>
      <div>Test5</div>

      <div className="list">{person.name}</div>
      <div className="list">{person.age}</div>
      <div className="list">{person.addr}</div>

      <button type="button" onClick={() => {
        setPerson({...person, name : '이름 : 홍길동'})
      }}>이름을 홍길동으로 변경</button>

      <button type="button" onClick={() => {
        setPerson({...person, age : '나이 : 30'})
      }}>나이를 30으로 변경</button>

      <button type="button" onClick={() => {
        setPerson({...person, addr : '주소 : 서울시'})
      }}>주소를 서울시로 변경</button>

    </>
  );
};

export default Test5;
