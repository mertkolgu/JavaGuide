package com.javase._54.staticnestedclass;

class OuterClassV2 {
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

public class OuterClassTest01 {

    public static void main(String[] args) {
        // regular inner class için outer class'ın objesi olmadan
        // inner class'ın objesinden bahsedemeyiz.
        OuterClassV2.StaticNested staticNested = new OuterClassV2.StaticNested();
        OuterClassV2.StaticNested.staticMethod();
    }
}
