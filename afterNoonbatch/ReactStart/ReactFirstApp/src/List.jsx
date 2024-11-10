const List = () => {
  const Fruits = ["Apple", "Grapes", "JackFruit", "papaya", "Mango"];

  const EmployeData = [
    { id: 0, name: "Ramesh", Position: "HR", salary: "70000" },
    { id: 1, name: "Suresh", Position: "Product manger", salary: "7000" },
    { id: 2, name: "arnav", Position: "CEO", salary: "700000" },
  ];

  return (
    <div>
      <ul>
        {Fruits.map((value, index) => (
          <h1>{`${index}${value}`}</h1>
        ))}
      </ul>

      <table border={1}>
        <tr>
          <th colSpan={4}>Employee</th>
        </tr>

        <tr>
          <th>Id</th>
          <th>Name</th>
          <th>Position</th>
          <th>Salary</th>
        </tr>
        {EmployeData.map((value, index) => (
          <tr key={index}>
            <td>{value.id}</td>
            <td>{value.name}</td>
            <td>{value.Position}</td>
            <td>{value.salary}</td>
          </tr>
        ))}
      </table>
    </div>
  );
};
export default List;
