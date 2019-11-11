package com.kotlin._18.classes

interface Okuyabilen {
    fun oku()
}

class Tarayici : Okuyabilen {
    override fun oku() {
        println("Tarayıcı sınıfından oku methodu tetiklendi.")
    }
}

fun main() {
    var tarayici = Tarayici()
    tarayici.oku()

    var isimsizSinif = object : Okuyabilen {
        override fun oku() {
            println("İsimsiz sınıfındaki oku methodu tetiklendi.")
        }
    }
    isimsizSinif.oku()
}
