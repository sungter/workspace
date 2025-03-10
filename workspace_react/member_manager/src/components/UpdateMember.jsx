
import axios from 'axios';
import React, { useEffect, useState } from 'react'
import { useNavigate, useParams } from 'react-router-dom';

const UpdateMember = () => {
  const nav = useNavigate();
  const {memId} = useParams();

  // const [memId, setMemId] = useState('');
  const [member, setMember] = useState({});
  // const [isShow, setIsShow] = useState(false);

  useEffect(() => {
    axios.get(`/api/members/${memId}`)
            .then((res) => {
              //console.log(res.data)
              setMember(res.data)
            })
            .catch((error) => {
              console.log(error)
            });
  }, [memId]);

  // 확인 취소 함수
  // const onDeleteClick = () => {
  //   //confirm : 확인 -> true
  //   //confirm : 취소 -> false
  //   if(confirm('삭제하시겠습니까?')){
  //     deleteMemberButton();
  //   }
  //   else{
  //     alert('취소');
  //   }
  // };

  const deleteMemberButton = () => {
    // 함수 지정하지 않고 사용방법
    if(!confirm('삭제할까요?')){
      return;
    }

    axios.delete(`/api/members/${memId}`)
            .then((res) => {
              console.log(res.data);
              alert('삭제되었습니다.');
              nav('/');
            })
            .catch((error) => {
              console.log(error);
            });
  };

  // const getMember = () => {
  //   axios.get(`/api/members/${memId}`)
  //           .then((res) => {
  //             console.log(res.data)
  //             setMember(res.data)
  //           })
  //           .catch((error) => {
  //             console.log(error)
  //           });
  // };

  const changeMember = (e) => {
    setMember({...member,
      [e.target.name] : e.target.value
    })
  };

  const updateMember = () => {
    axios.put(`/api/members/${member.memId}`, member)
        .then((res) => {
          //setMember(res.data);
          console.log(res.data);
        })
        .catch((error) => {});
  }

  console.log(member);
  
  return (
    <div>
      {/* 변경할 아이디 입력 : <input type="text" value={memId} onChange={(e)=> {setMemId(e.target.value)}} /> */}

      {/* <button type='button' onClick={(e) => {getMember() , setIsShow(true)}}>조회</button> */}


      {/* {
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
      } */}




    <table>
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
    </table> 




      <p>수정할 데이터 입력</p>
      <p>▼ 비밀번호 ▼</p> <input type="text" name='memPw' value={member.memPw} onChange={(e) => {changeMember(e)}} />
      <p>▼ 이름 ▼</p><input type="text" name='memName' value={member.memName} onChange={(e) => {changeMember(e)}} />
      <p>▼ 연락처 ▼</p><input type="text" name='memTell' value={member.memTell} onChange={(e) => {changeMember(e)}} />
      <p>▼ 소개 ▼</p><input type="text" name='memIntro' value={member.memIntro} onChange={(e) => {changeMember(e)}} />

      <br />
      <br />

      {/* nav()로 다시 돌아갈때 "/" = "" 같음, onclick에 쓰는거 보단 axios의 then에서 쓰는게 더 좋음 */}
      <button type='button' onClick={(e) => {updateMember(), nav('/')}}>변경하기</button>

      <button type='button' onClick={(e) => {deleteMemberButton()}}>회원 탈퇴</button>

    </div>
  )
}

export default UpdateMember

