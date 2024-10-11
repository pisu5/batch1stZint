import { StrictMode } from "react";
import { createRoot } from "react-dom/client";
import App from "./App";

import { BrowserRouter, Routes, Route } from "react-router-dom";

import Footer from "./Footer.jsx";
import HomePage from "./HomePage.jsx";
import UseEffect from "./UseEffect.jsx";
import "./index.css";
import AboutUs from "./tailwindMaterials/AboutUs.jsx";
import Header from "./tailwindMaterials/Header.jsx";
import ScoreCard from "./ScoreCard.jsx";
import CoinCollector from "./CoinCollector.jsx";
import CoinProvider from "./CoinProvider.jsx";

createRoot(document.getElementById("root")).render(
  <BrowserRouter>
    <CoinProvider>
      <Header />
      <Routes>
        <Route path="/" element={<App />}></Route>
        <Route path="/ScoreCard" element={<ScoreCard />}></Route>
        <Route path="/CoinCollect" element={<CoinCollector />}></Route>
        <Route path="/about-us" element={<AboutUs />}></Route>
      </Routes>
    </CoinProvider>
  </BrowserRouter>
);
