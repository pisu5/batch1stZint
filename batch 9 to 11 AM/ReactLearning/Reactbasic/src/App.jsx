import react from "react";

import Footer from "./Footer";
import HomePage from "./HomePage";

import { BrowserRouter } from "react-router-dom";
import Header from "./Header";
import FormData from "../FormData";

function App() {
  return (
    <>
      <FormData />

      <Header />
    </>
  );
}

export default App;
