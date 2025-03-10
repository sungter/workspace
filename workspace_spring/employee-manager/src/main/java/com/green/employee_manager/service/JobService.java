package com.green.employee_manager.service;

import com.green.employee_manager.dto.JobDTO;

import java.util.List;

public interface JobService {

  //직급 등록 기능
  public void regJob(JobDTO jobDTO);

  //직급 조회 기능
  public List<JobDTO> getJobList();

  //직급 한 개 삭제 기능
  public void deleteJob(int jobNo);

}
