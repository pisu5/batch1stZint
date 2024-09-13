import React from "react";
import "./App.css";

import { Link } from "react-router-dom";

const Header = () => {
  return (
    <>
      <nav>
        <Link to="/home">Home</Link>
        <Link to="./he"></Link>
        <Link to="/about">About</Link> 
      </nav>
    </>
  );
};
export default Header;
