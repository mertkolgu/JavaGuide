package com.kotlin._17.declareinterface

class ArabaMotoru {
    fun calis() {}
    fun dur() {}
}

class Pencere {
    fun asagiCek() {}
    fun yukariCek() {}
}

class Kapi {
    var pencere: Pencere = Pencere()
    fun ac() {}
    fun kapa() {}
}

class Tekerlek {
    fun havaPompala(miktar: Int) {}
}

class Araba {
    var arabaMotoru = ArabaMotoru()
    var sagKapi: Kapi = Kapi()
    var solKapi: Kapi = Kapi()
    var tekerlekler: Array<Tekerlek> = Array<Tekerlek>(4) { Tekerlek() }
}

fun main() {
    var arabam: Araba = Araba()
    arabam.sagKapi.pencere.asagiCek()
    arabam.solKapi.pencere.yukariCek()
    arabam.tekerlekler[2].havaPompala(50)
}
