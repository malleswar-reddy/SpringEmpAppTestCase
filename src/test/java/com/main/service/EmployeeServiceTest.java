package com.main.service;

import com.main.model.Employee;
import com.main.repository.EmployeeRepository;
import com.main.util.EmployeeUtils;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

/**
 * @Mock &ndash; creates mocks
 * @InjectMocks &ndash; creates objects and inject mocked dependencies
 */

@RunWith(SpringRunner.class)
public class EmployeeServiceTest {
    @InjectMocks
    EmployeeService employeeService;
    @Mock
    private EmployeeRepository employeeRepository;

    @Test
    public void getAllEmployeesTest() {
        Mockito.when(employeeRepository.findAll()).thenReturn(EmployeeUtils.getAllEmployee());
        List<Employee> allEmployee = employeeService.getAllEmployee();
        Assertions.assertEquals(allEmployee, EmployeeUtils.getAllEmployee());
    }

    @Test
    public void createOrUpdateEmployeeTest() {
        Mockito.when(employeeRepository.save(EmployeeUtils.getEmployee())).thenReturn(EmployeeUtils.getEmployee());
        Employee empUpdate = employeeService.createOrUpdateEmployee(EmployeeUtils.getEmployee());
        Assertions.assertEquals(empUpdate, EmployeeUtils.getEmployee());
    }

}
