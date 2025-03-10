
import axios from 'axios';
import React, { useEffect, useState } from 'react'

const Axios_2 = () => {
  const [person, setPerson] = useState({});

  useEffect(() => {
    axios.get('/api/t3')
          .then((res) => {
            console.log('통신 성공');
            console.log(res.data);
            setPerson(res.data);
          })
          .catch((error) => {
            console.log('통신 실패');
            console.log(error);
          });
  }, []);

  return (
    <>
      <div>{person.name}</div>
      <div>{person.age}</div>
      <div>{person.addr}</div>
    </>
  )
}

export default Axios_2