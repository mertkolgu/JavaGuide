package com.javase._05.declaremembers.finaltest;

public class FinalTest03 {

    public static void main(String[] args) {
        DB db = new DB();
        db.baglantiKur("root", "12345");
    }
}

final class DB {
    public final void baglantiKur(String userName, String password) {
        System.out.println(userName);
        System.out.println(password);
    }
}

// final class extends edilemez!
//class DB2 extends DB {
//    final method override edilemez
//    public final void baglantiKur(String userName, String password) {
//        System.out.println(userName);
//        System.out.println(password);
//    }
//}
