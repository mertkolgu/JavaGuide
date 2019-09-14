package com.kotlin._08.loops

fun main() {

    var toplam = 0
    for (sayi in 1..10) {
        if (sayi == 5) {
            return
        }
        toplam += sayi
        println("Şu anki sayı : $sayi")
        println("Şu anki toplam : $toplam")
    }
}