/*coffe

function boilWater(callback) {
  console.log("Water is boiling....");
  setTimeout(() => {
    console.log("Water is boiled");
    callback();
  }, 3000);
}
function addCoffe(callback) {
  console.log("cofee adding...");
  setTimeout(() => {
    console.log("Coffe added");
    callback();
  }, 2000);
}
function addMilk(callback) {
  console.log("Adding milk...");
  setTimeout(() => {
    console.log("Milk added");
    callback();
  }, 2000);
}
function serve() {
  console.log("Serving coffe...");
  setTimeout(() => {
    console.log("Coffe served!  Enjoy it");
  }, 3000);
}
boilWater(() => {
  addCoffe(() => {
    addMilk(() => {
      serve();
    });
  });
});
*/
async function abc() {
    console.log("Waiting for prominsing resolved")
  const resul = await new Promise((resolve) => {
    setTimeout(() => {
      resolve("Hello resolved success");
    }, 3000);
  });
  console.log(resul);
  
}
abc();