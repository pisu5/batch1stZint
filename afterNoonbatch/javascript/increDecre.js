let a = 5;  //6 //7
let b = a++ + ++a + a; //5+7+7= 19
 //console.log(b);
 let x = 3;  //4 //5 //6
 let y = ++x + x++ + x++ + ++x; //4+4+5+7=20
 //console.log(x, y);
 let p = 2; //3 //5
 let q = p++ * ++p * p++; //2*4*4
 //console.log(p, q); //5,32
 let i = 0; //1,2,3
 //let result = i++ + i++ + ++i + i; // 0+1+3+3
 //console.log(result);
 let m = 4
let n = 2
 let result = m++ - --n + n-- + ++m; // 4-1+1+6
 console.log(m, n, result);






