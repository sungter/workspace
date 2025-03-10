
import axios from 'axios';
import React, { useEffect, useState } from 'react'
import ItemDetail from './ItemDetail';
import { Route, Routes, useNavigate } from 'react-router-dom';
import styles from './ItemList.module.css'
import Pagination from 'react-js-pagination';

const ItemList = () => {
  const nav = useNavigate();

  const [itemList, setItemList] = useState([]);
  const [selectedNum, setSelectedNum] = useState(0);
  const [isShow, setIsShow] = useState(false);

  //모든 상품 리스트 불러오는 함수
  useEffect(() => {
    axios.get('/api/shops')
        .then((res) => {
          setItemList(res.data);
        })
        .catch((error) => {console.log(error)});
  } , []);

  

  return (
    <div className={styles.container}>

      <div>
        <h4>상품 목록</h4>
        <table className={styles.listTable}>
          <thead>
            <tr>
              <td>No</td>
              <td>상품명</td>
              <td>상품가격</td>
              <td>판매자</td>
            </tr>
          </thead>
  
          <tbody>
            {
              itemList.length == 0
              ?
              <tr>
                <td colSpan={4}><p>등록한 상품이 없습니다.</p></td>
              </tr>
              :
              itemList.map((item, i) => {
                return(
                  <tr key={i}>
                    <td>{itemList.length - i}</td>
                    {/* <td onClick={(e) => {nav(`/detail/${item.itemNum}`)}}>{item.itemName}</td> */}
                    <td className={styles.clickEvent} onClick={(e) => {setSelectedNum(item.itemNum), setIsShow(true)}}>{item.itemName}</td>
                    <td>￦ {item.itemPrice.toLocaleString()}</td>
                    <td>{item.seller}</td>
                  </tr>
                )
              })
              
            }
          </tbody>
        </table>
        
        <div className={styles.length}>{`총 ${itemList.length}개의 상품이 등록되었습니다.`}</div>
      </div>

      <div>
        {
          isShow ? <ItemDetail itemNum={selectedNum}/> : null
        }

        {/* <Routes>
          <Route path='/detail/:itemNum' element={<ItemDetail/>}/>
        </Routes> */}
      </div>

    </div>
  )
}

export default ItemList