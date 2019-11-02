package com.javase._09.enums;

public enum EmployeeType {
    FULL_TIME, PART_TIME, INTERN, CONSULTANT;
}

class EmployeeType2 {
    public static final EmployeeType2 FULL_TIME = new EmployeeType2();
    public static final EmployeeType2 PART_TIME = new EmployeeType2();
    public static final EmployeeType2 INTERN = new EmployeeType2();
    public static final EmployeeType2 CONSULTANT = new EmployeeType2();
    // enum'ların genel çalışma mantığı bu şekildedir.
}
