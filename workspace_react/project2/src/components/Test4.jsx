import React, { useState } from "react";
import "./Test4.css";

const Test4 = () => {

  const [numArr, setNumArr] = useState([0, 0, 0]);

  function changData (index) {
    const copyArr = [...numArr];
    copyArr[index] = copyArr[index] + 1;
    setNumArr(copyArr);
  }

  return (
    <>
      <div>Test4</div>

      <span onClick={() => {
        changData(0);
        //setNumArr([numArr[0], 0, 0]); 가능함.
      }}>{numArr[0]}</span>

      <span onClick={() => {
        changData(1);
      }}>{numArr[1]}</span>

      <span onClick={() => {
        changData(2);
      }}>{numArr[2]}</span>

    </>
  );
};

export default Test4;
