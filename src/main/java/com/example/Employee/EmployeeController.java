package com.example.Employee;

import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/employees")
public class EmployeeController {
    private final EmployeeService EmployeeService;

    @Autowired
    public EmployeeController(com.example.Employee.EmployeeService employeeService) {
        EmployeeService = employeeService;

    }
    @GetMapping
    @ApiOperation(value = "Retrieve all employees saved to the database")
    public List<Employee> getEmployees(){
        return EmployeeService.getEmployees();
    }

    @PostMapping
    @ApiOperation(value = "Post a new employee to the database")
    public ResponseEntity<Employee> addNewEmployee(@RequestBody Employee employee){
        EmployeeService.addNewEmployee(employee);

        return new ResponseEntity<>(employee, HttpStatus.ACCEPTED);
    }
}
