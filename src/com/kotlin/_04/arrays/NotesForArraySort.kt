package com.kotlin._04.arrays

import java.util.Arrays

fun main() {
    var array = arrayOf(71, 22, 43, 14, 5)

    // diziyi sırala
    Arrays.sort(array)

    for (i in array) {
        println(i)
    }
}
