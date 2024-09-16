import react from "react";

import Footer from "./Footer";
import HomePage from "./HomePage";

import { BrowserRouter } from "react-router-dom";
import Header from "./Header";
import FormData from "../FormData";
import ReVision from "./ReVision";
import SignUpsForm from "./SignUpsForm";

function App() {
  return (
    <>
      <FormData />
      <ReVision />
      <SignUpsForm/>

      <Header />
    </>
  );
}

export default App;
