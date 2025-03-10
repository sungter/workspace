import "./RandomNum.css";
import axios from "axios";
import React, { useState } from "react";

const RandomNum = () => {
  const [num, setNum] = useState([0, 0, 0, 0, 0, 0]);

  return (
    <>
      <div className="container">
        <h3>로또번호 생성기기</h3>

        <table className="mainBody">
          <tbody>
            <tr>
              {num.map((num1, i) => {
                return (
                  <td className="buttonCh" key={i}>
                    <p>{num1}</p>
                    <button
                      type="button"
                      onClick={(e) => {
                        axios
                          .get("/api/t10")
                          .then((res) => {
                            const copyNum = [...num];
                            copyNum[i] = res.data;
                            console.log(copyNum);
                            setNum(copyNum);
                          })
                          .catch((error) => {
                            alert("데이터를 받아오는데 실패했습니다.");
                          });
                      }}
                    >
                      생성
                    </button>
                  </td>
                );
              })}
            </tr>
          </tbody>
        </table>

        <div className="lastButton">
          <button
            type="button"
            onClick={(e) => {
              setNum([0, 0, 0, 0, 0, 0]);
            }}
          >
            초기화
          </button>

          <button
            type="button"
            onClick={(e) => {
              axios
                .get("/api/t11")
                .then((res) => {
                  console.log(res.data);
                  setNum(res.data);
                })
                .catch((error) => {});
            }}
          >
            일괄 변경
          </button>
        </div>
      </div>
    </>
  );
};

export default RandomNum;
