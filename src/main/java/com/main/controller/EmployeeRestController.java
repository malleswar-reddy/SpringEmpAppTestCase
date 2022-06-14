package com.main.controller;

import com.main.exception.RecordNotFoundException;
import com.main.model.Employee;
import com.main.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
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

    @GetMapping("/employeeCheck/{id}")
    public Boolean listOfEmployee(@PathVariable Integer id )  {
        return employeeService.getExistsEmployee(id);
    }


    @PostMapping("/saveEmployee")
    public Employee saveEmployee(@RequestBody Employee emp) {
        Employee employee = employeeService.createOrUpdateEmployee(emp);
        return employee;
    }

}
