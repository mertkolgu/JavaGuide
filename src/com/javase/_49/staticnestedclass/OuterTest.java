package com.javase._49.staticnestedclass;

import com.javase._49.staticnestedclass.Outer.StaticNested;

class OuterV2 {

    private int value = 20;
    private static int valueStatic = 200;

    static class StaticNested {

        // static nested class'lar outer class'ların static değişkenlerine ya da
        // static metotlarına erişim sağlayabilir!!!!
        void method() {
            // System.out.println(value);
            System.out.println(valueStatic);
        }

        static void staticMethod() {
            //
        }
    }
}

public class OuterTest {

    public static void main(String[] args) {
        // regular inner class için outer class'ın objesi olmadan
        // inner class'ın objesinden bahsedemeyiz.

        OuterV2.StaticNested staticNested = new OuterV2.StaticNested();
        OuterV2.StaticNested.staticMethod();
    }
}