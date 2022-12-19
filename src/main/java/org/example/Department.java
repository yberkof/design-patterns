package org.example;

import org.example.builder.Employee;

public class Department {
private Employee employee;
public  Department(){
    employee = new Employee.EmployeeBuilder()
            .create()
            .setName("Youssef")
            .setSalary(3000L)
            .setAge(35)
            .build();
    System.out.println(employee);

}
}
