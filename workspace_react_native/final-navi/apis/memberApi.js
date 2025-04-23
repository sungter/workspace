import axios from "axios"
import { Platform } from "react-native";

//회원가입시 경로 호출
export const api_join = (joinData) => {
  const baseUrl = Platform.OS === 'ios' ? 'http://localhost:8080' : 'http://10.0.2.2:8080' ;
  const response = axios.post(`${baseUrl}/users/join`, joinData);
  return response;
}

//로그인시 호출
export const api_login = (loginData) => {
  const baseUrl = Platform.OS === 'ios' ? 'http://localhost:8080' : 'http://10.0.2.2:8080' ;
  const response = axios.post(`${baseUrl}/member/login`, loginData);
  return response;
}