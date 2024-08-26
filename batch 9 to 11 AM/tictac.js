let grid = document.querySelector(".grid");
let cell = document.querySelectorAll(".cell");
let startBtn = document.querySelector("#btn");
let turn = "x";
let isTurn = true;
let isStart = false;
let startSound = new Audio("./gameSound/gamestart.mp3");
let cellClick = new Audio("./gameSound/click12.aac");
let tieSound = new Audio("./gameSound/tie.mp3");
let wrongClick = new Audio("./gameSound/wrongclickTrimmed.wav");
let vic = new Audio("./gameSound/vicAud.mp3");
startBtn.addEventListener("click", function () {
  startSound.play();
  isStart = true;
});
/*
//non-optimize way to handle click 

for (let i = 0; i < cell.length; i++) {
  let currCell = cell[i];
  currCell.addEventListener("click", function () {
    console.log("clicked", currCell);

    currCell.innerHTML = turn;
    if (isTurn) {
      turn = "y";
      isTurn = false;
    } else {
      turn = "x";
      isTurn = true;
    }
    let winner = checkWinner();
    if (winner == 1) {
      alert(" X is winner");
     
      resetgrid();
    } else if (winner == 2) {
      alert("Y is winner");
      resetgrid();
    }
  });
}
  //event delegations
*/ grid.addEventListener("click", function (event) {
  let currrCell = event.target;
  if (!isStart) {
    alert("first click on start button");
    return;
  }
  if (currrCell.innerHTML == "") {
    currrCell.innerHTML = turn;
    cellClick.play();
    if (isTurn) {
      turn = "y";

      isTurn = false;
    } else {
      turn = "x";
      isTurn = true;
    }
  } else {
    wrongClick.play();
  }

  let winner = checkWinner();
  if (winner == 1) {
    // alert(" X is winner");
    vic.play();
    winnerGesture();

    resetgrid();
  } else if (winner == 2) {
    alert("Y is winner");
    vic.play();
    winnerGesture();
    resetgrid();
  } else if (winner == 0) {
    alert("game is draw");
  }
});

function checkWinner() {
  if (
    (cell[0].innerHTML == "x" &&
      cell[1].innerHTML == "x" &&
      cell[2].innerHTML == "x") ||
    (cell[3].innerHTML == "x" &&
      cell[4].innerHTML == "x" &&
      cell[5].innerHTML == "x") ||
    (cell[6].innerHTML == "x" &&
      cell[7].innerHTML == "x" &&
      cell[8].innerHTML == "x") ||
    (cell[0].innerHTML == "x" &&
      cell[3].innerHTML == "x" &&
      cell[6].innerHTML == "x") ||
    (cell[1].innerHTML == "x" &&
      cell[4].innerHTML == "x" &&
      cell[7].innerHTML == "x") ||
    (cell[2].innerHTML == "x" &&
      cell[5].innerHTML == "x" &&
      cell[8].innerHTML == "x") ||
    (cell[0].innerHTML == "x" &&
      cell[4].innerHTML == "x" &&
      cell[8].innerHTML == "x") ||
    (cell[2].innerHTML == "x" &&
      cell[4].innerHTML == "x" &&
      cell[6].innerHTML == "x")
  ) {
    return 1;
  } else if (
    (cell[0].innerHTML == "y" &&
      cell[1].innerHTML == "y" &&
      cell[2].innerHTML == "y") ||
    (cell[3].innerHTML == "y" &&
      cell[4].innerHTML == "y" &&
      cell[5].innerHTML == "y") ||
    (cell[6].innerHTML == "y" &&
      cell[7].innerHTML == "y" &&
      cell[8].innerHTML == "y") ||
    (cell[0].innerHTML == "y" &&
      cell[3].innerHTML == "y" &&
      cell[6].innerHTML == "y") ||
    (cell[1].innerHTML == "y" &&
      cell[4].innerHTML == "y" &&
      cell[7].innerHTML == "y") ||
    (cell[2].innerHTML == "y" &&
      cell[5].innerHTML == "y" &&
      cell[8].innerHTML == "y") ||
    (cell[0].innerHTML == "y" &&
      cell[4].innerHTML == "y" &&
      cell[8].innerHTML == "y") ||
    (cell[2].innerHTML == "y" &&
      cell[4].innerHTML == "y" &&
      cell[6].innerHTML == "y")
  ) {
    return 2;
  } else if (
    cell[0].innerHTML != "" &&
    cell[1].innerHTML != "" &&
    cell[2].innerHTML != "" &&
    cell[3].innerHTML != "" &&
    cell[4].innerHTML != "" &&
    cell[5].innerHTML != "" &&
    cell[6].innerHTML != "" &&
    cell[7].innerHTML != "" &&
    cell[8].innerHTML != ""
  ) {
    tieSound.play();

    return 0;
  }
}
function resetgrid() {
  for (let i = 0; i < cell.length; i++) {
    setTimeout(() => {
      cell[i].innerHTML = "";
    }, 1000);
  }
}

function winnerGesture() {
  const container = document.querySelector(".lottie");
  container.style.display = "block";
  grid.style.display = "none";
  setTimeout(() => {
    restartgame();
    container.style.display = "none";
  }, 3000);

  const dotLottie = lottie.loadAnimation({
    container: container,
    autoplay: true,
    loop: true,
    renderer: "svg", // Use "svg" or "canvas" depending on your needs
    path: "./Animat1724468413277.json",
  });
  dotLottie.addEventListener("complete", function () {
    container.style.display = "none";
  });
}

function restartgame() {
  isStart = true;
  grid.style.display = "block";
  location.reload();
}
