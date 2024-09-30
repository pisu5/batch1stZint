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

createRoot(document.getElementById("root")).render(
  <BrowserRouter>
    <Header />
    <Routes>
      <Route path="/" element={<App />}></Route>
      <Route path="/home" element={<UseEffect />}></Route>
      <Route path="/about" element={<HomePage />}></Route>
      <Route path="/about-us" element={<AboutUs />}></Route>
    </Routes>
  </BrowserRouter>
);
