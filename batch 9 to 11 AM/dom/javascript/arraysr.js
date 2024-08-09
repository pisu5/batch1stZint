let a = [1, 2, 3, 4, 5, 6, 7];

let pointer1 = 0;
let pointerlast = a.length - 1; //6
while (pointer1 < pointerlast) {
  let temp = a[pointer1]; //1
  a[pointer1] = a[pointerlast]; //7
  a[pointerlast] = temp;
  pointer1++;
  pointerlast--;
}
for (let i = 0; i < a.length; i++) {
  console.log(a[i]);
}
console.log(a);
