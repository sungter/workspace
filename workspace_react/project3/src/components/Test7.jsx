import "./Test7.css";
import React, { useState } from "react";

const Test7 = () => {
  const [visible, setVisible] = useState(false);

  return (
    <>
      <div>Test7</div>

      <div onMouseEnter={(e) => {setVisible(true)}} onMouseLeave={(e) => {setVisible(false)}}>
        <div className="redBox" >마우스를 올리면 숨겨진 글자가 보여요</div>
        <div className="redBox">마우스를 올리면 숨겨진 글자가 보여요</div>
      </div>

      {
        visible ? <div className="blueBox">Hello React!</div> : null
      }
    </>
  );
};

export default Test7;
