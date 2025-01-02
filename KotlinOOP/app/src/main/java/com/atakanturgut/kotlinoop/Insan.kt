package com.atakanturgut.kotlinoop

// Soyut sınıfların objeleri oluşturulamaz fakat kalıtım verebilir
abstract class Insan {
    // bu yapıda referans alan sınıflar bu metodu override etmek zorundadır
    abstract  fun test()

    /*
    open fun test() {
        println("test")
    }
    */
}