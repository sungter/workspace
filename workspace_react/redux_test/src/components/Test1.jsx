import React from 'react'
import { useDispatch, useSelector } from 'react-redux'
import { decrease, handleCounter, increase } from '../redux/counterSlice';

const Test1 = () => {
  //store에 저장된 counter 가져오기
  const counter = useSelector(state => state.counter);
  

  //store에 등록된 reducer() 를 호출해주는 객체
  const dispatch = useDispatch();

  return (
    <div>
      {counter}
      <button type='button' onClick={e => dispatch(increase())}>counter + 1</button>
      <button type='button' onClick={e => dispatch(decrease())}>counter - 1</button>
      <button type='button' onClick={e => dispatch(handleCounter(10))}>handle</button>
    </div>
  )
}

export default Test1