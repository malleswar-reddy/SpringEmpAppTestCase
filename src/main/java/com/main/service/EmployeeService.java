package com.main.service;

import com.main.exception.RecordNotFoundException;
import com.main.model.Employee;
import com.main.mysql.repository.EmployeeMysqlRepository;
import com.main.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService {

    //@Autowired
   //// private EmployeeRepository employeeRepository;

    @Autowired
    private EmployeeMysqlRepository employeeMysqlRepository;

    public Employee createOrUpdateEmployee(Employee emp) {
        Employee empsave = employeeMysqlRepository.save(emp);
        return empsave;
    }

    public List<Employee> getAllEmployee() {
        List<Employee> employeeList = employeeMysqlRepository.findAll();
        return employeeList;
    }

    public boolean getExistsEmployee(int id) {
        Boolean out  = employeeMysqlRepository.existsBySalary(id);
        return out;
    }

    public void deleteEmployee(int id) {
        employeeMysqlRepository.deleteById(id);
    }

    public Employee getEmployeeById(int id) throws RecordNotFoundException {
        Optional<Employee> emp = employeeMysqlRepository.findById(id);
        if (emp.isPresent()) {
            return emp.get();
        } else {
            throw new RecordNotFoundException("No employee record exist for given id");
        }
    }

}