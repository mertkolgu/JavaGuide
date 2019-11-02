package com.javase._80.synchronizedcollections;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SynchronizedCollectionTest {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7);
        List<Integer> scynchronizedList = Collections.synchronizedList(numbers);
    }
}

// synchronized kullandığımızda o an ilgili metoda sadece bir tane thread girebilir.
// Collection'ı synchronized yaptığımızda ise benzer şekilde bütün bir collection locklanır.
// aynı anda sadece bir tane thread işlem yapabilir.

// concurrent collectionlarda ise durum farklı
// birden fazla thread ilgili collection üzerinde çalışabilir
// buradaki lock kilit mekanizması bütün bir Collection üzerinde olmaz.
// buradaki mantıkta aynı eleman üzerinde/index üzerinde birden fazla thread çalışamaz.

// synchronized(this) {
//	   numbers.add(....);
// }