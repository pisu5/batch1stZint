/*function abc(callback) {
  console.log("wait...");
  setTimeout(() => {
    const obj = { nam: "hello", age: 45 };
    callback(obj);
  }, 3000);
}
function data(a) {
    console.log("Data fetched success");
  console.log(a);
}
abc(data);
*/

async function fetchdata(ifPass) {
  try {
    console.log("Fetch data...");
    const result = await new Promise((resolve, reject) => {
      setTimeout(() => {
        if (ifPass) {
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
