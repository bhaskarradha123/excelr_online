import React from 'react'
import { useLocation } from 'react-router-dom'

const Dashboard = () => {
  const location = useLocation();
  console.log(location.state, 'dashboard user data');
  return (
    
    <div>
      <h2> {location.state.email}</h2>
      <p>Welcome to your dashboard!</p>
    </div>
  );
}

export default Dashboard