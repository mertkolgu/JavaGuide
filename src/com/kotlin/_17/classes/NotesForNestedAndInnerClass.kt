package com.kotlin._17.classes

class DisSinif {
    var sinifAdi = "Dış Sınıf"

    fun selamVerDisSinif() {
        println("Dış sınıftan merhaba")
    }

    class IcSinif {
        var sinifAdi = "İç Sınıf"

        fun selamVerIcSinif() {
            println("İç sınıftan merhaba")
        }
    }

    // burada dış sınıfa erişebilmek için inner keyword'ünü kullanıyoruz
    inner class InnerIcSinif {
        var sinifAdi = "Inner İç Sınıf"

        fun selamVerInnerIcSinif() {
            selamVerDisSinif()
            println("Inner iç sınıftan merhaba")
        }

        inner class EnIctekiSinif {
            var sinifAdi = "En İç Sınıf"

            fun selamVerEnIctekiSinif() {
                selamVerDisSinif()
                selamVerInnerIcSinif()
                println("En içteki sınıftan merhaba")
            }
        }
    }
}

fun main() {
    var disSinif = DisSinif()
    println(disSinif.sinifAdi)
    disSinif.selamVerDisSinif()

    var icSinif = DisSinif.IcSinif()
    println(icSinif.sinifAdi)
    icSinif.selamVerIcSinif()

    var innerIcSinif = DisSinif().InnerIcSinif()
    println(innerIcSinif.sinifAdi)
    innerIcSinif.selamVerInnerIcSinif()

    var enIctekiSinif = DisSinif().InnerIcSinif().EnIctekiSinif()
    println(enIctekiSinif.sinifAdi)
    enIctekiSinif.selamVerEnIctekiSinif()
}