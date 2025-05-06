import React, { useRef } from "react";

const Login = () => {
  let userName = useRef(null);
  let userPassword = useRef(null);
  const handleSubmit = (event) => {
    event.preventDefault();
    if (
      userName.current.value == "admin" &&
      userPassword.current.value == "1234"
    ) {
      alert("Login Successfull");
    } else {
      alert("Login Failed");
    }
  };
  return (
    <>
      <form onSubmit={handleSubmit}>
        <input type="text" placeholder="enter username" ref={userName} />
        <br />
        <br />
        <input type="text" placeholder="enter password" ref={userPassword} />
        <br />
        <br />
        <input
          type="submit"
          value="Login"
          className="btn btn-outline-primary"
        />
      </form>
    </>
  );
};

export default Login;
