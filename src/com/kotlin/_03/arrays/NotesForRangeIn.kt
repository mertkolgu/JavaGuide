package com.kotlin._03.arrays

fun main() {
    // 1 ile 20 arasındaki sayılar
    var sayilar: IntRange = 1..20
    var sayilarTersten = 20..1

    var oneToTwenty = 1.rangeTo(20)
    var oneToTwentyReverse = 20.downTo(1)

    // istediğimiz miktarda artırma yapmak için step() metodunu kullanıyoruz
    var beserBeserSayilar = 0.rangeTo(100).step(5)
    var beserBeserSayilarReverse = 100.rangeTo(5).step(5)

    // içinde var mı yok mu diye bakmak için "in" kullanılır
    var elemanVarMi = 11 in beserBeserSayilar
    println("11 range içinde mi ? : " + elemanVarMi)    // false

    println("İlk elemanı : " + beserBeserSayilar.first) // 0
    println("Son elemanı : " + beserBeserSayilar.last)  // 100
    println("Artım sayısı : " + beserBeserSayilar.step) // 5

    // a'dan z'ye harfler
    var harfler: CharRange = 'a'..'z'
    var harflerTersten = 'z'..'a'

    var aToZ = 'a'.rangeTo('z')
    var aToZReverse = 'a'.downTo('a')
}