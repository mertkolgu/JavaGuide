package com.kotlin._19.statics

object Student {
    // static davranış gösterir
    var sayac = 0

    fun sayaciGoster() {
        println("Sayaç : $sayac")
    }
}

fun main() {
    var ogrenci1: Student = Student
    Student.sayac = 8
    Student.sayaciGoster() // 8

    var ogrenci2: Student = Student
    Student.sayac = 18
    Student.sayaciGoster() // 18

    Student.sayaciGoster() // 18

    // tek bir obje ürettiğimiz için böyle kullanıyoruz
    Student.sayac = 28
    Student.sayaciGoster()  // 28
}
