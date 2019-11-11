package com.kotlin._04.arrays

fun main() {
    // array'in elemanları en başta sıfır olarak atanıyor
    var sayiDizisi = Array<Int>(5) { 0 }
    // array'in elemanları en başta boş olarak atanıyor
    var kelimeDizisi = Array<String>(10) { "" }

    for (i in 0..sayiDizisi.size - 1) {
        sayiDizisi[i] = i + 10
        println(sayiDizisi[i])
    }
}
