package com.kotlin._21.collection

fun main() {
    // değiştirilemez yapıdadır
    var listOfList = listOf(1, 2, "mert", true, null, 5.4)

    for (i in listOfList)
        println(i)

    var value1 = listOfList.get(0) as Int
    var value2 = listOfList.get(1) as Int

    println(value1 + value2)

    println("Listenin boyutu : " + listOfList.size) // 6

    // bu listede null değer tanımlanmıyor
    var listOfNotNullList = listOfNotNull(1, 2, "mert", true, null, 5.4)
    println("Listenin boyutu : " + listOfNotNullList.size)  // 5
}
