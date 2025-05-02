/**
 * Login
 * Dashboard
 * NavBar
 * Edit
 *
 */
const Login = () => {
  return (
    <>
      <div>Login</div>
      <Dashboard />
    </>
  );
};
const Dashboard = () => {
  return (
    <>
      <div>Dashboard</div>
      <NavBar />
    </>
  );
};
const NavBar = () => {
  return (
    <>
      <div>Navbar</div>
      <Edit />
    </>
  );
};
const Edit = () => {
  return <> 
  <div>edit</div>
  </>
};

export default Login;
