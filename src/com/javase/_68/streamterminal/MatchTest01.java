package com.javase._68.streamterminal;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class MatchTest01 {

    public static void main(String[] args) {
        // boolean anyMatch(Predicate <? super T> predicate)
        // boolean allMatch(Predicate <? super T> predicate)
        // boolean noneMatch(Predicate <? super T> predicate)

        // These may or may not terminate for infinite streams. It depends on the data
        // Like the find methods, they are not reductions because they do not
        // necessarily look at all of the elements.
        List<String> list = Arrays.asList("monkey", "2", "chimp");
        Stream<String> infinite = Stream.generate(() -> "chimp");
        Stream<String> infinite2 = Stream.generate(() -> "chimp");
        Predicate<String> pred = x -> Character.isLetter(x.charAt(0));

        System.out.println(list.stream().anyMatch(pred));   // true
        System.out.println(list.stream().allMatch(pred));   // false
        System.out.println(list.stream().noneMatch(pred));  // false
        System.out.println(infinite.anyMatch(pred));        // true
        // System.out.println(infinite2.allMatch(pred));       // takılı kalır. ilerlemez.
        // çünkü sonsuz tane eleman oluşturmaya çalışıyoruz
        // ve hepsi ilgili şartı destekliyor mu?
        // (allMatch)
        System.out.println(infinite2.noneMatch(pred));      // false
    }
}
