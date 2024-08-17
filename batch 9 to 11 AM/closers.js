/*closers

var v = 5; //global
function greet() {
  let h = "Hello"; //local
  let counter = 1;
  function wish() {
    counter++;
    console.log(counter);
    console.log(h);
  }
  wish();
}
setTimeout(() => {
  greet();
}, 1000);



let g = 56;
function  namee(){
    let name = "Alexa";
    function print(){
        console.log("Hello"+name);
    }
    print();
}
namee();
*/
