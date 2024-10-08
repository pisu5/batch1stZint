const grid = document.querySelector(".grid");
const cell = document.querySelectorAll(".cell");
const btn = document.querySelector("button");
let value = "X";
let isGameStart = false;
let isX = true;
let move = document.getElementById("showMove");
//start game
btn.addEventListener("click", function () {
  isGameStart = true;
});
function clearGrid() {
  for (let i = 0; i < cell.length; i++) {
    cell[i].innerText = "";
  }
}
function winnerAnnounce() {
  let winner = winnerConditions();
  if (winner == 1) {
    setTimeout(() => {
      alert("x is winner");
      clearGrid();
    }, 1000);
  } else if (winner == 2) {
    setTimeout(() => {
        alert("O is winner");
        clearGrid();
      }, 1000);
  }
}
grid.addEventListener("click", function (event) {
  if (!isGameStart) {
    return;
  }
  let target = event.target;
  if (isX) {
    if (target.innerText == "") {
      move.innerText = "Player O move";

      value = "X";

      target.innerText = value;
      isX = false;
      winnerAnnounce();
    }
  } else {
    if (target.innerText == "") {
      move.innerText = "Player X move";

      value = "O";

      target.innerText = value;

      isX = true;
      winnerAnnounce();
    }
  }
});

//winner condotion
function winnerConditions() {
  if (
    (cell[0].innerText == "X" &&
      cell[1].innerText == "X" &&
      cell[2].innerText == "X") ||
    (cell[3].innerText == "X" &&
      cell[4].innerText == "X" &&
      cell[5].innerText == "X") ||
    (cell[6].innerText == "X" &&
      cell[7].innerText == "X" &&
      cell[8].innerText == "X") ||
    (cell[0].innerText == "X" &&
      cell[3].innerText == "X" &&
      cell[6].innerText == "X") ||
    (cell[1].innerText == "X" &&
      cell[4].innerText == "X" &&
      cell[7].innerText == "X") ||
    (cell[2].innerText == "X" &&
      cell[5].innerText == "X" &&
      cell[8].innerText == "X") ||
    (cell[0].innerText == "X" &&
      cell[4].innerText == "X" &&
      cell[8].innerText == "X") ||
    (cell[2].innerText == "X" &&
      cell[4].innerText == "X" &&
      cell[6].innerText == "X")
  ) {
    return 1;
  } else if (
    (cell[0].innerText == "O" &&
      cell[1].innerText == "O" &&
      cell[2].innerText == "O") ||
    (cell[3].innerText == "O" &&
      cell[4].innerText == "O" &&
      cell[5].innerText == "O") ||
    (cell[6].innerText == "O" &&
      cell[7].innerText == "O" &&
      cell[8].innerText == "O") ||
    (cell[0].innerText == "O" &&
      cell[3].innerText == "O" &&
      cell[6].innerText == "O") ||
    (cell[1].innerText == "O" &&
      cell[4].innerText == "O" &&
      cell[7].innerText == "O") ||
    (cell[2].innerText == "O" &&
      cell[5].innerText == "O" &&
      cell[8].innerText == "O") ||
    (cell[0].innerText == "O" &&
      cell[4].innerText == "O" &&
      cell[8].innerText == "O") ||
    (cell[2].innerText == "O" &&
      cell[4].innerText == "O" &&
      cell[6].innerText == "O")
  ) {
    return 2;
  }
}
