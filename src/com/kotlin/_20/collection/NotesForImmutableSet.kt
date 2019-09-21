package com.kotlin._20.collection

fun main() {
    // değiştirilemez yapıdadır
    var set = setOf("mert", 1, 5, 7, true, "mert", null)

    for (str in set) {
        println(str)
    }
}