import axios from 'axios';
import React, { useEffect, useState } from 'react'
import './MemberList.css'
import { useNavigate } from 'react-router-dom';

// 회원 목록을 테이블 형태로 출력
// 회원 목록 테이블에 나타나는 정보로는
// 행번호(No), 회원 아이디, 이름, 연락처, 가입일 이다.

const MemberList = () => {
  const nav = useNavigate();
  const [memberList, setMemberList] = useState([]);

  useEffect((e) => {
    axios.get('/api/members')
        .then((res) => {
          console.log(res.data);
          setMemberList(res.data);
        })
        .catch((error) => {});
  }, []);

  return (
    <div>
      <table>
        <thead>
          <tr>
            <td>No</td>
            <td>회원 아이디</td>
            <td>회원 이름</td>
            <td>회원 연락처</td>
            <td>회원 가입일</td>
          </tr>
        </thead>

        <tbody>
          {
            memberList.map((member, i) => {
              return(
                <tr key={i}>
                  <td>{memberList.length - i}</td>
                  <td onClick={(e) => {nav(`/update/${member.memId}`)}} className='click-event'>{member.memId}</td>
                  <td>{member.memName}</td>
                  <td>{member.memTell}</td>
                  <td>{member.joinDate}</td>
                </tr>
              )
            })
          }
        </tbody>
      </table>
    </div>
  )
}

export default MemberList