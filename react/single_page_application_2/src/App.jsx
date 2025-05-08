import "./App.css";
import FetchProducts from "./components/FetchProducts";
import { BrowserRouter, Link, Route, Routes } from "react-router-dom";
import Navbar from "./components/Navbar";
import FetchUsers from "./components/FetchUsers";
function App() {
  return (
    <>
      <BrowserRouter>
       
       <Navbar/>


      

        <Routes>
          <Route path="/products" element={<FetchProducts />}></Route>
          <Route path="/users" element={<FetchUsers />}></Route>
          {/* try to fetch list of users */}
        </Routes>
      </BrowserRouter>
    </>
  );
}

export default App;
