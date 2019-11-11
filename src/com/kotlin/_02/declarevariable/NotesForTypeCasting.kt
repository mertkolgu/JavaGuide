package com.kotlin._02.declarevariable

fun main() {
    var shortSayi: Short = 32767
    var intSayi: Int = shortSayi.toInt()
    // intSayi = shortSayi.toInt()  // short veri tipini int'e çevirir
    println("Integer Sayı = $intSayi")

    var intSayi1: Int = 45000
    var shortSayi1: Short = intSayi1.toShort()
    println("Short Sayı = $shortSayi1")

    var ondalikliSayi: Double = 55250.55677
    var ondalikliSayiToInt: Int = ondalikliSayi.toInt()
    println("Ondalıklı Sayı = $ondalikliSayiToInt")

    var longSayi: Long = 5965623L
    var sayi: Int = longSayi.toInt()
    println("Long Sayı = $sayi")

    var buyukOndalikliSayi = 8555.9666F
    var d1: Double = buyukOndalikliSayi.toDouble()
    println("Double Sayı = $d1")

    var sayi1 = 8555
    println(sayi1 + 1)
    println(sayi1.toString() + 1)
}
