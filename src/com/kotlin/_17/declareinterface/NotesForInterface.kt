package com.kotlin._17.declareinterface

interface Hayvan {
    fun avlan()

    fun interfaceTest() {
        println("Interface methodu.")
    }
}

abstract class Kedigiller : Hayvan {
    abstract fun takipEt()
}

open class Kedi : Kedigiller() {
    override fun avlan() {
        println("Kedi class avlan çalıştı.")
    }

    override fun takipEt() {
        println("Kedi class takip et çalıştı.")
    }
}

class Kaplan : Kedi() {
    override fun takipEt() {
        println("Kaplan class takip et çalıştı.")
    }
}

// interface, implements
// interface'lerde nesne üretilemiyor.
// interface'in methodları public abstract'tır!
// interface'in değişkenleri public final'dır!
