package com.javase._46.classes;

class OuterClassV3 {

    private int value = 200;

    class Inner {

        private int value = 300;

        void test() {
            System.out.println(value);
            System.out.println(this.value);
            System.out.println(OuterClassV3.this.value);
        }
    }
}

public class OuterClassTest03 {

    public static void main(String[] args) {

        OuterClassV3.Inner inner = new OuterClassV3().new Inner();
        inner.test();
    }
}