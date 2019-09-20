package com.kotlin._18.statics

object Student {
    // static davranış gösterir
    var sayac = 0

    fun sayaciGoster() {
        println("Sayaç : $sayac")
    }
}

fun main() {

    var ogrenci1: Student = Student
    ogrenci1.sayac = 8
    ogrenci1.sayaciGoster() // 8

    var ogrenci2: Student = Student
    ogrenci2.sayac = 18
    ogrenci2.sayaciGoster() // 18

    ogrenci1.sayaciGoster() // 18

    // tek bir obje ürettiğimiz için böyle kullanıyoruz
    Student.sayac = 28
    Student.sayaciGoster()  // 28
}