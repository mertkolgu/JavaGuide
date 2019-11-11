package com.kotlin._13.inheritance

// final class'da inheritance işlemi yapılamaz
// final yerine open kullanılmalıdır
public open class GeometrikSekil {
    var en: Int = 0
    var boy: Int = 0

    // final method'da inheritance işlemi yapılamaz
    // final yerine open kullanılmalıdır
    public open fun alanHesapla() {
        println("Geometrik Şekil Alan : " + (en * boy))
    }

    override fun toString(): String {
        return "En : $en, Boy : $boy"
    }
}

class Kare : GeometrikSekil() {
    override fun alanHesapla() {
        println("Kare Alan : " + (en * boy))
    }
}

class Dikdortgen : GeometrikSekil() {
    override fun alanHesapla() {
        println("Dikdörtgen Alan : " + (en * boy))
    }
}

fun main() {
    var geometrikSekil1 = GeometrikSekil()
    geometrikSekil1.en = 3
    geometrikSekil1.boy = 6
    geometrikSekil1.alanHesapla()

    var kare = Kare()
    kare.en = 3
    kare.boy = 3
    kare.alanHesapla()

    var dikdortgen = Dikdortgen()
    dikdortgen.en = 4
    dikdortgen.boy = 9
    dikdortgen.alanHesapla()
}
