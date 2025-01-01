package com.atakanturgut.firstapp

fun main() {
    /* WHILE Loop - WHILE Döngüsü */
    println("----- WHILE Loop -----")

    var j = 0

    while (j < 10) {
        println(j)
        j++             // j = j + 1
    }

    println(j) // 10

    /* FOR Loop - FOR Döngüsü */
    println("----- FOR Loop -----")

    val numaraDizi = arrayListOf(5, 10, 15, 20, 25, 30)

    println(numaraDizi[0] / 5 * 3) // 3
    println(numaraDizi[1] / 5 * 3) // 6

    println("döngü başladı")
    for (numara in numaraDizi) {
        println(numara / 5 * 3)
    }
    println("döngü bitti")

    // range 0..9
    for (numara in 0..9) {
        println(numara * 10)
    }

    val stringDizi = ArrayList<String>()
    stringDizi.add("Atakan")
    stringDizi.add("Furkan")
    stringDizi.add("Yağmur")

    for (kelime in stringDizi) {
        println(kelime.uppercase())
    }

    stringDizi.forEach {
        //kelime -> println(kelime.lowercase())
        println(it.lowercase())
    }

}