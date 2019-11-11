package com.kotlin._20.generics

class DiziYaz<Genel>(var dizi: Array<Genel>) {
    fun diziYazdir() {
        for (gecici in dizi) {
            println(gecici)
        }
    }
}

fun main() {
    var stringDizi = arrayOf("mert", "ali", "hasan")
    var stringDiziYaz = DiziYaz(stringDizi)
    stringDiziYaz.diziYazdir()

    var integerDizi = arrayOf(1, 2, 3)
    var integerDiziYaz = DiziYaz(integerDizi)
    integerDiziYaz.diziYazdir()
}
