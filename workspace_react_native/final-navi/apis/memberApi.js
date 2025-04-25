import { axiosInstance } from "./axiosInstance";

//회원가입시 경로 호출
export const api_join = (joinData) => {
  const response = axiosInstance.post(`/users/join`, joinData);
  return response;
}

//로그인시 호출
export const api_login = (loginData) => {
  const response = axiosInstance.post(`/member/login`, loginData);
  return response;
}