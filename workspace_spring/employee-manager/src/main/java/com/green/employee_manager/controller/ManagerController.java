package com.green.employee_manager.controller;

import com.green.employee_manager.dto.DeptDTO;
import com.green.employee_manager.dto.EmployeeDTO;
import com.green.employee_manager.dto.JobDTO;
import com.green.employee_manager.dto.SearchDTO;
import com.green.employee_manager.service.DeptService;
import com.green.employee_manager.service.EmployeeService;
import com.green.employee_manager.service.JobService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employee")
@RequiredArgsConstructor
public class ManagerController {
  private final EmployeeService employeeService;
  private final DeptService deptService;
  private final JobService jobService;


  /// 사원 파트////////////////////////////////////////////////////////////////////
  @PostMapping("")
  public void regEmp(@RequestBody EmployeeDTO employeeDTO){
    employeeService.regEmp(employeeDTO);
  }

  @GetMapping("")
  public List<SearchDTO> searchEmp(SearchDTO searchDTO){
    return employeeService.searchEmp(searchDTO);
  }

  /// ////////////////////////////////////////////////////////////////////////////

  /// 부서 파트////////////////////////////////////////////////////////////////////
  @PostMapping("/dept")
  public void regDept(@RequestBody DeptDTO deptDTO){
    deptService.regDept(deptDTO);
  }

  @GetMapping("/dept")
  public List<DeptDTO> getDeptList(){
    return deptService.getDeptList();
  }

  @DeleteMapping("/dept/{deptNo}")
  public void deleteDept(@PathVariable("deptNo") int deptNo){
    deptService.deleteDept(deptNo);
  }

  /// ////////////////////////////////////////////////////////////////////////////





  /// 직급 파트////////////////////////////////////////////////////////////////////
  @PostMapping("/job")
  public void regJob(@RequestBody JobDTO jobDTO){
    jobService.regJob(jobDTO);
  }

  @GetMapping("/job")
  public List<JobDTO> getJobList(){
    return jobService.getJobList();
  }

  @DeleteMapping("/job/{jobNo}")
  public void deleteJob(@PathVariable("jobNo") int jobNo){
    jobService.deleteJob(jobNo);
  }

  /// ////////////////////////////////////////////////////////////////////////////

}
