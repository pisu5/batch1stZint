/*var global = "I am global";  //global
function outerFunc(){
    var ou = "I am outer var";
    function innerFunc(){
        var inn = "i am inner func";
        console.log(global); //i am gloval
        console.log(ou); //i am outer
        console.log(inn); //i am inner
    }
    innerFunc();
  //  console.log(inn); //error
}
outerFunc();
//console.log(ou); //error
*/
function outer() 
{ 
if(true){
var x = 10;

}
 function inner() {
 let y = 20; 
}
 inner();

console.log(x + "y+x"+x);
 }
 
 outer();
