import { StrictMode } from "react";
import { createRoot } from "react-dom/client";
import App from "./App.jsx";
import "./index.css";
createRoot(document.getElementById("root")).render(
  <StrictMode>
    <App />
  </StrictMode>
);

{
  /* setTimeout(() => {
    document.getElementById("root").style.display = "none"
    {
      /*reateRoot(document.getElementById("root")).render(
      <StrictMode>
        <App />
      </StrictMode>
    );
   
  }, 5000);
  
}
*/
}
