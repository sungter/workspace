
//객체 : key와 value 한 쌍의 데이터로 이루어진 데이터 집합

//객체 선언(중괄호로..)
const obj1 = {}; //빈 객체 생성

//ex> key = name, age, addr // value = 'kim', 20, '울산시'
//key는 중복불가, 중복일 경우 마지막으로 작성한 데이터가 저장된다.
const person = {
  name : 'kim',
  age : 20, 
  addr : '울산',
  age : 30 
};

//'kim' 문자열 출력
console.log(person);
console.log(person.name);
console.log(person['name']);

//새로운 데이터 변경, 추가 방법
person.hobby = '공부';
person.age = 50;
console.log(person);


