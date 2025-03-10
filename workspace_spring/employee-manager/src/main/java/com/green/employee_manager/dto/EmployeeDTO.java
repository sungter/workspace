package com.green.employee_manager.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDate;

@Getter
@Setter
@ToString
public class EmployeeDTO {
  private int empNo;
  private String empName;
  private String gender;
  private LocalDate hireDate;
  private int deptNo;
  private int jobNo;

  private String deptName;
  private String jobName;
  private LocalDate minHireDate;
  private LocalDate maxHireDate;

}
