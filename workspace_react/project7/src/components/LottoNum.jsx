import axios from "axios";
import React from "react";

//props 사용 연습
const LottoNum = ({num, i, lotto, setLotto}) => {
    //버튼클릭시 자바에서 1~45의 랜덤한 정수 받아오는 함수
    const getLottoNum = (i) => {
      axios.get('/api/getLottoNum')
          .then((res) => {
            console.log(res.data);
            const copyLotto = [...lotto];
            copyLotto[i] = res.data;
            setLotto(copyLotto);
          })
          .catch((error) => {alert('데이터를 가져오지 못했습니다.')});
    };

  return (
    <>
      <div className="num">
        <div className="display">{num}</div>

        <button type="button" onClick={(e) => {
          getLottoNum(i)
        }}>▲ 생 성</button>
      </div>
    </>
  );
};

export default LottoNum;
