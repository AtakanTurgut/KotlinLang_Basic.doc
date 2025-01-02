package com.atakanturgut.kotlinoop

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

        /* Encapsulation - Kapsülleme */
        var atakan = InsanSanatci("Atakan", 60, "Gitar")
        println(atakan.isim)
        atakan.isim = "atakan turgut"
        println(atakan.isim)

        atakan.sarkiSoyle() // şarkıcı şarkı söyledi: atakan turgut

        var yagmur = InsanSanatci("Yağmur", 40, "Bas Gitar")
        yagmur.sarkiSoyle() // şarkıcı şarkı söyledi: Yağmur

        //yagmur.sacRengi = "sarışın" // private olduğu için artık doğrudan değiştirilemez
        yagmur.setSacRengi("kızıl")
        yagmur.getSacRengi()

        yagmur.turuYazdir() // insan

        // yagmur.yas = 35 // val
        println(yagmur.yas) // 40

        // yagmur.gozRengi = "mavi" // private set
        println(yagmur.gozRengi)    // public get

        /* Inheritance - Kalıtım */
        val superKahraman = SuperKahraman("Süperman", "uçmak")
        superKahraman.kos() // Kahraman koştu

        val kahraman = SKahraman("Batman", "zengin olmak")
        kahraman.kos() // Kahraman koştu
        println(kahraman.isim)  // Batman

        // superKahraman >> kahraman - kahraman özelleştirilebilir
        //superKahraman.ozelKahraman() !!!
        kahraman.ozelKahraman()

        /* Polymorphism */
        // static polymorphism
        val islemler = Islemler()
        println(islemler.cikarma(10, 2))               // 8
        println(islemler.cikarma(10, 2, 3))         // 5
        println(islemler.cikarma(10, 2, 3, 5))   // 4

        // dynamic polymorphism
        val kedi = Hayvan()     // hayvan ses çıkardı
        val kopek = HKopek()    // köpek ses çıkardı

        val hayvanDizisi = arrayOf(kedi, kopek)
        hayvanDizisi.forEach {
            it.sesCikar()
        }

        /* Abstraction - Soyutlama */
        // Abstract Class - Interface

        //val insan = Insan()
        atakan.test()

        atakan.sarkiSoylemeFun()
        atakan.dansEtmeFun()
    }
}