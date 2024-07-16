let sum = 0;
let num = 153;
if (num > 0) {
  while (num > 0) {
    let lastDigit = num % 10;
    let cube = lastDigit * lastDigit * lastDigit;
    sum = sum + cube;
    num = num / 10;
  }
}
console.log(sum);

let a = 10;
let count = 0;
while (count <= a) {
  console.log(a);
  count++;
}
