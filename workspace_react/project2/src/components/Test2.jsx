import React, { useState } from "react";
import './Test2.css'

const Second = () => {
  const [onOff, setOnOff] = useState("On");
  const [onOff2, setOnOff2] = useState("Off");

  return (
    <>
      <div>Test2</div>
      <div className="onOff">{onOff}</div>
      <button type="button" onClick={() => {
        setOnOff(onOff === "On" ? "Off" : "On")
        setOnOff2(onOff2 === "Off" ? "On" : "Off")
      }}>{onOff2}</button>
    </>
  );
};

export default Second;
