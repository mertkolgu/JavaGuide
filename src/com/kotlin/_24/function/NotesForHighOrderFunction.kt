package com.kotlin._24.function

import java.util.function.Consumer

fun main() {
    var sayilar = listOf<Int>(1, 2, 3, 4, 5, 6)

//    for (i in sayilar) {
//        println(i)
//    }

//    var consumer: Consumer<Int> = object : Consumer<Int> {
//        override fun accept(t: Int) {
//            println(t)
//        }
//    }
//
//    sayilar.forEach(consumer)

    // high level
    sayilar.forEach({ sayi -> println(sayi) })
    sayilar.forEach({ println(it) })
}

// High Level Functions
// parametre olarak fonksiyon alan fonksiyondur
// geriye fonksiyon da döndürebilir veya ikisini de yapabilir
