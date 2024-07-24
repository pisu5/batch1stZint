//let arr = [1, 2, 4, 5, 7, 5, 3, 2];
/*console.log(arr[5]);
for (let i = 0; i < arr.length; i++) {
  console.log(arr[i]);
}
  
//array functions
arr.push(4);
console.log(arr[8]);
arr.pop();
console.log(arr[8]);
let arr2 = [2, 3, 4, 5, 6, 7, 8, 96, 4, 3, 2, 5, ["hello", "byebye", "yeha"]];
//remove element from index to index
arr2.splice(2, 12);
for (let i = 0; i < arr2.length; i++) {
    console.log(arr2[i]);
  }


let count = 0;
let arr2 = [2, 3, 4, 5, 6, 7, 89, 96, 4, 3, 2, 5, [4, 7, 8]];
for (let i = 0; i < arr2.length; i++) {
  if (arr2[i] % 2 == 0 ) {
    arr2[i] = "even";
    
    //count++;
  }
  if(arr2[12][i]%2==0){
    arr2[12][i] = "even";
}
}

for (let i = 0; i < arr2.length; i++) {
  console.log(arr2[i]);
}
  

let arr2 = [2, 3, 4, 5, 6, 7, 89, 96, 4, 3, 2, 5, [4, 600, 8]];
let max = Number.MIN_VALUE;
for (let i = 0; i < arr2.length; i++) {
  if (arr2[i] > max) {
    max = arr2[i];
  }
}
for (let i = 0; i < arr2[12].length; i++) {
  if (arr2[12][i] > max) {
    max = arr2[12][i];
  }
}
console.log(max);

let arr2 = [2, 3, 4, 5, 6, 7];
let isSorted = true;
for (let i = 1; i < arr2.length; i++) {
  if (arr2[i] < arr2[i - 1]) {
    isSorted = false;
  }
}
if(isSorted){
    console.log("Arrays is sorted");
}else{
    console.log("Arrays is not sorted");
}

//reverse an given array
let arr2 = [2, 3, 4, 5, 6, 7];
let start = 0;
let end = arr2.length-1;
while (start < end) {
  let temp = arr2[start];
  // console.log(temp)

  arr2[start] = arr2[end];
  arr2[end] = temp;
  start++;
  end--;
}
for (let i = 0; i < arr2.length; i++) {
  console.log(arr2[i]);
}
  
 //que find missing number
let k = 4;
let arr2 = [2, 3, 4, 5, 6, 7];
let isPresent = true;
for (let i = 0; i < arr2.length; i++) {
  if (arr2[i] !== k) {
    isPresent = false;
  } else {
    isPresent = true;
    break;
  }
}
if (isPresent) {
  console.log("Element is present");
} else {
  console.log("element is not present");
}
  
//find missing element from givern range
let arr2 = [1, 2, 3, 4, 6, 7, 8];
let range = 8;
let sum = (range * (range + 1)) / 2; //sum of arrayt
let sumOfArray = 0; //sum of array
for (let i = 0; i < arr2.length; i++) {
  sumOfArray = sumOfArray + arr2[i];
}
let diff = sum - sumOfArray;
//console.log(sum);
//console.log(sumOfArray);
console.log("Missing element is " + " " + diff);
//merge two arrrays
let arr2 = [1, 2, 3, 4, 6, 7, 8];
let arr = [1, 2, 4, 5, 7, 5, 3, 2];
let merge = new Array(arr2.length + arr.length);
for (let i = 0; i <= arr2.length - 1; i++) {
  merge[i] = arr2[i];
}
let startFromIndex = arr2.length;
for (let i = 0; i <= arr.length - 1; i++) {
  merge[startFromIndex] = arr[i];
  startFromIndex++;
}
for (let i = 0; i < merge.length; i++) {
  console.log(merge[i]);
}
  */
