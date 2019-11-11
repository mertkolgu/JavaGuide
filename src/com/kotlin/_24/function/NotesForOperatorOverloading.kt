package com.kotlin._24.function

class Baslik(var deger: String)

operator infix fun Baslik.plus(baslik: Baslik): Baslik {
    var geciciBaslik: Baslik = Baslik(this.deger + " " + baslik.deger)
    return geciciBaslik
}

fun main() {
    var ad = "Mert"
    var soyad = " Kolğu"

    var tamAd = ad + soyad
    println(tamAd)
    var tamAd2 = ad.plus(soyad)
    println(tamAd2)

    val baslik1 = Baslik("Başlık 1")
    val baslik2 = Baslik("Başlık 2")
    val baslik3 = baslik1.plus(baslik2)
    val baslik4 = baslik1 plus baslik2
    val baslik5 = baslik1 + baslik2

    println(baslik3.deger)
    println(baslik4.deger)
    println(baslik5.deger)
}
