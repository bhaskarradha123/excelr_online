import "./App.css";
import FetchProducts from "./components/FetchProducts";
import { BrowserRouter, Link, Route, Routes } from "react-router-dom";
import Navbar from "./components/Navbar";
import FetchUsers from "./components/FetchUsers";
import SearchInput from "./components/SearchInput";
import DeleteProduct from "./components/DeleteProduct";
import UpdateProduct from "./components/UpdateProduct";
function App() {
  return (
    <>
      <BrowserRouter>
       
       <Navbar/>


      

        <Routes>
          <Route path="/products" element={<FetchProducts />}></Route>
          <Route path="/users" element={<FetchUsers />}></Route>
          <Route path="/deleteProduct" element={<DeleteProduct />}></Route>
          <Route path="/updateProduct" element={<UpdateProduct />}></Route>
          <Route path="/search/:name" element={<SearchInput />}></Route>
          {/* try to fetch list of users */}
        </Routes>
      </BrowserRouter>
    </>
  );
}

export default App;
