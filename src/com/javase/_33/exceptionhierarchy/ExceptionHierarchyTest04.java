package com.javase._33.exceptionhierarchy;

public class ExceptionHierarchyTest04 {

    public static void main(String[] args) {

        String name = getName();

//        try {
//            // bu şekilde yapmak doğru bir hareket değildir!
//            System.out.println(name.length());
//        } catch (NullPointerException e) {
//            //
//        }

        // null check yaptığımızda NullPointerException almayız.
        if (name != null) {
            System.out.println(name.length());
        }

        // iyi bir yaklaşım değil
        if (name != null && name.equals("customer")) {
            //
        }
    }

    public static String getName() {
        return null;
    }
}

// UncheckedException'ları genel olarak yakalama eğilimi yerine ilgili hata durumunu fixlememiz daha doğru olacaktır.