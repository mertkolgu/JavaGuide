package com.kotlin._23.file

import java.io.FileNotFoundException
import java.io.FileReader

fun main() {
    var file: FileReader? = null

    try {
        file = FileReader("folders/kotlin.txt")
        var okunanVeri: Int = 0
        while (okunanVeri != -1) {
            print(okunanVeri.toChar())
            okunanVeri = file.read()
        }
    } catch (e: FileNotFoundException) {
        println(e.toString())
    } finally {
        file?.close()
    }

    var file2 = FileReader("folders/kotlin.txt")
    println("for each line ile okuma")
    file2.forEachLine { println(it) }
}
