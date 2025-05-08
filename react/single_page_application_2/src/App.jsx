import "./App.css";
import FetchProducts from "./components/FetchProducts";
import { BrowserRouter, Link, Route, Routes } from "react-router-dom";
function App() {
  return (
    <>
      <BrowserRouter>
        <Link to="/products">
          <button className="btn btn-outline-primary">
            Products
          </button>
        </Link>
        
        <Routes>
          <Route path="/products" element={<FetchProducts />}></Route>
        </Routes>
      </BrowserRouter>
    </>
  );
}

export default App;
