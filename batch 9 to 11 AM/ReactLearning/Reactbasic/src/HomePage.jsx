import React from "react";
function Heading(props) {
  return <>{props.children}</>;
}
function HomePage() {
  return (
    <div>
      <Heading>
        <h1>Hello i am from heading component</h1>
        <h2>Hello i am h2 from children component</h2>
        <h4>tis is h4</h4>
      </Heading>
    </div>
  );
}
export default HomePage;
