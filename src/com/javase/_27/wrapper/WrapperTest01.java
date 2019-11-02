package com.javase._27.wrapper;

public class WrapperTest01 {

    public static void main(String[] args) {
        Integer i1 = new Integer(10);
        Integer i2 = new Integer("00");

        System.out.println(i1);
        System.out.println(i2);

        Float f1 = new Float("3.14f");
        Float f2 = new Float(3.14);

        // -128, 127
        Byte b1 = new Byte((byte) 10);
        // 10 -> int tipindedir
    }
}
