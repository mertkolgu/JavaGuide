package com.kotlin._17.classes

class Kisi(val id: Int, val isim: String)

data class KisiData(val id: Int, val isim: String)

fun main() {

    val mert = Kisi(1, "Mert")
    val oguz = Kisi(2, "Oğuz")
    val mertKopya = mert
    val test = Kisi(1, "Mert")

    println(mert.toString())        // com.kotlin._17.classes.Kisi@1ddc4ec2
    println(mert.hashCode())        // 500977346
    println(mert.equals(oguz))      // false
    println(mert.equals(mertKopya)) // true
    println(mert.equals(test))      // false

    println("******************************")

    val mertd = KisiData(1, "Mert")
    val oguzd = KisiData(2, "Oğuz")
    val mertKopyad = mertd
    val testd = KisiData(1, "Mert")

    println(mertd.toString())           // KisiData(id=1, isim=Mert)
    println(mertd.hashCode())           // 2394649
    println(mertd.equals(oguzd))        // false
    println(mertd.equals(mertKopyad))   // true
    println(mertd.equals(testd))        // true

    val kopyaOguz = oguzd.copy()
    println("Kopya Oğuz : $kopyaOguz")
    println("Kopya Oğuz farklı id : ${oguzd.copy(id = 80)}")

    var (id, isim) = mertd
    println("$id $isim")
}