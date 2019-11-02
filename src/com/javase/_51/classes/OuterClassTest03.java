package com.javase._51.classes;

class OuterClassV3 {
    private int value = 200;

    class Inner {
        private int value = 300;

        void test() {
            System.out.println(value);  // 300
            System.out.println(this.value); // 300
            System.out.println(OuterClassV3.this.value);    // 200
        }
    }
}

public class OuterClassTest03 {

    public static void main(String[] args) {
        OuterClassV3.Inner inner = new OuterClassV3().new Inner();
        inner.test();
    }
}
