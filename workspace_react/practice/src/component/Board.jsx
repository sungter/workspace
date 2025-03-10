
import './Board.css'
import React, { useEffect, useState } from 'react'
import List from './List'
import Detail from './Detail'
import axios from 'axios';

const Board = () => {
    const [isShow, setIsShow] = useState(false);

    const [titleList, setTitleList] = useState([
    {
      num : 0,
      title : '제목입니다1',
      writer : '김자바',
      views : 0,
      boardInfo : ""
    },
  
    {
      num : 0,
      title : '제목입니다2',
      writer : '박자바',
      views : 5,
      boardInfo : ""
    },
  
    {
      num : 0,
      title : '제목입니다3',
      writer : '이자바',
      views : 1,
      boardInfo : ""
    },
    
    {
      num : 0,
      title : '제목입니다4',
      writer : '김자바',
      views : 3,
      boardInfo : ""
    },
    
    {
      num : 0,
      title : '제목입니다5',
      writer : '이자바',
      views : 2,
      boardInfo : ""
    }
    ]);

    const [listObject, setListObject] = useState({
      num : 0,
      title : '',
      writer : '',
      views : 0,
      boardInfo : ""
    });

    useEffect(() => {
      axios.post('/api/mountData', titleList)
            .then((res) => {
              console.log(res.data);
              setTitleList(res.data);
            })
            .catch((error) => {alert("데이터를 가져오지 못했습니다.")});
    // eslint-disable-next-line react-hooks/exhaustive-deps
    }, []);


  return (
    <>

      <h3 className='title'>게시글 목록</h3>
      <div className='container'>

      <List titleList={titleList} setIsShow={setIsShow} setListObject={setListObject} />

      <Detail isShow={isShow} listObject={listObject} />
      </div>

    </>
  )
}

export default Board