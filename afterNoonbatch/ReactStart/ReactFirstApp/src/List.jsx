const List = () => {
  const Fruits = ["Apple", "Grapes", "JackFruit", "papaya", "Mango"];

  const EmployeData = [
    { id: 0, name: "Ramesh", Position: "HR", salary: "70000" },
    { id: 1, name: "Suresh", Position: "Product manger", salary: "7000" },
    { id: 2, name: "arnav", Position: "CEO", salary: "700000" },
  ];

  const Phonedata = [
    {
      id: 0,
      name: "PoCO M6 5G",
      url: "https://rukminim2.flixcart.com/image/312/312/xif0q/mobile/9/b/n/-original-imah3afnqj84usyy.jpeg?q=70",
      price: "₹7,999",
    },
    {
      id: 1,
      name: "Vivo T3 5G",
      url: "https://rukminim2.flixcart.com/image/312/312/xif0q/mobile/w/3/4/-original-imahyytukhkky5ew.jpeg?q=70",
      price: "₹12,999",
    },
    {
      id: 2,
      name: "realme 12 5G",
      url: "https://rukminim2.flixcart.com/image/312/312/xif0q/mobile/w/c/3/-original-imah3chxfqnezjjb.jpeg?q=70",
      price: "₹12,999",
    },
    {
      id: 3,
      name: "Apple iPhone 15",
      url: "https://rukminim2.flixcart.com/image/312/312/xif0q/mobile/k/l/l/-original-imagtc5fz9spysyk.jpeg?q=70",
      price: "₹58,999",
    },
    {
      id: 4,
      name: "PoCO M6 5G",
      url: "https://rukminim2.flixcart.com/image/312/312/xif0q/mobile/9/b/n/-original-imah3afnqj84usyy.jpeg?q=70",
      price: "₹7,999",
    },
    {
      id: 5,
      name: "Vivo T3 5G",
      url: "https://rukminim2.flixcart.com/image/312/312/xif0q/mobile/w/3/4/-original-imahyytukhkky5ew.jpeg?q=70",
      price: "₹12,999",
    },
    {
      id: 6,
      name: "realme 12 5G",
      url: "https://rukminim2.flixcart.com/image/312/312/xif0q/mobile/w/c/3/-original-imah3chxfqnezjjb.jpeg?q=70",
      price: "₹12,999",
    },
    {
      id: 7,
      name: "Apple iPhone 15",
      url: "https://rukminim2.flixcart.com/image/312/312/xif0q/mobile/k/l/l/-original-imagtc5fz9spysyk.jpeg?q=70",
      price: "₹58,999",
    },
  ];

  return (
    <div>
      {/** <ul>
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
      </table> */}

      <div className="phones-list">
        <div className="phone-head">
          <h1>View SmartPhones</h1>
          <button>View All</button>
        </div>
        <div className="list">
          {Phonedata.map((value) => (
            <div key={value.id} className="phones">
              <img src={value.url} alt="" />
              <h3>{value.name}</h3>
              <p>{value.price}</p>
            </div>
          ))}
        </div>
      </div>
    </div>
  );
};
export default List;
