import "./App.css";
import FetchProducts from "./components/FetchProducts";
import { BrowserRouter, Link, Route, Routes } from "react-router-dom";
import Navbar from "./components/Navbar";
function App() {
  return (
    <>
      <BrowserRouter>
       
       <Navbar/>


      

        <Routes>
          <Route path="/products" element={<FetchProducts />}></Route>
        </Routes>
      </BrowserRouter>
    </>
  );
}

export default App;
