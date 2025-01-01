package com.atakanturgut.firstapp

fun main() {
    // Data Types and Variables - Veri Tipleri ve Değişkenler

    /* Integer - Tam Sayılar */
    println("----- Integer -----")

    // implicit - örtük tanımlama
    var x = 10 // Int
    println(x) // 10
    println(x * 20) // 200

    x = 30
    println(x) // 30

    var y = 5 // Int
    println(y) // 5
    println(x + y) // 35

    val z = 20 // Int
    //z = 30 // unchangeable - sabit bir değer değiştirilemez
    println(z * 15) // 300

    // explicit - açık tanımlama
    var ornekInt : Int  = 10  // Int
    println(ornekInt::class.simpleName)

    var ornekLong : Long = 10  // Long
    println(ornekLong::class.simpleName)

    var ornekShort : Short = 10  // Short
    println(ornekShort::class.simpleName)

    var ornekByte : Byte = 10  // Byte
    println(ornekByte::class.simpleName)
    //ornekByte = 10000 !!!

    val m = 10
    val n = 20
    val sonuc = m + n
    println(sonuc) // println(m + n) 30

    /* Double / Float - Kesirli Sayılar */
    println("----- Double / Float -----")

    val pi = 3.141592 // Double
    println(pi * 2) // 6.283184

    println(5 / 2) // 2
    println(5.0 / 2) // 2.5

    val ornekDouble = 3.2
    val ornekDoubleSonuc = pi * ornekDouble
    println(ornekDoubleSonuc) // 10.0530944

    val ornekFloat : Float = 2.25f
    println(ornekFloat * 2) // 4.5

    /* String - Metinler */
    println("----- String -----")

    val benimStringim = "Benim String'im"
    println(benimStringim)

    val ornekString : String = "örnek"

    val isim = "Atakan"
    println(isim.uppercase())   // ATAKAN
    println(isim.lowercase())   // atakan

    val soyisim = "Turgut"
    println(isim + soyisim) // AtakanTurgut
    println(isim + " " + soyisim) // AtakanTurgut

    /* Boolean */
    println("----- Boolean -----")

    var benimBool : Boolean = true
    benimBool = false

    println(benimBool) // false

    // <   küçüktür
    // >   büyüktür
    // <=   küçük eşit
    // >=   büyük eşit
    // ==   eşittir
    // !=   eşit değildir
    // &&   ve
    // ||   veya

    println(3 > 5)  // false
    println(3 < 5)  // true
    println(3 == 5) // false
    println(5 == 5) // true

    val kullaniciYasi = "35"
    println(kullaniciYasi.toInt() > 18) // true

    println(10 != 10) // false
    println("atakan" == "atakan") // true

    println(4 > 3 && 3 > 5) // false ->  1 0 = 0
    println(4 > 3 || 3 > 5) // true ->   1 0 = 1

    /* Unsigned Variables */
    println("----- Unsigned Variables -----")
    var unsignedInt : UInt  = 10u  // UInt
    println(unsignedInt::class.simpleName)

    var unsignedLong : ULong = 10u  // ULong
    println(unsignedLong::class.simpleName)

    var unsignedShort : UShort = 10u  // UShort
    println(unsignedShort::class.simpleName)

    var unsignedByte : UByte = 10u  // UByte
    println(unsignedByte::class.simpleName)
}
