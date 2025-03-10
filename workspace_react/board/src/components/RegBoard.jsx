import axios from 'axios';
import React, { useState } from 'react'
import { useNavigate } from 'react-router-dom';
import styles from './BoardList.module.css'

const RegBoard = () => {
  const nav = useNavigate();
  const [board, setBoard] = useState({
    title : '',
    writer : '',
    content : ''
  });

  console.log(board);

  const changeData = (e) => {
    setBoard({
      ...board,
      [e.target.name] : e.target.value
    })
  }

  //유효성 검사 함수
  const validateBoard = () => {
    let isValid = true;
    if(board.title === ''){
      alert('제목은 필수 입력 사항입니다.');
      isValid = false;
    }

    if(board.writer === ''){
      alert('작성자는 필수 입력 사항입니다.');
      isValid = false;
    }

    if(!confirm('등록하시겠습니까?')){
      isValid = false;
    }
    

    return isValid;
  }


  const postRegBoard = () => {

    if(!validateBoard()){
      return
    }

    axios.post('/api/boards', board)
        .then((res) => {
          alert('등록이 완료되었습니다.')
          nav('/')
        })
        .catch((error) => {console.log(error)});
  };


  return (
    <div className={styles.regContainer}>
      <table className={styles.regData}>
        <tbody>
          <tr>
            <td colSpan={2}><span>※</span> 필수 입력 사항</td>
          </tr>
          
          <tr>
            <td>제목</td>
            <td><input type="text" name='title' value={board.title} onChange={(e) => {changeData(e)}} /> <span>※</span> </td>
          </tr>

          <tr>
            <td>작성자</td>
            <td><input type="text" name='writer' value={board.writer} onChange={(e) => {changeData(e)}} /> <span>※</span> </td>
          </tr>

          <tr>
            <td>내용</td>
            <td><textarea cols={50} rows={5} name='content' value={board.content} onChange={(e) => {changeData(e)}} /></td>
          </tr>
        </tbody>
      </table>    

      <button type='button' onClick={(e) => {nav('/')}}>
        <i className="bi bi-card-list"> List</i>
      </button>
      <button type='button' onClick={(e) => {postRegBoard()}}>
        <i className="bi bi-check2-circle"> Sign</i>
      </button>
    </div>
  )
}

export default RegBoard