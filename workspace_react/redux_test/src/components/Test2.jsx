import React, { useState } from 'react'
import { useDispatch, useSelector } from 'react-redux';
import { handleMemberId } from '../redux/memberSlice';

const Test2 = () => {
  //store 에서 member 가져오기
  const member = useSelector(state => state.member);

  const dispatch = useDispatch();


  return (
    <div>
      <p>회원 아이디 : {member.memId}</p>
      
      <p>회원 나이 : {member.memAge}</p>
      
      아이디 변경 : 
      
      <input 
        type="text" 
        value={member.memId} 
        onChange={e => dispatch(handleMemberId(e.target.value))}
      />

    </div>
  )
}

export default Test2