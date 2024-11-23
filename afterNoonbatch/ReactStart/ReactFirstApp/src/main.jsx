import { StrictMode } from "react";
import { createRoot } from "react-dom/client";
import "./index.css";
import App from "./App.jsx";
import { BrowserRouter, Routes, Route } from "react-router-dom";
import { Provider } from "react-redux"; // Import the Provider from react-redux
import store from "./React-Redux/ConfigureStore.jsx"; // Import the Redux store you created
import { Header } from "./Header.jsx";
import List from "./List.jsx";

createRoot(document.getElementById("root")).render(
  <StrictMode>
    <Provider store={store}> {/* Wrap your application with the Redux Provider */}
      <BrowserRouter>
        <Routes>
          <Route path="/" element={<App />} />
          <Route path="/home" element={<Header />} />
        </Routes>
      </BrowserRouter>
    </Provider>
  </StrictMode>
);
