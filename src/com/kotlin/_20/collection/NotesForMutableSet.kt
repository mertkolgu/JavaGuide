package com.kotlin._20.collection

fun main() {
    // değiştirilebilir yapıdadır
    var set = mutableSetOf("mert", 1, 5, 7, true, "mert", null)

    // ekleme
    set.add(5.55)
    set.add(false)
    set.add("ahmet")

    for (str in set) {
        println(str)
    }

    println("Set boyutu : " + set.size)
}