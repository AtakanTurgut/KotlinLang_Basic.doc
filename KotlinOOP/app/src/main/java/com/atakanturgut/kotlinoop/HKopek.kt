package com.atakanturgut.kotlinoop

class HKopek : Hayvan() {
    fun havla() {
        println("köpek havladı")
        super.sesCikar()
        // super -> kalıtım alınan sınıfa referans verir
    }

    // kalıtım alındığı için "override" edilmeden bu fonksiyon tkrar kullanılamaz
    override fun sesCikar() {
        println("köpek ses çıkardı")
    }
}