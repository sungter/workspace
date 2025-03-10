package com.green.employee_manager.service;

import com.green.employee_manager.dto.DeptDTO;
import com.green.employee_manager.mapper.DeptMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DeptServiceImpl implements DeptService {
  private DeptMapper deptMapper;

  public DeptServiceImpl(DeptMapper deptMapper){
    this.deptMapper = deptMapper;
  }

  @Override
  public void regDept(DeptDTO deptDTO) {
    deptMapper.regDept(deptDTO);
  }

  @Override
  public List<DeptDTO> getDeptList() {
    return deptMapper.getDeptList();
  }

  @Override
  public void deleteDept(int deptNo) {
    deptMapper.deleteDept(deptNo);
  }
}
