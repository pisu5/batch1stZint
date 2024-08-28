/*var namee = "ram"; //string
var number = 3215151; //number dt
var boolean = true; //
var bigInt = 266562541544878512265896215154548448481n;
console.log(`name${number}${boolean}`); //string litral
console.log(namee + "" + number + "" + boolean); // print multiple variables together
//how to know which types of types present in variables

console.log(typeof bigInt);

//operators
//Airthmetic opeartors
let a = 3;
let b = 4;
let result = a+b; //7
console.log(a + b+" "+result); //7
//console.log(a - b);

//2nd - increment,decrenmenr opeartors

let a = 2; //3
console.log(a) ;// 2
console.log(a--); //2 
console.log(a);// 1


let t = 1;
let f = t++; 
console.log(f++); 
console.log(t)
console.log(f)
*/

let b = 2;

let d = ++b;
let c = ++d;

console.log(++d);
console.log(++c + ++d);

let x = 2;
let y = 3;
let z = x++ + ++y + y++ + ++x + x++ + ++y;

console.log(z);
