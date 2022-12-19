package org.example.builder;

import java.util.StringJoiner;

public class Employee {
    private String name;
    private long salary;
    private int age;

    private void setName(String name) {
        this.name = name;
    }

    private void setSalary(long salary) {
        this.salary = salary;
    }

    private void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public long getSalary() {
        return salary;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Employee.class.getSimpleName() + "[", "]")
                .add("name='" + name + "'")
                .add("salary=" + salary)
                .add("age=" + age)
                .toString();
    }

    public static class EmployeeBuilder {
        private Employee employee;

        public EmployeeBuilder create() {
            employee = new Employee();
            return this;
        }

        public EmployeeBuilder setName(String name) {
            this.employee.setName(name);
            return this;
        }

        public EmployeeBuilder setSalary(long salary) {
            this.employee.setSalary(salary);
            return this;
        }

        public EmployeeBuilder setAge(int age) {
            this.employee.setAge(age);
            return this;
        }

        public Employee build() {
            return employee;
        }
    }
}
