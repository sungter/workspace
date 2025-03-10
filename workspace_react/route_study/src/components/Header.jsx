import React from 'react'
import './Header.css'
import { Link, useNavigate } from 'react-router-dom'

const Header = () => {
  const nav = useNavigate();

  return (
    <div className='header'>
      {/* Link는 태그가 아니지만 css에서 디자인 할 때, a로 작성 
      ex> .header a{...} */}
      <div onClick={(e) => {nav('/')}}>게시판</div>

      <div className='headerList'>
        <div onClick={(e) => {nav('/login')}}>LOGIN</div>
        {/* JOIN클릭 시 로그인 페이지 */}
        <span onClick={(e) => {nav('/login')}}>JOIN</span>
      </div>
    </div>
  )
}

export default Header