package com.atakanturgut.classesandfunctions

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

//var benimDegisken = 10  global

class MainActivity : AppCompatActivity() {
    var count = 0

    lateinit var benimKahraman: SuperKahraman   // later initialize

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        println("onCreate çalıştırıldı")

        // lateinit
        benimKahraman = SuperKahraman("Atakan", 24,"Yazılım")

        birinciFonksiyon()
        birinciFonksiyon()
        ikinciFonksiyon()

        cikarma(10, 20)
        toplama(10, 20)

        val cikarmanSonuc = cikarma(3, 5)   // UNIT
        val toplamaSonuc = toplama(3, 5)    // * 5  // INT

        println(cikarmanSonuc)  // kotlin.Unit
        println(toplamaSonuc)   // 8

        val superman = SuperKahraman("Clark Kent", 30, "Gazeteci")
        println(superman.yas)   // 30

        /*
        val batman = SuperKahraman()
        batman.yas = 35
        batman.isim = "Bruce Wayne"
        batman.meslek = "Patron"
        */

        /* Nullability - Geçersiz olma durumu */
        val kullaniciGirdisi = "atakan"
        val kullaniciGirdisiInt = kullaniciGirdisi.toIntOrNull()    // Int?

        if (kullaniciGirdisiInt != null) {
            println(kullaniciGirdisiInt * 2)
        }

        var benimDouble : Double? = null

        val kullaniciGirdisiDouble = kullaniciGirdisi.toDoubleOrNull()

        // !! ->  non-null  -> % 100 null gelmeyevek - uygulamayı çökertir
        //kullaniciGirdisiDouble!!.div(2)

        if (kullaniciGirdisiDouble != null) {
            println(kullaniciGirdisiDouble * 2)  // 20
        }

        // ? - save
        kullaniciGirdisiDouble?.div(2)

        // ?: elvis operator - değeri var ise onu kullan eğer null ise sağdaki default durumu kullan
        println(kullaniciGirdisiDouble?.div(2) ?: 20) // 20

        kullaniciGirdisiDouble?.let {
            println(it * 2) // 20
        }

    }

    fun testFoksiyonu() {
        //count = 10
        var x = 10

        //println(benimKahraman.isim) benimKahraman tanımlaması bu fonksiyon çağırılmadan önce yapılmalıdır
    }

    fun birinciFonksiyon() {
        count++
        println("birinci fonksiyon çalıştırıldı ${count}")
        //x = 10 unresolved
    }

    fun ikinciFonksiyon() {
        println("ikinci fonksiyon çalıştırıldı")
        println(benimKahraman.isim)
    }

    // input - girdi alma
    fun cikarma(a: Int, b: Int) {   // UNIT
        println("Çıkarma Sonucu: ${a - b}")
    }

    // output - çıktı vermek -> döndürmek - return
    fun toplama(a: Int, b: Int) : Int { // INT
        println("Toplama Sonucu: ${a + b}")
        return a + b
    }

}