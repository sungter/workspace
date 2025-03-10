import { useState } from 'react';
import './ObjectTest.css'
import React from "react";

const ObjectTest = () => {
  const [monitor, setMonitor] = useState({
    brand : 'Samsung',
    price : 10000,
    color : 'black'
  });



  return (
    <>
      <div>ObjectTest</div>

      브랜드 : {monitor.brand} <br />
      가격 : {monitor.price} <br />
      색상 : {monitor.color} <br />

      <button type='button' onClick={() => {
        //새로운 객체 생성
        // const copyMonitor = {...monitor};
        // copyMonitor.brand = 'Lg';
        // setMonitor(copyMonitor);

        setMonitor({
          ...monitor,
          brand : 'Lg'
        });
      }}>버튼</button>

    </>
  );
};

export default ObjectTest;
