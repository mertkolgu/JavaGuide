package com.javase._50.generics;

public class GenericsTest08 {

    public static void main(String[] args) {
        Integer[] array = {1, 2, 3, 4, 5, 6};
        Double[] array2 = {1.7, 2.4, 3.2, 4.1, 5.0, 6.9};
        String[] array3 = {"key1", "key2"};

        GenericClassV3.genericStaticMethod(array);
        GenericClassV3.genericStaticMethod(array2);
        GenericClassV3.genericStaticMethod(array3);
    }
}

class GenericClassV3<T> {
    public void genericMethod(T t) {
        //
    }

    public static <T> void genericStaticMethod(T[] array) {
        for (T element : array)
            System.out.println(element);
    }
}
