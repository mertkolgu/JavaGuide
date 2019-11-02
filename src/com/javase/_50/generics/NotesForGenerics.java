package com.javase._50.generics;

import java.util.ArrayList;
import java.util.List;

public class NotesForGenerics {

    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        // numbers.add("compile error");
        numbers.add(100);

        Integer numberGet = numbers.get(0);

        List nonGeneric = new ArrayList();
        nonGeneric.add(200);
        Integer numberNonGeneric = (Integer) nonGeneric.get(0);
    }
}

// generic class'lar veya methodlar türden bağımsız işlem yapılan class'lar veya methodlardır.
// herhangi bir türe bağlı kalmadan bir class'ı veya methodu yazabiliriz.

// genericlerin sağlamış olduğu avantajlar;
// derleme/compile time'da güçlü bir type check/tip kontrolü sağlar.
// generic yapıyı kullandığımızda casting işlemine gerek kalmaz.
// generic yapısı genel bir implementasyon sağlar
