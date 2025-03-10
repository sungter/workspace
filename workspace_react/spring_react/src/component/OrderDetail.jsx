
import React from 'react'

const OrderDetail = ({orderDetail}) => {
  return (
    <div>
      <h3>주문 상세 정보</h3>
      <table className='detailInfo'>
        <colgroup>
          <col width={'15%'}/>
          <col width={'30%'}/>
          <col width={'*'}/>
          <col width={'40%'}/>
        </colgroup>
        <tbody>
          <tr>
            <td>상품번호</td>
            <td>{orderDetail.itemNum}</td>
            <td>상품명</td>
            <td>{orderDetail.itemName}</td>
          </tr>

          <tr>
            <td>가격</td>
            <td>{orderDetail.itemPrice}원</td>
            <td>수량</td>
            <td>{orderDetail.itemCnt}</td>
          </tr>

          <tr>
            <td>주문자ID</td>
            <td>{orderDetail.id}</td>
            <td>구매금액</td>
            <td>{orderDetail.itemPrice * orderDetail.itemCnt}원</td>
          </tr>
        </tbody>
      </table>
    </div>
  )
}

export default OrderDetail