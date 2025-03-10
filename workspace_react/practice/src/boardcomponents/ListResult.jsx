
import axios from 'axios';
import React, { useEffect, useState } from 'react'

const ListResult = ({setBoard, setIsShow}) => {
  //서버에서 받아오는 게시글 목록 데이터를 저장할 state변수
  const [boardList, setBoardList] = useState([]);

  useEffect(() =>{
    axios.get('/api/getBoardList')
          .then((res) => {
            console.log(res.data);
            setBoardList(res.data);
          })
          .catch((error) => {
            console.log('오류발생');
            console.log(error);
          });
  }, []);

  return (
    <div>
      <table className='list-table'>
        <colgroup>
          <col width={'10%'}/>
          <col width={'*'}/>
          <col width={'20%'}/>
          <col width={'20%'}/>
        </colgroup>
        <thead>
          <tr>
            <td>No</td>
            <td>제목</td>
            <td>작성자</td>
            <td>조회수</td>
          </tr>
        </thead>

        <tbody>
          {
            boardList.map((board, i) => {
              return(
                <tr key={i}>
                  <td>{boardList.length - i}</td>
                  <td>
                    <span onClick={(e) => {
                      //클릭한 제목의 게시글에서 글번호를 찾아서
                      //boardList에 저장된 게시글 목록 중
                      //글번호가 일치하는 게시글 정보를 검색
                      //board.boardNum;
                      for(let i = 0 ; i < boardList.length ; i++){
                        if(boardList[i].boardNum == board.boardNum){
                          setBoard(boardList[i]); 
                          setIsShow(true);
                        }
                      }

                    }}>{board.title}</span>
                  </td>
                  <td>{board.writer}</td>
                  <td>{board.readCnt}</td>
                </tr>
              )
            })
          }
        </tbody>
      </table>
    </div>
  )
}

export default ListResult