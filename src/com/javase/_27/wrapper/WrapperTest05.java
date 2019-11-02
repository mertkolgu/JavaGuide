package com.javase._27.wrapper;

public class WrapperTest05 {

    public static void main(String[] args) {
        Integer number = new Integer(100);
        Integer number1 = Integer.valueOf(100);
        // 100 -> int tipinde
        // primitive -> Wrapper -> Boxing işlemi olur!

        Integer number2 = 200;
        // Autoboxing
        // otomatik şekilde primitive -> wrapper'a dönüşüm.

        int primitive = 100;
        Integer autoBoxing = primitive;
        // Integer -> int
        // Wrapper -> int

        int unboxing = number.intValue();

        int autoUnboxing = number;
        // auto unboxing işlemi

        method(100);    // autoboxing yapılmakta
        // 100 -> int tipinde
        // int -> Integer

        method(new Integer(100));
        // - autoboxing ve autounboxing bizim için yeterli
        // - genel olarak primitive tipleri tercih et!
        // - null değer olma durumları varsa/web service durumları, db durumları vs. olabilir.
        // o zaman Integer gibi wrapperları tercih ederiz.
        // - collectionlarda generic ifadelerde wrapperları kullanmak zorundayız
        // List<int> legal değildir, List<Integer>
    }

    public static void method(Integer number) {
        //
    }
}
