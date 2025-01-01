package com.atakanturgut.firstapp

fun main() {
    /* IF Statements - IF Kontrolleri */
    println("----- IF Statement -----")

    println(3 > 5) // false

    var sayi = 10
    sayi = sayi + 1
    println(sayi) // 11
    sayi++
    println(sayi) // 12

    /* remainder - kalanı bulma */
    println(10 % 3) // 1

    val skor = 200

    if (skor < 10) {
        println("oyunu kaybettiniz")
    } else if (skor >= 10 && skor < 20) {
        println("oyunda idare eder bir skor aldınız")
    } else if (skor >= 20 && skor < 30) {
        println("oyunda iyi bir skor elde ettiniz")
    } else {
        println("skorunuz çok iyi tebrikler")
    }

    /* WHEN Statements - WHEN Kontrolleri */
    println("----- WHEN Statement -----")

    val notRakam = 6
    var notDurum = ""

    if (notRakam == 0) {
        notDurum = "Geçersiz Not"
    } else if (notRakam == 1) {
        notDurum = "Zayıf"
    }

    when(notRakam) {
        0 -> notDurum = "Geçersiz Not"
        1 -> notDurum = "Zayıf"
        2 -> notDurum = "Kötü"
        3 -> notDurum = "Orta"
        4 -> notDurum = "İyi"
        5 -> notDurum = "Pek İyi"
        else -> notDurum = "Tanımlı Not Değil"
    }

    println(notDurum)
}