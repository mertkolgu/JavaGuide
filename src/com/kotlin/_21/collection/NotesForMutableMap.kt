package com.kotlin._21.collection

fun main() {
    // değiştirilebilir yapıdadır
    var map = hashMapOf<Int, String>(1 to "mert", 2 to "özgür")
    var mutableMap = mutableMapOf<Int, String>(1 to "mert", 2 to "özgür")

    // ekleme
    map.put(3, "ecir")

    // okuma
    println(map.get(1))
    println(map[2])

    map.put(4, "oğuz")

    // güncelleme
    map.set(3, "emre")

    for (str in map) {
        println("Key : ${str.key}, Value : ${str.value}")
    }

    // silme
    map.remove(3)

    for (str in map) {
        println("Key : ${str.key}, Value : ${str.value}")
    }
}
