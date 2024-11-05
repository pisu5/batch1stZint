import react, { Suspense, lazy } from "react";

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
import { ShimmerTable, ShimmerSectionHeader } from "shimmer-effects-react";
import ScoreCard from "./ScoreCard";
import ToDoApp from "./ToDoApp";
import { Stroy } from "./Stroy";
import Accordion from "./Accordion";

function App() {
  const sc = lazy(() => import("./ScoreCard"));
  return (
    <>
    
     
    </>
  );
}

export default App;
