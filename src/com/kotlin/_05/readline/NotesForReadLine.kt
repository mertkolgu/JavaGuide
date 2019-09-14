package com.kotlin._05.readline

fun main() {
    print("Adınızı giriniz : ")
    var ad: String? = readLine()

    print("Soyadınızı giriniz : ")
    var soyad: String = readLine()!!

    print("Yaşınızı Giriniz : ")
    var yas = readLine()!!

    print("Adınız : $ad, Soyadınız : $soyad, Yaşınız : $yas")
}

// kullanıcıdan veri almak için readLine() metodu kullanılır
// bu metod ne değer girilirse girilsin String değer döndürür