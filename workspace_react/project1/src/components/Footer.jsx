import React from "react"

function Footer() {
  return(
    <>
      <div>footer</div>
      <button type="button" onClick={ () => {
        console.log('버튼 클릭');
      } }>버튼 1</button>

      <button type="button" onMouseEnter={ () => {
        console.log(5);
      } }>버튼 2</button>

      <input type="text" onChange={ () => {
        alert('!!!');
      } } />
    </>
  )
}

export default Footer