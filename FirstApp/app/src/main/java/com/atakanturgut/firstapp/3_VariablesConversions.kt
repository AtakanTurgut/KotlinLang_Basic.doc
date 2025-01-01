package com.atakanturgut.firstapp

fun main() {
    val benimStr : String
    // benimStr.uppercase()
    benimStr = "benim stringim" // initialize, init, initialization

    val yas = "15"
    val ornekDeger = "20"
    println(yas + ornekDeger) // 1520

    // Conversion
    val yasInt = yas.toInt() // 15
    val yasByte = yas.toByte() // 15
    val yasLong  = yas.toLong() // 15

    val ornekDegerInt = ornekDeger.toInt() // 20

    println(yasInt * ornekDegerInt) // 15 * 20 = 300
    println(yasByte) // 15
    println(yasLong) // 15

    val strYas = "on beş"
    // val strYasInt = strYas.toInt() NumberFormatException
    // println(strYasInt)
}