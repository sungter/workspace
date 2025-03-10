import React from "react";

const Display = ({ changeNum }) => {
  return (
    <>
      <div>
        <p>현재 카운트 :</p>
        <h2>{changeNum}</h2>
      </div>
    </>
  );
};

export default Display;
