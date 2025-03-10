package com.green.employee_manager.mapper;

import com.green.employee_manager.dto.DeptDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface DeptMapper {

  //부서 등록 쿼리
  public void regDept(DeptDTO deptDTO);

  //부서 조회 쿼리
  public List<DeptDTO> getDeptList();

  //부서 한 개 삭제 쿼리
  public void deleteDept(int deptNo);

}
