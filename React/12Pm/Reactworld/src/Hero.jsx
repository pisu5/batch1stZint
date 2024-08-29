import React, { useState } from "react";
import "./parent.css";
const Hero = (props) => {
  const [products, addProducts] = useState(0);
  let clicked = 0;
  let index = document.querySelectorAll(".child");

  var oncClick = () => {
    console.log("clickd");

    addProducts(products + 1);
    cli;
  };

  return (
    <div>
      <h1>Hello this is{props.name}</h1>
      <div className="parent">
        <div onClick={oncClick} className="child">
          1
        </div>

        <div onClick={oncClick} className="child">
          2
        </div>
        <div onClick={oncClick} className="child">
          3
        </div>
        <div onClick={oncClick} className="child">
          4
        </div>
        <div onClick={oncClick} className="child">
          5
        </div>
      </div>
      <div className="cart">{products}</div>
    </div>
  );
};
export default Hero;
