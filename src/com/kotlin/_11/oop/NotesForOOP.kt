package com.kotlin._11.oop

// kotlinde bütün sınıflar default olarak "public final"'dır.
// bunu yazmaya gerek yoktur.
class Person {
    var isim: String = "mert"
    var yas: Int = 23

    fun selamVer() {
        println("Merhaba")
    }

    fun dogduguYil() = 2019 - yas
}

fun main() {

    var kisi: Person = Person()

    println(kisi.isim)
    println(kisi.yas)
    kisi.selamVer()
    println(kisi.dogduguYil())
}