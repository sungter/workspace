import React, { useState } from 'react'

const Practice = () => {
  const [person, setPerson] = useState({
    name : '',
    email : '',
    pw : '',
    major : '수학',
    gender : 'man',
    info : ''
  });

  const changePerson = (e) => {
    setPerson({...person, [e.target.name] : e.target.value})
  };



  // const hobby = ['여행 ', '게임 ', '공연 ', '운동 ', '기타 '];
  // const [checkboxItems, setCheckboxItems] = useState([]);
  // const checkAll = (e) => {
  //   setCheckboxItems(e.target.checked ? hobby : []);
  // };

  // const checkItem = (e) => {
  //   if(e.target.checked){
  //     setCheckboxItems([...checkboxItems, e.target.value])
  //   }
  //   else{
  //     const copyItems = checkboxItems.filter((item) => {return item !== e.target.value});
  //     setCheckboxItems(copyItems);
  //   }
  // };


  return (
    <>
      이름 : <input name='name' type="text" value={person.name} onChange={(e) => {
        changePerson(e);
      }}/> <br />    

      이메일 : <input name='email' type="text" value={person.email} onChange={(e) => {
        changePerson(e);
      }}/> <br />

      비밀번호 : <input name='pw' type="password" value={person.pw} onChange={(e) => {
        changePerson(e);
      }}/> <br />

      학과 : <select name="major" value={person.major} onChange={(e) => {
        changePerson(e);
      }}>
        <option value='수학'>수학</option>
        <option value='영어'>영어</option>
        <option value='국어'>국어</option>
      </select> <br />

      성별 : 
      <input name='gender' type="radio" value='man' checked = {person.gender === 'man'} onChange={(e) => {changePerson(e)}}/>남자
      <input name='gender' type="radio" value='woman' checked = {person.gender === 'woman'} onChange={(e) => {changePerson(e)}} /> 여자 <br />

      자기소개 : <br /> <textarea style={{resize : 'none'}} cols={60} rows={8} placeholder='내용을 입력하시오.'   name="info" value={person.info} onChange={(e) => {changePerson(e)}}></textarea>
      <br />

      {/* 관심사 :
      
      <input type="checkbox" onChange={(e) => {checkAll(e)}} /> 전체
      {
        hobby.map((item, i) => {
          return(
            <tr key={i}>
              <td>
                <input type="checkbox" value={item} checked ={checkboxItems.includes(item)}
                onChange={(e) => {checkItem(e)}} />
              </td>
              <td>{item}</td>
            </tr>
          )
        })
      } */}


      <h3>작성 내용</h3>
      이름 : {person.name} <br />
      이메일 : {person.email} <br />
      비밀번호 : {person.pw} <br />
      학과 : {person.major} <br />
      성별 : {person.gender} <br />
      자기소개 : {person.info} <br />
      
      {/* 관심사 : {[checkboxItems]} */}

    </>
  )
}

export default Practice