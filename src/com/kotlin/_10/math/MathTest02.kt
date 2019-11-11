package com.kotlin._10.math

fun main() {
    // 0-50 arasında rastgele üretilen sayıların önce büyüğünü
    // sonra küçüğünü bulma

    var sayi1: Int = (Math.random() * 50).toInt()
    var sayi2: Int = (Math.random() * 50).toInt()

    println("Üretilen sayıların büyüğü : " + Math.max(sayi1, sayi2))
    println("Üretilen sayıların büyüğü : " + Math.min(sayi1, sayi2))
}
