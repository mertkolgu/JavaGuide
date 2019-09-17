package com.kotlin._15.declareabstract

abstract class Calisan {
    open var pozisyon: String = "Çalışan"

    abstract fun calis()

    open fun soyutOlmayanMethod() {
        println("Soyut olmayan method")
    }
}

open class Mudur : Calisan() {
    override var pozisyon: String = "Müdür"

    override fun calis() {
        println("$pozisyon çalışmaya başladı.")
    }

    override fun soyutOlmayanMethod() {
        println("Müdür soyut olmayan methodu override etti.")
    }
}

class GenelMudur : Mudur() {
    override var pozisyon: String = "Genel Müdür"

    override fun calis() {
        println("$pozisyon çalışmaya başladı.")
    }
}

open class Programci : Calisan() {
    override var pozisyon: String = "Programcı"

    override fun calis() {
        println("$pozisyon çalışmaya başladı.")
    }
}

class AnalizProgramci : Programci() {
    override var pozisyon: String = "Analiz Programcısı"

    override fun calis() {
        println("$pozisyon çalışmaya başladı.")
    }
}

class SistemProgramci : Programci() {
    override var pozisyon: String = "Sistem Programcısı"

    override fun calis() {
        println("$pozisyon çalışmaya başladı.")
    }

    fun sistemiIncele() {
        println("Sistemi inceliyor.")
    }
}

class Pazarlamaci : Calisan() {
    override var pozisyon: String = "Pazarlamacı"

    override fun calis() {
        println("$pozisyon çalışmaya başladı.")
    }
}

fun mesaiyeBaslaPolymorphism(calisanlar: Array<Calisan>) {

    for (oAnkiCalisan in calisanlar) {
        oAnkiCalisan.calis()

        if (oAnkiCalisan is SistemProgramci) {
            oAnkiCalisan.sistemiIncele()
        }
    }
}

fun main() {

    var calisanlar = Array<Calisan>(6) { Programci() }

    calisanlar[0] = Programci()
    calisanlar[1] = Mudur()
    calisanlar[2] = Pazarlamaci()
    calisanlar[3] = GenelMudur()
    calisanlar[4] = AnalizProgramci()
    calisanlar[5] = SistemProgramci()

    mesaiyeBaslaPolymorphism(calisanlar)
}

// abstract class'larda nesne üretilemiyor.
// default olarak "public open" tanımlanır.