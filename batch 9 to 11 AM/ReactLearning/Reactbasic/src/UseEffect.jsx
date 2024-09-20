import { useEffect } from "react";
import { useState } from "react";

const UseEffect = ({ props }) => {
  const [count, setCount] = useState(0);

  const count2 = () => {
    setCount(count + 1);
  };
  useEffect(() => {
    setTimeout(() => {
      alert("Out use effect start working");
      console.log("starting mounting...");
    }, 3000);

    //use cleanup function : optional
    return () => {
      // console.log("just cleaning this component");
      console.log("demounting....");
    };
  }, [count]);
  return (
    <>
      <h1>This is useffect state </h1>
      <button onClick={count2}>
        Click here to chnage state and run useffect code again{count}
      </button>
      <h1>{props.target}</h1>
    </>
  );
};
export default UseEffect;
