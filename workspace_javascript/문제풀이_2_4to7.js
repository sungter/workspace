

const foodList = [
  {
    name : '김치찌개',
    price : 12000,
    type : '한식',
    material : ['김치','두부', '돼지고기']
  }, 
  {
    name : '짜장면',
    price : 8000,
    type : '중식',
    material : ['춘장','밀가루', '양파', '오이']
  }, 
  {
    name : '불고기',
    price : 15000,
    type : '한식',
    material : ['소고기','양파', '대파']
  }, 
  {
    name : '탕수육',
    price : 25000,
    type : '중식',
    material : ['돼지고기','밀가루']
  }
];

console.log(foodList);


// const test1 = (foodlist) => {
//   for(let i = 0 ; i < foodlist.length ; i++){
//     console.log(foodlist[i].name);
//   }
// };

// test1(foodList);


// const test2 = function(foodList){
//   let sum = 0;
//   for(let food of foodList){
//     if(food.type === '한식'){
//       sum += food.price;      
//     }
//   }
//   console.log(`한식 가격의 합은 ${sum}원 입니다.`);
// };

// test2(foodList);


const test3 = (list, foodName) => {
  let isFind = false;

  for(let i = 0 ; i < list.length ; i++){
    if(list[i].name === foodName){
      console.log(list[i].material);
      isFind = true;
      break;
    }
  }

  if(!isFind){
    console.log('정보없음');
  }
};

// //return사용시
// const test3 = (list, foodName) => {
//   for(let i = 0 ; i < list.length ; i++){
//     if(list[i].name === foodName){
//       console.log(list[i].material);
//       return;
//     }
//   }
//   console.log('정보없음');
// };

test3(foodList, '탕수육');

//매개변수로 5보다 큰 숫자가 들어올때만 안녕 출력
//return 키워드 작성 후 데이터를 작성하지 않고 return을 만나면 함수 종료
function aaa(num){
  if(num > 5){
    console.log('안녕');
  }
}

function bbb(num){
  if(num < 5){
    return
  }
  console.log('안녕');
}

