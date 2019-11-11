package com.kotlin._12.oop

class Dikdortgen(var en: Int = 0, var boy: Int = 0) {
    fun alanHesapla(): Int {
        return this.en * this.boy
    }
}

fun main() {
    var dikdortgen1: Dikdortgen = Dikdortgen(5, 10)
    println(dikdortgen1.alanHesapla())  // 50

    var dikdortgen2: Dikdortgen = Dikdortgen(6, 12)
    println(dikdortgen2.alanHesapla())  // 72

    var dikdortgen3: Dikdortgen = Dikdortgen(boy = 18, en = 8)
    println(dikdortgen3.alanHesapla())  // 144

    var dikdortgen4: Dikdortgen = Dikdortgen()
    println(dikdortgen4.alanHesapla())  // 0
}
