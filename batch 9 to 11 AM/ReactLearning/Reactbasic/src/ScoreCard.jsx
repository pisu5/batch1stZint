import { useContext } from "react";
import { CoinContext } from "./CoinProvider";
const ScoreCard = () => {
  const {coins} = useContext(CoinContext);

  return <h1>Coins: {coins}</h1>;
};

export default ScoreCard;
