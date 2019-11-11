package com.kotlin._21.collection

fun main() {
    // değiştirilemez yapıdadır
    var map = mapOf<Int, String>(1 to "mert", 2 to "özgür")

    println("Key value 2 : " + map.get(2))

    for (str in map) {
        println(str)
        println("Key : ${str.key}, Value : ${str.value}")
    }

    print("Aranan ifadeyi giriniz : ")
    var aranacakIfade = readLine()!!

    if (map.containsValue(aranacakIfade)) {
        println("$aranacakIfade map'de var.")
    } else {
        println("$aranacakIfade map'de yok.")
    }
}
