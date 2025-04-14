import './App.css'
import { Route, Routes } from 'react-router'
import Login from './components/Login'
import Join from './components/Join'
import Admin from './components/Admin'
import UserPage from './components/UserPage'
import Header from './components/Header'
import Menu from './components/Menu'
import ProtectedRoute from './components/ProtectedRoute'
import ProtectedAdminRoute from './components/ProtectedAdminRoute'


function App() {

  return (
    <div>
      <Header />
      
      <Menu />

      <Routes>
          <Route path='' element={<div>메인페이지</div>}/>
          <Route path='/login' element={<Login />}/>
          <Route path='/join' element={<Join />}/>

          <Route path='/user' element={ <ProtectedRoute><UserPage/></ProtectedRoute> }/>

          <Route path='/admin' element={ <ProtectedAdminRoute><Admin /></ProtectedAdminRoute> }/>
      </Routes>
    </div>
  )
}

export default App
