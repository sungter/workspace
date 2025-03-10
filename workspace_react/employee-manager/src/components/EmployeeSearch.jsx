import axios from "axios";
import React, { useEffect, useState } from "react";
import styles from './EmployeeSearch.module.css'

const EmployeeSearch = () => {

  //부서 데이터 받아올 변수
  const [deptData, setDeptData] = useState([]);

  //조회하기 위해 쿼리에 보낼 데이터를 저장하는 변수
  const [searchEmp, setSearchEmp] = useState({});

  //조회시 return되는 값을 받아 저장할 변수
  const [searchData, setSearchData] = useState([]);


  //쿼리에 보낼 searchEmp 변수 변경하는 함수
  const changeSearchEmp = (e) => {
    setSearchEmp({
      ...searchEmp,
      [e.target.name] : e.target.value
    });
  };


  //부서 리스트 받아오는 함수
  useEffect(() => {
    axios.get("/api/employee/dept")
      .then((res) => setDeptData(res.data))
      .catch((error) => console.log(error));

      axios.get(`/api/employee?empName=${searchEmp.empName}`+
        `&deptName=${searchEmp.deptName}`+
        `&gender=${searchEmp.gender}`+
        `&minHireDate=${searchEmp.minHireDate}`+
        `&maxHireDate=${searchEmp.maxHireDate}`)
            .then(res => {
              setSearchData(res.data);
            })
            .catch(error => console.log(error));
  }, []);

  
  //사원 조회 검색 버튼 기능 함수
  const getSearchData = () => {
    axios.get(`/api/employee?empName=${searchEmp.empName}`+
                `&deptName=${searchEmp.deptName}`+
                `&gender=${searchEmp.gender}`+
                `&minHireDate=${searchEmp.minHireDate}`+
                `&maxHireDate=${searchEmp.maxHireDate}`)
        .then(res => {
          setSearchData(res.data);
        })
        .catch(error => console.log(error));
  }

  
  return (
    <div className={styles.container}>
      <table>
        <colgroup>
          <col width={'10%'} />
          <col width={'15%'} />
          <col width={'15%'} />
          <col width={'20%'} />
          <col width={'15%'} />
          <col width={'15%'} />
          <col width={'10%'} />
        </colgroup>

        <tbody>
          <tr>
            <td>사원명</td>
            <td colSpan={5}>
              <input className={styles.dept_input} type="text" name="empName" value={searchEmp.empName} 
              onChange={e => changeSearchEmp(e)}/>
            </td>
            <td><button type="button" onClick={(e) =>{getSearchData()}}>검색</button></td>
          </tr>

          <tr>
            <td>부서</td>
            <td>
              <select className={styles.dept_select} name="deptName" value={searchEmp.deptName}
              onChange={e => changeSearchEmp(e) }>
                <option value="">전체</option>
                {
                  deptData.map((dept, i) => {
                    return(
                      <option key={i} value={dept.deptName}>{dept.deptName}</option>
                    )
                  })
                }
              </select>
            </td>

            <td>성별</td>
            <td>
              <input type="radio" name="gender" value={'male'} 
              onChange={e => changeSearchEmp(e)} />남
              
              <input type="radio" name="gender" value={'female'} 
              onChange={e => changeSearchEmp(e)} />여
            </td>

            <td>입사일</td>
            <td colSpan={2}>
              <input type="date" name="minHireDate" value={searchEmp.minHireDate}
              onChange={e => changeSearchEmp(e)} />
              <input type="date" name="maxHireDate" value={searchEmp.maxHireDate}
              onChange={e => changeSearchEmp(e)} />
            </td>
          </tr>
        </tbody>
      </table>


      <table className={styles.search_list_table}>
        <thead>
          <tr>
            <td>No</td>
            <td>부서명</td>
            <td>직급</td>
            <td>사원명</td>
            <td>성별</td>
            <td>입사일</td>
          </tr>
        </thead>
              


        <tbody>
          {
            searchData.map((data, i) => {
              return(
                <tr key={i}>
                  <td>{searchData.length - i}</td>
                  <td>{data.deptName}</td>
                  <td>{data.jobName}</td>
                  <td>{data.empName}</td>
                  <td>{data.gender}</td>
                  <td>{data.hireDate}</td>
                </tr>
              )
            })
          }
        </tbody>
      </table>

    </div>
  );
};

export default EmployeeSearch;
