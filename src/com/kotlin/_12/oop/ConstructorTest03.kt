package com.kotlin._12.oop

class Kare {
    var kenar: Int = 0

    constructor() {
        this.kenar = 0
    }

    constructor(kenar: Int) {
        this.kenar = kenar
    }

    fun kareAlanHesapla(): Int {
        return kenar * kenar
    }
}

fun main() {
    var kare1 = Kare()
    println("Karenin alanı : " + kare1.kareAlanHesapla())   // 0

    var kare2 = Kare(5)
    println("Karenin alanı : " + kare2.kareAlanHesapla())   // 25
}
