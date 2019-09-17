package com.kotlin._03.arrays

fun main() {

    var isimler = arrayListOf("mert", "oğuz", "ecir")

    isimler.add("emre")
    isimler.add(2, "rıdvan")

    for (isim in isimler) {
        println(isim)
    }
    println("*********")

    // istenilen indexteki değeri göster
    println("İkinci indexteki değer : " + isimler.get(2))

    // dizinin boyutunu göster
    println("Dizinin boyutu : " + isimler.size)

    // istenilen elemanı siler
    println(isimler.remove("emre"))

    // varolan bir değeri güncelleme
    isimler.set(0, "yeni değer")

    for (isim in isimler) {
        println(isim)
    }
    println("*********")

    // array'in tamamını siler
    isimler.clear()
}

// arrayListOf ile arrayOf farkı;
// arrayListOf'ta array'i istediğimiz gibi değiştirebiliriz.