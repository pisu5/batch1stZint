/*async function fetchdata(isPass) {
  console.log("Fetching result Hold on...");
  try {
    const result = await new Promise((resolve, reject) => {
      setTimeout(() => {
        if (isPass) {
          resolve("You are pass");
        } else {
          reject("You are failed");
        }
      }, 3000);
    });
    console.log(result);
  } catch (error) {
    console.log(error);
  }
}
fetchdata(false);

setTimeout(() => {
  console.log("Fetch success");
}, 4000);
console.log("Data fetching....");

function foo(callback) {
  console.log("Waiting to date announced....");
  setTimeout(() => {
    console.log(Date.now());
    const obj = { name: "anurag", age: 45 };
    callback(obj);
  }, 3000);
}
function data(obj) {
  console.log("data received");
  console.log(obj);
}
foo(data);
*/
