package com.kotlin._24.function

class Ogrenci {
    var yetenek: String? = null

    fun yetenekYazdir() {
        println(yetenek)
    }
}

// tek parametre alan fonksiyonlarda infix kullanılabilir
infix fun Ogrenci.yetenekBirlestir(ogrenci: Ogrenci): Ogrenci {
    var olusturulanOgrenci = Ogrenci()
    olusturulanOgrenci.yetenek = this.yetenek + " " + ogrenci.yetenek
    return olusturulanOgrenci
}

fun main() {
    var mert = Ogrenci()
    mert.yetenek = "Kotlin"
    mert.yetenekYazdir()

    var oguz = Ogrenci()
    oguz.yetenek = "Android"
    oguz.yetenekYazdir()

    var ilker: Ogrenci = mert.yetenekBirlestir(oguz)
    ilker.yetenekYazdir()

    var can: Ogrenci = ilker yetenekBirlestir mert
    can.yetenekYazdir()
}
