/*let original = ["India", ["Asia"], "Russia", "America", "Dubai", "Pak"];
//1st way to shawllow copy
let copy = Object.assign({}, original);
//copy[0] = "Canada";
copy[1][0] = "North America";
copy[2] = "Newyork";
//console.log(original[0]); //
console.log(copy[1][0]); //north ame
console.log(original[2]); //rus
*/
let original = [
  { name: "jonh", age: 34, id: 45 },
  { city: "gwalior" },
  ["M.P"],
];
let copy = Object.assign({}, original);
copy.name = "suresh";
copy[1].city = "indore";
copy[2][0] = "U.P";

console.log(original);
