package com.example.kotlindersleri.giris

class Kt (var hiz : Int, var renk : String, var calisiyorMu : Boolean) {

    fun bilgiAl() {

        println("-----------------------------")
        println("Hız: ${hiz}")
        println("Çalışıo?: ${calisiyorMu}")
        println("Renk: ${renk}")

    }

    fun isminNe(isim:String) {

        val sonuc = "Merhaba kaşarant $isim"

        println(sonuc)

    }


}