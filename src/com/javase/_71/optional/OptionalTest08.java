package com.javase._71.optional;

import java.util.Comparator;
import java.util.Optional;
import java.util.stream.Stream;

public class OptionalTest08 {

    private static void threeDigit(Optional<Integer> optional) {
        if (optional.isPresent()) {
            Integer num = optional.get();
            String string = "" + num;
            if (string.length() == 3)
                System.out.println(string);
        }
    }

    private static void threeDigitV2(Optional<Integer> optional) {
        optional.map(n -> "" + n).filter(s -> s.length() == 3).ifPresent(System.out::println);
        // part 1 // part 2 // part 3
    }

    public static void main(String[] args) {
        Optional<Integer> opt = Stream.of(100, 200, 50, 10, 60).max(Comparator.naturalOrder());
        threeDigit(opt);
        threeDigitV2(opt);
    }
}
