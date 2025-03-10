import React from "react";

//localList를 selectbox를 그리시오
const Map_3 = () => {
  const localList = ["경기도", "강원도", "경상도", "전라도"];

  return (
    <>
      <select>
        {localList.map((local, i) => {
          return <option key={i}>{local}</option>;
        })}
      </select>
    </>
  );
};

export default Map_3;
