package com.kotlin._23.file

import java.io.FileWriter

fun main() {
    // dosya oluşturma
    var file = FileWriter("folders/kotlin.txt", true)

    print("Adınızı giriniz : ")
    var isim = readLine()!!

    file.write(isim + "\n")
    file.write("Yaş : 23\n")
    println("Veri dosyaya yazıldı.")
    file.close()
}
