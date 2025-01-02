package com.atakanturgut.kotlinoop

// "open" ile kalıtım verilebiliyor
open class Hayvan {

    // eğer bir metot override edilecekse o metot da "open" olarak belirtilmeli
    open fun sesCikar() {
        println("hayvan ses çıkardı")
    }
}