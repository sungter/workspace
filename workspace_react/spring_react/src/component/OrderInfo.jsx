import './OrderInfo.css'
import React, { useState } from "react";
import OrderList from "./OrderList";
import OrderDetail from "./OrderDetail";

const OrderInfo = () => {
  const [orderDetail, setOrderDetail] = useState({});

  const [isShow, setIsShow] = useState(false);

  return (
    <>
      <div className="container">
        <OrderList setOrderDetail={setOrderDetail} isShow={isShow} setIsShow={setIsShow} />
        
        {isShow ? <OrderDetail orderDetail={orderDetail} /> : null}

        <button className='hide' type='button' onClick={(e) => {setIsShow(false)}}>HIDE</button>
      </div>
    </>
  );
};

export default OrderInfo;
