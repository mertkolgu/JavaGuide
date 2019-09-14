package com.kotlin._07.loops

fun main() {

    // 1 ile 100 arasındaki çift sayıların toplamı
    var i: Int = 1
    var ciftToplam = 0
    while (i <= 100) {
        if (i % 2 == 0) {
            ciftToplam += i
        }
        i++
    }
    println("Çift sayıların toplamı : $ciftToplam")
}