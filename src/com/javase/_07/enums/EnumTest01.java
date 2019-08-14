package com.javase._07.enums;

public class EnumTest01 {

    public static void main(String[] args) {

        EmployeeType eType = EmployeeType.valueOf("FULL_TIME");

        System.out.println(eType == EmployeeType.FULL_TIME);
        System.out.println(eType.equals(EmployeeType.FULL_TIME));

        // == ve equals true olur.
        // her enum değeri için bir tane obje oluşur.
    }
}