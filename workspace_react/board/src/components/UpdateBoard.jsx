import axios from 'axios';
import React, { useEffect, useState } from 'react'
import { useNavigate, useParams } from 'react-router-dom'
import styles from './Board.module.css'
import dayjs from 'dayjs';

const UpdateBoard = () => {
  const nav = useNavigate();
  const {boardNum} = useParams();
  const [copyBoard, setCopyBoard] = useState({});
  console.log(copyBoard);

  useEffect(() => {
    axios.get(`/api/boards/${boardNum}`)
        .then((res) => {
          setCopyBoard(res.data);
        })
        .catch((error) => {console.log(error)});
  }, [boardNum]);

  const changeCopyBoard = (e) => {
    setCopyBoard({...copyBoard,
      [e.target.name] : e.target.value
    });
  };

  const updateBoard = () => {
    axios.put('/api/boards', copyBoard)
        .then((res) => {
          if(res.data !== 1){
            alert('제목은 필수 입력 사항입니다.');
            return;
          }
          alert('수정이 완료되었습니다.');
          nav(`/board/${boardNum}`);
        })
        .catch((error) => {console.log(error)});
  };

  return (
    <div>
      <table className={styles.show_table}>
        <tbody>
          <tr>
            <td>작성일</td>
            <td>{dayjs(copyBoard.regDate).format('YYYY년 MM월 DD일 HH:mm:ss')}</td>
            <td>작성자</td>
            <td>{copyBoard.writer}</td>
          </tr>

          <tr>
            <td>제목</td>
            <td colSpan={3}>
              <input size={63} type="text" name='title' value={copyBoard.title} onChange={(e) => {changeCopyBoard(e)}} />
            </td>
          </tr>

          <tr>
            <td>내용</td>
            <td colSpan={3}>
            <textarea cols={65} rows={5} name='content' value={copyBoard.content} onChange={(e) => {changeCopyBoard(e)}} />
            </td>
          </tr>
        </tbody>
      </table>

      <div className={styles.button_list}>
        <button type='button' onClick={(e) => {nav(`/board/${boardNum}`)}}>
          <i className="bi bi-arrow-counterclockwise">Back</i>
        </button>
        
        <button type='button' onClick={(e) => {updateBoard()}}>
          <i className="bi bi-arrow-repeat">Correction</i>
        </button>
      </div>
    </div>
  )
}

export default UpdateBoard