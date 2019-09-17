package com.kotlin._03.arrays

fun main() {
    var sayilar: Array<Int> = arrayOf(1, 2, 3, 4, 5, 6)
    println(sayilar[0])     // 1
    println(sayilar.get(1)) // 2
    println("Toplam eleman sayısı : " + sayilar.size)   // 6

    var kelimeler: Array<String> = arrayOf("mert", "oğuz", "ecir")

    // kotlinde bir dizi birden fazla farklı türdeki elemanı saklayabilir
    var degiskenler: Array<Any> = arrayOf(1, "mert", true)
    for (i in degiskenler) {
        println(i)
    }

    // otomatik olarak veri tipini algılıyor
    var gunler = arrayOf("pazartesi", "salı", "çarşamba")
    var sayi = arrayOf(1, 2, 3, 4, 5)
}