package com.kotlin._12.oop

class Daire(var yariCap: Int) {}

fun daireAlanHesapla(daire: Daire) {
    println("Dairenin alanı : " + (daire.yariCap * daire.yariCap * Math.PI))
}

fun daireDizisiniGoster(daireDizi: Array<Daire>) {
    for (daire in daireDizi) {
        daireAlanHesapla(daire)
    }
}

fun main() {
    var daire1: Daire = Daire(5)
    daireAlanHesapla(daire1)
    var daire2: Daire = Daire(7)
    daireAlanHesapla(daire2)

    var daire3: Daire = Daire(8)
    var daire4: Daire = Daire(2)
    var daire5: Daire = Daire(3)

    var daireler: Array<Daire> = Array<Daire>(5) { Daire(0) }
    daireler[0] = daire1
    daireler[1] = daire2
    daireler[2] = daire3
    daireler[3] = daire4
    daireler[4] = daire5
    daireDizisiniGoster(daireler)
}
