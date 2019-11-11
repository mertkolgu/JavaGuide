package com.kotlin._15.polymorphism

open class Calisan {
    open var pozisyon: String = "Çalışan"

    open fun calis() {
        println("$pozisyon çalışmaya başladı.")
    }
}

open class Mudur : Calisan() {
    override var pozisyon: String = "Müdür"

    override open fun calis() {
        println("$pozisyon çalışmaya başladı.")
    }
}

class GenelMudur : Mudur() {
    override var pozisyon: String = "Genel Müdür"

    override open fun calis() {
        println("$pozisyon çalışmaya başladı.")
    }
}

open class Programci : Calisan() {
    override var pozisyon: String = "Programcı"

    override open fun calis() {
        println("$pozisyon çalışmaya başladı.")
    }
}

class AnalizProgramci : Programci() {
    override var pozisyon: String = "Analiz Programcısı"

    override open fun calis() {
        println("$pozisyon çalışmaya başladı.")
    }
}

class SistemProgramci : Programci() {
    override var pozisyon: String = "Sistem Programcısı"

    override open fun calis() {
        println("$pozisyon çalışmaya başladı.")
    }

    fun sistemiIncele() {
        println("Sistemi inceliyor.")
    }
}

class Pazarlamaci : Calisan() {
    override var pozisyon: String = "Pazarlamacı"

    override open fun calis() {
        println("$pozisyon çalışmaya başladı.")
    }
}

// burası polymorphism kullanılmadan yapıldı
fun mesaiyeBasla(calisanlar: Array<Any>) {

    for (oAnkiCalisan in calisanlar) {
        // downcasting işlemi yapılıyor
        if (oAnkiCalisan is Calisan) {
            var calisan: Calisan = oAnkiCalisan
            calisan.calis()
        } else if (oAnkiCalisan is Mudur) {
            var mudur: Mudur = oAnkiCalisan
            mudur.calis()
        } else if (oAnkiCalisan is Programci) {
            var programci: Programci = oAnkiCalisan
            programci.calis()
        } else if (oAnkiCalisan is Pazarlamaci) {
            var pazarlamaci: Pazarlamaci = oAnkiCalisan
            pazarlamaci.calis()
        }
    }
}

// burası polymorphism kullanılarak yapıldı
fun mesaiyeBaslaPolymorphism(calisanlar: Array<Calisan>) {

    for (oAnkiCalisan in calisanlar) {
        oAnkiCalisan.calis()

        if (oAnkiCalisan is SistemProgramci) {
            oAnkiCalisan.sistemiIncele()
        }
    }
}

fun main() {
    // 4 tane farklı tipte çalışan olduğu için Any kullanıldı
/*  var calisanlar = Array<Any>(4) { Any() }

    // upcasting işlemi yapılıyor
    calisanlar[0] = Calisan()
    calisanlar[1] = Mudur()
    calisanlar[2] = Programci()
    calisanlar[3] = Pazarlamaci()

    mesaiyeBasla(calisanlar)
 */

    var calisanlar = Array<Calisan>(7) { Calisan() }

    calisanlar[0] = Calisan()
    calisanlar[1] = Mudur()
    calisanlar[2] = Programci()
    calisanlar[3] = Pazarlamaci()
    calisanlar[4] = GenelMudur()
    calisanlar[5] = AnalizProgramci()
    calisanlar[6] = SistemProgramci()

    mesaiyeBaslaPolymorphism(calisanlar)
}
