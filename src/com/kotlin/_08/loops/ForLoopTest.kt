package com.kotlin._08.loops

fun main() {
    for (i in 1..5) {
        println("Mert Kolğu")
    }

    var isim = "Mert Kolğu"
    for (j in isim) {
        if (!j.equals(isim.last())) {
            print(j + ",")
        } else {
            println(j)
        }
    }   // M,e,r,t, ,K,o,l,ğ,u

    var sayilar: Array<Int> = arrayOf(5, 10, 15, 20)
    var toplam = 0
    for (sayi in sayilar) {
        println(sayi)
        toplam += sayi
    }
    println("Toplam : " + toplam)   // 50

    for (i in 1..3) {
        for (j in 1..3) {
            println("$i * $j = " + (i * j))
        }
    }

    // 1 ile 100 arasındaki çift sayıların toplamı
    var ciftToplam = 0
    for (sayi in 1..100) {
        if (sayi % 2 == 0) {
            ciftToplam += sayi
        }
    }
    println("Çift sayıların toplamı : $ciftToplam") // 2550
}

// for (x in dizi, liste, range, string) {
//     // çalıştırılacak kodlar
// }
