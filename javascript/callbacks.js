//callbacks
//function callToServer(callback) {
//console.log("Wait...we are fetching dat from server ");
//setTimeout(() => {
//callback();
//}, 4000);
//}

/*function
function fetchdata() {
  const data = {
    name: "Ram",
    age: 34,
    isMarried: true,
  };
  console.log("Data fetch successfuly, Thanku for waiting");
  console.log(data.name + " " + data.age + " " + data.isMarried);
}

callToServer(fetchdata);


function greeting() {
  console.log("Hello john how are you");
}

function deleyedgreet(callback) {
  console.log("Wait for meet...");
  setTimeout(() => {
    callback();
  }, 4000);
}
deleyedgreet(greeting);

const namee = (parameter) => {
  console.log("this is arrow functio" + parameter);
};
namee("hello");
*/

function boilWater(callback) {
  console.log("Water is boiling...");
  setTimeout(() => {
    console.log("water is boiled");
    callback();
  }, 3000);
}

function addCoffe(callback) {
  console.log("Adding coffe in ");
  setTimeout(() => {
    console.log("Coffe poweder added");
    callback();
  }, 2000);
}
function addSugar(callback) {
  console.log("Adding sugar in coffe...");
  setTimeout(() => {
    console.log("Sugar added");
    callback();
  }, 2000);
}

function serveCoffe() {
  console.log("Serving coffe...");
  setTimeout(() => {
    console.log("Coffe serving in cups...");

  }, 2000);
}

boilWater(() => {
  addCoffe(() => {
    addSugar(() => {
      serveCoffe();
    });
  });
});
