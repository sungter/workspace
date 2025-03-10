
import { Route, Routes, useNavigate } from 'react-router-dom'
import './App.css'
import MemberList from './components/MemberList'
import JoinMember from './components/JoinMember'
import Member from './components/Member';
import UpdateMember from './components/UpdateMember';

function App() {
  const nav = useNavigate();

  return (
    <>
      <h1>회원 관리 프로그램</h1>

      <Routes>
        
        {/* 회원 목록 페이지 */}
        <Route path='' element={ <MemberList /> } />
        {/* 회원 가입 페이지 */}
        <Route path='/join' element={ <JoinMember/> } />
        {/* 회원 한명 상세 보기 페이지 */}
        <Route path='/member' element={ <Member /> } />
        {/* 회원 정보 수정 페이지 */}
        <Route path='/update/:memId' element={<UpdateMember />} />

      </Routes>

      <br/>

      <div className='menu'>
        <button type='button' onClick={(e) => {nav('')}}>홈 이동</button>
        <button type='button' onClick={(e) => {nav('/join')}}>회원 가입 이동</button>
        <button type='button' onClick={(e) => {nav('/member')}}>상세보기</button>
      </div>

      {/* <button type='button' onClick={(e) => {nav('/update')}}>회원 정보 수정</button> */}

    </>
  )
}

export default App
