package com.atakanturgut.functionalprogramming

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        /* Lambda */
        println("------ Lambda ------")
        yazdigimiYazdir("atakan")   // atakan

        val yazdigimiYazdirLambda = {
            verilenString: String -> println(verilenString)
        }  // () -> Unit

        yazdigimiYazdirLambda("yazdır test")    // yazdır test

        val carpmaIslemiLambda = {a: Int, b: Int -> a * b}
        val sonuc = carpmaIslemiLambda(3, 5)
        println(sonuc) // 15

        val carpmaIslemiIkinciVersiyonLambda : (Int, Int) -> Int = {a, b -> a * b}
        println(carpmaIslemiIkinciVersiyonLambda(5, 3)) // 15

        /* Higher Order Functions - Yüksek Dereceli Fonksiyonlar */
        println("------ Higher Order Functions ------")

        val benimListem = arrayListOf(1, 3, 5, 7, 9, 11, 13, 15, 17, 19)
        /*
        val kucukSayilarListesi = benimListem.filter { num -> num < 10 }
        for (numara in kucukSayilarListesi) {
            println(numara) // 1, 3, 5, 7, 9,
        }
        */

        var bosListe = arrayListOf<Int>()
        for (numara in benimListem) {
            if (numara < 10) {
                bosListe.add(numara)
            }
        }

        val kucukSayilarYeniListesi = benimListem.filter { it < 10 }
        for (numara in kucukSayilarYeniListesi) {
            println(numara) // 1 3 5 7 9
        }

        /* Map */
        println("------ Map ------")
        val karesiAlinmisSayilar = benimListem.map {it * it}
        for (numara in karesiAlinmisSayilar) {
            println(numara)     // 1 9 25 49 81 121 169 225 289 361
        }

        /* Map && Filter */
        val mapFilterBirArada = benimListem.filter { it < 10 }.map { it * it }
        mapFilterBirArada.forEach {
            println(it)     // 1 9 25 49 81
        }

        val sanatci1 = Sanatci("Atakan", 25, "Gitar")
        val sanatci2 = Sanatci("Furkan", 20, "Bas Gitar")
        val sanatci3 = Sanatci("Yağmur", 24, "Piyano")

        val sanatcilar = arrayListOf<Sanatci>(sanatci1, sanatci2, sanatci3)

        val yirmidenBuyukSanatciEnstrumanlari = sanatcilar.filter { it.yas > 20 }.map { it.enstruman }
        yirmidenBuyukSanatciEnstrumanlari.forEach { println(it) }   // Gitar, Piyano

        val yirmiikidenKucukSanatciIsimleri = sanatcilar.filter { it.yas < 22 }.map { it.isim }
        yirmiikidenKucukSanatciIsimleri.forEach { println(it) }     // Furkan

        /* Scope Functions */
        println("------ Scope Functions ------")

        // let
        var benimInteger : Int? = null
        benimInteger = 4

        benimInteger?.let {
            println(it)     // 4
        }

        val yeniInteger = benimInteger?.let { it + 1 } ?: 0
        println(yeniInteger)    // 5

        // also
        sanatcilar.filter { it.yas > 20 }.also { it.forEach{ println(it.enstruman) }} // it -> com.atakanturgut.functionalprogramming.Sanatci@554b48d
    }

    fun yazdigimiYazdir(string: String) {
        println(string)
    }
}