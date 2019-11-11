package com.kotlin._24.function

fun faktoriyel(sayi: Int): Int {
    var sonuc = 1
    for (i in 1..sayi) {
        sonuc *= i
    }
    return sonuc
}

// extension function
fun Int.faktoriyelExt(): Int {
    var sonuc = 1
    for (i in 1..this) {
        sonuc *= i
    }
    return sonuc
}

fun String.bosluklariDuzenle(): String {
    // içinde birden fazla boşluk olan ifadeleri alıyor
    var regex = Regex("\\s+")
    return regex.replace(this, " ")
}

fun main() {
    println("Normal faktöriyel -> 5! = " + faktoriyel(5))
    println("Extension faktöriyel -> 6! = " + 6.faktoriyelExt())

    var yazi = "Mert               Kolğu\t Kotlin"
    println(yazi)
    println("Düzenlenmiş hali : " + yazi.bosluklariDuzenle())
}
