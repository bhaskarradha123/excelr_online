import React from "react";
import { useNavigate } from "react-router-dom";
import "bootstrap/dist/css/bootstrap.min.css";

const Home = () => {
  const navigate = useNavigate();

  return (
    <div className="text-center mt-5">
      <h1>Employee Management System</h1>
      <p>Welcome to the Employee Management System</p>

      <button
        className="btn btn-primary m-2"
        onClick={() => navigate("/register")}
      >
        Register
      </button>

      <button
        className="btn btn-success m-2"
        onClick={() => navigate("/login")}
      >
        Login
      </button>

      <footer className="text-center mt-5">
        <p>&copy; 2023 Employee Management System</p>
      </footer>
    </div>
  );
};

export default Home;
