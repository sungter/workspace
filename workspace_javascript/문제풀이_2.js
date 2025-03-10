

const emp ={
  name : "kim",
  dep : "개발부",
  rank : "사원",
  salary : 300
};

const emp2 ={
  name : "lee",
  dep : "개발부",
  rank : "사원",
  salary : 500
};

const empTest = (obj) => {
  if(obj.dep === "개발부"){
    console.log(obj.salary);
  }
  else{
    console.log("부서가 잘못되었습니다.")
  }

  //삼항 연산자로 바꿨을때
  //console.log(obj.dep === "개발부" ? obj.salary : "부서가 잘못되었습니다.");
};

empTest(emp);

//위 코드와 같음.
// empTest({
//   name : "kim",
//   dep : "개발부",
//   rank : "사원",
//   salary : 300
// });

const empTest2 = (obj1, obj2) => {
  if(obj1.salary > obj2.salary){
    return obj.name;
  }
  else{
    return obj2.name;
  }
};

console.log(empTest2(emp, emp2));


/////////////////////////////////////////////////////////////////////////
//문제 4~7

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

const foodName = (obj) => {
  for(let i = 0 ; i < obj.length ; i++){
    console.log(obj[i].name);
  }
}

foodName(foodList);

const sumPrice = function(obj){
  let sum = 0;
  for(let e of obj){
    if(e.type === '한식'){
      sum += e.price;
    }
  }
  console.log(sum);
};

sumPrice(foodList);

const foodInfo = (obj) => {
  const newList =[];
  for(let i = 0 ; i < obj.length ; i++){
    if(obj[i].material.length >= 3){
      newList.push(obj[i]);
    }
  }
  return newList;
};


console.log(foodInfo(foodList));

const foodEtc = (list, foodname) => {
  for(let i = 0 ; i < list.length ; i++){
    if(list[i].name === foodname){
      console.log(list[i]);
      break;
    }
    else if(i === list.length - 1 && list[i] !== foodname){
      console.log('정보없음');
    }
  }
};

foodEtc(foodList, '탕수육');


