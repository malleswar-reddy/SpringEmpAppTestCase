package com.main.service;

import com.main.model.Employee;
import com.main.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    public void createOrUpdateEmployee(Employee emp) {
        employeeRepository.save(emp);
    }

    public List<Employee> getAllEmployee() {
        List<Employee> employeeList = employeeRepository.findAll();
        return employeeList;
    }

    public void deleteEmployee(int id) {
        employeeRepository.deleteById(id);
    }

    public Employee editEmployee(int id) {
        Employee emp = employeeRepository.getOne(id);
        return emp;
    }

}