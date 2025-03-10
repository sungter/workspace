import { Route, Routes } from 'react-router-dom'
import './App.css'
import BoardList from './components/BoardList'
import RegBoard from './components/RegBoard'
import Board from './components/Board'
import UpdateBoard from './components/UpdateBoard'
import QueryString from './components/QueryString'

function App() {

  return (
    <div className='container'>
      <h1>자유 게시판</h1>
      <div className='deco_image' />

      <Routes>
        {/* 게시글 목록 페이지 */}
        <Route path='' element={<BoardList/>}/>

        {/* 게시글 생성 페이지 */}
        <Route path='/regBoard' element={<RegBoard/>} />

        {/* 게시글 상세 페이지 */}
        <Route path='/board/:boardNum' element={<Board/>} />

        {/* 게시글 수정 페이지 */}
        <Route path='/update/:boardNum' element={<UpdateBoard/>} />

        {/* query string 연습 페이지 */}
        <Route path='/test' element={ <QueryString/> } />

      </Routes>
      
    </div>
  )
}

export default App
