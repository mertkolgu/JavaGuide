package com.kotlin._15.polymorphism

open class Hayvan {
    open fun avYakala() {
        println("Av yakala çalıştı.")
    }
}

class Kartal : Hayvan() {
    override fun avYakala() {
        println("Kartal av yakala çalıştı.")
    }
}

class Timsah : Hayvan() {
    override fun avYakala() {
        println("Timsah av yakala çalıştı.")
    }
}

fun rastgeleSec(): Hayvan {
    var rastgeleSayi = (Math.random() * 3).toInt()
    var oAnkiHayvan = Hayvan()

    when (rastgeleSayi) {
        0 -> oAnkiHayvan = Hayvan()
        1 -> oAnkiHayvan = Kartal()
        2 -> oAnkiHayvan = Timsah()
    }
    return oAnkiHayvan
}

fun main() {
    var hayvanlar = Array<Hayvan>(3) { Hayvan() }

    for (i in 0 until hayvanlar.size - 1) {
        hayvanlar[i] = rastgeleSec()
    }

    for (hayvan in hayvanlar) {
        hayvan.avYakala()
    }
}

// burada late binding vardır. çünkü program ne yapacağına çalışma anında karar veriyor.
