package com.kotlin._01.declarevariable

fun main() {
    // kotlinde null veri tipinin yanına ? işareti koyarak tanımlanıyor
    var isim: String? = null
    println(isim)           // null
    println(isim?.length)   // null

    // içerik önemli değil null olup olmaması umrumda değil
    // println(isim!!.length)  // kotlin.KotlinNullPointerException

    var sayi: Int? = 5
    println(sayi)   // 5
    sayi = null
    println(sayi)   // null
    // sayi'yı String'e çevirip boyunu aldık
    println(sayi.toString().length) // 4

    var onay: Boolean? = null
    println(onay.toString().length) // 4
}

// kotlin bize çok daha güvenilir, NullPointerException'dan uzak uygulamalar yazmayı sağlar
// String ile String? birbirinden farklıdır
// String null kabul etmezken String? kabul ediyor