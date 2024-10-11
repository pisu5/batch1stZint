import React, { createContext, useState } from "react";

// Create the context
export const CoinContext = createContext();

const CoinProvider = ({ children }) => {
  const [coins, setCoins] = useState(0);

  return (
    <CoinContext.Provider value={{ coins, setCoins }}>
      {children}
    </CoinContext.Provider>
  );
};

export default CoinProvider;
