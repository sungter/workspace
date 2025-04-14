import { createSlice } from "@reduxjs/toolkit";

// 숫자를 저장하고 있는 state 변수를 만듦.
const counterSlice = createSlice({
  name : 'counter',
  //초기값
  initialState : 5,
  //상태를 변경하는 함수
  reducers : {
    increase : (state) => {
      //state: state 변수의 값
      return state + 1 //return되는 데이터로 state값을 변경
    },
    decrease : (state) => {
      return state - 1
    },
    //매개변수로 들어온 데이터 만큼 counter값 만큼 증가
    handleCounter : (state, action) => {
      return state + action.payload
    }
  }
});

export const {increase, decrease, handleCounter} = counterSlice.actions;
export default counterSlice;