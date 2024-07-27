//
function abc(a, b, c) {
  let sum = a + b + c;
  console.log(sum);
}
//func call
/*
abc(3, 4, 9);
abc(5, 6, 5);
abc(95, 6, 3);

function check(namee = "ravi", age = 55) {
  console.log(namee + " " + " " + age);
}

check();

function rest(a, ...w) {
  if (w.length <= 20) {
    console.log("Elemnt fit");
  } else {
    console.log("Element cross the limit" + w.length);
  }
  //rest parametrs
}
rest(
  "rest is history",
  4,
  3,
  6,
  4,
  6,
  4,
  7,
  4,
  7,
  4,
  6,
  653,
  76,
  23566543,
  67,
  654
);
//reduce function of array
function red(...a) {
  let r = a.reduce((total, number) => {
    return total * number;
  }, 1);
  console.log(r);
}
red(1, 2, 3, 5, 6, 7);
*/
//filter 
function filter(...a){
    let f = a.filter(i=>i%2==0);
    console.log(f);

}
filter(2,3,4,5);


