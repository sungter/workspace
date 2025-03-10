

//배열의 데이터를 다른 변수에 저장하는 일반적 방법
const arr1 = [1,2,3];
let a = arr1[1];
let b = arr1[2];
let c = arr1[3];

//배열에서 구조분해할당
let [aa, bb, cc] = arr1; //aa = 1, bb = 2, cc = 3
console.log(aa, bb, cc);

let [aaa, bbb] = arr1; //aaa = 1, bbb = 2
console.log(aaa, bbb);

let [a1, b1, c1, d1] = arr1;
console.log(a1, b1, c1, d1); // dddd = undefined

///////////////////////////////////////////////////////////////////////
//객체에서 구조분해할당
const person = {
  name1 : 'kim',
  age : 20,
  hobby : '공부'
};

//const {name1, age, hobby} = person;
const {age, name1, hobby} = person;
console.log(age, name1, hobby);

// * 변수명은 반드시 객체의 속성명과 동일해야함! * 
const {name2, age1, hobby1} = person;
console.log(age1, name2, hobby1); //전부 undefined


const student = {
  name : 'kim',
  age : 30,
  korScore : 80,
  engScore : 70
};

//매개변수로 student객체가 전달되면 해당학생의 총점을 리턴하는 함수
function sumScore(s){
  let korScore = s.korScore;
  let engScore = s.engScore;
  return korScore + engScore;
};
sumScore(student);


function getSum({korScore, engScore}){
  return korScore + engScore;
};
getSum(student);

const phone = {
  modelName : 's5',
  price : 10000
};

//매개변수로 phone을 전달하면 폰 객체의 모델명과 가격을 출력하는 함수
function p1 (p){
  console.log(p.modelName, p.price);
};
p1(phone);

function p2 ({modelName, price}){
  console.log(modelName, price);
};
p2(phone);



