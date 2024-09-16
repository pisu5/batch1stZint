//let num = [1, 2, 3, 4, "ramesg"];
//declare an array

//for(element of num2){
//  console.log(element);
//}

/*let value = 4;
let foundIndex = 1;

let num2 = new Array(8);
num2[0] = "grapes";
num2[1] = "banana";
num2[2] = "papaya";
num2[3] = "pineapple";
num2[4] = "orange";
num2[5] = "apple";
for (let i = 0; i < num2.length; i++) {
  let currentvalue = num2[i]; //
  if (currentvalue == value) {
    foundIndex += i;

    console.log("Value found at index" + " " + foundIndex);
  }
}
let index = 4;
let num2 = new Array(8);
num2[0] = "grapes";
num2[1] = "banana";
num2[2] = "papaya";
num2[3] = "pineapple";
num2[4] = "orange";
num2[5] = "apple";

num2[2] = "avaogardo";
console.log(num2[2])
for(let i =0;i<num2.length;i++){
    if(index==i){
        console.log(num2[i]);
    }
}



let num2 = new Array(8);
num2[0] = "grapes";
num2[1] = "banana";
num2[2] = "papaya";
num2[3] = "pineapple";
num2[4] = "orange";
num2[5] = "apple";
for (let i = 0; i < num2.length; i++) {
  console.log(num2[i]);
}

for (let i = 1; i < num2.length; i = i + 2) {
  num2[i] = "ladyfinger";
}



let num = [1, 2, 3, 4, 5, 6, 7];
//way 1 

//7...1
let result = new Array(num.length);
let index = 0;

for (let i = num.length; i >= 0; i--) {
  let currentval = num[i]; //7
  result[index] = currentval;
  index++;
}
for (let i = 0; i < result.length; i++) {
  console.log(result[i]);
}


//way 2

let num = [1, 2, 3, 4, 5, 6, 7];
let left = 0;
let right = num.length-1;
while (left < right) {
  let temp = num[left];
  num[left] = num[right];
  num[right] = temp;
  left++;
  right--;
}
for(let i =0;i<num.length;i++){
  console.log(num[i])
}


let num = [1,2,3,4,7,778,-1];
let max = -1000;
let index = 0;
while(index<num.length){
  if(num[index]>max){
    max = num[index];
  }
  index++;
}
console.log(max);

*/
/// arrays function

let arr = [1, 2, 3, 5, 5, 6];
let arr2 = [4, 5, 6, 7];
//arr.push(10); //add elelemnt at last
//arr.pop(); //remove last ele,nt
//arr.shift();  //remove 0 index elemnt
//arr.unshift(45); //add element at 0 index
//arr.splice(1, 5); //remove element from desired index to desired index
//let combied = arr.concat(arr2); //combined two arrrays
//console.log(combied)

//for (let i = 0; i < arr.length; i++) {
//  console.log(arr[i]);
//}
let func = arr.map(num =>num*2);
console.log(func)
let filteyr = arr.filter(num2=>num2>5);
console.log(filteyr);


