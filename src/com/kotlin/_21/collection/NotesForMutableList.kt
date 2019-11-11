package com.kotlin._21.collection

fun main() {
    // değiştirilebilir yapıdadır
    // initialCapacity zorunlu değil
    var arrayList = ArrayList<Any>(50)
    var arrayListOfList = arrayListOf(1, 2, "mert", null, false)
    var mutableListOfList = mutableListOf(1, 2, "mert", null, false)

    // ekleme
    arrayListOfList.add(2)
    arrayListOfList.add("ecir")
    arrayListOfList.add(null)
    arrayListOfList.add(9.8)

    for (i in arrayListOfList)
        println(i)

    // güncelleme
    arrayListOfList.set(6, "özgür")

    for (i in arrayListOfList)
        println(i)

    // silme
    arrayListOfList.remove(null)
    arrayListOfList.removeAt(1)

    for (i in arrayListOfList)
        println(i)

    println("Listenin boyutu : " + arrayListOfList.size)
}
