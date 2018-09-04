package com.employee.demo.controllers;

import com.employee.demo.models.Employee;
import com.employee.demo.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;

    @RequestMapping(value = "/employee")
    public List<Employee> getEmployeeDetails(){

        return employeeService.getEmployeeDetails();
    }

    @RequestMapping(value = "/employeeDetails")
    public List<Employee> getEmployee(@RequestParam String deptId){
        return employeeService.getEmployee(deptId);
    }
}
