//functuon dclare

function foo() {
  console.log("Function is declare and intilize");
}

foo(); //intiliziton

function para(a, b, c) {
  if (c == "-") {
    console.log(a - b);
  } else if (c == "/") {
    console.log(a / b);
  }
}

para(6, 7, "-"); //arguments

function defaultparam(name = "mits", location = "gwalior") {
    console.log("My College name is :" +" "+name + " "+ "Locations is :" + " "+location);

}
defaultparam();

function restpara(...a) {
  let sum = a.reduce((total, number) => total + number, 0);
  console.log(sum);
}
restpara(1, 2, 4, 6, 3, 6, 3, 63, 6);
restpara(24, 56);

function restpara(...a) {
  let odd = a.filter((number) => number % 2 == 0);
  odd.forEach((number) => console.log(number));
}
restpara(1, 23, 4, 6, 7, 9, 3, 854, 57, 36);

