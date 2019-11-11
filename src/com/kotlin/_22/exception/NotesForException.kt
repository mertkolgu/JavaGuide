package com.kotlin._22.exception

fun exception1(array: Array<Int>) {
    println("Exception 1 başladı.")
    try {
        exception2(array)
    } catch (e: ArrayIndexOutOfBoundsException) {
        println("Hata oluştu : " + e.toString())
    }
    println("Exception 1 bitti.")
}

fun exception2(array: Array<Int>) {
    println("Exception 2 başladı.")
//    try {
        for (i in 0..3) {
            println("Sayı : " + array[i])
        }
//    } catch (e: ArrayIndexOutOfBoundsException) {
//        println("Hata oluştu : " + e.toString())
//    }
    println("Exception 2 bitti.")
}

fun main() {
    var array = Array<Int>(3) { 0 }

    array[0] = 0
    array[1] = 1
    array[2] = 2
    exception1(array)

//    try {
//        for (i in 0..2) {
//            println("Sayı : " + array[i])
//        }
//
//        var bolum = 9 / 0
//    } catch (e: ArrayIndexOutOfBoundsException) {
//        println("Hata oluştu : " + e.toString())
//    } catch (e: ArithmeticException) {
//        println("Hata oluştu : " + e.toString())
//    }
    println("main sonlandı.")
}
