import { NavLink, Route, Routes, useNavigate } from 'react-router-dom'
import './App.css'
import ItemList from './components/ItemList'
import InsertItem from './components/InsertItem';
import { useState } from 'react';
import ItemDetail from './components/ItemDetail';
import OrderItem from './components/OrderItem';
import OrderList from './components/OrderList';
import OrderListResult from './components/OrderListResult';

function App() {
  const nav = useNavigate();

  return (
    <div>

      <div className='headList'>
        <div onClick={(e) => {nav('/')}}>상품정보</div>
        <div onClick={(e) => {nav('/insert')}}>상품등록</div>
        <div onClick={(e) => {nav('/order')}}>주문하기</div>
        <div onClick={(e) => {nav('/orderList')}}>주문목록</div>
        <div onClick={(e) => {nav('/orderListResult')}}>주문목록 풀이</div>
      </div>

      <ul className='headList'>
        <li>
          {/* 현재 선택된 link에 css 적용 기능 제공 */}
          {/* consol.log(data) =>
            {isActive : true , isPending : false , isTransitioning : false} */}
          {/* isActive 는 현재 페이지 주소 활성화 상태 표시 (밑에 코드는 활용 예시) */}
          <NavLink to={'/'} className={
            //NavLink 는 className 따로 설정 안해도 active로 자동으로 만들어줌
            (data) => {return data.isActive ? 'active' : ''}
            //truty falsty
            //(data) => {return data.isActive && 'active'}
          } >상품정보</NavLink>
        </li>

        <li>
          <NavLink to={'/insert'}>상품등록</NavLink>
        </li>

        <li>
          <NavLink to={'/order'}>주문하기</NavLink>
        </li>

        <li>
          <NavLink to={'/orderList'}>주문목록</NavLink>
        </li>

        <li>
          <NavLink to={'/orderListResult'}>주문목록 풀이</NavLink>
        </li>
      </ul>

      <Routes>
        {/* 상품 정보 페이지 */}
        <Route path='/*' element={ <ItemList/>} />
        
        {/* 상품 등록 페이지 */}
        <Route path='/insert' element={ <InsertItem/> } />

        {/* 주문하기 페이지 */}
        <Route path='/order' element={<OrderItem/>}/>

        {/* 주문목록 페이지 */}
        <Route path='/orderList' element={ <OrderList/> } />

        {/* 주문목록 풀이 페이지 */}
        <Route path='/orderListResult' element={ <OrderListResult /> } />
      </Routes>

      
    </div>
  )
}

export default App
