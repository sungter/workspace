
import React, { useState } from 'react'

const PracticeResult = () => {
  const [info, setInfo] = useState({
    name : '',
    email : '',
    password : '',
    major : '',
    gender : 'male',
    intro : ''
  });

  const changeInfo = (e) => {
    setInfo({...info, [e.target.name] : e.target.value});
  };

  return (
    <>
      이름 : <input name='name' type="text" value={info.name} onChange={(e) => {changeInfo(e)}} /> <br />
      이메일 : <input name='email' type="text" value={info.email} onChange={(e) => {changeInfo(e)}} /> <br />
      비밀번호 : <input name='password' type="password" value={info.password} onChange={(e) => {changeInfo(e)}} /> <br />
      
      학과
      <select name='major' value={info.major} onChange={(e) => {changeInfo(e)}}>
        <option value="">학과를 선택하세요</option>
        <option value="computer">컴퓨터공학</option>
        <option value="business">경영학과</option>
      </select> 
      <br />

      성별
      <input name='gender' type="radio" value='male' checked = {info.gender === 'male'} onChange={(e) => {changeInfo(e)}} />남자
      <input name='gender' type="radio" value='female'checked = {info.gender === 'female'} onChange={(e) => {changeInfo(e)}} />여자
      <br />

      자기소개
      <br />
      <textarea name='intro' cols="50" rows="5" value={info.intro} onChange={(e) => {changeInfo(e)}}></textarea>
      <br />

      <div>
        <h3>입력정보</h3>
        이름 : {info.name} <br />
        이메일 : {info.email}<br />
        비밀번호 : {info.password}<br />
        학과 : {info.major}<br />
        성별 : {info.gender}<br />
        자기소개 : {info.intro}<br />
      </div>

    </>
  )
}

export default PracticeResult