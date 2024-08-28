import React, { useState } from "react";
import "./Header.css";
function Header(props) {
  const [count, setCount] = useState(0); //integer
  const [name, setname] = useState("");
  


  return (
    <div>
      <header>
        <div className="left">
          <h1>Logo</h1>
        </div>
        <div className="right">
          <nav>
            <ul>
              <li>Home</li>
              <li>About</li>
              <li>Logout</li>
              <li>Account</li>
              <li>Lost</li>
              <li>{props.name}</li>
              <li>{props.age}</li>
              <li>{props.color}</li>
            </ul>
          </nav>
        </div>
        <button onClick={() => setCount(count + 1)}>Increase by{count}</button>
       <button onClick={()=>setname("ravi")}>click</button>

       <h1>{name}</h1>
      </header>
    </div>
  );
}
export default Header;
