import "./Test6.css";
import React, { useState } from "react";

const Test6 = () => {
  const [num, setNum] = useState(0);

  const changeCount = (val) => {
    setNum(num + val);
  }

  return (
    <>
      <h2>Simple Counter</h2>

      <div className="first">
        <div>현재 카운트 : </div>
        <div className="change">{num}</div>
      </div>

      <div className="second">
        <button type="button" onClick={(e) => {
          changeCount(-1);
        }}>-1</button>

        <button type="button" onClick={() => {
          setNum(num -10);
        }}>-10</button>

        <button type="button" onClick={() => {
          setNum(num-100);
        }}>-100</button>

        <button type="button" onClick={() => {
          setNum(num+100);
        }}>+100</button>

        <button type="button" onClick={() => {
          setNum(num+10);
        }}>+10</button>

        <button type="button" onClick={() => {
          setNum(num+1);
        }}>+1</button>
      </div>


    </>
  );
};

export default Test6;
