package com.main.repository;

import com.main.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import javax.persistence.criteria.CriteriaBuilder;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer>{

    public Employee getOne(Integer id);
    public Employee findByLastName(String lastName);
    @Query(value = "select sum(salary) from Employee")
    public Integer findSumSalary();


    @Query(value = "SELECT COUNT(SALARY) FROM EMPLOYEE_DATA",nativeQuery = true)
    public Integer findNativeSumSalary();



}
