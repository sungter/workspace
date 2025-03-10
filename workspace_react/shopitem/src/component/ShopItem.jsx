
import axios from 'axios';
import React, { useEffect, useState } from 'react'

const ShopItem = () => {
  const [itemList, setItemList] = useState([]);

  const [item, setItem] = useState({
    itemCode : 0
    , itemName : ''
    , itemPrice : 0
    , itemIntro : ''
  });

  const changeItem = (e) => {
    setItem({
      ...item, [e.target.name] : e.target.value
    });
  };

  useEffect(() => {
    axios.get('/api/shops')
        .then((res) => {
          setItemList(res.data)
        })
        .catch((error) => {
          console.log('오류')
        });
  },[])  

  // 새로운 객체(item) 생성 함수
  const postItemData = () => {
    axios.post("/api/shops", item)
        .then((res) => {
          console.log(res.data)
        })
        .catch((error) => {
          alert("서버로 데이터를 전송하지 못했습니다.")
        });
  };

  // 객체 삭제할(delete) 함수
  const deleteItemData = () => {
    //url 작성때 변수 사용을 위해 백틱 문법으로 작성, `` 홀따옴표 아님!!
    axios.delete(`/api/shops/${item.itemCode}`, item.itemCode)
        .then((res) => {
          console.log('성공')
        })
        .catch((error) => {
          alert('실패')
        });
  }


  return (
    <>
      <div>
        <input type="text" name='itemName' value={item.itemName} onChange={changeItem}/>

        <input type="number" name='itemPrice' value={item.itemPrice} onChange={changeItem}/>

        <input type="text" name='itemIntro' value={item.itemIntro} onChange={changeItem}/>
        

        <button type='button' onClick={(e) => {
          postItemData();
        }}>데이터 입력</button>
      </div>

      <div>
        삭제할 번호 입력
        <input type="number" name='itemCode' value={item.itemCode} onChange={changeItem} />

        <button type='button' onClick={(e) => {
          deleteItemData();
        }}>데이터 삭제</button>
      </div>
      
      {console.log(itemList)}
      
    </>
  )
}

export default ShopItem