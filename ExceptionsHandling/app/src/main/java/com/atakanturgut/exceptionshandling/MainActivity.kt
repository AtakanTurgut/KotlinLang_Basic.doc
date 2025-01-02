package com.atakanturgut.exceptionshandling

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    var globalX = 10

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        /* Exceptions Handling */
        println("------ Exceptions Handling ------")
        /*
        val ornekString = "atakn"
        val integerString = ornekString.toInt()
        */

        val sonuc1 = intOrNullFpnksiyonu("10")
        println(sonuc1)

        val sonuc2 = intOrNullFpnksiyonu("atakan")
        println(sonuc2)

        /* Debugging */
        println("------ Debugging ------")

        println(globalX)
        ornekFuonksiyon2()
        ornekFuonksiyon1()

        // breakpoint
    }

    fun intOrNullFpnksiyonu(str: String) : Int? {
        try {
            val numara = str.toInt()
            return numara   // return str.toInt()
        } catch (e : NumberFormatException) {
            e.printStackTrace()
        } catch (e : Exception) {
            e.printStackTrace()
        }

        return null
    }

    fun ornekFuonksiyon1() {
        globalX = 20
        println(globalX)
    }

    fun ornekFuonksiyon2() {
        globalX = 30
        println(globalX)
    }
}