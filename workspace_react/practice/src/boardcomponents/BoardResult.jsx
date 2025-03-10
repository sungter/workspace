
import './BoardResult.css'
import React, { useState } from 'react'
import ListResult from './ListResult'
import DetailResult from './DetailResult'

const BoardResult = () => {
  //게시글 하나의 정보를 담을 state변수
  const[board, setBoard] = useState({});

  //상세정보를 보이고, 안보이게 하는 state변수
  const [isShow, setIsShow] = useState(false);

  return (
    <>
      <div className='container'>
        <div>
          <h2>게시글 제목</h2>
        </div>

        <ListResult setBoard={setBoard} setIsShow={setIsShow} />

        {
          isShow ? <DetailResult board={board} /> : null
        }
        
      </div>
    </>
  )
}

export default BoardResult

