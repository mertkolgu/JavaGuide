package com.javase._34.string;

public class NotesForToString {

    public static void main(String[] args) {

        Student student = new Student("ali", "seven", 10);
        System.out.println(student);

        Student student1 = new Student("mert", "kolğu", 10);
        System.out.println(student1);

        Integer i = 100;
        System.out.println(i);
    }
}

class Student {

    private String name;
    private String surname;
    private int number;

    public Student(String name, String surname, int number) {
        super();
        this.name = name;
        this.surname = surname;
        this.number = number;
    }

    @Override
    public String toString() {
        return "Student [name = " + name + ", surname = " + surname + ", number = " + number + "]";
    }
}