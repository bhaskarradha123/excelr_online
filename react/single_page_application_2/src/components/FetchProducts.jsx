import React, { useEffect } from "react";

const FetchProducts = () => {
  let [products, setProducts] = React.useState([]);
  //fetching backend data with the help of fetch api
  let fetchData = () => {
    fetch("https://fakestoreapi.com/products")
      .then((res) => res.json())
      .then((json) => setProducts(json)) //adding products to state
      .catch((err) => console.log(err));
  };
  useEffect(() => {
    fetchData();
  }, []);

  return (
    <>
      {products.map((element, index) => {
        return <div key={index}>{element.title}</div>;
      })}
    </>
  );
};

export default FetchProducts;
