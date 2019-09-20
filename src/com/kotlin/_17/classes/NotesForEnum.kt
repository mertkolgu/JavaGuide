package com.kotlin._17.classes

class Book {
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
    var kapakRenk: KapakRenk

    constructor(id: Int, isim: String, kapakRenk: KapakRenk) {
        this.id = id
        this.isim = isim
        this.kapakRenk = kapakRenk
    }
}

// enum sabit değerleri içerir
enum class KapakRenk {
    KIRMIZI,
    MAVİ,
    YEŞİL
}

fun main() {

    var kitap: Book = Book(-7, "nutuk", KapakRenk.MAVİ)
    println(kitap.id)
    kitap.id = 65
    println(kitap.id)
    println("ID : ${kitap.id}, İsim : ${kitap.isim}, Kapak Rengi : ${kitap.kapakRenk}")
}