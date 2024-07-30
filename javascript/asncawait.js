function boilWater() {
  return new Promise((resolve) => {
    console.log("water is boiling...");
    setTimeout(() => {
     // console.log("water is boiling");
      resolve("boiled water is ready");
    }, 5000);
  });
}
function addMaggi() {
  return new Promise((resolve) => {
    console.log("Add Maggi to boiled water...");
    setTimeout(() => {
      console.log("Maggi added to boiled water");
      resolve("Maggi added");
    }, 3000);
  });
}

function maggiReady () {
  return new Promise((resolve) => {
    console.log("Cooking Maggi...");
    setTimeout(() => {
      console.log("Maggi is ready...");
      resolve("Maggi cooked");
    }, 2000);
  });
}

async function cookMaggi() {
  const step1 = await boilWater();
  console.log(step1);
  const step2 = await addMaggi();

  console.log(step2);
  const step3 = await maggiReady();
  console.log(step3);
  console.log("Maggi is ready to serve...");
}
cookMaggi();
