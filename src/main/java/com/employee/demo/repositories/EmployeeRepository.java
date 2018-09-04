package com.employee.demo.repositories;


import com.employee.demo.models.Employee;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class EmployeeRepository {

    List<Employee> employeeList = new ArrayList<>();

    public List<Employee> getAllEmployeeDetails(){

        employeeList.add(new Employee(101,"Siri",100000,110));
        employeeList.add(new Employee(102,"akruthi",150000,110));
        employeeList.add(new Employee(103,"Nithin",200000,120));

        return employeeList;
    }

    public List<Employee> getEmployee(String deptId){
        List<Employee> list = new ArrayList<>();

        for (int i =0; i< employeeList.size(); i++) {
            if (employeeList.get(i).getDeptId() == Integer.parseInt(deptId))

                list.add(employeeList.get(i));
        }
        return list;
    }
}
