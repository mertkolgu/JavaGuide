package com.kotlin._09.methods

fun sum(sayi1: Int, sayi2: Int) {
    println("Toplam : " + (sayi1 + sayi2))
}

fun sum(sayi1: Double, sayi2: Double) {
    println("Toplam : " + (sayi1 + sayi2))
}

fun sum(sayi1: Int, sayi2: Int, sayi3: Int) {
    println("Toplam : " + (sayi1 + sayi2 + sayi3))
}

fun sum(sayilarDizi: Array<Int>) {
    var toplam = 0
    for (sayi in sayilarDizi) {
        toplam += sayi
    }
    println("Toplam : " + toplam)
}

// vararg ile tanımladığımız zaman istediğimiz kadar değişken girebiliriz
fun sum(vararg sayilar: Int) {
    var toplam = 0
    for (i in sayilar) {
        toplam += i
    }
    println("Toplam : " + toplam)
}

fun bilgileriGoster(isim: String) {
    println(isim)
}

fun bilgileriGoster(yas: Int) {
    println(yas)
}

fun main() {
    sum(5, 3)
    sum(5, 3, 7)
    sum(5.4, 3.2)
    sum(5, 3, 7, 8, 9, 4, 1, 2)

    var sayilarDizi = arrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    sum(sayilarDizi)

    bilgileriGoster("mert kolğu")
    bilgileriGoster(23)
}

// overloaded -> aşırı yükleme gibi Türkçe karşılığı var.
// metod isimleri aynı olmalı
// parametre listesi farklı olmalı

// overloaded ile reusable(tekrar kullanılabilir) methodlar yazabiliriz.

// overloaded metodlar için dönüş tipi değişebilir.
// access level değişebilir
// hem metodlar için hem constructor'lar için overloaded söz konusudur!
