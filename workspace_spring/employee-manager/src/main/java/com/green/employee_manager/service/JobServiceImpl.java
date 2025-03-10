package com.green.employee_manager.service;

import com.green.employee_manager.dto.JobDTO;
import com.green.employee_manager.mapper.JobMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class JobServiceImpl implements JobService {
  private final JobMapper jobMapper;


  @Override
  public void regJob(JobDTO jobDTO) {
    jobMapper.regJob(jobDTO);
  }

  @Override
  public List<JobDTO> getJobList() {
    return jobMapper.getJobList();
  }

  @Override
  public void deleteJob(int jobNo) {
    jobMapper.deleteJob(jobNo);
  }
}
