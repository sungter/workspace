import React, { useState } from 'react'
import { useDispatch, useSelector } from 'react-redux'
import { handleSumList } from '../redux/cartListSlice';

const Test3 = () => {

  //장바구니 목록 조회
  const cartList = useSelector(state => state.cartList);

  //장바구니 상품 추가
  //추가할 item변수
  const [item, setItem] = useState({
    cartNum : 0,
    itemName : '',
    price : 0
  });

  //item변수 값 변경 함수
  const handleItem = (e) => {
    setItem({
      ...item,
      [e.target.name] : e.target.value
    })
  }

  //cartList에 item추가하기 위한 함수
  const dispatch = useDispatch();

  return (
    <div>
      <table border={1}>
        <thead>
          <tr>
            <td>상품 번호</td>
            <td>상품 이름</td>
            <td>상품 가격</td>
          </tr>
        </thead>

        <tbody>
          {
            cartList.map((item, i) => {
              return(
                <tr key={i}>
                  <td>{item.cartNum}</td>
                  <td>{item.itemName}</td>
                  <td>{item.price}</td>
                </tr>
              )
            })
          }
        </tbody>
      </table>

      <span>상품 번호 : </span>
      <input 
        type="text" 
        name='cartNum' 
        value={item.cartNum} 
        onChange={e => handleItem(e)} 
      />
      <br />
      <span>상품 이름 : </span>
      <input 
        type="text" 
        name='itemName' 
        value={item.itemName} 
        onChange={e => handleItem(e)} 
      />
      <br />
      <span>상품 가격 : </span>
      <input 
        type="text" 
        name='price' 
        value={item.price} 
        onChange={e => handleItem(e)} 
      />
      <br />

      <button type='button' onClick={e => {
        dispatch(handleSumList(item))
        setItem({
          cartNum : 0,
          itemName : '',
          price : 0
        })
      }}>상품 추가</button>

    </div>
  )
}

export default Test3