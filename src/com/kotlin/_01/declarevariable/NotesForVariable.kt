package com.kotlin._01.declarevariable

fun main() {

    var byteMin: Byte = Byte.MIN_VALUE
    println("Byte MIN = $byteMin")

    var byteMax: Byte = Byte.MAX_VALUE
    println("Byte MAX = $byteMax")

    var shortMin: Short = Short.MIN_VALUE
    println("Short MIN = $shortMin")

    var shortMax: Short = Short.MAX_VALUE
    println("Short MAX = $shortMax")

    var intMin: Int = Int.MIN_VALUE
    println("Integer MIN = $intMin")

    var intMax: Int = Int.MAX_VALUE
    println("Integer MAX = $intMax")

    var longMin: Long = Long.MIN_VALUE
    println("Long MIN = $longMin")

    var longMax: Long = Long.MAX_VALUE
    println("Long MAX = $longMax")

    var floatMin: Float = Float.MIN_VALUE
    println("Float MIN = ${floatMin}")

    var floatMax: Float = Float.MAX_VALUE
    println("Float MAX = ${floatMax}")

    var doubleMin = Double.MIN_VALUE    // değişkenin veri tipini belirtmesek de olur
    println("Double MIN = ${doubleMin}")

    var doubleMax = Double.MAX_VALUE
    println("Double MAX = ${doubleMax}")

    var isTrue: Boolean = false
    println("isTrue değişkeninin değeri : $isTrue")

    var ilkHarf: Char = 'A'
    var ikinciHarf: Char = 'b'
    println("ilk harf : $ilkHarf ikinci harf : $ikinciHarf")

    var isim: String = "Mert Kolğu"
    println("Adım $isim ve adımdaki karakter sayısı ${isim.length}")
    println("${isim[0]}")
    println(isim[5])
}

// değişken tanımlamak için var keyword'ü kullanılır.

// değişkenler(variable)
// camelCase yapıda olmalı.
// değişken isimleri anlamlı ne işe yaradığı belli olacak şekilde olmalı.
// değişken isminin kısa olması önemli değil.
// değişken rakamla başlayamaz.

// byte -> 8 bit/1 byte yer kaplar.
// short -> 16 bit/2 byte yer kaplar.
// char -> 16 bit/2 byte yer kaplar.
// int -> 32 bit/4 byte yer kaplar.
// float -> 32 bit/4 byte yer kaplar.
// long -> 64 bit/8 byte yer kaplar.
// double -> 64 bit/8 byte yer kaplar.
// boolean -> true ya da false değeri alır.

// var sayi: Int = 5
// println("sayı = $sayi")
// println("sayı = ${sayi}")

// var sayi: Int
// sayi = 5
// println("sayı = " + sayi)

// değişkenler defaul olarak "public final" olarak tanımlanır.