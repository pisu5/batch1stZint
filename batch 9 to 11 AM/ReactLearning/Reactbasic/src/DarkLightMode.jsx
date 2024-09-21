import { useState } from "react";
import "./LightMode.css";

const DarkLightMode = () => {
  const [isDarkMode, setDarkMode] = useState(false);
  const handleToggle = () => {
    setDarkMode((prevMode) => !prevMode);
  };
  return (
    <>
      <div className={isDarkMode ? "darkMode" : "lighMode"}>
        <h1>This is{isDarkMode ? "DarkMode On" : "LightMode On"}</h1>
        <button onClick={handleToggle}>
          Toggle to switch{isDarkMode ? "LightMode" : "DarkMode"}
        </button>
      </div>
    </>
  );
};
export default DarkLightMode;
