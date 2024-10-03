//create call back function
/*function fetchdata(data) {
  console.log("Wait data fetched....");
  setTimeout(() => {
    data(); //function type parameter
  }, 3000);
}

function fetching() {
  console.log("data sucessfully fetched from : abc.com");
  let personData = {
    id: 0,
    name: "ramesh",
    age: 12,
    mariatalStatus: true,
  };
  console.log(
    `${personData.id} ${personData.name} ${personData.age} ${personData.mariatalStatus}`
  );
}
fetchdata(fetching);

console.log("hello");

console.log("Start");
setTimeout(() => {
  console.log("inside it");
}, 10000);

console.log("end");

*/

function greet(nitin) {
  console.log("function excute after timeout , wait");
  setTimeout(() => {
    nitin();
  }, 3000);
}

function data() {
  console.log("i am called from data function");
}
greet(data);
