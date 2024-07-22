function hello(a, b, char) {
  if (char == "+") {
    return a + b;
  } else if (char == "-") {
    return a - b;
  } else if (char == "*") {
    return a * b;
  } else if (char == "/") {
    return a / b;
  }
}

let c = "-";
let func = hello(2, 3, c);
console.log(func);
const person = {
  firstname: "ram",
  lastname: "Sharma",
  age: 34,
  education: "degree",
  Aboutperson : function(){
    console.log(this.firstname+" "+ this.lastname+" "+this.age+" "+this.education);
  }
};
person.Aboutperson();
