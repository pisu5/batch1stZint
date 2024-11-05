import { StrictMode } from "react";
import { createRoot } from "react-dom/client";
import "./index.css";
import App from "./App.jsx";
import Check from "./Check.jsx";

createRoot(document.getElementById("root")).render(
  <StrictMode>
    <App />
    <Check  intro="i am from intro but main jsx" param="ljefh"lejfhgief33fd/>
  </StrictMode>
);
