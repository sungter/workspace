

import axios from 'axios';
import React, { useEffect, useState } from 'react'

const OrderList = ({setOrderDetail, setIsShow}) => {

  const [orderData, setOrderData] = useState([]);

  useEffect(() => {
    axios.get('/api/order')
        .then((res) => {
          console.log(res.data);
          setOrderData(res.data);
        })
        .catch((error) => {
          alert('데이터를 받아오지 못했습니다.')
        });
  }, []);
  
  const home = ['▼', 'HOME', '가고', '싶다', '▲'];

  return (
    <div>
      <h3>주 문 목 록</h3>

      <table className='mainInfo'>
        <colgroup>
          <col width={'10%'}/>
          <col width={'*'}/>
          <col width={'20%'}/>
          <col width={'10%'}/>
          <col width={'20%'}/>
        </colgroup>
        <thead>
          <tr>
            <td>No</td>
            <td>상품명</td>
            <td>상품가격</td>
            <td>수량</td>
            <td>총구매가격</td>
          </tr>
        </thead>

        <tbody>
          {
            orderData.map((order, i) => {
              return(
                <tr key={i}>
                  <td>{orderData.length - i}</td>
                  <td><span className='clickEvent' onClick={(e) => {
                    setOrderDetail(order);
                    setIsShow(true);
                    console.log(home[i]);
                  }}>{order.itemName}</span></td>
                  <td>{order.itemPrice}원</td>
                  <td>{order.itemCnt}</td>
                  <td>{order.itemPrice * order.itemCnt}원</td>
                </tr>
              )
            })
          }
        </tbody>

      </table>

    </div>
  )
}

export default OrderList