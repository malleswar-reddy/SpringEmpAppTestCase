package com.main.util;

import com.main.model.Employee;

import java.util.Arrays;
import java.util.List;

public class EmployeeUtils {

    public static List<Employee> getAllEmployee() {
        Employee e1 = new Employee(1, "Davolio", "Nancy", 3500, "Marketing");
        Employee e2 = new Employee(2, "Fuller", "Andrew", 2500, "Sales");
        Employee e3 = new Employee(3, "Leverling", "Janet", 2500, "Sales");
        Employee e4 = new Employee(4, "Peacock", "Margaret", 5500, "Marketing");
        Employee e5 = new Employee(5, "Buchanan", "Steven", 7500, "Admin");
        Employee e6 = new Employee(6, "Suyama", "Michael", 6000, "Maintenance");

        return Arrays.asList(e1,e2,e3,e4,e5,e6);
    }

    public static Employee getEmployee() {
        Employee e1 = new Employee(1, "Davolio", "Nancy", 3500, "Marketing");
        return e1;
    }
}
