import React, { useState } from "react";
import axios from "axios";
import { useNavigate } from "react-router-dom";

const Login = () => {
  const navigate = useNavigate();

  const [formData, setFormData] = useState({
    email: "",
    pwd: ""
  });
  const [message, setMessage] = useState("");

  const handleChange = (e) => {
    setFormData({ ...formData, [e.target.name]: e.target.value });
  };

  const handleSubmit = async (e) => {
    e.preventDefault();
    try {
      const response = await axios.post("http://localhost:8080/employee/login", formData, {
        validateStatus: (status) => status < 500
      });
      if (response.status === 302) {
        setMessage("Login successful!");
        setTimeout(() => {
          console.log(response.data, 'login user data');
          navigate("/dashboard" , {state: response.data});
        }, 1500);
      } else if (response.status === 404) {
        setMessage(response.data.data || "Invalid credentials.");
      } else {
        setMessage("Unexpected response: " + response.status);
      }
    } catch (err) {
      console.error("Error:", err);
      setMessage("Network or server error. Please try again later.");
    }
  };

  return (
    <div className="container mt-5">
      <h2>Login</h2>
      <form onSubmit={handleSubmit} style={{ maxWidth: "400px", margin: "0 auto" }}>
        <div className="mb-3">
          <label>Email</label>
          <input type="email" name="email" className="form-control" onChange={handleChange} required />
        </div>
        <div className="mb-3">
          <label>Password</label>
          <input type="password" name="pwd" className="form-control" onChange={handleChange} required />
        </div>
        <button type="submit" className="btn btn-success">Login</button>
      </form>
      {message && <p className="mt-3 text-center">{message}</p>}
    </div>
  );
};

export default Login;
