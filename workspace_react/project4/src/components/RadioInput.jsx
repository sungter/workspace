import React, { useState } from "react";

const RadioInput = () => {
  //선택한 라디오의 값을 저장할 state 변수
  const [feel, setFeel] = useState("nomal");

  return (
    <>
      <h2>Radio Input</h2>
      {/* 여러 선택지 중 무조건 하나만 선택할 경우 Radio를 쓴다. */}
      {/* Radio의 name 속성 값을 동일하게 작성하면 같은 name속성 끼리 한 개만 선택 가능하게 바뀐다. */}
      <input name="feeling" type="radio" value="bad" checked={feel === "bad"} onChange={(e) => {setFeel(e.target.value)}} />
      나쁨
      <input
        name="feeling"
        type="radio"
        value="nomal"
        checked={feel === "nomal"}
        onChange={(e) => {setFeel(e.target.value)}}
      />
      보통
      <input
        name="feeling"
        type="radio"
        value="good"
        checked={feel === "good"}
        onChange={(e) => {setFeel(e.target.value)}}
      />
      좋음

      <br />
      선택한 값 : {feel}

      {console.log(feel)}
    </>
  );
};

export default RadioInput;
