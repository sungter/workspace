
import React, { useState } from 'react'
import Controller from './Controller'
import Display from './Display'

const Counter = () => {
  const [changeNum, setChangeNum] = useState(0);

  return (
    <>
      <h2>Simpl Counter</h2>

      <Display changeNum={changeNum} />

      <Controller changeNum={changeNum} setChangeNum={setChangeNum}/>
    </>
  )
}

export default Counter

