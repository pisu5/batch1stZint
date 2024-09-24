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

for (let i = 1; i <= 10; i++) {
  setTimeout(() => {
    console.log(i);
  }, 3000);
}
