const library = [
  {
    title: "Monk",
    author: "robin",
    isReading: false,
    durations: 20,
  },
  {
    title: "vampire",
    author: "danny",
    isReading: true,
    durations: 20,
  },
  {
    title: "time",
    author: "anurag",
    isReading: false,
    durations: 20,
  },
  {
    title: "rdShrama",
    author: "rd",
    isReading: true,
    durations: 20,
  },
  {
    title: "Bloodrain",
    author: "rudra",
    isReading: false,
    durations: 20,
  },
];
for (let i = 0; i < library.length; i++) {
  let isRead = library[i].isReading;
  let author = library[i].author;
  let tit = library[i].title;
  if (isRead) {
    console.log(
      "The book" +
        " " +
        tit +
        " " +
        "Author" +
        " " +" "+
        author +
        " " +
        "you already read"
    );
  } else {
    console.log(
      "The book" +
        " " +
        tit +
        " " +
        "Author" +
        "" +
        author +
        "" +
        "you need to still read this book"
    );
  }
}
