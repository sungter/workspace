import axios from "axios";
import React, { useEffect, useState } from "react";
import { useNavigate, useSearchParams } from "react-router-dom";
//특정 module.css파일 연결하기 위한 import
//styles는 변수명처럼 내가 사용하고 싶은 것으로 명명
import styles from './BoardList.module.css'
import dayjs from "dayjs";

const BoardList = () => {
  const nav = useNavigate();
  const [boardList, setBoardList] = useState([]);

  useEffect(() => {
    axios
      .get("/api/boards")
      .then((res) => {
        setBoardList(res.data);
      })
      .catch((error) => {
        console.log(error);
      });
  }, []);

  

  //query string 실습//////////////////////////////////////////////////////////
  const [data, setData] = useState({
    age : 0,
    name : ''
  });

  const changeData = (e) => {
    setData({
      ...data,
      [e.target.name] : e.target.value
    })
  }
  ///////////////////////////////////////////////////////////////////////////
  


  //검색창에 입력한 데이터를 저장할 변수
  const [searchData, setSearchData] = useState({
    searchKeyword : 'TITLE',
    searchValue : ''
  });
  
  //검색창 내용 변경 시 실행되는 함수
  const changeSearchData = (e) => {
    setSearchData({
      ...searchData,
      [e.target.name] : e.target.value
    });
  };


  //검색한 결과값으로 데이터 불러오는 함수
  const changeSearchBoard = () => {
    axios.get(`/api/boards?searchKeyword=${searchData.searchKeyword}&searchValue=${searchData.searchValue}`)
        .then(res => {
          console.log(res.data);
          setBoardList(res.data);
        })
        .catch(error => console.log(error));
  };
  
  return (
    <div>

      <select name="searchKeyword" value={searchData.searchKeyword} 
      onChange={e => changeSearchData(e)}>
        <option value="TITLE">제목</option>
        <option value="WRITER">작성자</option>
      </select>

      <input type="text" name="searchValue" value={searchData.searchValue} 
      onChange={e => changeSearchData(e)}/>

      {/* <button type="button" onClick={(e) => {nav(`/search?searchKeyword=${searchData.searchKeyword}&searchValue=${searchData.searchValue}`)}}>검색</button> */}
      <button type="button" onClick={(e) => {changeSearchBoard()}}>검색</button>


      {/* 해당 페이지에 사용시 styles.className명 객체 사용하는 것 처럼 사용 */}
      {/* 두개의 className을 사용할 때, 
      [styles.list_table , styles.second].join(' ')사용 -> 공백 필수!! */}
      <table className={styles.list_table}>
        <thead>
          <tr>
            <td>No</td>
            <td>제목</td>
            <td>작성자</td>
            <td>작성일</td>
            <td>조회수</td>
          </tr>
        </thead>

        <tbody>
          {
          boardList.length === 0
          ?
          <tr>
            <td colSpan={5}>등록된 게시글이 없습니다.</td>
          </tr>

          :
          boardList.map((board, i) => {
            return (
              <tr key={i}>
                <td>{boardList.length - i}</td>
                <td className="clickEvent" onClick={(e) => { nav(`/board/${board.boardNum}`) }}>{board.title}</td>
                <td>{board.writer}</td>
                <td>{dayjs(board.regDate).format('YY년 MM월 DD일 HH:mm')}</td>
                <td>{board.readCnt}</td>
              </tr>
            );
          })}
        </tbody>

      </table>

      <button type="button" onClick={(e) => {nav('/regBoard')}}>
        <i className="bi bi-pencil-square"> Reg</i>
      </button>



      {/* 아래 나이, 입력 입력값을 Query String 방식으로 */}
      {/* 버튼 클릭 시 /test url로 전달하세요 */}
      
      <div className={styles.practice}>
        <div>Query String 실습</div>
        <div>나이 : <input type="text" name="age" value={data.age} onChange={e => changeData(e)} /></div>
        <div>이름 : <input type="text" name="name" value={data.name} onChange={e => changeData(e)} /></div>
        <button type="button" onClick={(e) => {
          nav(`/test?age=${data.age}&name=${data.name}`)
        }}>Query String 실행</button>
  
      </div>
    </div>
  );
};

export default BoardList;
