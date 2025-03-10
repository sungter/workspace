
import axios from 'axios';
import React, { useState } from 'react'

const Member = () => {
  const [memId, setMemId] = useState('');
  const [member, setMember] = useState({});
  const [isShow, setIsShow] = useState(false);

  const getMember = () => {
    axios.get(`/api/members/${memId}`)
            .then((res) => {
              console.log(res.data)
              setMember(res.data)
            })
            .catch((error) => {
              console.log(error)
            });
  };

  return (
    <div>
      <p>▼ 조회할 아이디 입력 ▼</p><input type="text" value={memId} onChange={(e)=> {setMemId(e.target.value)}} />
      {console.log(memId)}

      <button type='button' onClick={(e) => {getMember() , setIsShow(true)}}>조회</button>


      {
        isShow ? <table border={1}>
        <thead>
           <tr>
             <td>회원 아이디</td>
             <td>회원 비밀번호</td>
             <td>회원 이름</td>
             <td>회원 연락처</td>
             <td>회원 소개</td>
             <td>회원 가입일</td>
           </tr>
         </thead>
 
         <tbody>
           <tr>
             <td>{member.memId}</td>
             <td>{member.memPw}</td>
             <td>{member.memName}</td>
             <td>{member.memTell}</td>
             <td>{member.memIntro}</td>
             <td>{member.joinDate}</td>
           </tr>
         </tbody>
       </table> : null
      }
      

    </div>
  )
}

export default Member