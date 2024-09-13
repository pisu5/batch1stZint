let num = [1, 2, 3, 4, "ramesg"];
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

*/

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
