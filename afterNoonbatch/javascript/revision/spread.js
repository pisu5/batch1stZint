function declareResult(rollNu, ...studentname) {
  console.log("We are rolling out result on JIWJI UMI");
  studentname.map((value) => {
    console.log(`Result of ${rollNu} ${value} is 70%`);
  });
}

let st = ["Ramesh", "Suresh", "ramu", "pawan", "ragit", "nitin"];
let f = { 1: 2, 2: 2, 3: 3, 4: 4 };
let c = { ...f };
let copy = [...st]; //way 2 of shallow copy
copy[2] = "virat";
console.log(copy[2]);
declareResult(12, st);

let name = "abhishek";
let age = 23;
let city = "gwalior";
console.log(` My name is ${name} and age is   ${age} and city is ${city}`);
