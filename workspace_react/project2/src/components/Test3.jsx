import React, { useState } from "react";
import './Test3.css'

const Third = () => {
  const [look , setLook] = useState(true);
  


  return (
    <>
      <div>Test3</div>

      <div className="buttonLook">
        <button type="button" onClick={() => {
          setLook(false)
        }}>광고 닫기</button>

        <button type="button" onClick={() => {
          setLook(true)
        }}>광고 보기</button>
      </div>
      
      {
        look  ? <div className="banner">오늘 구매하시면 30% Sale</div> : ''
      }
      
    </>
  );
};

export default Third;
