package com.kotlin._10.math

fun main() {
    // dik kenarları x olan bir ikizkenar üçgenin alanını bulma
    print("Üçgenin bir kenarını giriniz : ")
    var kenarUzunlugu = readLine()!!.toInt()
    var alan: Double = (Math.pow(kenarUzunlugu.toDouble(), 2.0)) / 2

    println("Kenar uzunluğu $kenarUzunlugu olan bir üçgenin alanı : $alan")
}
