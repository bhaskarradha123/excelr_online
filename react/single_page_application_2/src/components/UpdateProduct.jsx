import React, { useEffect } from "react";
import axios from 'axios';
import '../styles/FetchProducts.css';
const UpdateProduct = () => {
 let [products, setProducts] = React.useState([]);

let fetchData=()=>{
      axios.get('https://fakestoreapi.com/products')
      .then((res)=>setProducts(res.data))
      .catch((err)=>console.log(err));
}
  useEffect(() => {
    fetchData();
  }, []);

  return (
    <>
      <div className="container">
        {
          products.map(
            (product)=>{
              return(
                <div className="card" key={product.id}>
                  <img src={product.image}  alt={product.title} />
                  <h3>{product.title.slice(0,15)}</h3>
                  <p className="price">${product.price}</p>
                  <p className="category">{product.category}</p>
                </div>
              )
            }
          )  
        }
      </div>
    </>
  )
}

export default UpdateProduct;