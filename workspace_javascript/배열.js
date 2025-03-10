
//배열 생성 문법

//빈 배열 생성
const arr1 = new Array(); 
const arr2 = [];
const arr3 = [1, 3, 5]; //초기값 세팅된 배열 생성
const arr4 = [1, 5.5, 'jaba']; //자료형이 다른 데이터 추가 가능!
const arr5 = [1, 5, [1, 3, 5]]; //데이터 3개

//배열에 데이터 추가
const arr6 = [];
arr6[0] = 5;
arr6[1] = 7;
arr6.push(10); //배열의 순서 마지막 요소에 데이터 저장
arr6.push("java");

//배열 데이터 출력
console.log(arr6); //배열 객체 출력하면 모든 정보 출력됨.
console.log(arr6[1]);

const arr7 =[5, 1, [1, 4, 7]];
//7만 출력
console.log(arr7[2][2]);

