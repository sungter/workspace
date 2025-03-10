package com.green.employee_manager.service;

import com.green.employee_manager.dto.EmployeeDTO;
import com.green.employee_manager.dto.SearchDTO;
import com.green.employee_manager.mapper.EmployeeMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class EmployeeServiceImpl implements EmployeeService {
  private final EmployeeMapper employeeMapper;

  @Override
  public void regEmp(EmployeeDTO employeeDTO) {
    employeeMapper.regEmp(employeeDTO);
  }

  @Override
  public List<SearchDTO> searchEmp(SearchDTO searchDTO) {
    return employeeMapper.searchEmp(searchDTO);
  }
}
