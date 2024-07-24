/*console.log(a); //error
let a = 56;
console.log(f); //undefined
var f = 3; //75
f = 45;
console.log(f);//45
var f = 75; 
console.log(f) //75 

{
  var f = 56;
}
console.log(f);

//function declartion

function foo(a, b) {
  //a ,b are parameters
  return a + b;
}
let prnt = foo(4,5);
console.log(prnt);


//deafult parameters
function deafultPara(user="Massi",college="MITS"){
    console.log(user + " "+ college);


}
deafultPara();
*/
function rest(...a) {
  let print;
  /*  if (c == "+") {
    print = a.reduce((total, number) => total + number, 0);
  } else if (c == "-") {
    print = a.reduce((total, number) => total - number, 0);
  }
*/
  const oddNumber = a.filter((total) => total % 2 == 0);
  oddNumber.forEach((total) => console.log(total));
}
rest(1, 2, 3, 4, 7);
//rest(1, 2, 3, 4, 4, 6, 3, 5, 3, 5, 3, 5, 3, 3543, 5, 432, 543); //10
