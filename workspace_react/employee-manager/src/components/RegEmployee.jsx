
import axios from 'axios';
import React, { useEffect, useState } from 'react'
import styles from './RegEmployee.module.css'

const RegEmployee = () => {

  //부서 데이터 받아올 변수
  const [deptData, setDeptData] = useState([]);
  

  //직급 데이터 받아올 변수
  const [jobData, setJobData] = useState([]);

  //등록한 데이터를 보내기 위해 데이터를 저장하는 변수
  const [regEmployee, setRegEmployee] = useState({
    deptNo : 0,
    jobNo : 0,
    empName : '',
    gender : '',
    hireDate : ''
  });

  //등록 데이터를 입력값으로 바꿔주는 함수
  const changeRegEmployee = (e)=>{
    setRegEmployee({
      ...regEmployee,
      [e.target.name] : e.target.value
    });
  };


  //페이지 로딩시 데이터 받아오는 함수
  useEffect(() => {
    axios.all([
      axios.get('/api/employee/dept'),
      axios.get('/api/employee/job')
    ])
        .then(axios.spread((res1, res2) => {
          setDeptData(res1.data);
          setJobData(res2.data);
        }))
        .catch(error => console.log(error));
  } , []);

  //등록 데이터를 보내서 사원을 등록시킬 함수
  const regEmp = () => {
    if(!confirm('사원을 등록하시겠습니까?')){
      return;
    }

    axios.post('/api/employee', regEmployee)
        .then(res => alert('사원 등록이 완료되었습니다.'))
        .catch(error => console.log(error));
  };

  console.log(regEmployee);

  return (
    <div className={styles.container}>
      <h4>사원 등록</h4>
      <div className={styles.reg_button}>
      <table className={styles.reg_table}>
        <colgroup>
          <col width='150px'/>
          <col width='300px'/>
        </colgroup>

        <tbody>
          <tr>
            <td>소속부서</td>
            <td>
              <select name='deptNo' value={regEmployee.deptNo} 
              onChange={e => changeRegEmployee(e)}>
                <option value="">선택</option>
                {
                  deptData.map((dept, i) => {
                    return(
                      <option key={i} value={dept.deptNo}>{dept.deptName}</option>
                    )
                  })
                }
              </select>
            </td>
          </tr>


          <tr>
            <td>직급</td>
            <td>
              <select name="jobNo" value={regEmployee.jobNo}
              onChange={e => changeRegEmployee(e)}>
                <option value="">선택</option>
                {
                  jobData.map((job, i) => {
                    return(
                      <option key={i} value={job.jobNo}>{job.jobName}</option>
                    )
                  })
                }
              </select>
            </td>
          </tr>


          <tr>
            <td>사원명</td>
            <td>
              <input type="text" name='empName' value={regEmployee.empName}
              onChange={e => changeRegEmployee(e)}/>
            </td>
          </tr>


          <tr>
            <td>성별</td>
            <td>
              <input type="radio" name='gender' 
              value={'male'} onChange={e => changeRegEmployee(e)}/>남
              <input type="radio" name='gender' 
              value={'female'} onChange={e => changeRegEmployee(e)}/>여
            </td>
          </tr>

          <tr>
            <td>입사일</td>
            <td>
              <input type="datetime" name='hireDate' value={regEmployee.hireDate}
              onChange={e => changeRegEmployee(e)} />
            </td>
          </tr>

        </tbody>
      </table>

      
        <div><button type='button' onClick={e => regEmp()}>등록</button></div>
  
      </div>

    </div>
  )
}

export default RegEmployee