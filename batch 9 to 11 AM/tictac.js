let grid = document.querySelector(".grid");
let cell = document.querySelectorAll(".cell");
let startBtn = document.querySelector("#btn");
let turn = "x";
let isTurn = true;
winnerGesture();
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
*/ grid.addEventListener("click", function (event) {
  let currrCell = event.target;
  if (currrCell.innerHTML == "") {
    currrCell.innerHTML = turn;
  } else {
    alert("Wroong turn");
  }

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
  let conatiner = document.querySelector("lottie");
 

  const dotLottie = lottie.loadAnimation({
    container: conatiner,
    autoplay: true,
    loop: true,
    renderer: "canvas",
    path: "./Animat1724468413277.json",
  });
  dotLottie.addEventListener("complete", function () {
    conatiner.style.display = "none";
  });
}
