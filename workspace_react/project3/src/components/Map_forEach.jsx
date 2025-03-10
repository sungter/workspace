import React from "react";

const Map_forEach = () => {
  function aaa() {
    console.log(3);
  }

  //java script 반복문 : for, for of, forEach(), map() 4종류가 있다.

  const arr = [1, 3, 5];
  //forEach()
  //() 안의 내용을 반복 실행! -> 매개변수로 함수가 들어갈 수 있다.
  //c -> 배열을 []를 없애서 모든 값으로 바꿔줌
  arr.forEach((item, i, c) => {
    console.log(`a = ${item} , b = ${i} , c = ${c}`);
  });

  //반복 후 리턴해줌
  const result = arr.map((item, i) => {
    console.log(`a = ${item} , b = ${i}`);
    return item * 2 ;
  });
  console.log(result);


  return (
    <>
      <h1>Map_forEach</h1>
    </>
  );
};

export default Map_forEach;
