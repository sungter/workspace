import React from 'react'

const Controller = ({changeNum, setChangeNum}) => {
  
  const change = (e) => {
    setChangeNum(changeNum + e);
  }

  return (
    <>

      <div >
        <button type='button' onClick={(e) =>{
          change(-1);
        }}>-1</button>
        <button type='button' onClick={(e) =>{
          change(-10);
        }}>-10</button>
        <button type='button' onClick={(e) =>{
          change(-100);
        }}>-100</button>
        <button type='button' onClick={(e) =>{
          change(100);
        }}>+100</button>
        <button type='button' onClick={(e) =>{
          change(10);
        }}>+10</button>
        <button type='button' onClick={(e) =>{
          change(1);
        }}>+1</button>
      </div>
    </>
  )
}

export default Controller