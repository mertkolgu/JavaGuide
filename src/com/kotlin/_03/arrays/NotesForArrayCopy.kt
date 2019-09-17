package com.kotlin._03.arrays

fun main() {

    var array1 = arrayOf(1, 2, 3, 4, 5)
    var array2 = Array<Int>(5) { 0 }

//    for (i in 0..array1.size - 1) {
//        array2[i] = array1[i]
//    }

    // dizileri kopyala
    System.arraycopy(array1, 0, array2, 0, array1.size)

    for (i in array2) {
        println(i)
    }
}