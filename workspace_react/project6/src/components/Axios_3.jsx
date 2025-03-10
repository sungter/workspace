import axios from "axios";
import React, { useState } from "react";

const Axios_3 = () => {
  //서버에서 넘어오는 데이터를 저장할 변수의 초기값은 최종적으로 받는 데이터의 자료형과 일치시켜 만들어준다.
  const [person, setPerson] = useState({});

  //서버에서 데이터를 받아 person에 저장하는 함수
  const getPersonData = () => {
    //get : 데이터를 받아올 서버의 주소(url)
    axios
      .get("/api/t3")
      //then : 서버와 통신 성공 시 실행할 내용 작성
      .then((res) => {
        console.log(res.data);
        setPerson(res.data);
      })
      //서버와 통신 실패 시 실행할 내용 작성
      .catch((error) => {
        console.log(error);
      });
  };

  return (
    <>
      <h2>Axios_3</h2>

      <input type="button" value={"Info ▼"} onClick={(e) => {
        getPersonData();
      }} />

      <h4>이름 : {person.name}</h4>
      <h4>나이 : {person.age}</h4>
      <h4>주소 : {person.addr}</h4>
    </>
  );
};

export default Axios_3;
