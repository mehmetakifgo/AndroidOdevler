package com.example.kotlindersleri.nesnetabanli

class Fonksiyonlar {

    fun isminNe(isim:String) {

        val sonuc = "Merhaba $isim"
        println(sonuc)

    }

    fun topla(sayi1:Int, sayi2:Int) : Int {

        val sonucc= sayi1 + sayi2

        return sonucc
    }

    fun giris(kullaniciAdi:String, sifre:Int) {

        val sonuccc = "Merhaba $kullaniciAdi, şifreniz: $sifre"

        println(sonuccc)

    }


}