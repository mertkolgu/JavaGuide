package com.kotlin._10.string

fun main() {

    var isim = "Mert Kolğu"
    var yas = "23"
    var takim = "Beşiktaş"
    println(isim + 1)   // Mert Kolğu1
    println(yas + 1)    // 231
    println(yas.toInt() + 1)    // 24
    println("İsim : " + isim + " Yaş : $yas")
    println("Mert " + "Kolğu")  // Mert Kolğu

    for (tekKarakter in isim) {
        print("$tekKarakter ")  // M e r t   K o l ğ u
    }

    println()

    for (index in 0..isim.length - 1) {
        print(isim[index])  // Mert Kolğu
    }

    println()

    // uzunluk
    println("Takım Adının Uzunluğu : " + takim.length)  // 8

    // get() -> verilen indeksteki karakteri döndürür
    println(takim.get(0) + " " + takim.get(1))  // B e

    // substring() -> verilen aralıktaki karakterleri göserir
    println(takim.substring(0, 6))  // Beşikt

    // a harfinin geçtiği ilk indeksi gösterir
    println(takim.indexOf('a')) // 6

    // a harfinin geçtiği son indeksi gösterir
    println(takim.lastIndexOf('a')) // 6

    // istenilen karakteri değiştirme
    println(takim.replace('B', 'A')) // Aeşiktaş

    // hepsini büyük harf yapma
    println(takim.toUpperCase())    // BEŞIKTAŞ

    // hepsini küçük harf yapma
    println(takim.toLowerCase())    // beşiktaş
}