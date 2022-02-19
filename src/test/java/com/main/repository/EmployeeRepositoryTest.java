package com.main.repository;

import com.main.model.Employee;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@DataJpaTest
public class EmployeeRepositoryTest {

    @Autowired
    private TestEntityManager entityManager;

    @Autowired
    private EmployeeRepository employeeRepository;

    @Test
    public void whenFindByName_thenReturnEmployee() {
        // given
        Employee emp1 = new Employee(1, "Davolio", "Nancy", 3500, "Marketing");
        /*entityManager.persist(emp1);
        entityManager.flush();*/

        // when
        Employee found = employeeRepository.findByLastName(emp1.getLastName());
        System.out.println("Output List of data: "+employeeRepository.findAll().size());

        System.out.println("Sum Salary : "+employeeRepository.findSumSalary());

        System.out.println("Sum Native Salary : "+employeeRepository.findNativeSumSalary());

        // then

        Assertions.assertEquals(found.getLastName(),emp1.getLastName());
    }

}
