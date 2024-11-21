import { Link } from "react-router-dom";

export const Routers =()=>{
    return(
        <>
        <h1>This is Rouetrs</h1>
        <ul>
            <Link to={"/home"}>Go to home</Link>
            <Link to={"/about"}>About</Link>
        </ul>
        </>
    );
    
}