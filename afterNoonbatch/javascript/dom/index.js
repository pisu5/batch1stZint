/*let inputtext = document.querySelector("#text");
let num = document.querySelector("#num");
let col = document.querySelector("#col");
let emial = document.querySelector("#email");

let text = document.getElementById("");
let num = document.getElementsByClassName("");


let timeout = 10000;

setTimeout(() => {
  console.log(`${inputtext.value} ${num.value} ${col.value} ${emial.value}`);
}, timeout);


//extract values

*/

let input = document.querySelector("input");
let container = document.querySelector("div");
let ul = document.querySelector("ul");
//extract value from input


//create element in js
setTimeout(() => {
  let li = document.createElement("li"); //li created
  let inputvalue = input.value;
  li.innerText = inputvalue;
  ul.appendChild(li);
}, 5000);
