import { Route, Routes, useNavigate } from 'react-router-dom'
import './App.css'
import Employee from './components/Employee'
import RegEmployee from './components/RegEmployee'
import EmployeeSearch from './components/EmployeeSearch';

function App() {
  const nav = useNavigate();

  //falsy : false로 판단하는 내용
  //null, undefined, 0, ''

  //truthy : falsy한 데이터를 제외한 전부

  return (
    <div>
      <div className='header-bar'>
        <div onClick={e => nav('/')}>부서&직급 관리</div>
        <div onClick={e => nav('/reg')}>사원 관리</div>
        <div onClick={e => nav('/search')}>사원 조회</div>
      </div>      

      <Routes>
        {/* 부서&직급 관리 페이지 */}
        <Route path='' element={ <Employee/>} />
        {/* 사원 관리 페이지 */}
        <Route path='/reg' element={ <RegEmployee/> } />
        {/* 사원 조회 페이지 */}
        <Route path='/search' element={ <EmployeeSearch/> } />
      </Routes>

    </div>
  )
}

export default App
