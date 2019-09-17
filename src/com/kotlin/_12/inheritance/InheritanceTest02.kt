package com.kotlin._12.inheritance

open class People {
    var name: String
    var age: Int
    var isMan: Boolean = false

    constructor(name: String, age: Int) {
        this.name = name
        this.age = age
    }

    constructor(name: String, age: Int, isMan: Boolean) : this(name, age) {
        this.isMan = isMan
    }

    override fun toString(): String {
        var gender = if (isMan) "erkek" else "kadın"
        return "isim : $name, yaş : $age, cinsiyet : $gender"
    }

    open fun bilgileriGoster(): String {
        var gender = if (isMan) "erkek" else "kadın"
        return "isim : $name, yaş : $age, cinsiyet : $gender"
    }
}

class Teacher : People {
    var brans: String

    constructor(name: String, age: Int, isMan: Boolean, brans: String) : super(name, age, isMan) {
        this.brans = brans
    }

    override fun toString(): String {
        return super.toString() + ", branş : $brans"
    }

    override fun bilgileriGoster(): String {
        return super.bilgileriGoster() + ", branş : $brans"
    }
}

fun main() {
    var person1: People = People("mert", 23, true)
    println(person1)

    var person2: People = People("fatma", 35)
    println(person2)

    var teacher: Teacher = Teacher("mahmut", 65, true, "Tarih")
    println(teacher)
    println(teacher.bilgileriGoster())
}