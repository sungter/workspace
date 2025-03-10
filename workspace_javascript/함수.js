

//함수 -> 자바에서 메서드와 같다

//리턴타입 작성x, 매개변수 필요한 만큼 작성 가능
//함수 선언
function printHello(){
  console.log('hello');
}

//함수 호출
//printHello();

//매개변수로 두 정수를 받아 두정수의 합을 출력
function printSum(a, b){
  console.log(a + b);
}

printSum(1, 3);

//매개변수로 두 수를 전달받아, 두 수의 곱을 리턴함수
function getMul(a,b){
  return a * b;
}

console.log(getMul(2, 5));

/////////////////
function printData1(){
  console,log('hello');
}

//함수 표현식 -> 호출시 기본 함수는 실행 가능, 함수 표현식은 선언 후 호출만 실행 가능
const printData2 = function(){console.log('hello')};

//화살표 함수
const printData3 = () => {console.log('hello')};

function f1(a,b){
  console.log(a+b);
}
const f2 = function(a,b){console.log(a+b);};
const f3 = (a,b) => {console.log(a+b);};


//자바스크립트는 변수에 저장 가능!
//ex ) 함수를 변수에 저장이 가능함


