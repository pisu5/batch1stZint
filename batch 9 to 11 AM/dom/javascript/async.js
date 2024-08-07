/*function foo(van) {
  console.log("Wait to be called...");
  setTimeout(() => {
    van();
  }, 4000);
}
function fetchh() {
  let obj = { naam: "Ram", age: "45", edu: "failed" };
  console.log(obj.naam + " " + obj.age + " " + obj.edu);
}
foo(fetchh);

function demo(a, b) {
  console.log(a + b);
}
demo(2, 3);

//arrow functions
const namee = (a) => {
    console.log(a)

};
namee(4);

function hello() {
  setTimeout(() => {
    console.log("hello world");
  }, 4000);
}
hello();
*/
function boilwater(callback) {
  console.log("Water to be boiled...");
  setTimeout(() => {
    console.log("water is boiled successfully");
    callback();
  }, 4000);
}
function dipMaggi(callback) {
  console.log("Maggi is dipped , wait.. ");
  setTimeout(() => {
    console.log("Maggi is ready to be cook");
    callback();
  }, 4000);
}
function cookMaggi(callback) {
  console.log("Wait to cook");
  setTimeout(() => {
    console.log("Maggi is ready to serve");
    callback();
  }, 4000);
}
function serveMaggi() {
  console.log("Wait to Serve");
  setTimeout(() => {
    console.log("Maggi is served, Enjoy it! ");
  }, 4000);
}
boilwater(() => {
  dipMaggi(() => {
    cookMaggi(() => {
      serveMaggi();
    });
  });
});
