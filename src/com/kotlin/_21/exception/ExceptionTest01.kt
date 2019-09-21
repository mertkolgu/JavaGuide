package com.kotlin._21.exception

class Person {
    var yas: Int = 0
        get() = field
        set(value) {
            if (value < 0) {
                val exception = IllegalArgumentException("Yaş negatif olamaz.")
                throw exception
            } else {
                field = value
            }
        }
}

fun main() {
    var person = Person()
    println(person.yas)
    try {
        person.yas = -9
        println(person.yas)
    } catch (e: IllegalArgumentException) {
        println("Hata 1 : " + e.message)
        println("Hata 1 : " + e.toString())
    } finally {
        println("Program bitti.")
    }
}