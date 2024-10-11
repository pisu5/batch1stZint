import react from "react";

import Footer from "./Footer";
import HomePage from "./HomePage";

import { BrowserRouter, Link } from "react-router-dom";

import FormData from "../FormData";
import ReVision from "./ReVision";
import SignUpsForm from "./SignUpsForm";
import UseEffect from "./UseEffect";

import DarkLightMode from "./DarkLightMode";
import Basic from "./tailwindMaterials/Basic";
import Header from "./tailwindMaterials/Header";
import CoinProvider from "./CoinProvider";

function App() {
  return (
    <>
      <Link to="/ScoreCard">ScoreCard</Link>
      <Link to="/CoinCollect">CoinCollector</Link>
    </>
  );
}

export default App;
