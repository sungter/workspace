
import React, { useState } from 'react'

const Input_4 = () => {
  //모든 입력정보를 저장할 state 변수 생성
  const [person, setPerson] = useState({
    name : '',
    phoneNum : '',
    emailAddr : '',
    study : 'kor' 
  });

  //모든 input 태그의 값이 변경될 때 실행할 함수
  //input 태그에 입력한 정보를 person에 저장하는 기능
  const changData = (e) => {
    setPerson({...person, [e.target.name] : e.target.value});
  };

  function getStudy(study){
    if(study === 'kor'){
      return '국어'
    }
    else if (study === 'eng'){
      return '영어'
    }
    else{
      return '수학'
    }
  }


  return (
    <>
    
      <h2>회원가입서</h2>
      
      이름 : <input name='name' type="text" value={person.name} onChange={(e) => {
        changData(e)
      }}/> <br/>

      연락처 : <input name='phoneNum' type="text" value={person.phoneNum} onChange={(e) => {
        changData(e)
      }}/> <br/>

      이메일 : <input name='emailAddr' type="text" value={person.emailAddr} onChange={(e) => {
        changData(e);
      }} /> <br/>

      희망과목 : {" "}
      <select name='study' value={person.study} onChange={(e) => {
        changData(e);
      }}>
        <option value='kor'>국어</option>
        <option value='eng'>영어</option>
        <option value='math'>수학</option>
      </select> <br/>

      <h3>작성내용</h3>
      이름 : {person.name}<br/>
      연락처 : {person.phoneNum}<br/>
      이메일 : {person.emailAddr}<br/>
      희망과목 : {person.study} <br />
      희망과목 : {getStudy(person.study)}

    </>
  )
}

export default Input_4