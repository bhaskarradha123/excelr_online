import React from "react";

const GrandParent = () => {
  return (
    <>
      <div>GrandParent</div>
      <Parent />
    </>
  );
};
const Parent = () => {
  return (
    <div>
      <div>Parent</div>
      <Child />
    </div>
  );
};
const Child = () => {
  return (
    <>
      <div>Child</div>
      <GrandChild />
    </>
  );
};
const GrandChild = () => {
  return (
    <>
      <div>GrandChild</div>
    </>
  );
};

export default GrandParent;
