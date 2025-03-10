import "./Food.css";
import axios from "axios";
import React, { useEffect, useState } from "react";

const Food = () => {
  const [foodInfo, setFoodInfo] = useState({
    foodName: "",
    foodCnt: 1,
    foodSum: "토핑추가",
    etc: "",
    date: ""
  });

  const changeData = (e) => {
    setFoodInfo({ ...foodInfo, [e.target.name]: e.target.value });
  };

  //then까지 마무리 하는게 좋다.
  const postFoodInfo = () => {
    axios.post("/api/t9", foodInfo).then((res) => {
      alert('서버로 데이터를 전송했습니다.')
    }).catch((error) => {
      alert('서버로 데이터를 전송하지 못했습니다.')
    });
  };

  console.log(foodInfo);

  return (
    <>
      <div>Food</div>

      <table className="mainBody" border={1}>
        <tbody>
          <tr>
            <td>
              <p>음식 선택</p>
            </td>
            <td>
              <select
                name="foodName"
                value={foodInfo.foodName}
                onChange={(e) => {
                  changeData(e);
                }}
              >
                <option value="">선택</option>
                <option value="치킨">치킨</option>
                <option value="피자">피자</option>
                <option value="족발">족발</option>
              </select>
            </td>
          </tr>

          <tr>
            <td>
              <p>수량</p>
            </td>
            <td>
              <input
                name="foodCnt"
                type="number"
                value={foodInfo.foodCnt}
                onChange={(e) => {
                  changeData(e);
                }}
              />
            </td>
          </tr>

          <tr>
            <td>
              <p>추가선택</p>
            </td>
            <td>
              <input
                name="foodSum"
                type="radio"
                value="토핑추가"
                checked={foodInfo.foodSum === "토핑추가"}
                onChange={(e) => {
                  changeData(e);
                }}
              />
              토핑추가
              <input
                name="foodSum"
                type="radio"
                value="음료추가"
                checked={foodInfo.foodSum === "음료추가"}
                onChange={(e) => {
                  changeData(e);
                }}
              />
              음료추가
              <input
                name="foodSum"
                type="radio"
                value="공기밥추가"
                checked={foodInfo.foodSum === "공기밥추가"}
                onChange={(e) => {
                  changeData(e);
                }}
              />
              공기밥추가
            </td>
          </tr>

          <tr>
            <td>
              <p>요청사항</p>
            </td>
            <td>
              <textarea
                placeholder="내용을 입력하시오."
                name="etc"
                value={foodInfo.etc}
                onChange={(e) => {
                  changeData(e);
                }}
                cols={50}
                rows={5}
              ></textarea>
            </td>
          </tr>

          <tr>
            <td>
              <p>주문일시</p>
            </td>
            <td>
              <input
                name="date"
                value={foodInfo.date}
                onChange={(e) => {
                  changeData(e);
                }}
                type="date"
              />
            </td>
          </tr>
        </tbody>
      </table>

      <button
        className="postButton"
        type="button"
        onClick={(e) => {
          postFoodInfo(e);
        }}
      >
        전송
      </button>

    </>
  );
};

export default Food;
