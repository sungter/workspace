
//배열
const arr1 = [1, 2, 3];
const arr2 = [4, 5];

//[1,2,3,4,5]
//스프레드 연산자 (배열을 버리고 각각의 요소만 가져온다.) : ...변수명
const arr3 = [1, 2, 3, ...arr2];

//잘못된 예시
//arr1[3] = arr2; //[1, 2, 3, [4,5] ]
//arr1.push(arr2); //[1, 2, 3, [4,5] ]

//[1, 4, 5, 2, 3]
const arr4 = [1, ...arr2, 2, 3];



//객체
const person = {
  name : 'kim',
  age : 20
};

const score = {
  korScore : 80,
  mathScore : 100
};

//객체 안 요소
const student = {
  ...person,
  ...score
};

//객체 안 객체
const student1 = {
  person,
  score
};
