package com.atakanturgut.appemployeesproject

// 1)
class Calisan(val isim: String, maas: Int, var departman: String, var yas: Int) {
    // 2)

    private val _maas = maas

    fun maasGoster() {
        println(_maas)
    }
}