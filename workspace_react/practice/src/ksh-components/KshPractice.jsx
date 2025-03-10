import React from 'react'

const KshPractice = () => {
  let arr = [3, 5, 11, 0, 9, 'string'];

  let result = arr.filter((value) => value < 10);
  console.log(result)

  //문제2
  //filter를 이용해 다음 배열에서 species가 'mammalia'인 새로운 배열을 만들고 콘솔에 출력해주세요.

  let animals = [
    { species: 'mammalia', name: "cat" },
    { species: 'reptiles', name: "lizard" },
    { species: 'amphibia', name: "flog" },
    { species: 'mammalia', name: "dog" },
    { species: 'amphibia', name: "salamander" }
  ];

  let result2 = animals.filter((value) =>value.species === 'mammalia');
  console.log(result2);

  //문제 3 홀수만 갖는 배열 만들기
  const numbers = [1, 2, 3, 4, 5];
  const result3 = numbers.filter(value => value % 2 !== 0);
  console.log(result3);

  //문제 4 결혼 안한 사람만 뽑는 배열
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

  const result4 = friends.filter(value => value.married === false);
  console.log(result4);

  return (
    <div>
      {
        result.map((value, i) => {
          return(
            <div key={i}>{value}</div>

          )
        })
      }

      {
        result2.map((value, i) => {
          return(
            <div key={i}>
              {i} 번 객체
              <br />
              species : {value.species}
              <br />
              name : {value.name}
              <hr />
            </div>
          )
        })
      }

    </div>
  )
}

export default KshPractice