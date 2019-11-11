package com.kotlin._13.inheritance

open class Person(open var name: String, open var age: Int, open var isMan: Boolean) {

    init {
        println("person class'ının init bloğu tetiklendi")
        this.name = name
        this.age = age
        this.isMan = isMan
    }

    override fun toString(): String {
        var gender = if (isMan) "erkek" else "kadın"
        return "isim : $name, yaş : $age, cinsiyet : $gender"
    }
}

class Ogretmen(name: String, override var age: Int, isMan: Boolean, brans: String) : Person(name, age, isMan) {
    var brans: String

    init {
        println("öğretmen class'ının init bloğu tetiklendi")
        this.brans = brans
        if (age < 0) {
            age = 999
        }
    }

    override fun toString(): String {
        return super.toString() + ", branş : $brans"
    }
}

fun main() {
    var person: Person = Person("mert", 23, true)
    println(person)

    var ogretmen: Ogretmen = Ogretmen("fatma", -29, false, "matematik")
    println(ogretmen)
}
