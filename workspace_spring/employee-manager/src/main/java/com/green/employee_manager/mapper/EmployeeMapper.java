package com.green.employee_manager.mapper;

import com.green.employee_manager.dto.EmployeeDTO;
import com.green.employee_manager.dto.SearchDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface EmployeeMapper {

  //사원 등록 쿼리
  public void regEmp(EmployeeDTO employeeDTO);

  //사원 조회 쿼리
  public List<SearchDTO> searchEmp(SearchDTO searchDTO);
}
