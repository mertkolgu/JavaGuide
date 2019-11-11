package com.kotlin._12.oop

// primary constructor
class User(var id: Int, var name: String) {
    var adress: String = ""
    var mail: String = ""

    init {
        if (id < 0) {
            id = 1
        }
        println("id : $id, isim : $name")
    }

    // secondary constructor
    constructor(id: Int, name: String, adress: String) : this(id, name) {
        this.adress = adress
    }

    constructor(id: Int, name: String, adress: String, mail: String) : this(id, name) {
        this.adress = adress
        this.mail = mail
    }
}

fun main() {
    var mert: User = User(100, "mert")
    var emre: User = User(101, "emre")
    var mahmut: User = User(-5, "mahmut", "antalya")
    var ecir: User = User(3, "ecir", "ısparta", "ecir@sdu.edu.tr")
}
