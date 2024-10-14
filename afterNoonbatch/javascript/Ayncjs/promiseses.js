function boilWater() {
  return new Promise((resolve, reject) => {
    console.log("wait water is boiling...");
    setTimeout(() => {
      resolve("water is bolied");
    }, 3000);
  });
}

function addMaggi() {
  return new Promise((resolve, reject) => {
    setTimeout(() => {
      resolve("Maggi added successfully");
    }, 2000);
  });
}

function mixIncredients(gas) {
  return new Promise((resolve, reject) => {
    console.log("Wait incredents mixing...");
    setTimeout(() => {
      if (gas >= 2) {
        resolve("Incredents mixed success");
      } else {
        reject("gas is not enough to cook maggi");
      }
    }, 4000);
  });
}

function serveMaggi() {
  return new Promise((resolve, reject) => {
    setTimeout(() => {
      resolve("Maggi served successfully");
    }, 3000);
  });
}

boilWater()
  .then((result) => {
    console.log(result);
    return addMaggi();
  })
  .then((result) => {
    console.log(result);
    return mixIncredients(1);
  })
  .then((result) => {
    console.log(result);
    return serveMaggi();
  })
  .then((result) => {
    console.log(result);
  });
