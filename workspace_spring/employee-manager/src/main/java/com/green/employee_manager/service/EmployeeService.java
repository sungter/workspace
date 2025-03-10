package com.green.employee_manager.service;

import com.green.employee_manager.dto.EmployeeDTO;
import com.green.employee_manager.dto.SearchDTO;

import java.util.List;

public interface EmployeeService {
  //사원 등록 기능
  public void regEmp(EmployeeDTO employeeDTO);

  //사원 조회 기능
  public List<SearchDTO> searchEmp(SearchDTO searchDTO);
}
