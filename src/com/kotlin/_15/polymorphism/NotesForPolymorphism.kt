package com.kotlin._15.polymorphism

open class Asker {
    open fun selamVer() {
        println("Asker selam verdi.")
    }
}

class Yuzbasi : Asker() {
    override fun selamVer() {
        println("Yüzbaşı selam verdi.")
    }
}

class Er : Asker() {
    override fun selamVer() {
        println("Er selam verdi.")
    }
}

fun hazirOl(asker: Asker) {
    asker.selamVer()
}

fun main() {
    var asker = Asker()
    var yuzbasi = Yuzbasi()
    var er = Er()

    hazirOl(asker)
    hazirOl(yuzbasi)
    hazirOl(er)
}

// polymorphism -> çok biçimlilik
// bir objenin birden fazla obje gibi davranması

// bir tane super class olması lazım ve geri kalanlar subclass olacak.
// geriye kalan subclass'ların referanslarını super class'taki referanslara eşitleyebiliriz.

// super class'ta bulunan bir method subclass'ta override edilmemiş ise
// super class'taki method çağrılır.

// static -> overloaded // early binding
// dynamic -> override  // late binding override kavramı kalıtım extends/implements geçerlidir!
// runtime'da belirlenen özelliklere late binding denir.
// compile anında neyin çalıştırılacağı tahmin edilip bulunuyorsa early binding denir.
