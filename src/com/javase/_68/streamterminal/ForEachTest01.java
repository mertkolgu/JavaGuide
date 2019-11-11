package com.javase._68.streamterminal;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class ForEachTest01 {

    public static void main(String[] args) {
        // void forEach(Consumer<? super T> action);
        Stream<String> s = Stream.of("Monkey", "Gorilla", "Bonobo");
        s.forEach(System.out::print);   // MonkeyGorillaBonobo

        // Consumer
        // void accept(T t);
        List<String> list = new ArrayList<>();
        s.forEach((str) -> {
            String sUpper = str.toUpperCase();
            list.add(sUpper);
        });
        // void forEachOrdered(Consumer<? super T> action);

        // iterable interfacesinde de yer almakta!
//        default void forEach (Consumer < ? super T > action){
//            Objects.requireNonNull(action);
//            for (T t : this) {
//                action.accept(t);
//            }
//        }
    }
}
