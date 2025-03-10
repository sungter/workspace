
import axios from 'axios';
import React, { useEffect, useState } from 'react'
import styles from './Employee.module.css'

const Employee = () => {

  //부서 데이터 받아올 변수
  const [deptData, setDeptData] = useState([]);
  //부서 등록시 보낼 변수
  const [deptName, setDeptName] = useState('');

  //직급 데이터 받아올 변수
  const [jobData, setJobData] = useState([]);
  //직급 등록시 보낼 변수
  const [jobName, setJobName] = useState('');


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


  //부서명 유효성 검사 함수
  const validationDept = () => {
    let valid = true;

    for(let i = 0 ; i < deptData.length ; i++){
      if(deptData[i].deptName === deptName){
        alert('부서명이 중복됩니다.')
        valid = false;
      }
    }
    return valid;
  }


  //부서 등록 함수
  const insertDept = () => {
    if(!validationDept()){
      return;
    }
    

    if(!confirm('부서 등록을 하시겠습니까?')){
      return;
    }

    axios.post(`/api/employee/dept`, {deptName})
        .then(res => {
          alert('등록이 완료되었습니다.');
          window.location.reload();
        })
        .catch(error => console.log(error));
  }

  //부서 삭제 함수
  const deleteDept = (deptNo) => {
    if(!confirm('삭제하겠습니까?')){
      return;
    }

    axios.delete(`/api/employee/dept/${deptNo}`)
        .then(res => {
          alert('삭제되었습니다.')
          window.location.reload();
        })
        .catch(error => console.log(error));
  }



  //직급명 유효성 검사 함수
  const validationJob = () => {
    let valid = true;

    for(let i = 0 ; i < jobData.length ; i++){
      if(jobData[i].jobName === jobName){
        alert('부서명이 중복됩니다.')
        valid = false;
      }
    }
    return valid;
  }

  //직급 등록 함수
  const insertJob = () => {
    if(!validationJob()){
      return;
    }

    if(!confirm('부서 등록을 하시겠습니까?')){
      return;
    }

    axios.post(`/api/employee/job`, {jobName})
        .then(res => {
          alert('등록이 완료되었습니다.');
          window.location.reload();
        })
        .catch(error => console.log(error));
  }

  //직급 삭제 함수
  const deleteJob = (jobNo) => {
    if(!confirm('삭제하겠습니까?')){
      return;
    }

    axios.delete(`/api/employee/job/${jobNo}`)
        .then(res => {
          alert('삭제되었습니다.')
          window.location.reload();
        })
        .catch(error => console.log(error));
  }



  return (
    <div className={styles.container}>

      <div>
          <h4>부서 등록</h4>
          <div className={styles.dept_insert}>
            <input type="text" placeholder='등록할 부서명을 입력하세요.'
            value={deptName} onChange={(e) => {setDeptName(e.target.value)}} />
            <button type='button' onClick={e => insertDept()}>등록</button>
          </div>

          <h4>부서 목록</h4>
          <table >
            <colgroup>
              <col width='50px'/>
              <col width='100px'/>
              <col width='100px'/>
              <col width='80px'/>
            </colgroup>
            <thead>
              <tr>
                <td>No</td>
                <td>부서코드</td>
                <td>부서명</td>
                <td>삭제</td>
              </tr>
            </thead>

            <tbody>
              {
                deptData.length === 0
                ?
                <tr>
                  <td colSpan={4}>데이터가 없습니다.</td>
                </tr>
                :
                deptData.map((dept, i) => {
                  return(
                    <tr key={i}>
                      <td>{deptData.length - i}</td>
                      <td>{dept.deptNo}</td>
                      <td>{dept.deptName}</td>
                      <td>
                        <button type='button' onClick={e => deleteDept(dept.deptNo)}>삭제</button>
                      </td>
                    </tr>
                  )
                })
              }              
            </tbody>
          </table>
        </div>



        <div>
          <h4>직급 등록</h4>
          <div className={styles.dept_insert}>
            <input type="text" placeholder='등록할 직급을 입력하세요.' 
            value={jobName} onChange={e => setJobName(e.target.value)}/>
            <button type='button' onClick={e => insertJob()}>등록</button>
          </div>

          <h4>직급 목록</h4>
          <table border={1}>
            <colgroup>
              <col width='50px'/>
              <col width='100px'/>
              <col width='100px'/>
              <col width='80px'/>
            </colgroup>

            <thead>
              <tr>
                <td>No</td>
                <td>직급코드</td>
                <td>직급</td>
                <td>삭제</td>
              </tr>
            </thead>

            <tbody>
              {
                jobData.length === 0
                ?
                <tr>
                  <td colSpan={4}>데이터가 없습니다.</td>
                </tr>
                :
                jobData.map((job, i) => {
                  return(
                    <tr key={i}>
                      <td>{jobData.length - i}</td>
                      <td>{job.jobNo}</td>
                      <td>{job.jobName}</td>
                      <td>
                        <button type='button' onClick={e => deleteJob(job.jobNo)}>삭제</button>
                      </td>
                    </tr>
                  )
                })
              }
            </tbody>
          </table>
        </div>



    </div>
  )
}

export default Employee