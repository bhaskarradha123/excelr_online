import React from "react";
import { Link, Outlet } from "react-router-dom";

const Dashboard = () => {
  return (
    <>
      <div>Dashboard</div>
      <Link to={"/dashboard/mens/jeans"} style={{ margin: "10px" }}>
        <button className="btn btn-outline-primary">MENS</button>
      </Link>
      <Link to={"/dashboard/womens/saree/green"} style={{ margin: "10px" }}>
        <button className="btn btn-outline-primary">WOMENS</button>
      </Link>
      <Link to={"/dashboard/kids"}>
        <button className="btn btn-outline-primary">KIDS</button>
      </Link>

      <Outlet></Outlet>
    </>
  );
};

export default Dashboard;
