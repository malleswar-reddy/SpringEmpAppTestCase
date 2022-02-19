package com.main.controller;

import com.main.model.Employee;
import com.main.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EmployeeRestController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/employeeAllList")
    public List<Employee> listOfEmployee() {
        List<Employee> employeeList = employeeService.getAllEmployee();
        return employeeList;
    }

}
