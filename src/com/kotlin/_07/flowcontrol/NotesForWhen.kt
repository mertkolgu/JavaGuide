package com.kotlin._07.flowcontrol

fun main() {

    print("Notunuzu Giriniz : ")
    var not: Int = readLine()!!.toInt()

    // kotlinde when'lerde sonuc değerine değer atayabiliyoruz
    // burada önemli husus if bloğunun son satırındaki değeri almamız
    var sonuc = when (not) {
        in 0..24 -> {
            println("0 aldın")
            0
        }
        in 25..44 -> {
            println("1 aldın")
            1
        }
        in 45..54 -> {
            println("2 aldın")
            2
        }
        in 55..69 -> {
            println("3 aldın")
            3
        }
        in 70..84 -> {
            println("4 aldın")
            4
        }
        in 85..100 -> {
            println("5 aldın")
            5
        }
        else -> {
            println("Geçersiz not girdiniz.")
            -1
        }
    }

    if (sonuc == -1) {
        println("Tekrar deneyin yanlış giriş yaptınız.")
    } else {
        println("Sonuç : $sonuc")
    }
}