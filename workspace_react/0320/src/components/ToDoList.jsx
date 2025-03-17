import React, { useState } from 'react'
import { data } from '../data/Data'
import styles from './ToDoList.module.css'
import ListOne from './ListOne';

const ToDoList = () => {
  const [toDoList, setToDoList] = useState(data);

  //등록 input 태그 데이터 저장할 변수
  const [regData, setRegData] = useState('');

  //등록 버튼 클릭시 toDoList 변경할 함수
  const handleList = () => {
    //const newList = toDoList.map((e) => {return e.id})
    const maxId = Math.max(...(toDoList.map((e) => {return e.id}))) + 1

    setToDoList([
      ...toDoList,
      {
        id : maxId,
        text : regData
      }
    ])
  };

  return (
    <div className={styles.container}>
      <h1>To Do List</h1>

      <div className={styles.insertBox}>
        <input 
          className={styles.insertText}
          type="text" 
          placeholder='+ Add a Task' 
          value={regData}
          onChange={(e) => {
            setRegData(e.target.value)
          }}
        />

        <button type='button' onClick={(e) => {handleList()}}>등 록</button>
      </div>

      <div className={styles.listBox}>
        {
          toDoList.map((e, i) => {
            return(
              <ListOne key={i} 
                e={e} 
                toDoList={toDoList} 
                setToDoList={setToDoList} 
              />
            )
          })
        }
      </div>

      

    </div>
  )
}

export default ToDoList