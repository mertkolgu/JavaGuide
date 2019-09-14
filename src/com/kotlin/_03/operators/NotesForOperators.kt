package com.kotlin._03.operators

fun main() {
    // aritmetik operatörler
    var sayi1 = 15
    var sayi2 = 4
    println("Sayıların toplamı = " + (sayi1 + sayi2))
    println("Sayıların farkı = ${sayi1 - sayi2}")
    println("Sayıların çarpımı = ${sayi1 * sayi2}")
    println("Sayıların bölümü = ${sayi1 / sayi2}")
    println("Sayıların mod'u = ${sayi1 % sayi2}")

    // atama operatörleri
    var sayi = 5
    sayi += 5   // sayi = sayi + 5 -> 10
    sayi -= 2   // sayi = sayi - 2 -> 8
    sayi *= 3   // sayi = sayi * 3 -> 24
    sayi /= 6  // sayi = sayi / 6 -> 4
    sayi %= 3  // sayi = sayi / 3 -> 1

    // karşılaştırma operatörleri
    var sayi3 = 13
    var sayi4 = 7
    var sonuc: Boolean
    sonuc = sayi3 > sayi4   // true
    println(sonuc)
    sonuc = sayi3 < sayi4   // false
    println(sonuc)
    sonuc = sayi3 == sayi4  // false
    println(sonuc)
    sonuc = sayi3 != sayi4  // true
    println(sonuc)

    // mantıksal operatörler
    var sart1 = true
    var sart2 = false
    var sart3 = true
    var sart4 = false
    var sart5 = true
    println(sart1 && sart2) // false
    println(sart3 || sart4) // true
    println(!sart5)         // false

    // artırma ve azaltma operatörleri
    var sayi5 = 16
    println(sayi5++)    // 16
    println(sayi5)      // 17
    println(++sayi5)    // 18
    println(sayi5--)    // 18
    println(sayi5)      // 17
    println(--sayi5)    // 16

    // işlem önceliği
    var sayi6 = 15
    var sayi7 = 5
    var sonuc2: Int
    sonuc2 = (sayi6 + sayi7 * 2 - sayi7) + sayi7 - sayi6 * 5 + sayi7    // -45
    println(sonuc2)
    sonuc2 = 0
    sonuc2 = (sayi6 * sayi7 + 4 / 2) + sayi6++ * sayi7  // 152
    println(sonuc2)
}

// Assignment Operator/Atama Operatörü
// =

// Compound Assignment Operator
// +=, -=, *=, /=, %= ...

// Equality & Relational Operators
// <, <=, >, >=, ==, !=

// Arithmetic Operator +, -, *, /, %

// Increment/Decrement Operator ++, --
// prefix ya da postfix
// prefix -> ++number, --number
// postfix -> number++, number--

// logical
// &&, ||, !
// and -> && -> bütün şartlar doğru ise true, en az bir şart yanlış ise false
// or -> || -> en az bir tane şart doğru ise true, bütün şartlar yanlış ise false
// not -> ! -> true ise false, false ise true yapar

// işlem önceliği
// () -> parantez
// ++ ve -- değişkenden önce
// ^
// * ve /
// + ve -
// = atama
// ++ ve -- değişkenden sonra