package com.kotlin._08.loops

fun main() {
    for (i in 1..10) {
        println(i)
        if (i == 7) {
            break
        }
    }

    for (harf in "mertkolgu@outlook.com") {
        if (harf == '@') {
            break
        }
        print(harf)
    }
}
