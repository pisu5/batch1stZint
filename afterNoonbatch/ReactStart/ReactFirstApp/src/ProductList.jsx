import React, { useState } from "react";

function ProductList() {
  const [products, setProducts] = useState([
    { id: 1, name: "Laptop", price: 50000 },
    { id: 2, name: "Smartphone", price: 20000 },
    { id: 3, name: "Headphones", price: 2000 },
    { id: 4, name: "Smartwatch", price: 8000 },
  ]);

  const [newProduct, setNewProduct] = useState({ name: "", price: "" });

  // Function to remove a product
  const removeProduct = (id) => {
    setProducts(products.filter((product) => product.id !== id));
  };

  // Function to add a new product
  const addProduct = () => {
    if (newProduct.name && newProduct.price) {
      setProducts([
        ...products,
        {
          id: products.length + 1,
          name: newProduct.name,
          price: Number(newProduct.price),
        },
      ]);
      setNewProduct({ name: "", price: "" });
    }
  };

  return (
    <div style={{ padding: "20px", fontFamily: "Arial, sans-serif" }}>
      <h2>Product List</h2>
      <ul>
        {products.map((product) => (
          <li key={product.id} style={{ marginBottom: "10px" }}>
            <strong>{product.name}</strong> - ₹{product.price}
            <button
              onClick={() => removeProduct(product.id)}
              style={{
                marginLeft: "10px",
                color: "white",
                backgroundColor: "red",
                border: "none",
                padding: "5px 10px",
                cursor: "pointer",
              }}
            >
              Remove
            </button>
          </li>
        ))}
      </ul>

      <h3>Add a New Product</h3>
      <input
        type="text"
        placeholder="Product Name"
        value={newProduct.name}
        onChange={(e) => setNewProduct({ ...newProduct, name: e.target.value })}
        style={{ marginRight: "10px", padding: "5px" }}
      />
      <input
        type="number"
        placeholder="Product Price"
        value={newProduct.price}
        onChange={(e) =>
          setNewProduct({ ...newProduct, price: e.target.value })
        }
        style={{ marginRight: "10px", padding: "5px" }}
      />
      <button
        onClick={addProduct}
        style={{
          color: "white",
          backgroundColor: "green",
          border: "none",
          padding: "5px 10px",
          cursor: "pointer",
        }}
      >
        Add Product
      </button>
    </div>
  );
}

export default ProductList;
