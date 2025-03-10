package com.green.employee_manager.service;

import com.green.employee_manager.dto.DeptDTO;

import java.util.List;

public interface DeptService {

  //부서 등록 기능
  public void regDept(DeptDTO deptDTO);

  //부서 조회 기능
  public List<DeptDTO> getDeptList();

  //부서 한 개 삭제 기능
  public void deleteDept(int deptNo);

}
