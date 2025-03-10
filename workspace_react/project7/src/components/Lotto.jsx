import axios from 'axios';
import './Lotto.css'
import React, { useState } from 'react'
import LottoNum from './LottoNum';

const Lotto = () => {
  //로또의 번호를 저장하는 state 변수
  const [lotto, setLotto] = useState([0, 0, 0, 0, 0, 0]);

  return (
    <>
      <h2>로또 자동 번호 생성기</h2>

      <div className='lotto'>
        
        {
          lotto.map((num, i) => {
            return(
              <LottoNum key={i} num={num} i={i} lotto={lotto} setLotto={setLotto} />
            )
          })
        }
     
      </div>
    </>
  )
}

export default Lotto