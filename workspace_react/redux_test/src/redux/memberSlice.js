import { createSlice } from "@reduxjs/toolkit";

const memberSlice = createSlice({
  name : 'member',
  initialState : {
    memId : 'hong',
    memAge : 20
  },
  reducers : {
    handleMemberId : (state, action) => {
      //return {...state, memId:'java'}
      state.memId = action.payload //usestate와 다르게 일반 변수 바꾸듯이 사용 가능(usestate 함수처럼 사용할 필요 x) 
    }
  }
});

export const {handleMemberId} = memberSlice.actions;
export default memberSlice;