package com.kotlin._12.oop

//class Student constructor(var isim: String, var yas: Int) {
//    fun bilgileriGoster() {
//        println("İsim : $isim, Yaş : $yas")
//    }
//}

// constructor yazmasak da olur
class Student(isim: String, yas: Int) {
    var gelenIsim: String
    var gelenYas: Int

    // obje üretildiğinde ilk tetiklenecek yer
    // bu blok içinde değişkenlerin başına "var" eklenmese bile değişkenler kullanılabilir
    // bu bloğun içinde return kullanılamaz
    init {
        this.gelenIsim = isim
        this.gelenYas = yas
        println("init bloğu çalıştı")
        println("İsim : $isim, Yaş : $yas")
    }

    fun bilgileriGoster() {
        println("İsim : $gelenIsim, Yaş : $gelenYas")
    }
}

fun main() {
    var student: Student = Student("mert", 23)
    student.bilgileriGoster()
}
