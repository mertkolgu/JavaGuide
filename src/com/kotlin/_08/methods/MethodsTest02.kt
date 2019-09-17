package com.kotlin._08.methods

fun faktoriyelHesapla(sayi: Int): Int {
    var girilenSayi = sayi
    var sayac = 1
    var faktoriyel = 1

    while (sayac <= girilenSayi) {
        faktoriyel *= sayac
        sayac++
    }
    return faktoriyel
}

fun main() {
    print("Sayı giriniz : ")
    var sayi = readLine()!!.toInt()
    println("Girilen sayının faktöriyeli : " + faktoriyelHesapla(sayi))
}