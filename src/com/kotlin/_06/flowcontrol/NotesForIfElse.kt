package com.kotlin._06.flowcontrol

fun main() {

    print("Notunuzu Giriniz : ")
    var not: Int = readLine()!!.toInt()
    var karneNotu: Int = -1

    // kotlinde if'lerde sonuc değerine değer atayabiliyoruz
    // burada önemli husus if bloğunun son satırındaki değeri almamız
    var sonuc = if (not in 0..24) {
        println("0 aldın")
        karneNotu = 0
        0
    } else if (not in 25..44) {
        println("1 aldın")
        karneNotu = 1
        1
    } else if (not in 45..54) {
        println("2 aldın")
        karneNotu = 2
        2
    } else if (not in 55..69) {
        println("3 aldın")
        karneNotu = 3
        3
    } else if (not in 70..84) {
        println("4 aldın")
        karneNotu = 4
        4
    } else if (not in 85..100) {
        println("5 aldın")
        karneNotu = 5
        5
    } else {
        println("Geçersiz not girdiniz.")
        -1
    }
    println("Karneye yansıyacak not : $karneNotu")
    println("Sonuç : $sonuc")
}