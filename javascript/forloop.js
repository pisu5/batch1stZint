//que 1
/*
for (let i = 1; i <= 10; i++) {
  console.log(i);
}
  
//que 2
let num = 100; //input
for (let i = 0; i <= num; i++) {
  //for loop [0-100] check even num
  if (i % 2 == 0) {
    console.log(i);
  }
}
  */
const series = 7;
let firstNum = 0;
let seconNum = 1;
for (let i = 2; i <= series; i++) {
  console.log(firstNum);
  let nextNum = firstNum + seconNum; //calculate first 2 num

  firstNum = seconNum;
  seconNum = nextNum;
}
