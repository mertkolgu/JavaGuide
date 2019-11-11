package com.kotlin._20.generics

abstract class GeometrikSekil {
    abstract fun alanHesapla(): Int
}

class Kare(var kenarUzunlugu: Int) : GeometrikSekil() {
    override fun alanHesapla(): Int {
        return kenarUzunlugu * kenarUzunlugu
    }
}

class Dikdortgen(var en: Int, var boy: Int) : GeometrikSekil() {
    override fun alanHesapla(): Int {
        return en * boy
    }
}

fun <Genel : GeometrikSekil> alanKarsilastir(sekil1: Genel, sekil2: Genel): Genel {
    if (sekil1.alanHesapla() < sekil2.alanHesapla()) {
        return sekil2
    } else {
        return sekil1
    }
}

fun main() {
    var sekil1 = Kare(6)
    var sekil2 = Kare(8)

    println("Büyük karenin alanı : " + alanKarsilastir(sekil1, sekil2).alanHesapla())
}
