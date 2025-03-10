import React, { useState } from "react";
import "./Axios_5.css";
import axios from "axios";

const Axios_5 = () => {
  const [personList, setPersonList] = useState([]);
  const [studentList, setStudentList] = useState([]);

  const getPersonList = () => {
    axios
      .get("/api/t4")
      .then((res) => {
        console.log("personList data 가져오기 성공 !");
        console.log(res.data);
        setPersonList(res.data);
      })
      .catch((error) => {
        console.log("오류 발생!");
      });
  };

  const getStudentList = () => {
    axios
      .get("/api/t5")
      .then((res) => {
        console.log("studentList data 가져오기 성공 !");
        console.log(res.data);
        setStudentList(res.data);
      })
      .catch((error) => {
        console.log("오류 발생!")
      });
  };

  return (
    <>
      <div>Axios_5</div>

      <table className="t1">
        <colgroup>
          <col width={"50%"} />
          <col width={"50%"} />
        </colgroup>

        <tbody>
          <tr className="t1-tr">
            <td>
              <button
                type="button"
                onClick={(e) => {
                  getPersonList();
                }}
              >
                버튼
              </button>

              <table border={1} className="allInfo">
                <thead>
                  <tr>
                    <td>이름</td>
                    <td>나이</td>
                    <td>주소</td>
                  </tr>
                </thead>

                <tbody>
                  {
                  personList.length === 0 
                  ? 
                  <tr>
                    <td colSpan={3}>버튼을 클릭하면 데이터가 조회됩니다.</td>
                  </tr>
                  :
                  personList.map((p, i) => {
                    return (
                      <tr key={i}>
                        <td>{p.name}</td>
                        <td>{p.age}</td>
                        <td>{p.addr}</td>
                      </tr>
                    );
                  })}
                </tbody>
              </table>
            </td>

            <td>
              <button
                type="button"
                onClick={(e) => {
                  getStudentList();
                }}
              >
                버튼
              </button>

              <table border={1} className="allInfo">
                <thead>
                  <tr>
                    <td>이름</td>
                    <td>국어점수</td>
                    <td>영어점수</td>
                    <td>수학점수</td>
                    <td>총 점수</td>
                  </tr>
                </thead>
                <tbody>
                  {
                  studentList.length === 0
                  ?
                  <tr>
                    <td colSpan={5}>버튼을 클릭하면 데이터가 조회됩니다.</td>
                  </tr>
                  :
                  studentList.map((stu, i) => {
                    return (
                      <tr key={i}>
                        <td>{stu.name}</td>
                        <td>{stu.korScore}</td>
                        <td>{stu.engScore}</td>
                        <td>{stu.mathScore}</td>
                        <td>{stu.korScore + stu.engScore + stu.mathScore}</td>
                      </tr>
                    );
                  })}
                </tbody>
              </table>
            </td>
          </tr>
        </tbody>
      </table>
    </>
  );
};

export default Axios_5;
