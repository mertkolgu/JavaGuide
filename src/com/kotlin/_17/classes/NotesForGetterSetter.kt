package com.kotlin._17.classes

// bu class java dosyasından çevrildi
class Kitap(private var id: Int, var ad: String?) {

    fun getId(): Int {
        return id
    }

    fun setId(id: Int) {
        if (id < 0) {
            this.id = 1
        } else {
            this.id = id
        }
    }
}

class KitapKotlin {
    var id: Int = 0
        get() = field
        set(value) {
            if (value < 0) {
                field = 1
            } else {
                field = value
            }
        }

    var isim: String

    constructor(id: Int, isim: String) {
        this.id = id
        this.isim = isim
    }
}

fun main() {

    var kitap: Kitap = Kitap(-9, "sefiller")
    println(kitap.ad)
    kitap.setId(-80)
    println(kitap.getId())

    println("*****************")

    var kitap2: KitapKotlin = KitapKotlin(-7, "nutuk")
    println(kitap2.id)
    kitap2.id = 65
    println(kitap2.id)
}