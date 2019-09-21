package com.kotlin._23.function

class LamdaTest {

    fun ikiSayiyiTopla(sayi1: Int, sayi2: Int, action: (Int, Int) -> Int) {
        val toplam = action(sayi1, sayi2)
        println(toplam)
    }

    fun terstenYaz(yazi: String, myFunc: (String) -> String) {
        var terstenYazi = myFunc(yazi)
        println(terstenYazi)
    }
}

fun main() {

    var lambda = LamdaTest()
    lambda.ikiSayiyiTopla(9, 12, { sayi1: Int, sayi2: Int -> sayi1 + sayi2 })
    lambda.ikiSayiyiTopla(9, 12) { sayi1: Int, sayi2: Int -> sayi1 + sayi2 }

    lambda.terstenYaz("mert", { yazi: String -> yazi.reversed() })
    lambda.terstenYaz("mert") { yazi: String -> yazi.reversed() }
    lambda.terstenYaz("mert") { it.reversed() } // tek parametreli function
}