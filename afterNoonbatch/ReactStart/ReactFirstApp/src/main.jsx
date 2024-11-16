import { StrictMode } from "react";
import { createRoot } from "react-dom/client";
import "./index.css";
import App from "./App.jsx";
import Check from "./Check.jsx";
import { BrowserRouter, Routes, Route } from "react-router-dom";
import List from "./List.jsx";
import { Header } from "./Header.jsx";
import { Footer } from "./Footer.jsx";

createRoot(document.getElementById("root")).render(
  <BrowserRouter>
   
    <Routes>
      <Route path="/" element={<App />}></Route>
      <Route path="/smartPhones" element={<List />}></Route>
    </Routes>
   
  </BrowserRouter>
);
