package com.javase._05.declaremembers.finaltest;

public class FinalTest02 {

    public static void main(String[] args) {

        System.out.println("Database İsmi : " + Database.dbName);
        System.out.println("Kullanıcı Adı : " + Database.password);
        System.out.println("Password : " + Database.password);
    }
}

class Database {
    public static final String dbName = "test";
    public static final String userName = "root";
    public static final String password = "12345";
}