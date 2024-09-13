import react, { useState } from "react";
const FormData = () => {
  const [formdata, setFormdata] = useState({
    name: "",
    email: "",
    age: "",
  });
  const handleSubmit = (e) => {
   
    console.log(formdata.name);
  };

  const handleChnage = (e) => {
    const { name, value } = e.target;
    setFormdata({
      ...formdata,
      [name]: value,
    });
  };
  return (
    <>
      <div>
        <form onSubmit={handleSubmit}>
          <label htmlFor="name">name</label>

          <input
            name="name"
            value={formdata.name}
            onChange={handleChnage}
            id="name"
            type="text"
          />
          <label htmlFor="email">email</label>

          <input
            name="email"
            onChange={handleChnage}
            value={formdata.email}
            id=""
            type="mail"
          />

          <label htmlFor="age">age</label>

          <input
            name="age"
            onChange={handleChnage}
            value={formdata.age}
            type="number"
          />
          <button type="submit">submit data</button>
        </form>
      </div>
      <div>
        <h1>This is real time data</h1>
        <p>{formdata.name}</p>
        <p>{formdata.age}</p>
        <p>{formdata.email}</p>
      </div>
    </>
  );
};
export default FormData;
