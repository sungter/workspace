
import axios from 'axios';
import dayjs from 'dayjs';
import React, { useEffect, useState } from 'react'
import { useParams } from 'react-router-dom'
import styles from './ItemDetail.module.css'

const ItemDetail = ({itemNum}) => {
  // const {itemNum} = useParams();

  const [itemDetail, setItemDetail] = useState({});


  //상품 상세 정보 불러오는 함수
  useEffect((e) =>{
    axios.get(`/api/shops/${itemNum}`)
        .then((res) =>{
          setItemDetail(res.data);        
        })
        .catch((error) => {console.log(error)});
  }, [itemNum]);

  //itemDetail 정보 변경 함수
  const changItemDetail = (e) => {
    setItemDetail({
      ...itemDetail,
      [e.target.name] : e.target.value
    });
  };

  //상품 정보 수정 함수
  const updateItem = () => {
    axios.put(`/api/shops/${itemNum}`, itemDetail)
        .then((res) => {
          window.location.reload();
          alert('상품 정보가 변경되었습니다.');
        })
        .catch((error) => {console.log(error)});
  };

  //상품 상세정보 삭제 함수
  const deleteItem = () => {
    if(!confirm('삭제하시겠습니까?')){
      return;
    }

    axios.delete(`/api/shops/${itemNum}`)
        .then((res) => {
          window.location.reload();
          alert('삭제되었습니다.');
        })
        .catch((error) => {});
  }


  return (
    <div>
      <h4>상품 상세 정보</h4>

      <table className={styles.detailTable}>
        <tbody>
          <tr>
            <td>상품번호</td>
            <td><input className={styles.detailInput} type="text" readOnly value={itemDetail.itemNum}/></td>
          </tr>

          <tr>
            <td>상품명</td>
            <td>
              <input type="text" name='itemName' value={itemDetail.itemName} 
            onChange={(e) => {changItemDetail(e)}}/>
            </td>
          </tr>

          <tr>
            <td>상품가격</td>
            <td>
              <input type="text" name='itemPrice' value={itemDetail.itemPrice} 
            onChange={(e) => {changItemDetail(e)}} />
            </td>
          </tr>

          <tr>
            <td>판매자</td>
            <td><input className={styles.detailInput} type="text" readOnly value={itemDetail.seller} /></td>
          </tr>

          <tr>
            <td>상품등록일</td>
            <td><input className={styles.detailInput} type="text" readOnly value={dayjs(itemDetail.regDate).format('YY년 MM월 DD일 HH:mm')} /></td>
          </tr>

          <tr>
            <td>상품설명</td>
            <td><textarea cols={40} rows={5} name='itemIntro' value={itemDetail.itemIntro} 
            onChange={(e) => {changItemDetail(e)}}></textarea></td>
          </tr>
        </tbody>
      </table>

      <div className={styles.detailButton}>
        <button type='button' onClick={(e) => {updateItem()}}>수정</button>
        <button type='button' onClick={(e) => {deleteItem()}}>삭제</button>
      </div>
      
    </div>
  )
}

export default ItemDetail