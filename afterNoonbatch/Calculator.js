let num1 = 2;
let num2 = 3;
let char = "%"; //
let result = 0;
if (char == "+") {
  result = num1 + num2;
  console.log(result);
} else if (char == "-") {
  result = num1 - num2;
  console.log(result);
} else if (char == "*") {
  result = num1 * num2;
  console.log(result);
} else if (char == "/") {
  result = num1 / num2;
  console.log(result);
} else if (char == "%") {
  result = num1 % num2;
  console.log(result);
} else {
  console.log("invalid character please again");
}
