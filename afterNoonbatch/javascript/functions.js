function greet(a, b, q, r = 7) {
  //functiond eclare
  // let c = "hello";
  // return a + b + q + r;
}

//let f = greet(1, 2, 3);
//console.log(f);

/*function persons(...personss) {
  //rest parameter ==arrays
  for (let i = 0; i < personss.length; i++) {
    console.log(personss[i]);
  }
}
persons(1, 2, 3, 4, 5, 6);
persons(1);
persons(5, 6, 7, 5);


//arrow function
const greet2 = (a) => {
  console.log(a);
};
greet2(33);

*/

//callbacks function
//settimeout

function fetchDeatils(data) {
  console.log("Data is fetching from servers....");
  setTimeout(() => {
    data("Sizuka", 23, "Masters", "pass in fd", 400);
  }, 3000);
}
function fetchingdata(rname, rage, rresult, status, totalNumbers) {
  console.log("data fetched success with these values");
  const data = {
    name: rname,
    age: rage,
    result: rresult,
    status: status,
    totalNum: totalNumbers,
  };

  console.log(
    `${data.name}${data.age}${data.result}${data.status}${data.totalNum}`
  );
}
fetchDeatils(fetchingdata);



setTimeout(() => {
console.log("timer resolved")
  
}, 3000);
