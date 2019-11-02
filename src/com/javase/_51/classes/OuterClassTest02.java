package com.javase._51.classes;

import com.javase._51.classes.OuterClassV2.InnerClass;

class OuterClassV2 {
    private int privateNumber = 100;
    private static int privateStaticNumber = 200;

    class InnerClass {
        private int innerInstanceNumber = 200;
        private final static int innerStaticNumber = 200;

        private void method() {
            System.out.println(privateNumber);
            System.out.println(privateStaticNumber);
            // inner classlar outer classların private değişkenlerine erişim sağlayabilir!

            System.out.println(innerInstanceNumber);
            // inner classta static değişken sadece final olduğunda izin verilir.
        }

//        private static void t1() {
//            // compile error
//        }

//        private final static void t2() {
//            // compile error
//        }
    }
}

public class OuterClassTest02 {

    public static void main(String[] args) {
        OuterClassV2 outRef = new OuterClassV2();
        InnerClass inner = outRef.new InnerClass();
        OuterClassV2.InnerClass inner2 = outRef.new InnerClass();
        OuterClassV2.InnerClass inner3 = new OuterClassV2().new InnerClass();
    }
}
