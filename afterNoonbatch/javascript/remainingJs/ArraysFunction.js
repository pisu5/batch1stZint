const length = [1, 2, 3, 5, 67, 78, 8];
/*const doubled  =  length.map(num=>num);
console.log(doubled) //2,4,

length.map((value)=>{
    console.log(value);
})

let students = [
  {
    name: "ram",
    grade: 75,
  },
  { name: "shyam", grade: 60 },

  { name: "sheema", grade: 50 },
  { name: "teena", grade: 50 },
  { name: "ravenaa", grade: 88 },
];

const pass = students.filter((student) => student.grade >= 70);
console.log(pass);


*/

let f = [1, 2, 3, 4, 6];
const totalNum = f.reduce(
  (accumaltor, currentValue) => accumaltor + currentValue
);
console.log(totalNum);
