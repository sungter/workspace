package com.green.employee_manager.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDate;

@Getter
@Setter
@ToString
public class SearchDTO {
  private String empName;
  private String deptName;
  private String jobName;
  private String gender;
  private LocalDate hireDate;
  private String minHireDate;
  private String maxHireDate;

}
