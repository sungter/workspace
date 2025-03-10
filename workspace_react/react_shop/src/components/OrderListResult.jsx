import axios from 'axios';
import dayjs from 'dayjs';
import React, { useEffect, useState } from 'react'
import styles from './OrderList.module.css'

const OrderListResult = () => {
  const [getOrderList, setGetOrderList] = useState([]);

  useEffect(() => {
    axios.get('/api/test/4')
        .then(res => {
          setGetOrderList(res.data)
          
        })
        .catch(error => console.log(error));
  } , []);

  const sumPrice = getOrderList.reduce((acc, cur) => {return acc + cur.buyPrice}, 0);
  

  return (
    <div className={styles.orderContainer}>
      
      <table className={styles.orderListTable}>
        <thead>
          <tr>
            <td>No</td>
            <td>상품명</td>
            <td>상품단가</td>
            <td>구매수량</td>
            <td>구매가격</td>
            <td>주문자</td>
            <td>주문일</td>
          </tr>
        </thead>

        <tbody>
          {
            getOrderList.map((order, i) => {
              return(
                <tr key={i}>
                  <td>{getOrderList.length - i}</td>
                  <td>{order.shopItemDTO.itemName}</td>
                  <td>{order.shopItemDTO.itemPrice
                  .toLocaleString('ko-KR',{ style: 'currency', currency: 'KRW' })}</td>
                  <td>{order.buyCnt}</td>
                  <td>{order.buyPrice
                  .toLocaleString('ko-KR',{ style: 'currency', currency: 'KRW' })}</td>
                  <td>{order.buyer}</td>
                  <td>{dayjs(order.buyDate).format('YYYY.MM.DD HH:mm:ss')}</td>
                </tr>
              )
            })
          }
        </tbody>

      </table>
      
      <div className={styles.allPrice}>
        <span>총 주문금액</span>
        <span>￦ {sumPrice.toLocaleString()} 원</span>
      </div>
    </div>
  )
}

export default OrderListResult