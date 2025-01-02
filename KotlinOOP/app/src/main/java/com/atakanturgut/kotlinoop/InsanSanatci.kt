package com.atakanturgut.kotlinoop

// extends abstract - implement interface
class InsanSanatci(var isim: String, val yas: Int, val enstruman: String) : Insan(), ISarki, IDans{
    // var: get set -- val: get
    // "var" yerine "val" olursa değiştirilemez - private set public get
    // başına bir şey koyulmazsa o değere ulaşılamaz

    // Bir sınıfta sadece bir sınıftan kalıtım alabilirsin - Super Type bir tane olabilir

    private var sacRengi = ""

    private var tur = "insan"

    var gozRengi = ""
        private set
        public get

    fun sarkiSoyle() {
        println("şarkıcı şarkı söyledi: ${this.isim}")
    }

    fun turuYazdir() {
        println(this.tur)
    }

    fun setSacRengi(yeniSacRengi: String) {
        this.sacRengi = yeniSacRengi
    }

    fun getSacRengi() {
        println(this.sacRengi)
    }

    override fun test() {
        // bu abstract sınıftan gelen abstract metodun override edilmiş hali
    }

    override fun sarkiSoylemeFun() {    // ISarki
        TODO("Not yet implemented")
    }

    override fun dansEtmeFun() {    // IDans
        TODO("Not yet implemented")
    }

    // super class da olduğu için override elimelidir
    //override fun test() {}

    /*
    init {
        println("init çağırıldı")
    }
    */
}