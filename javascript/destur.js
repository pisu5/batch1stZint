/*let arr = [1, 2, 3, 4, 5, 5, 6];
//traditonal way

const first = arr[0];
const second = arr[1];
//console.log(first);
//console.log(second);

//es6 way
const [f, s, thir, fs, fg, fd] = arr;
console.log(f);
console.log(s);
console.log(thir);


let gree = ["Hello",'I',"am","student"];
const [a,b,c,d] = gree;
console.log(a)
console.log(b)
console.log(c)
console.log(d)

//desturing value 1stv and last index
let use = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10];
const [first,...rest] = use;
const [last] = rest.reverse();
console.log(first);
console.log(last);

//how to get desire elemnt

let use = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10];
const[,,,,, desired,,next] = use;
console.log(desired);
console.log(next)
//find mid elemnt

let use = [1, 2, 3, 4, 100, 6, 7, 8, 9, 10,34];
const mid = Math.floor(use.length/2);
console.log(use[mid]);


//unpack values from objects

//const { namee, age, edu } = obj;
//access value from diff name
const obj = { namee: "ram", age: 34, edu: "graduate" };
const {
  namee: personme,
  age: personAge,
  edu: personEdu,
  character = "characterLess",
} = obj;
console.log(personAge);
console.log(personme);
console.log(personEdu);
console.log(character);
*/

