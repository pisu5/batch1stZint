import { useState } from "react";
import "./App.css";
import Header from "./Header";
import Hero from "./Hero";
import ClassComponent from "./ClassComponent";

function App() {
  var namee = "ram";

  return (
    <div>
      <Header name="reels" age="45" color="red" />;
      <Hero name={namee} />
      <ClassComponent />
    </div>
  );
}

export default App;
