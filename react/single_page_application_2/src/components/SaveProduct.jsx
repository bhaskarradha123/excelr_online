import axios from "axios";
import React, { useState } from "react";

const SaveProduct = () => {
  let [product, setProduct] = useState({
    price: 0,
    name: "",
    category: "",
  });

  let handleChange = () => {
    setProduct({
      ...product,
      [e.target.name]: e.target.value,
    });
  };
  let handleSubmit = (e) => {
    e.preventDefault()
    axios
      .post("https://fakestoreapi.com/products", product)
      .then((res) => alert("saved successfully"))
      .catch((err) => console.log(err));
  };

  return (
    <form>
      <input
        type="text"
        placeholder="enter product name"
        onChange={handleChange}
      />
      <br />
      <br />
      <input
        type="text"
        placeholder="enter product price"
        onChange={handleChange}
      />
      <br />
      <br />
      <input
        type="text"
        placeholder="enter product category"
        onChange={handleChange}
      />
      <br />
      <br />
      <button onClick={handleSubmit}>Save</button>
    </form>
  );
};

export default SaveProduct;
