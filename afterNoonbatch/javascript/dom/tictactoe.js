const grid = document.querySelector(".grid");
const cell = document.querySelectorAll(".cell");
const btn = document.querySelector("button");
let value = "X";
let isGameStart = false;
let isX = true;
let move = document.getElementById("showMove");
const animinationCon = document.querySelector(".lottie");

//voices
let click = new Audio("./gameSound/click12.aac");
let startGame = new Audio("./gameSound/gamestart.mp3");
let vic = new Audio("./gameSound/vicAud.mp3");
let tie = new Audio("./gameSound/tie.mp3");

//start game
btn.addEventListener("click", function () {
  startGame.play();
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
    winnerGesture();
  } else if (winner == 2) {
    winnerGesture();
  } else if (winner == 3) {
    tie.play();
    move.innerText = "game is draw";
  }
}
grid.addEventListener("click", function (event) {
  if (!isGameStart) {
    return;
  }
  let target = event.target;
  if (isX) {
    if (target.innerText == "") {
      click.play();
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
  } else if (
    cell[0].innerText != "" &&
    cell[1].innerText != "" &&
    cell[2].innerText != "" &&
    cell[3].innerText != "" &&
    cell[4].innerText != "" &&
    cell[5].innerText != "" &&
    cell[6].innerText != "" &&
    cell[7].innerText != "" &&
    cell[8].innerText != ""
  ) {
    return 3;
  }
}

function winnerGesture() {
  vic.play();
  const container = document.querySelector(".lottie");
  container.style.display = "block";
  grid.style.display = "none";

  const dotLottie = lottie.loadAnimation({
    container: container,
    autoplay: true,
    loop: true,
    renderer: "svg", // Use "svg" or "canvas" depending on your needs
    path: "Animation - 1728459876176.json",
  });
  dotLottie.addEventListener("complete", function () {
    container.style.display = "none";
  });
}
