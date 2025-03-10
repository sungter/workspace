import React, { useState } from "react";
import './Test1.css'

const First = () => {
  const [sumClick, setSumClick] = useState(0);

  return (
    <>
      <div>Test1</div>

      <div className="clickFive">
        <div className="click">
          {sumClick}
        </div>

        <div className="click">
          {sumClick}
        </div>

        <div className="click">
          {sumClick}
        </div>

        <div className="click">
          {sumClick}
        </div>

        <div className="click">
          {sumClick}
        </div>

      </div>

      <button className="buttonClick" type="button" onClick={() => {
        setSumClick(sumClick + 1)
      }}>클릭</button>
    </>
  )
};

export default First;
