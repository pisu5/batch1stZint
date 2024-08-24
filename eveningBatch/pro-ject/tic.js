let btn = document.querySelector("btn2");
let cell = document.querySelectorAll(".cell");
let turn = "X";
let isTurn = true;
let str = false;

for (let i = 0; i < cell.length; i++) {
  let j = cell[i];

  j.addEventListener("click", function () {
    j.innerHTML = turn;
    checkwinner();
    if (isTurn) {
      turn = "O";
      isTurn = false;
    } else {
      turn = "X";
      isTurn = true;
    }
  });
}
function checkwinner() {
  if (
    (cell[0].innerHTML == "X" &&
      cell[1].innerHTML == "X" &&
      cell[2].innerHTML == "X") ||
    (cell[3].innerHTML == "X" &&
      cell[4].innerHTML == "X" &&
      cell[5].innerHTML == "X") ||
    (cell[6].innerHTML == "X" &&
      cell[7].innerHTML == "X" &&
      cell[8].innerHTML == "X") ||
    (cell[0].innerHTML == "X" &&
      cell[3].innerHTML == "X" &&
      cell[6].innerHTML == "X") ||
    (cell[1].innerHTML == "X" &&
      cell[4].innerHTML == "X" &&
      cell[7].innerHTML == "X") ||
    (cell[2].innerHTML == "X" &&
      cell[5].innerHTML == "X" &&
      cell[8].innerHTML == "X") ||
    (cell[0].innerHTML == "X" &&
      cell[4].innerHTML == "X" &&
      cell[8].innerHTML == "X") ||
    (cell[2].innerHTML == "X" &&
      cell[4].innerHTML == "X" &&
      cell[6].innerHTML == "X")
  ) {
    alert(" x is winner");
  } else if (
    (cell[0].innerHTML == "O" &&
      cell[1].innerHTML == "O" &&
      cell[2].innerHTML == "O") ||
    (cell[3].innerHTML == "O" &&
      cell[4].innerHTML == "O" &&
      cell[5].innerHTML == "O") ||
    (cell[6].innerHTML == "O" &&
      cell[7].innerHTML == "O" &&
      cell[8].innerHTML == "O") ||
    (cell[0].innerHTML == "O" &&
      cell[3].innerHTML == "O" &&
      cell[6].innerHTML == "O") ||
    (cell[1].innerHTML == "O" &&
      cell[4].innerHTML == "O" &&
      cell[7].innerHTML == "O") ||
    (cell[2].innerHTML == "O" &&
      cell[5].innerHTML == "O" &&
      cell[8].innerHTML == "O") ||
    (cell[0].innerHTML == "O" &&
      cell[4].innerHTML == "O" &&
      cell[8].innerHTML == "O") ||
    (cell[2].innerHTML == "O" &&
      cell[4].innerHTML == "O" &&
      cell[6].innerHTML == "O")
  ) {
    alert("o is winner");
  }
}
btn.addEventListener("click", function () {
  str = true;
});
