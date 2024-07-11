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
  //que 3
const series = 7;
let firstNum = 0;
let seconNum = 1;
for (let i = 2; i <= series; i++) {
  console.log(firstNum);
  let nextNum = firstNum + seconNum; //calculate first 2 num

  firstNum = seconNum;
  seconNum = nextNum;
}
  
//que 4
let a = 3;
let result = 1;
for (let i = 1; i <= a; i++) {
  result *= i;
}
console.log(result)


//que 6
let a = 8;
for(let i =1;i<=10;i++){
  console.log(a*i)

}
  
//que 7
console.log("svsrge");
const num = 3;
let isprime = true;
for (let i = 2; i < num; i++) {
  if (num % i === 0) {
    isprime = false;
    break;
  }
}
console.log(isprime);
*/
//que 8 print all prime 
let m = 10;
for (let i = 2; i <= m; i++) { //outer loop 
  let isPrime = true;
  for (let j = 2; j < i; j++) { //inner loop
    if (i % j == 0) {
      isPrime = false;
      break;
    }
  }
  if (isPrime) {
    console.log(i);
  }
}
