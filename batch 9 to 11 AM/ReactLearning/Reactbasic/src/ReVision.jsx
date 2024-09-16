import React from "react";
const ReVision = () => {
  const fruits = [
    "mango",
    "tomoato",
    "grapes",
    "pinee",
    "dragonfruits",
    "apple",
  ];
  const obj = [
    { id: 1, name: "jnwdne", id: 2, age: "34", id: 3, edu: "master" },
  ];
  return (
    <>
      <h1>This is list of fruits</h1>
      <ul>
        {fruits.map((element, index) => (
          <li key={index}>{element}</li>
        ))}
      </ul>

      <ul>
        {obj.map((element) => (
          <li key={element.id}>
            {" "}
            name is{element.name} and age is{element.age}
          </li>
        ))}
      </ul>
    </>
  );
};

export default ReVision;
