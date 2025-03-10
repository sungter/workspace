import axios from 'axios';
import dayjs from 'dayjs';
import React, { useEffect, useState } from 'react'
import { useNavigate, useParams } from 'react-router-dom'
import styles from './Board.module.css'

const Board = () => {
  // 변수 /////////////////////////////////////////////////////////////////////////////////

  const nav = useNavigate();
  const {boardNum} = useParams();
  
  const [board, setBoard] = useState({});

  // 댓글 기록 데이터 받을 state 함수
  const [reply, setReply] = useState([]);

  // 댓글 등록 시 보낼 데이터 저장할 함수
  const [replyData, setreplyData] = useState({
    content : '',
    writer : '',
    boardNum : boardNum
  });

  const [cnt, setCnt] = useState(2);

  // 변수 /////////////////////////////////////////////////////////////////////////////////



  // 함수 /////////////////////////////////////////////////////////////////////////////////

  //한개의 정보 데이터 조회
  // useEffect(()=> {
  //   axios.get(`/api/boards/${boardNum}`)
  //       .then((res) => {
  //         console.log(res.data);
  //         setBoard(res.data);
  //       })
  //       .catch((error) => {
  //         console.log(error);
  //       });

  //   //댓글 목록 가져오는 axios
  //   axios.get(`/api/replys/${boardNum}`)
  //       .then((res) => {
  //         console.log(res.data);
  //         setReply(res.data);
  //       })
  //       .catch((error) => {console.log(error)});
  // }, [boardNum, cnt]);


  //조회 쿼리 여러개 동시 실행하기
  useEffect(() => {
    //all() 을 사용해서 []로 axios.get()을 여러개 넣을 수 있다.
    axios.all([
      axios.get(`/api/boards/${boardNum}`),
      axios.get(`/api/replys/${boardNum}`)
    ])
      //데이터를 받을 때, axios.spread() 사용
      .then(axios.spread((res1, res2) => {
        setBoard(res1.data);
        setReply(res2.data);
      }))
      .catch(error => console.log(error));
  } , [boardNum, cnt]);




  const deleteData = () => {
    axios.delete(`/api/boards/${boardNum}`)
        .then((res) => {
          if(!confirm('게시글을 삭제하시겠습니까?')){
            return;
          };
          alert('삭제되었습니다.');
          nav('/');
        })
        .catch((error) => {
          console.log(error);
        });
  };
  
  const insertReply = () => {
    if((replyData.writer === '')){
      alert('작성자를 입력하시오')
      return;
    }

    if(!confirm('댓글을 등록 하시겠습니까?')){
      return;
    }

    axios.post(`/api/replys`, replyData)
        .then(res => {
          alert('댓글 등록이 완료되었습니다.');
          setCnt(cnt + 1);
          setreplyData({
            ...replyData,
            writer : '', content : ''
          });
        })
        .catch(error => console.log(error));
  };

  
  const changReplyData = (e) => {
    setreplyData({
      ...replyData,
      [e.target.name] : e.target.value
    });
  };

  const deleteReplyData = (replyone) => {
    if(!confirm('댓글을 삭제하시겠습니까?')){
      return;
    }

    axios.delete(`/api/replys/${replyone.replyNum}`)
        .then((res) => {
          alert('삭제되었습니다.');
          setCnt(cnt + 1);
          // window.location.reload();
        })
        .catch((error) => {console.log(error)});
  };

  // 함수 /////////////////////////////////////////////////////////////////////////////////

  return (
    <div>
      
      <table className={styles.show_table}>
        <tbody>
          <tr>
            <td>작성일</td>
            <td>{dayjs(board.regDate).format('YY-MM-DD HH:mm:ss')}</td>
            <td>작성자</td>
            <td>{board.writer}</td>
            <td>조회수</td>
            <td>{board.readCnt}</td>
          </tr>

          <tr>
            <td>제목</td>
            <td colSpan={5}>{board.title}</td>
          </tr>

          <tr>
            <td>내용</td>
            <td colSpan={5}>{board.content}</td>
          </tr>
        </tbody>
      </table>


      <div className={styles.button_list}>
        <button type='button' onClick={(e) => {nav('/')}}>
          <i className="bi bi-card-list"> List</i>
        </button>

        <button type='button' onClick={(e) => {nav(`/update/${boardNum}`)}}>
          <i className="bi bi-arrow-repeat"> Correction</i>
        </button>

        <button type='button' onClick={(e) => {deleteData()}}>
          <i className="bi bi-person-x"> Delete</i>
        </button>
      </div>


      <hr />


      {/* 댓글 기록 입력창 */}
      <div className={styles.insert_reply}>
        <input size={6} type="text" placeholder='작성자' name='writer' value={replyData.writer} onChange={(e) => {changReplyData(e)}} />

        <input size={30} type="text" placeholder='댓글 내용 입력' name='content' value={replyData.content} onChange={(e) => {changReplyData(e)}}/>

        <button type='button' onClick={(e) => {insertReply()}}>
          <i className="bi bi-pencil-square"> reg-reply</i>
        </button>
      </div>

      <div>
        {
          reply.length === 0
          ?
          <div>
            댓글이 없습니다.
          </div>
          :
          <table className={styles.showReply}>
            
              {
                reply.map((replyone, i) => {
                  return(
                    <tbody key={i}>
                      <tr>
                       <td>{replyone.writer}</td>
                       <td>{dayjs(replyone.regDate).format('YY년 MM월 DD일 HH:mm')}</td>
                      </tr>

                      <tr>
                        <td colSpan={2}>{replyone.content}</td>
                        <td><button className={styles.delete_button} type='button' onClick={(e) => {deleteReplyData(replyone)}}><i className="bi bi-x-square"> delete</i></button></td>
                      </tr>
                      
                      <tr>
                        <td colSpan={3}>
                          <hr />
                        </td>
                      </tr>

                    </tbody>
                  )
                })
              }
            
          </table>
        }  
      </div>



    </div>
  )
}

export default Board