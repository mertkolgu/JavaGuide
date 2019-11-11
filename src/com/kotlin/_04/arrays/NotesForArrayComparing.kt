package com.kotlin._04.arrays

import java.util.Arrays

fun main() {
    var array1 = arrayOf(71, 22, 43, 14, 5)
    var array2 = Array<Int>(5) { 0 }

    System.arraycopy(array1, 0, array2, 0, array1.size)
    Arrays.sort(array2)

    for (i in array1) {
        println(i)
    }
    println("*****")
    for (i in array2) {
        println(i)
    }

    println("Diziler birbirine eşit mi ? : " + Arrays.equals(array1, array2))   // false
}
