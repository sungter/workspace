import React from 'react'

const KshPractice2 = () => {
  const numbers = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10];

  const sum1 = numbers.reduce((accumulator, currentNumber) => accumulator + currentNumber);
  console.log('sum1 = ' + sum1);

  const sumReducer = (accumulator, currentNumber) => {
    return accumulator + currentNumber;
  };

  const sum2 = numbers.reduce(sumReducer);
  console.log('sum2 = ' + sum2);

  //문제 1
  //3명의 나이를 더하기
  const friends = [
    {
      name: '양주진',
      age: 32,
      job: '코인러',
      married: false,
    },
    {
      name: '오영제',
      age: 32,
      job: '랩퍼',
      married: false,
    },
    {
      name: '서준형',
      age: 32,
      job: '2년차 유부남',
      married: true,
    }
  ];

  const ageSum = friends.reduce((acc, cur) => {return acc + cur.age}, 0);
  console.log(ageSum);

  //문제 2 해설을 위한 예시
  const number = [1, 2, 3, 4, 5];

  function reducer(accumulator, currentValue, currentIndex) {
    const result = accumulator + currentValue;
    console.log('accumulator = ', accumulator, ', currentValue = ', currentValue, ', currentIndex = ', currentIndex, ', result = ', result);
    return result;
  }

  // initialValue가 없을 경우
  number.reduce(reducer);

  // 동작
  // accumulator = 1, currentValue = 2, currentIndex = 1, result = 3
  // accumulator = 3, currentValue = 3, currentIndex = 2, result = 6
  // accumulator = 6, currentValue = 4, currentIndex = 3, result = 10
  // accumulator = 10, currentValue = 5, currentIndex = 4, result = 15

  // initialValue가 있을 경우
  number.reduce(reducer, 0);

  // 동작
  // accumulator = 0, currentValue = 1, currentIndex = 0, result = 1
  // accumulator = 1, currentValue = 2, currentIndex = 1, result = 3
  // accumulator = 3, currentValue = 3, currentIndex = 2, result = 6
  // accumulator = 6, currentValue = 4, currentIndex = 3, result = 10
  // accumulator = 10, currentValue = 5, currentIndex = 4, result = 15

  

  return (
    <div>

    </div>
  )
}

export default KshPractice2