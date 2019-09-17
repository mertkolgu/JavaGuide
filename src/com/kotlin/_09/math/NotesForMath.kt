package com.kotlin._09.math

fun main() {
    // E sabiti
    println("E : " + Math.E)

    // PI sabiti
    println("PI : " + Math.PI)

    // girilen sayının mutlak değeri
    println(Math.abs(-9))

    // bir üst sayıya yuvarlar
    println(Math.ceil(8.6))

    // bir alt sayıya yuvarlar
    println(Math.floor(7.5))

    // üs alma
    println(Math.pow(2.0, 5.0))

    // karekök bulma
    println(Math.sqrt(81.0))

    // max bulma
    println(Math.max(8, 4))

    // min bulma
    println(Math.min(8, 4))

    // random() -> 0-1 arasında rastgele sayı üretir
    println((Math.random() * 100).toInt())  // 1-100 arasında rastgele sayı üretir
}