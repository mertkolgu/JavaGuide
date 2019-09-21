package com.kotlin._23.function

import java.math.BigInteger

fun normalFaktoriyelBul(sayi: BigInteger): BigInteger {
    var sonuc = BigInteger.ONE
    for (i in 1..sayi.toInt()) {
        sonuc *= BigInteger("$i")
    }
    return sonuc
}

tailrec fun recursiveFaktoriyelBul(sayi: BigInteger, sonuc: BigInteger = BigInteger.ONE): BigInteger {
    if (sayi == BigInteger.ZERO) {
        return sonuc
    } else {
        return recursiveFaktoriyelBul(sayi - BigInteger.ONE, sayi * sonuc)
    }
}

fun main() {

    println("Normal faktöriyel 70000! = " + normalFaktoriyelBul(BigInteger("70000")))
    println("Recursive faktöriyel 70000! = " + recursiveFaktoriyelBul(BigInteger("70000")))
}