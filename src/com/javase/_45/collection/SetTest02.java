package com.javase._45.collection;

import java.util.HashSet;
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

        System.out.println(emps.size());

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
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + ((surname == null) ? 0 : surname.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;

        Employee other = (Employee) obj;

        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        if (surname == null) {
            if (other.surname != null)
                return false;
        } else if (!surname.equals(other.surname))
            return false;
        return true;
    }
}