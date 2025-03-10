import axios from 'axios';
import React, { useEffect, useState } from 'react'
import styles from './OrderItem.module.css'

const OrderItem = () => {

  //처음 페이지 그릴 때, 상품 정보 받아올 변수
  const [itemList, setItemList] = useState([]);

  //상품 한 개의 정보를 받아올 변수
  const [itemName, setItemName] = useState('상품1');
  //상품 한 개 정보 가져온 데이터를 담을 함수
  const [item, setItem] = useState({});

  //주문자, 주문수량 입력한 데이터를 가질 변수
  const [orderData, setOrderData] = useState({
    buyer : '',
    buyCnt : 1,
    itemNum : 0
  });

  
  
  //주문자, 주문수량 입력한 데이터를 변경시킬 함수
  const changeOrderData = (e) => {
    setOrderData({
      ...orderData,
      itemNum : item.itemNum,
      [e.target.name] : e.target.value,
    })

    /// find 함수 쓰는 문법 예시(설명 없음)//////////////////////////////////////////////////
    // find함수 쓰면 itemName, item 의 useState변수 필요없이 itemList에서 price만 뽑을 수 있음
    const price = itemList.find((e) => {return e.itemNum == item.itemNum}).itemPrice;
    console.log(price);
    ///////////////////////////////////////////////////////////////////////////////////////

  }

  //상품 정보 가져올 함수
  useEffect(() => {
    axios.get('/api/shops')
        .then((res) => {
          setItemList(res.data);
        })
        .catch((error) => {console.log(error)});
  } , []);

  //상품 선택시 상품 가격 가져오는 함수
  useEffect(() => {
    axios.get(`/api/shops/order/${itemName}`)
        .then(res => {
          setItem(res.data);
        })
        .catch(error => console.log(error));
  }, [itemName]);

  //주문정보를 등록하는 기능을 가진 함수
  const insertOrder = () => {
    if(!confirm('상품 주문을 하시겠습니까?')){
      return;
    }

    axios.post(`/api/shops/order?itemPrice=${item.itemPrice}`, orderData)
        .then(res => alert('상품 주문이 완료되었습니다.'))
        .catch(error => console.log(error));
  };


  return (
    <div className={styles.orderContainer}>
      <h4>상품 주문</h4>
      
      <table className={styles.orderTable}>
        <tbody>
          <tr>
            <td>주문상품</td>

            <td>
            <select className={styles.orderSelect} value={itemName} onChange={e => setItemName(e.target.value)}>
              {
                itemList.length === 0
                ?
                null
                :
                itemList.map((objItem, i) => {
                  return(
                    <option key={i} value={objItem.itemName}>{objItem.itemName}</option>
                  )
                })
              }
            </select>
            </td>
          </tr>
          
          <tr>
            <td>상품단가</td>
            <td><input className={styles.orderInput} type="text" readOnly value={`￦ ${item.itemPrice}`}/></td>
          </tr>

          <tr>
            <td>주문자</td>
            <td><input type="text" name='buyer' value={orderData.buyer} 
            onChange={e => changeOrderData(e)} /></td>
          </tr>

          <tr>
            <td>주문수량</td>
            <td><input type="text" name='buyCnt' value={orderData.buyCnt} 
            onChange={e => changeOrderData(e)} /></td>
          </tr>
        </tbody>
      </table>

      <div className={styles.divButton}><button className={styles.orderButton} type='button' onClick={e => insertOrder()}>주문하기</button></div>

    </div>
  )
}

export default OrderItem