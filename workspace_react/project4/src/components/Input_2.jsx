import React, { useState } from "react";

const Input_2 = () => {
  //모든 input 태그에 저장할 state 객체 변수
  const [person, setPerson] = useState({
    name: "",
    age: "",
    addr: "",
  });

  //input 태그의 값이 변경되면 실행되는 함수 / onChange에 들어갈 함수
  const changePerson = (e) => {
    setPerson({ ...person, [e.target.name]: e.target.value });
  }


  return (
    <>

      이름 :{" "}
      <input
        name="name"
        type="text"
        value={person.name}
        placeholder="이름 입력"
        onChange={(e) => {
          // 함수없이 쓸수도 있음
          setPerson({...person, name : e.target.value})
        }}
      />
      <br />
    
      나이 :{" "}
      <input
        name="age"
        type="text"
        value={person.age}
        placeholder="나이 입력"
        onChange={(e) => {
          changePerson(e);
        }}
      />
      <br />
    
      주소 :{" "}
      <input
        name="addr"
        type="text"
        value={person.addr}
        placeholder="주소 입력"
        onChange={(e) => {
          changePerson(e);
        }}
      />
      <br />
    
      <div>입력받은 이름 : {person.name}</div>
      <div>입력받은 나이 : {person.age}</div>
      <div>입력받은 주소 : {person.addr}</div>
    </>
  );
};

export default Input_2;
