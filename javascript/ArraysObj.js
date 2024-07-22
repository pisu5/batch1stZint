//const arr = [1, 2, 4, 5, 6, 8, 64];
//let k = 8;
//for (let i = 0; i < arr.length; i++) {
// console.log(arr[i]);
//}
//arr.push(56);
//console.log(arr[7]);
//arr.pop();
//console.log(arr[7]);
//arr.shift();
//console.log(arr[0]);
//arr.unshift(89);
//console.log(arr[0]);
/*let startIndex = 1;
let lastIndex = 3;
arr.splice(startIndex, lastIndex);
for (let j = 0; j < arr.length; j++) {
  console.log(arr[j]);
}
  
const arr = [1, 2, 4, 5, 6, 8, 64];
let k = 8;
for (let i = 0; i < arr.length; i++) {
  if (arr[i]%2==0) {
   arr[i] = "even"
  }
}
for(let i =0;i<arr.length;i++){
    console.log(arr[i])
}
    */
//que find max value;
let max = Number.MAX_VALUE;
console.log(max);
const arr = [700, 2, 4, 100, 6, 8, 6400];
for (let i = 0; i < arr.length;i++) {
  if (max>arr[i]) {
    max = arr[i];
  }
}
console.log(max);
