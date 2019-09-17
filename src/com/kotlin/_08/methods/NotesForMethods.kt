package com.kotlin._08.methods

fun isimYazdir(): Unit {
    println("Mert Kolğu")
    println("Yaş 23")
}

fun ismiParameteIleYazdir(isim: String, yas: Int): Unit {
    println("İsim : $isim, Yaş : $yas")
}

fun menuGoster(): Unit {
    println("MENÜ")
    println("1 - İki sayının toplamını bul")
    println("2 - İki sayının farkını bul")
    println("3 - İki sayının çarpımını bul")
}

fun main() {
    isimYazdir()
    ismiParameteIleYazdir("Mert Kolğu", 23)
    menuGoster()

    // anonymous methods
    fun yasimiGoster() = 23
    println("Yaşım : " + yasimiGoster())

    fun sum(x: Int, y: Int): Int = x + y
    println("Toplam : " + sum(2, 5))
}

// methodu bir defa tanımlarız.
// tanımladığımız metodu her yerde kullanırız.
// metodu istediğimiz kadar çağırabiliriz.
// metodları olabildiğince parçalara bölüp çalışmak faydalıdır.

// unit -> geriye bir şey döndürmüyor. return kullanılamaz.
// return olan methodlarda return'den sonra hiçbir işlem yapılmaz,
// method return'e kadar işlem yapar.

// kotlinde metodlar default olarak "public final"'dır