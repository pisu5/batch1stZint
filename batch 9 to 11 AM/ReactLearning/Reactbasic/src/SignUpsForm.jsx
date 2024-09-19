import react, { useState } from "react";

const SignUpsForm = () => {
  const [formdata, setformdata] = useState({
    name: " ",
    mail: " ",
    password: " ",
  });
  //uniuw id
  const [users, setUsers] = useState({});

  const handleChange = (e) => {
    const { name, value } = e.target;
    setformdata({
      ...formdata,
      [name]: value,
    });
  };

  const handleSubmit = () => {
    console.log("clicked");
    e.preventDeafult();
    const id = Date.now().toString();
    setUsers({ ...formdata, id });
    setformdata({ name: " ", mail: " ", password: " " });
  };
  const showUsers = () => {
    console.log("users"+formdata.name);
  };
  return (
    <>
      <div>
        <form onSubmit={handleSubmit}>
          <div>
            <label htmlFor="name">name</label>
            <input
              name="name"
              type="text"
              value={formdata.name}
              onChange={handleChange}
            />
            <h1>{formdata.name}</h1>
          </div>
          <div>
            <label htmlFor="mail">Email</label>
            <input
              name="mail"
              type="mail"
              value={formdata.mail}
              onChange={handleChange}
            />
          </div>
          <div>
            <label htmlFor="password">Password</label>
            <input
              name="password"
              type="password"
              value={formdata.password}
              onChange={handleChange}
            />
          </div>
          <button type="submit">submit</button>
        </form>
        <button onClick={showUsers}>Show all users</button>
      </div>
    </>
  );
};
export default SignUpsForm;
