package com.javase._47.collection;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class SetTest02 {

    public static void main(String[] args) {
        Set<Employee> emps = new HashSet<>();

        Employee emp1 = new Employee("name", "surname1");
        Employee emp2 = new Employee("name", "surname1");
        Employee emp3 = new Employee("name", "surname1");

        emps.add(emp1);
        emps.add(emp2);
        emps.add(emp3);

        System.out.println(emps.size());    // 1
        // Set duplicate elemana izin vermez!
        // duplicate kontrolü equals kontrolü anlamına gelir!

        // equals ve hashcode metodunu override ettiğimizde
        // bu durumda equals olacağı için duplicate eleman olurlar.
        // eğer override edilmezse java bunların duplicate olduğunu anlamaz.
        // java açısından duplicate değildir çünkü equals true değildir eğer override edilmezse.
    }
}

class Employee {
    private String name;
    private String surname;

    public Employee(String name, String surname) {
        super();
        this.name = name;
        this.surname = surname;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return name.equals(employee.name) &&
                surname.equals(employee.surname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname);
    }
}
