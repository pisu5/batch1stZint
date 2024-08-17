abc(); //
var f = 7; //global
function abc() {
  for (let i = 1; i <= 10; i++) {
    var t = i + 1;
    setTimeout(() => {
      console.log(i); //
    }, 1000);
  }
  console.log(t); // 11

  function def() {
    function ghi() {
      //  console.log(f);
      //  console.log(y + y);
    }
    ghi();
  }
  def();
}


