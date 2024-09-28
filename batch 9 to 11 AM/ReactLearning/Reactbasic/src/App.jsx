import react from "react";

import Footer from "./Footer";
import HomePage from "./HomePage";

import { BrowserRouter } from "react-router-dom";

import FormData from "../FormData";
import ReVision from "./ReVision";
import SignUpsForm from "./SignUpsForm";
import UseEffect from "./UseEffect";

import DarkLightMode from "./DarkLightMode";
import Basic from "./tailwindMaterials/Basic";
import Header from "./tailwindMaterials/Header";

function App() {
  return (
    <>
      <Basic />
      <h1 className="text-3xl font-bold underline">Hello wodvrld!</h1>
      <Header />
    </>
  );
}

export default App;
