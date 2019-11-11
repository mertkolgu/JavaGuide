package com.javase._59.predicate;

import java.util.function.Predicate;
import java.util.stream.Stream;

public class PredicateTest01 {

    // java.util.function.Predicate #boolean test(T T)
    public static void main(String[] args) {
        Predicate<String> predicate1 = element -> element.startsWith("h");
        // 1 tane parametre alıyorsa ve tipini belirtmediysek paranteze gerek yoktur!

        Predicate<String> predicate2 = (String element) -> element.startsWith("h");

        // açık şekilde return etmek istersek;
        // süslü parantez kullanmamız gerekli!!!
        Predicate<String> predicate3 = (String element) -> {
            return element.startsWith("h");
        };
        // bu 3 predicate'de aynı anlama gelmektedir.
        Stream.of("java", "hello", "world", "hi", "test").filter(predicate1).forEach(System.out::println);
    }
}
