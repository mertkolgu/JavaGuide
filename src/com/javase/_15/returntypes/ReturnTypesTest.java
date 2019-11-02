package com.javase._15.returntypes;

import java.util.ArrayList;
import java.util.List;

public class ReturnTypesTest {

    // rule - 1
    public String getKey() {
        return null;
    }

    // rule - 1
    public Integer getValue() {
        return null;
    }

    // arrayler reference type
    // rule1 rule2
    public int[] getValues() {
        return null;
    }

    public static void main(String[] args) {
        char c = 'c';
        System.out.println(c);
        System.out.println((int) c);
        System.out.println((int) Character.MAX_VALUE);
    }

    // In a method with a primitive return type, you can return any value or
    // variable that can be implicitly converted to the declared return type.

    public int foo() {
        char c = 'c';
        return c;   // char is compatible with int
    }

    // In a method with a primitive return type, you can return any value or
    // variable that can be explicitly cast to the declared return type.
    public int foo2() {
        float f = 32.5f;
//		long lo = 10;
//		return (int) lo;
        return (int) f;
    }

    // void metot için geriye bir şey döndüremeyiz! legal değildir.
    public void bar() {
        // return "this is it"; // Not legal!!
    }

    public void invoke() {
        method(-10);
    }

    public void method(int number) {
        // koşul sağlanmazsa methoddan çık
        if (number < 0)
            return;
    }

    public List<String> getList() {
        ArrayList<String> arrayList = new ArrayList<String>();
        return arrayList;
    }
}

// 1 - metot dönüş tipi reference type ise null dönebilir. (null dönmek genelde iyi bir kod pratiği değildir.)
// 2 - dönüş tipi array olabilir. An array is a perfectly legal return type.
// 3 -
// char 16 bit/2 byte unsigned bir veri tipi
// unsigned -> işaretsiz -> negatif değil.

// 2^16-1
// 0 - 65535

// 4 - örnek olarak metot dönüş tipi int ise, geriye float, double, long dönmek istersek bu durumda casting yapmamız gerekir.
// 5 - void metotlar geriye bir şey döndürmez.
// 6 - metot dönüş tipi superclass/interface ise döndüğümüzde değer/reference subclass olabilir.