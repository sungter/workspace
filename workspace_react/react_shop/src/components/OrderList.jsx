import axios from 'axios';
import dayjs from 'dayjs';
import React, { useEffect, useState } from 'react'
import styles from './OrderList.module.css'

const OrderList = () => {
  //ORDER_INFO에서 가져온 데이터를 저장할 변수
  const [orderList, setOrderList] = useState([]);

  //총 주문 금액
  const [allPrice, setAllPrice] = useState(0);

  //ORDER_INFO에서 데이터를 가져올 함수
  useEffect(() => {
    axios.get('/api/shops/order')
        .then(res => setOrderList(res.data))
        .catch(error => console.log(error));
  }, []);

  // orderList안 각각 buyPrice 값을 더하는 함수
  // useEffect(() => {
  //   const totalPrice = orderList.reduce((acc, order) => acc + order.buyPrice, 0);
  //   setAllPrice(totalPrice);
  // }, [orderList]);

  useEffect(() => {
    axios.post('/api/shops/sumPrice', orderList)
        .then(res => setAllPrice(res.data))
        .catch(error => console.log(error))
  },[orderList]);


  const deleteOrder = (orderNum) => {
    if(!confirm('주문 목록을 삭제하시겠습니까?')){
      return;
    }

    axios.delete(`/api/shops?orderNum=${orderNum}`)
        .then(res => {
          alert('삭제되었습니다.')
          window.location.reload();
        })
        .catch(error => console.log(error));
  };

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
            orderList.length === 0
            ?
            <tr>
              <td colSpan={7}>데이터가 없습니다.</td>
            </tr>
            :
            orderList.map((order, i) => {
              return(
                <tr key={i}>
                  <td>{orderList.length - i}</td>
                  <td>{order.itemName}</td>
                  <td>{`￦ ${order.itemPrice.toLocaleString()}`}</td>
                  <td>{order.buyCnt}</td>
                  <td>{`￦ ${order.buyPrice.toLocaleString()}`}</td>
                  <td>{order.buyer}</td>
                  <td>{dayjs(order.buyDate).format('YY-MM-DD')}</td>
                  
                  <td><button className={styles.orderListButton} type='button' onClick={(e) => {deleteOrder(order.orderNum)}}>삭제</button></td>
                </tr>
              )
            })
          }
        </tbody>
      </table>

      <div className={styles.allPrice}>
        <span>총 주문금액</span>
        <span>￦ {allPrice} 원</span>
      </div>
    </div>
  )
}

export default OrderList