let arr = [1, 2, 4, 5, 7, 5, 3, 2];
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
*/
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
