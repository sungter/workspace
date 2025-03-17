import { isGetAccessor } from "typescript";
import CartList from "../components/CartList";

export const data = [
  {
    id : 1,
    item : '달걀 한 판'
  },
  {
    id : 2,
    item : '라면 한 묶음'
  },
  {
    id : 3,
    item : '주방 세제'
  }
];

//cartList에서 id가 2인 데이터 찾기

//일반적 방법  
  // for (const e of data){
  //   if(e.id === 2){
  //     //찾음
  //   }
  // }

//find함수 방법
// e : 배열에 있는 데이터 한 개
// find : return에 작성한 조건문과 일치하는 데이터만 리턴해준다.
// arr.find( (배열 한 개의 요소) => {return 한개의 요소와 비교할 조건} )
const findData = data.find(e => e.id === 2); // data.find( (e) => {return e.id === 2} );

//filter 사용법 예시
//한개만 뽑아낼 때, 조건의 부정쓰면 한 데이터만 뽑아낼 수 있다.
const filterData = data.filter((e) => { return e.id === 2 });
//filter : return문에 작성한 조건과 일치하는 데이터를 제외한 남은 데이터만 리턴해준다.
const filterData2 = data.filter((e) => { return e.id !== 2 });
