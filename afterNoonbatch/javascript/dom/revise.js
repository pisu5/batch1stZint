//query selector
/*let input4 = document.querySelectorAll("#gg");
console.log(input4);
let con = document.querySelector(".container");
console.log(con);
let h1 = document.createElement("h1");
h1.innerText = "Text added suucesfully"; //add text
con.appendChild(h1); //add element to container
//remove element
//h1.remove(); //directly removed
con.removeChild(h1);
let div = document.querySelector("div");
//add class to eleemnt
div.classList.add("hh");

*/

let numInput = document.querySelector("#num");
let colInput = document.querySelector("#col");
let select = document.querySelector("select");
let btn = document.querySelector("button");
let con = document.querySelector(".container");
btn.addEventListener("click", shapeGenerator);

function shapeGenerator() {
  let numValue = numInput.value;
  let colValue = colInput.value;
  let selectValue = select.value;

  for (let i = 1; i <= numValue; i++) {
    let div = document.createElement("div");
    if (selectValue == "circle") {
      div.classList.add("circle");
    } else {
      div.classList.add("square");
    }

    div.style.backgroundColor = colValue;
    div.style.borderRadius = "10px";
    div.setAttribute("contenteditable", "true");
    div.style.color = "red";
    con.appendChild(div);

    //add listener
    div.addEventListener("dblclick", function () {
      div.remove();
    });
  }
}
