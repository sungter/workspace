import React, { useEffect, useState } from "react";
import styles from './ListOne.module.css'

const ListOne = ({e, toDoList, setToDoList}) => {
  //수정 아이콘 클릭시 보여줄 데이터 정할 변수
  const [isEditing, setIsEditing] = useState(false);

  //수정시 input 태그 데이터 저장할 변수
  const [newText, setNewText] = useState('');

  //mount시 newText 데이터를 변경할 useEffect 함수
  useEffect(() => {
    setNewText(e.text);
  } , [e]);
  
  //수정 확인 버튼 클릭시 실행될 함수
  const handleToDoList = () => {
    const copyToDoList = [...toDoList];
    const findToDo = copyToDoList.find((toDo) => {return toDo.id === e.id});
    findToDo.text = newText;
    console.log(findToDo.text)
    setToDoList(copyToDoList);
  };

  //삭제 버튼 클릭시 실행될 함수
  const deleteToDoList = () => {
    if(!confirm(`${e.text}를 삭제하시겠습니까?`)){
      return;
    }

    const copyToDoList = [...toDoList];
    const filterToDo = copyToDoList.filter((toDo) => {return toDo.id !== e.id});
    setToDoList(filterToDo);
  };

  return (
    isEditing ? 
      <div className={styles.oneList}>
        <input 
          type="text" 
          value={newText}
          onChange={e => setNewText(e.target.value)}
          autoFocus={true}
        />
        
        <button 
          type='button' 
          onClick={event => {
            handleToDoList();
            setIsEditing(false);
          }}
        >확 인</button>

        <button type='button' onClick={event => {
          setNewText(e.text);
          setIsEditing(false);
        }}>취 소</button>
      </div>
    :
      <div className={styles.oneList}>
        <span className={styles.e_text}>{e.text}</span>
        <img src="src\assets\edit.png" onClick={e => setIsEditing(true)} />
        <img src="src\assets\delete.png" onClick={e => deleteToDoList()} />
      </div>
  );
};

export default ListOne;
