package com.javase._61.streamsources;

import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.stream.Stream;

public class StreamSourcesTest04 {

    public static void main(String[] args) {

        Arrays.stream(Object.class.getMethods()).map(method -> method.getName()).distinct().forEach(System.out::println);

        // source
        // intermediate op
        // terminal operation

        // uzun formatı
        Method[] objectMethods = Object.class.getMethods();
        Stream<Method> objectMethodStream = Arrays.stream(objectMethods);
        Stream<String> objectMethodNames = objectMethodStream.map(method -> method.getName());
        Stream<String> uniqueObjectMethodNames = objectMethodNames.distinct();
        uniqueObjectMethodNames.forEach(System.out::println);
    }
}