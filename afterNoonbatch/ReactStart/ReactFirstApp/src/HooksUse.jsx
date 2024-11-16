import { useState } from "react";
import "./lightMode.css";

export const HooksUse = () => {
  const [count, setCount] = useState(10);
  const [isDark, setMode] = useState(false);

  const handleClick = () => {
    setCount(count + 3);
  };
  const handleMode = () => {
    setMode(!isDark);
  };
  return (
    <>
      <div className={isDark ? "darkMode" : "lightMode"}>
        <h1>This is use State hooks</h1>
        <h2>{count}</h2>

        <h3 onClick={handleMode}>{isDark ? "Dark mode" : "Light mode"}</h3>

        <button onClick={handleClick}>Count</button>
      </div>
    </>
  );
};
