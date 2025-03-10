package com.green.employee_manager.mapper;

import com.green.employee_manager.dto.DeptDTO;
import com.green.employee_manager.dto.JobDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface JobMapper {
  //직급 등록 쿼리
  public void regJob(JobDTO jobDTO);

  //직급 조회 쿼리
  public List<JobDTO> getJobList();

  //직급 한 개 삭제 쿼리
  public void deleteJob(int jobNo);
}
