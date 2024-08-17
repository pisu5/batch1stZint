var t = "This is global";
function abc() {
  function def() {
    function ghi() {
      console.log(h);
      function jkl() {
        var h = 9;
      }
      jkl(); //3rd
    }
    ghi(); //2nd
  }
  def(); ///1st
}
abc(); //last

//This is scope chai chai
