package com.main.service;

import com.main.exception.RecordNotFoundException;
import com.main.model.Employee;
import com.main.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    public Employee createOrUpdateEmployee(Employee emp) {
        Employee empsave = employeeRepository.save(emp);
        return empsave;
    }

    public List<Employee> getAllEmployee() {
        List<Employee> employeeList = employeeRepository.findAll();
        return employeeList;
    }

    public void deleteEmployee(int id) {
        employeeRepository.deleteById(id);
    }

    public Employee getEmployeeById(int id) throws RecordNotFoundException {
        Optional<Employee> emp = employeeRepository.findById(id);
        if(emp.isPresent()) {
            return emp.get();
        } else {
            throw new RecordNotFoundException("No employee record exist for given id");
        }
    }

}