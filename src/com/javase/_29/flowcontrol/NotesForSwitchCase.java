package com.javase._29.flowcontrol;

public class NotesForSwitchCase {

    public static void main(String[] args) {

        int key = 5;

        switch (key) {
            case 0:
            case 2:
            case 4:
            case 6:
            case 8:
                System.out.println("çift");
                break;

            default:
                System.out.println("tek");
                break;
        }
    }
}

// switch-case keyword

// eğer çok fazla if-else-if-else şeklinde bir yapı varsa bu durumda tercih edebiliriz

// switch(expression)
// case contant1 : code block;
// case contant2 : code block;
// case contant3 : code block;
// default : code block;

// char, short, byte, int ya da bunların wrapperları kullanılabilir
// Character Short Byte Integer

// double, float, long -> Double Float Long olmaz!!

// String Java 7 ile birlikte eklendi.

// enumlarda kullanılır!

// switch-case yapısında break anahtar kelimesi kullanılmaktadır.