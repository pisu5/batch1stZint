//non primitive
//way 1 to create array ., declare and initilize
//let stataion = ["gwalior","morena","mathura","agra","delhi","gurgaon"];
//console.log(typeof(arr));
//console.log(arr[2]); //access element
//console.log(arr.length); //find length
//create array object
/*let stations = new Array(6); // creating array using object
stations[0] = "pune";
stations[1] = "navi mumbai";
stations[2] = "khandala";
stations[3] = "nasik";
stations[4] = "aurangabad";
stations[5] = "ahemadnagar";
stations[6] = "manmad";
stations[7] = "mumbai";
*/
let number = [3, 5, 6, 7, 8, 9, 0, 3, 44, 20, 10, 50, 60];

let ele = 444;
let foundIndex = -1; //
let isFound = false; 
for (let i = 0; i < number.length; i++) {
  let cur = number[i];
  if (cur == ele) {
    isFound = true;
    foundIndex = i;
  }
}

if (isFound) {
  console.log("Element found at index : " + " " + foundIndex);
} else {
  console.log("not found");
}

/*
let index = 5;
number[index] = 50;
console.log(number[index]);

//

for (let i = 0; i < number.length; i++) {
  if (number[i] % 2 == 0) {
    console.log(number[i]);
  }
}
  */
