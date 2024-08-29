import { useState } from "react";
import "./App.css";
import Header from "./Header";
import Hero from "./Hero";

function App() {
  var namee = "ram";

  return (
    <div>
      <Header name="reels" age="45" color="red" />;
      <Hero name={namee} />
    </div>
  );
}

export default App;
