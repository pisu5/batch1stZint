import { useState } from "react";

export const Form = () => {
  const [name, setName] = useState(""); //hooks use state
  const [mail, setMail] = useState("");

  const handleClick = (e) => {
    setName(e.target.value);
  };
  const handlemail = (e) => {
    setMail(e.target.value);
  };
  return (
    <>
      <h1>This is form</h1>
      <input onChange={handleClick} type="text" placeholder="Enter Your Name" />
     
      <input
        onChange={handlemail}
        type="email"
        placeholder="Enter your Email"
      />
     <button>show ans</button>
    </>
  );
};
