/*function abc(ab) {
  let a = 6;
  console.log(a);
  ab(); //callback
}

function greet() {
  console.log("i am call back from ab");
}
abc(greet);

function f(e) {
  console.log(e);
}

let e = 5;
f(e);
sayhello();
const sayhello = () => {
  console.log("Hello,r");
};

*/

function data(a) {
  console.log("wait for data feetching...");
  setTimeout(() => {
    a();
  }, 3000);
}

function fetchData() {
  const person = {
    name: "ramesh",
    age: 23,
    edu: "masters",
  };
  console.log(`${person.name} ${person.age} ${person.edu}`);
  console.log("data fetched successfully");
}
data(fetchData);
