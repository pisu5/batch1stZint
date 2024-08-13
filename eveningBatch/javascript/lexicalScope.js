/*let a = 6; //gobal scope
function b() {
  var v = 7; //local scope
  console.log(v);
}
  
function foo() {
  var v = 7;
  if (true) {
    console.log(v); //7
    var c = 9; 
  }
  console.log(c);
}
foo();
if(true){
    var t =9;
}
console.log(t);


function foo() {
  let y = 7;
  let f = true;
  if (f == true) {
    console.log(y);
    var v = 8;
    let d = 78;
  }
}
if ( true) {
    console.log(v);
    var v = 8;
    let d = 78;
   
  }
console.log(v);
console.log(d);

function abc() {
  let g = 6;
  console.log(g);
}
abc();
console.log(g);

for (var i = 0; i <= 10; i++) {
    var f = i+1; //12
    console.log(f);
    
}
f=i++ + f++; 11+11
console.log(i+f);
12+22


for (var i = 0; i <= 10; i++) {
  setTimeout(() => {
    var v = 1;
    console.log(v + i);
  }, 3000);
  console.log(i);
}
console.log(i);
*/
function infinite(){
    console.log("calling function wait for 3 second...")
    setTimeout(() => {
        console.log("Function called");
        infinite();
        
    }, 3000);
}
infinite();
