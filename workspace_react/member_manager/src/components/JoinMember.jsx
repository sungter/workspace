
import axios from 'axios';
import React, { useState } from 'react'
import { useNavigate } from 'react-router-dom';

const JoinMember = () => {
  const nav = useNavigate();

  const [insertMember, setInsertMember] = useState({
    memId : ''
    , memName : ''
    , memPw : ''
    , memTell : ''
    , memIntro : ''
    , pwConfirm : ''
  });

  const joinMember = (e) => {
    setInsertMember({
      ...insertMember, 
      [e.target.name] : e.target.value
    });
  };

  //데이터 유효성 검사 (validation 처리) : 빈 값 혹은 잘못된 값을 입력시
  //DB 데이터에 잘못된 데이터를 들어가는 것을 방지시키기 때문에 필수로 작성해야됨
  const validateInsertMember = () => {
    let isValid = true;
    //else if를 쓰지 않는 이유? 첫 if문 조건이 충족하면 다음 else if가 진행 안됨.
    if(insertMember.memId === '' ){
      alert('ID는 필수 입력 사항입니다.');
      isValid = false;
    }

    if(insertMember.memName === ''){
      alert('이름은 필수 입력 사항입니다.');
      isValid = false;
    }

    if(insertMember.memPw !== insertMember.pwConfirm){
      alert('입력한 두 비밀번호가 다릅니다.');
      isValid = false;
    }

    return isValid;
  };



  const postData = () => {
    if(!validateInsertMember()){
      return;
    }

    //spring 데이터 보내는 기능
    axios.post('/api/members', insertMember)
            .then((res) => {
              console.log(res.data)

              if(res.data !== 1){
                alert('알 수 없는 이유로 오류가 발생했습니다.');
                // return은 if문 안에서 사용시 javascript에서 함수를 종료시킴.
                return;
              }
              
              alert(`${insertMember.memId}님 가입을 축하합니다.`);
              nav('/');
              
            })
            .catch((error) => {
              console.log(error)
            });
  };

  console.log(insertMember);

  return (
    <div>
      <p>▼ 아이디 ▼</p>
      <input type="text" name='memId' value={insertMember.memId} onChange={joinMember} />

      <p>▼ 이름 ▼</p>
      <input type="text" name='memName' value={insertMember.memName} onChange={joinMember} />

      <p>▼ 비밀번호 ▼</p>
      <input type="password" name='memPw' value={insertMember.memPw} onChange={joinMember} />

      <p>▼ 비밀번호 확인 ▼</p>
      <input type="password" name='pwConfirm' value={insertMember.pwConfirm} onChange={joinMember} />

      <p>▼ 전화번호 ▼</p>
      <input type="text" name='memTell' value={insertMember.memTell} onChange={joinMember} />
      
      <p>▼정보 ▼</p>
      <input type="text" name='memIntro' value={insertMember.memIntro} onChange={joinMember} />



      <br></br>
      <br></br>

      

      <button type='button' onClick={(e) => {
        postData()
      }}>가입</button>
    </div>
  )
}

export default JoinMember