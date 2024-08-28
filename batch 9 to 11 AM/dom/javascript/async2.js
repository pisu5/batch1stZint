//aync
//promises
/*
console.log(5);
setTimeout(() => {
  console.log(4);
}, 1000);
console.log(12);

const fetchdat = () => {
  return new Promise((resolved, reject) => {
    setTimeout(() => {
      const success = false;
      if (success) {
        resolved("Promises success");
      } else {
        reject("Promeses reject");
      }
    }, 2000);
  });
};
fetchdat()
  .then((data) => {
    console.log(data);
  })
  .catch((error) => {
    console.log(error);
  });
  */
//aync
//asnc await

async function fetchdata() {
  ///

  setTimeout(() => {
    let data = "data fetch";
    console.log(data);
  }, 2000);
}
async function processdata() {
  try {
    await fetchdata();
    // console.log(data);
  } catch (error) {
    console.log(error);
  }
}
processdata();
