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
import java.util.Optional;

/**
 * @Mock &ndash; creates mocks
 * @InjectMocks &ndash; creates objects and inject mocked dependencies
 */

@RunWith(SpringRunner.class)
public class EmployeeServiceTest {
    @Mock
    private EmployeeRepository employeeRepository;

    @InjectMocks
    EmployeeService employeeService;

    @Test
    public void getAllEmployeesTest() {
        Mockito.when(employeeRepository.findAll()).thenReturn(EmployeeUtils.getAllEmployee());
        List<Employee> allEmployee = employeeService.getAllEmployee();
        Assertions.assertEquals(allEmployee,EmployeeUtils.getAllEmployee());
    }

    @Test
    public void createOrUpdateEmployeeTest() {
        Mockito.when(employeeRepository.save(EmployeeUtils.getEmployee())).thenReturn(EmployeeUtils.getEmployee());
        Employee empUpdate = employeeService.createOrUpdateEmployee(EmployeeUtils.getEmployee());
        Assertions.assertEquals(empUpdate,EmployeeUtils.getEmployee());
    }

   /* @Test
    public void deleteEmployeeTest() {
        Mockito.verify(employeeRepository.deleteById(Mockito.any()));
        employeeService.deleteEmployee(EmployeeUtils.getEmployee().getId());
    }*/


    @Test
    public void GetOneEmployeeTest() {
        Mockito.when(employeeRepository.findOne(Mockito.any())).thenReturn(Optional.of(EmployeeUtils.getEmployee()));
        employeeService.getOneEmployee(EmployeeUtils.getEmployee().getId());
    }


}
