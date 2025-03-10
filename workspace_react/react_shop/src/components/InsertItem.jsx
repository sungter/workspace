import axios from 'axios';
import React, { useState } from 'react'
import { useNavigate } from 'react-router-dom';
import styles from './InsertItem.module.css'

const InsertItem = () => {
  const nav = useNavigate();

  //상품 등록을 위해 spring으로 보낼 데이터를 저장할 변수
  const [postItem, setPostItem] = useState({
    itemName : '',
    itemPrice : '',
    seller : '',
    itemIntro : ''
  });

  //postItem 데이터를 input에 입력한 데이터로 바꾸는 함수
  const changeItemData = (e) => {
    setPostItem({
      ...postItem,
      [e.target.name] : e.target.value
    });
  };

  //데이터 유효성 검사 함수
  const validateItem = () => {
    let isValid = true;
    if(!(postItem.itemName && postItem.itemPrice)){
      alert('상품명과 가격은 필수 입력사항 입니다.')
      isValid = false;
    }


    if(!confirm('상품을 등록하시겠습니까?')){
      isValid = false;
    }

    return isValid;
  };

  //데이터를 보내는 axios 함수
  const posetItemData = () => {
    
    if(!validateItem()){
      return;
    }

    axios.post('/api/shops', postItem)
        .then((res) => {
          alert('상품등록이 완료되었습니다.')
          nav('/');
        })
        .catch((error) => {console.log(error)});
  };



  return (
    <div className={styles.insertContainer}>
      <h4>상품 등록</h4>

      <table className={styles.insertTable}>
        <tbody>
          <tr>
            <td>상품명</td>
            <td><input type="text" name='itemName' value={postItem.itemName}
            onChange={(e) => {changeItemData(e)}} /></td>
          </tr>

          <tr>
            <td>상품가격</td>
            <td><input type="text" name='itemPrice' value={postItem.itemPrice}
            onChange={(e) => {changeItemData(e)}} /></td>
          </tr>

          <tr>
            <td>판매자</td>
            <td><input type="text" name='seller' value={postItem.seller}
            onChange={(e) => {changeItemData(e)}} /></td>
          </tr>

          <tr>
            <td>상품설명</td>
            <td><textarea cols={50} rows={5} name='itemIntro' value={postItem.itemIntro}
            onChange={(e) => {changeItemData(e)}} /></td>
          </tr>
        </tbody>
      </table>
      
      <div className={styles.divButton}><button className={styles.insertButton} type='button' onClick={(e) => {posetItemData()}}>등록</button></div>
    </div>
  )
}

export default InsertItem