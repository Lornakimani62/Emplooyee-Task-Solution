package com.example.Employee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

 private final EmployeeRepository employeeRepository;

 @Autowired
 public EmployeeService(EmployeeRepository employeeRepository) {
  this.employeeRepository = employeeRepository;
 }

 public List<Employee> getEmployees(){
   return  employeeRepository.findAll();
 };

 public void addNewEmployee(Employee employee){
  employeeRepository.save(employee);
 }
}
