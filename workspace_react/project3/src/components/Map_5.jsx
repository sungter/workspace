import './Map_5.css'
import React, { useState } from 'react'

const Map_5 = () => {
  const [isShow, setIsShow] = useState(false);

  const boardList = [
    {
      boardNum : 1,
      title : '첫번째 글',
      writer : '김자바',
      createDate : '2025-01-13',
      readCnt : 5
    },
    {
      boardNum : 2,
      title : '두번째 글',
      writer : '홍자바',
      createDate : '2025-01-17',
      readCnt : 3
    },
    {
      boardNum : 3,
      title : '세번째 글',
      writer : '이자바',
      createDate : '2025-01-10',
      readCnt : 0
    },
    {
      boardNum : 4,
      title : '네번째 글',
      writer : '최자바',
      createDate : '2025-01-19',
      readCnt : 10
    },
    {
      boardNum : 5,
      title : '다섯번째 글',
      writer : '조자바',
      createDate : '2025-01-01',
      readCnt : 1
    }
  ];


  return (
    <>
      <table>

        <thead className='headPerson'>
          <tr>
            <td>No</td>
            <td>글 번호</td>
            <td>글 제목</td>
            <td>작성자</td>
            <td>작성일</td>
            <td>조회수</td>
            <td className='showButton'><button type='button' onClick={(e) => {
              setIsShow(!isShow);
            }}>▼</button></td>
          </tr>
        </thead>

        {
          isShow ? <tbody className='bodyInfo'>
          {
            boardList.map((person, i) => {
              return(
                <tr key={i}>
                  <td>{boardList.length - i}</td>
                  <td>{person.boardNum}</td>
                  <td>{person.title}</td>
                  <td>{person.writer}</td>
                  <td>{person.createDate}</td>
                  <td>{person.readCnt}</td>
                </tr>
              )
            })
          }
        </tbody> : ''
        }


        

      </table>
    </>
  )
}

export default Map_5