package com.kotlin._08.loops

fun main() {

    distakiDongu@ for (i in 4..6) {
        for (j in 1..3) {
            if (i * j == 12) {
                break@distakiDongu  // bu koşul sağlandığı zaman en dıştaki döngüden çıkacak
            } else {
                println("$i * $j : ${i * j}")
            }
        }
    }
}