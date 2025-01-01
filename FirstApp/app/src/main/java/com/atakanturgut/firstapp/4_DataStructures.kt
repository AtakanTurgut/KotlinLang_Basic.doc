package com.atakanturgut.firstapp

fun main() {
    // Data Structures - Veri Yapıları - Koleksiyonlar

    // Array - Diziler
    println("----- Array -----")

    val stringIsim  = "atakan"

    val benimDizim = arrayOf(stringIsim, "turgut", "furkan", "yağmur") // Array<String>
    // 0 1 2 3 4 ...

    println(benimDizim[0])  // atakan
    println(benimDizim[1])  // turgut
    println(benimDizim.last())  // yağmur

    benimDizim[1] = "fatih"
    println(benimDizim[1])  // fatih
    println(benimDizim.get(3))  // yağmur

    /* ArrayIndexOutOfBoundsException
    benimDizim[5] = "görkem"
    println(benimDizim[5])
    */

    val numaraDizisi = arrayOf(1, 10, 20, 15, 2, 4)
    println(numaraDizisi[3] * 10) // 150

    val karisikDizi = arrayOf(10, 3.14, 2, "atakan", false, true)
    println(karisikDizi[2]) // 2

    // ArrayList - Listeler
    println("----- ArrayList -----")

    val isimListesi = arrayListOf(stringIsim, "turgut", "furkan", "yağmur") // ArrayList<String>
    // 0 1 2 3 4 ...

    println(isimListesi[0])  // atakan
    println(isimListesi[1])  // turgut
    println(isimListesi.last())  // yağmur

    println(isimListesi.size)  // 4

    isimListesi.add("fatih")
    println(isimListesi.get(4)) // fatih

    isimListesi[4] = "osman"
    println(isimListesi.get(4)) // osman

    //isimListesi.remove("turgut")  .removeAt(1)

    val numaraListesi = arrayListOf<Int>()
    var digerNumaraListesi = ArrayList<Int>()

    numaraListesi.add(10)   // 0
    numaraListesi.add(20)   // 1
    numaraListesi.add(30)   // 2

    digerNumaraListesi.add(40)  // 0
    digerNumaraListesi.add(50)  // 1
    digerNumaraListesi.add(60)  // 2

    println(numaraListesi[1] * digerNumaraListesi[2]) // 20 * 60 = 1200

    //numaraListesi.add("atakan")

    val karisikListe = arrayListOf(10, 3.14, 2, "atakan", false, true)
    val karisiBosListe = arrayListOf<Any>()

    karisiBosListe.add(10)
    karisiBosListe.add(3.14)
    karisiBosListe.add(2)
    karisiBosListe.add("atakan")
    karisiBosListe.add(false)
    karisiBosListe.add(true)

    println(karisiBosListe.get(0)) // 10

    // Set
    println("----- Set -----")  // iki tane aynı değeri içerik olarak saklayamazsın

    val ornekDizi = arrayOf(10, 10, 10, 10, 20, 30, 40)
    println(ornekDizi.get(0)) // 10
    println(ornekDizi.get(1)) // 10

    val ornekIntSet = setOf(10, 10, 10, 10, 20, 30, 40) // setOf<Int>()

    println(ornekIntSet.size)  // 4

    /* unordered
    ornekIntSet.get(0)
    ornekIntSet[0]
    */

    ornekIntSet.forEach {
        println(it)     // 10 20 30 40
    }

    val bosStrSet = HashSet<String>()

    bosStrSet.add(stringIsim)
    bosStrSet.add("atakan")
    bosStrSet.add("atakan")
    bosStrSet.add("furkan") // lifo

    bosStrSet.forEach {
        println(it)     // furkan atakan
    }

    val ornekTekilSet = ornekDizi.toHashSet()

    ornekTekilSet.forEach {
        println(it) // 20 40 10 30
    }

    // Map - Dictionary - Sözlük
    println("----- Map -----")  // anahtardan yalnızca bir tane olabilir
    // Key - Value Pairing |  Anahtar - Değer Eşleştirmesi

    val yemekDizisi = arrayListOf("Elma", "Armut", "Muz")
    val kaloriDizisi = arrayListOf(100, 150, 200)

    println("Elma kalorisi 100")
    println("${yemekDizisi[0]} kalorisi ${kaloriDizisi[0]}")

    val yemekKaloriMapi = hashMapOf<String, Int>()      // HashMap<String, Int>
    yemekKaloriMapi.put("Elma", 100)
    yemekKaloriMapi.put("Armut", 150)
    yemekKaloriMapi.put("Muz", 200)

    println(yemekKaloriMapi["Elma"]) // 100
    println(yemekKaloriMapi.get("Armut")) // 150

    yemekKaloriMapi.put("Elma", 300)
    println(yemekKaloriMapi.get("Elma")) // 300

    val ornekhashMap = HashMap<String, String>()
    ornekhashMap.put("atakan", "turgut")
    ornekhashMap.put("furkan", "üvenç")
    //ornekhashMap.put("yağmur", 11123) !!!
    ornekhashMap.put("yağmur", "soydan")
}