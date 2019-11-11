package com.kotlin._09.methods

fun topla(sayi1: Int, sayi2: Int): Int {
    var toplam = sayi1 + sayi2
    println("topla metodundaki toplam değeri: $toplam")
    return toplam
}

fun isimGoster(isim: String): String {
    return "Merhaba $isim"
}

fun main() {
    var toplam = topla(1, 3)
    println("main metodundaki toplam değeri : $toplam")
    println(isimGoster("Mert"))
}
