import { createSlice } from "@reduxjs/toolkit";
import { cartList } from "./data";

const cartListSlice = createSlice({
  name : 'cartList',
  initialState : cartList,
  reducers : {
    handleSumList : (state, action) => {
      // return [...state, action.payload]
      state.push(action.payload)
    }
  }
});

export const {handleSumList} = cartListSlice.actions;
export default cartListSlice;