/*objects
const car = {
  wjdk: "nexson",
  model: "03589034gif",
  color: "red",
  engine: "pet",
  freatures: "sunroof",
  dishes: [
    "pizza",
    "coffe",
    "tea",
    "sandwich",
    "fries",
    "waterballs",
    ["laddo", "icecream", "cappcino", "rasgulla", "barfii"],
  ],
};

console.log(car.dishes[6][3]);
*/

const library = [
  {
    title: "Time is lost",
    author: "nadela",
    language: "English",
    isReading: false,
  },
  {
    title: "last Chance",
    author: "unknown",
    language: "french",
    isReading: false,
  },
  {
    title: "The vampire Army",
    author: "danny",
    language: "english",
    isReading: true,
  },
];
for (let i = 0; i < library.length; i++) {
  let book = " " + library[i].title + " " + "by" + library[i].author + " ";
  if (library[i].isReading) {
    console.log("You are already read this book :" + " " + book);
  } else {
    console.log("You need to still read this book" + " " + book);
  }
}
