package com.kotlin._19.statics

internal class Ogrenci(private val id: Int, private val isim: String) {
    init {
        toplamOgrenciSayisi++
    }

    fun bilgileriYazdir() {
        println("No : $id, İsim : $isim, Toplam öğrenci sayısı : $toplamOgrenciSayisi")
    }

    // static değişkenleri burada tanımlıyoruz
    companion object {
        var toplamOgrenciSayisi = 0
    }
}

// object olduğu için bu class artık static
// burada bütün bir uygulama boyunca TEK BİR obje oluşturuyoruz
// bütün uygulamada tek bir obje olacağı için constructor tanımlayamayız
object KotlinStatics {
    var sinifAdi = "Kotlin Statics"
    // eğer bu dosyayı java'da çalıştıracaksak @JvmStatic kullanıp
    // java'ya bu methodun static olduğunu söylüyoruz
    @JvmStatic
    fun main(args: Array<String>) {
        val ogrenci1 = Ogrenci(1, "mert")
        ogrenci1.bilgileriYazdir()
        val ogrenci2 = Ogrenci(2, "emre")
        ogrenci2.bilgileriYazdir()
        val ogrenci3 = Ogrenci(3, "ilker")
        ogrenci3.bilgileriYazdir()
        val ogrenci4 = Ogrenci(4, "oğuz")
        ogrenci4.bilgileriYazdir()
    }
}

fun main() {
    var test: KotlinStatics = KotlinStatics
    println(KotlinStatics.sinifAdi) // Kotlin Statics
    println(KotlinStatics.sinifAdi)  // Kotlin Statics
}

// kotlinde static keyword'ü yok bunun yerine object ve companion keyword'leri var
