package com.kotlin._24.function

class Person {
    var ad: String = ""
    var yas: Int = -1

    fun kendiniTanit() {
        println("Merhaba ben $ad ve $yas yaşındayım.")
    }
}

fun main() {
    var kisi = Person()
    kisi.ad = "Mert"
    kisi.yas = 23

    kisi.kendiniTanit()

    with(kisi) {
        ad = "Emre"
        yas = 23
    }

    kisi.kendiniTanit()

    kisi.apply {
        ad = "İlker"
        yas = 23
    }.kendiniTanit()
}
