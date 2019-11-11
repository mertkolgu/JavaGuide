package com.kotlin._24.function

class Topla {
    fun ikiSayiyiTopla(sayi1: Int, sayi2: Int) {
        val toplam = sayi1 + sayi2
        println(toplam)
    }

    fun ikiSayiyiTopla(sayi1: Int, sayi2: Int, action: ToplamGosteren) {
        val toplam = sayi1 + sayi2
        action.toplamGosteren(toplam)
    }

    fun ikiSayiyiTopla(sayi1: Int, sayi2: Int, action: (Int) -> Unit) {
        val toplam = sayi1 + sayi2
        action(toplam)
    }
}

interface ToplamGosteren {
    fun toplamGosteren(toplam: Int)
}

fun main() {
    var obje = Topla()
    obje.ikiSayiyiTopla(3, 5)

    obje.ikiSayiyiTopla(6, 10, object : ToplamGosteren {
        override fun toplamGosteren(toplam: Int) {
            println(toplam)
        }
    })
    // lambda expression
    var lambdaExpression = { sayi: Int -> println(sayi) }

    obje.ikiSayiyiTopla(9, 15, lambdaExpression)
    obje.ikiSayiyiTopla(9, 15, { sayi: Int -> println(sayi) })
}

// lambda expression -> isimsiz bir function
