
const arr1 = [2, 4, 5, 7];

function result (a) {
  for(let i = 0; i < a.length ; i++){
    if (a[i] % 2 === 0){
      console.log(a[i]);
    }
  }
};

result(arr1);



const arr2 = [3, 8, 9];
let sum = 0;
const result2 = function(a, b){
  for(let i = 0; i < a.length ; i++){
    sum += a[i];
  }
  for(let i = 0 ; i < b.length ; i++){
    sum += b[i];
  }
  return sum / (a.length + b.length)
}

console.log(result2(arr1, arr2));




const strArr = ["java", "c++", "javascript"];
const result3 = (a) => {
  let max = "";
  for(let i = 0 ; i < a.length ; i++){
    if(max.length < a[i].length){
      max = a[i];
    }
  }
  return max;
};

console.log(result3(strArr));





const mulArr = [];

function result4(a, b){
  for (let i = 0 ; i < b ; i++){
    mulArr[i] = a * (i + 1);
  }
  return mulArr;
};

console.log(result4(3, 5))