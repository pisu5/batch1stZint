/*let mypromies = new Promise((resolve, reject) => {
  console.log("wait for promies...");
  setTimeout(() => {
    let f = false;
    if (f) {
      resolve("promise success");
    } else {
      reject("promes reject");
    }
  }, 3000);
});
console.log(mypromies);

mypromies
  .then((result) => {
    console.log(result);
  })
  .catch((error) => {
    console.log("sorrr, 404 not found");
  });

  */

const res = require("express/lib/response");

//cook pastea
function boilWater() {
  return new Promise((resolve, reject) => {
    console.log("Water is boiling....");
    setTimeout(() => {
      resolve("Water is boiled ");
    }, 4000);
  });
}

//add patea
function addPastea() {
  return new Promise((resolve, reject) => {
    console.log("Adding pastea...");
    setTimeout(() => {
      resolve("pastea added");
    }, 2000);
  });
}

//cook pastea

function cookPastea() {
  return new Promise((resolve, reject) => {
    console.log("pastea is cooking...");
    setTimeout(() => {
      resolve("pastea is ready");
    }, 4000);
  });
}

//serve pastea

function servePastea() {
  return new Promise((resolve, reject) => {
    console.log("serving pastea...");
    setTimeout(() => {
      resolve("pasteaa is served");
    }, 3000);
  });
}
//useing callbacks and promises
/*
boilWater()
  .then((result) => {
    console.log(result);
    return addPastea();
  })
  .then((result) => {
    console.log(result);
    return cookPastea();
  })
  .then((result) => {
    console.log(result);
    return servePastea();
  })
  .then((result) => {
    console.log(result);
    console.log("pastea served success");
  })
  .catch((error) => {
    console.log(error);
  });
  */
async function cookPastea() {
  const waterResult = await boilWater();
  console.log(waterResult);

  const addpasta = await addPastea();
  console.log(waterResult);
}
