import { StrictMode } from "react";
import { createRoot } from "react-dom/client";
import App from "./App";

import { BrowserRouter, Routes, Route } from "react-router-dom";
import Header from "./Header";
import Footer from "./Footer.jsx";
import HomePage from "./HomePage.jsx";
import UseEffect from "./UseEffect.jsx";
import "./index.css";

createRoot(document.getElementById("root")).render(
  <BrowserRouter>
    <Routes>
      <Route path="/" element={<App />}></Route>
      <Route path="/home" element={<UseEffect />}></Route>
      <Route path="/about" element={<HomePage />}></Route>
    </Routes>
  </BrowserRouter>
);
