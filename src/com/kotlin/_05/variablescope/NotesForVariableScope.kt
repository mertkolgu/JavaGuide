package com.kotlin._05.variablescope

var sayi: Int = 10

fun main() {

    run {
        var seviye1: Int = 1
        run {
            println(seviye1)
            // println(seviye2) -> kullanamayız çünkü bu blok içinde tanımlı değil
        }

        var seviye2: Int = 5
        run {
            println(seviye1)
            println(seviye2)

            var seviye3: Int = 20
            run {
                println(seviye1)
                println(seviye2)
                println(seviye3)
            }
        }
        // println(seviye3) -> kullanamayız çünkü bu blok içinde tanımlı değil
    }
}

// static > instance > local
// scope'a göre sıralama

// static değişkenler class load edildiğinde hazırdır. proje durana kadar JVM çalıştığı sürece vardır.
// instance değişken obje varsa vardır, obje temizlenirse(Garbage Collection) bu değişken de uçar.
// local değişken metot çalışınca vardır, metot tamamlanınca uçar. (stack)