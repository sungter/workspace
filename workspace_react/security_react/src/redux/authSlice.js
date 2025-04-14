import { createSlice } from "@reduxjs/toolkit";
import { jwtDecode } from "jwt-decode";

const getToken = () => {
  const token = localStorage.getItem('accessToken');

  //token이 없다면 null 리턴 후 함수 종료
  if(token === null) return null;

  //localStorage에 accessToken이 있다면 복호화된(해석된) 토큰을 decodedToken저장 => 객체로 return함
  //ex) {sub: 'user', role: 'ROLE_USER', iat: 1744265787, exp: 1744267587}
  const decodedToken = jwtDecode(token);

  //현재 날짜 및 시간(현재 시간을 가져오면 밀리 세컨드 단위로 값을 가져온다.)
  const currentTime = Date.now() / 1000;

  //decodedToken.exp가 현재 시간보다 작다면 decodedToken.exp는 만료된 토큰이다.
  //때문에, 만료가 되었다면 localStorage 안 accessToken을 지운다.
  if(decodedToken.exp < currentTime){
    localStorage.removeItem('accessToken')
    return null;
  }else{
    return token;
  }

};

const authSlice = createSlice({
  name : 'auth',
  initialState : {token : getToken() },
  reducers : {
    loginReducer : (state, action) => {
      state.token = action.payload;
      localStorage.setItem('accessToken', action.payload);
    },

    logoutReducer : (state, action) => {
      state.token = null;
      localStorage.removeItem('accessToken');
    }
  }
});

export const {loginReducer, logoutReducer} = authSlice.actions;
export default authSlice;