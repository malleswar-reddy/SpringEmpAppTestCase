package com.main;

import com.main.controller.EmployeeRestController;
import com.main.mysql.repository.EmployeeMysqlRepository;
import com.main.repository.EmployeeRepository;
import com.main.service.EmployeeService;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = SpringEmpAppApplication.class)
class SpringEmpAppApplicationTests {

    @MockBean
    private EmployeeRestController employeeRestController;

    @MockBean
    private EmployeeService employeeService;

    @MockBean
    private EmployeeRepository employeeRepository;

    @MockBean
    private EmployeeMysqlRepository employeeMysqlRepository;


    @Test
    void contextLoads() {
        SpringEmpAppApplication.main(new String[]{});
    }

}
