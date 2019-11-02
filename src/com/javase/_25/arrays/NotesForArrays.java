package com.javase._25.arrays;

public class NotesForArrays {
    int[] array;    // önerilen yaklaşımda [] değişken isminden önce olmalıdır!
    int badArray [];    // derleme hatası vermez fakat önerilmez.
    // int[15] compileErrorArray;  // legal değildir!
}

// Java'da array tipindeki değişkenler reference type'dır!
// int [] -> reference type bir değişkendir!
// declaration kısmında arrayin boyutunu veremeyiz legal değildir.
// array'in elemanları primitive ya da reference type olabilir!
