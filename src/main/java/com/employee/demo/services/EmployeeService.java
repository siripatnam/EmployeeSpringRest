package com.employee.demo.services;


import com.employee.demo.models.Employee;
import com.employee.demo.repositories.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    EmployeeRepository employeeRepository;

    public List<Employee> getEmployeeDetails(){

        return employeeRepository.getAllEmployeeDetails();
    }

    public List<Employee> getEmployee(String deptId){

        return employeeRepository.getEmployee(deptId);
    }
}
