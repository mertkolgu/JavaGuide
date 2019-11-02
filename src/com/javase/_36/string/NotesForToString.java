package com.javase._36.string;

public class NotesForToString {

    public static void main(String[] args) {
        Student student = new Student("ali", "seven", 10);
        System.out.println(student);    // Student [name = ali, surname = seven, number = 10]

        Student student1 = new Student("mert", "kolğu", 10);
        System.out.println(student1);   // Student [name = mert, surname = kolğu, number = 10]

        Integer i = 100;
        System.out.println(i);  // 100
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
