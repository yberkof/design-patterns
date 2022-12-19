package org.example;

import org.example.builder.Employee;
import org.example.factory.Animal;
import org.example.factory.AnimalFactory;

import java.util.Scanner;

public class Company {
    private Employee employee;

    public Company() {
        Employee.EmployeeBuilder employeeBuilder = new Employee.EmployeeBuilder();
        employee = employeeBuilder
                .create()
                .setName("Muhamed")
                .setAge(25)
                .setSalary(550L)
                .build();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Enter Animal");
            String name = scanner.next();
            Animal byName = AnimalFactory.getByName(name, 4);
            System.out.println(byName.getClass());
            if (name.equals(""))
                break;
        }
    }
}
