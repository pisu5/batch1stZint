import { configureStore } from "@reduxjs/toolkit";
import counterReducer from "./CounterSlices";

const store = configureStore({
  reducer: {
    //add slice
    counter: counterReducer,
  },
});

export default store;
