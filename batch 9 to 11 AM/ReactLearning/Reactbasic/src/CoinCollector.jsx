import React, { useContext } from "react";
import { CoinContext } from "./CoinProvider";

const CoinCollector = () => {
  const { coins, setCoins } = useContext(CoinContext);

  const collectCoin = () => {
    setCoins(coins + 1);
  };

  return (
    <div>
      <h2>Coin Collector</h2>
      <button onClick={collectCoin}>Collect Coin</button>
      <p>Coins: {coins}</p>
    </div>
  );
};

export default CoinCollector;
