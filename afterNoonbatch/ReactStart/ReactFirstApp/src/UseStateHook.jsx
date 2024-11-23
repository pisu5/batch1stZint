import { useState } from "react";

export const UseStateHook=()=>{
    const [getter , setter] = useState("oksnch");
    const f = ()=>{
        setter("lknfjed")
    }
    return(
        <>
        <h1 onClick={f}>THis is use state hook</h1>
        <h2>{getter}</h2>
        </>
    );
}