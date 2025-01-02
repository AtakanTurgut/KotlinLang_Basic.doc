package com.atakanturgut.appemployeesproject

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

        /*

        1) Çalışanlar sınıfı oluştur
        2) Çalışanların isim, maaş, departman, yaş bilgileri olacak
        3) Örnek10 tane çalışan oluşturulacak, bir listede bu çalışanlar toplanacak
        4) İsim bilgileri sadece okunabilir olacak - calisan.isim = "asadasd" değişiklik yapılamayacak
        5) Maaş bilgileri okunabilir de olmayacak, yazılabilir de olmayacak - sadece maasGoster denilerek bir fonksiyonla okunabilir olacak
           Bu fonksiyon içerisine aldığı objenin maaşını gösterecek
        6) MainActivity içerisinde -> yasi 30'dan büyük olan ve departmanı Yazılım olan kişilerin maaşlarını tutan bir liste yapınız
        7) MainActivity içerisinde -> yasi 30'dan küçük olan kişilerin sadece isimlerini tutan bir liste yapınız

         */

        // 3)
        val calisan2 = Calisan("Buse", 55500, "Yazılım", 90)
        val calisan3 = Calisan("Cem", 17000, "Satış", 40)
        val calisan4 = Calisan("Deniz", 14000, "Muhasebe", 25)
        val calisan5 = Calisan("Ece", 13000, "İnsan Kaynakları", 29)
        val calisan6 = Calisan("Furkan", 11000, "Yazılım", 32)
        val calisan7 = Calisan("Gizem", 19000, "Pazarlama", 38)
        val calisan8 = Calisan("Hakan", 12500, "Satış", 42)
        val calisan9 = Calisan("Işıl", 16000, "Muhasebe", 27)
        val calisan10 = Calisan("Kaan", 13500, "İnsan Kaynakları", 31)

        var calisan1 = Calisan("Atakan", 10000, "Yazılım", 25)

        // 3)
        val calisanlar = arrayListOf(calisan1, calisan2, calisan3, calisan4, calisan5, calisan6, calisan7, calisan8, calisan9, calisan10)

        // 4)
        println(calisan1.isim)    // Atakan
        //calisan1.isim = "atakan"

        // 5)
        //println(calisan1.maas)
        //calisan1.maas = 12000
        calisan1.maasGoster()     // 10000

        println("---")

        // 6)
        val yasiOtuzdanBuyukCalisanlarinDepartmani = calisanlar.filter { it.yas > 30 }.filter { it.departman == "Yazılım" }.map { it.maasGoster() }
        // 55500 - 11000
        println("---")

        // 7)
        val yasiOtuzdanKucukCalisanlar = calisanlar.filter { it.yas < 30 }.map { it.isim }
        yasiOtuzdanKucukCalisanlar.forEach { println(it) }
        // Atakan - Deniz - Ece - Işıl
    }
}