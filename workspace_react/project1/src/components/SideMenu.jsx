//rafce
//React Arrow Function Compornent Export

import React from "react";

const SideMenu = () => {
  function click(){
    console.log(3);
  };

  return (
    <>
      <div>SideMenu</div>

      <button type="button" onClick={click}>사이드 버튼 1</button>
      <button type="button" onClick={click}>사이드 버튼 2</button>
    </>
  );
};

export default SideMenu;
