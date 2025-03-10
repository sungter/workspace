import './Axios_4.css'
import axios from "axios";
import React, { useEffect, useState } from "react";

const Axios_4 = () => {
  //서버에서 넘어오는 데이터를 저장하기 위한 state 변수 생성
  const [personList, setPersonList] = useState([]);

  useEffect(()=>{
    axios.get('/api/t4')
        .then((res) => {
          console.log('성공')
          console.log(res.data)
          setPersonList(res.data)
        })
        .catch((error) => {
          console.log("오류")
        });
  },[]);

  return (
    <>
      <div>Axios_4</div>
  
      <table>
        <thead>
          <tr>
            <td>이름</td>
            <td>나이</td>
            <td>주소</td>
          </tr>
        </thead>

        <tbody>
          {personList.map((p, i) => {
            return(
              <tr key={i}>
                <td>{p.name}</td>
                <td>{p.age}</td>
                <td>{p.addr}</td>
              </tr>
            );
          })}
        </tbody>

      </table>
      
    </>
  );
};

export default Axios_4;
