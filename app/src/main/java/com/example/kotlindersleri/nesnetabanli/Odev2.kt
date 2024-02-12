package com.example.kotlindersleri.nesnetabanli

class Odev2 {

    fun kmtoMile(km:Double)  {

        val sonuc = km*0.621

        println("Giriş yapmış olduğun km: $km nin mil karşılığı: $sonuc tur. bb")

    }

    fun dikdortgen(kk:Int,uk:Int) {

        val sonuc = kk*uk

        println("Kısa kenarı $kk, uzun kenarı $uk olan dikdörtgenin alanı: $sonuc")

    }

    fun faktor(sayi:Int) : Long {

        var fact : Long = 1
        var i = 1
        while (i <= sayi) {

            fact *= i.toLong()
            i++

        }

        return(fact)
    }

    fun kaceVar(kelime:String) {

        var count = 0
        for (element in kelime) {

            if (element == 'e') {
                count++
            }

        }
        println("Girdiğiniz $kelime içerisinde $count kadar 'e' harfi vardır.")
    }

    fun faktori (sayii: Int) {

        var faktoriiel : Long = 1
        var i = 1

        while (i <= sayii) {

            faktoriiel *= i.toLong()
            i++

        }

        println("girmiş olduğunuz $sayii sayısının faktoriyeli $faktoriiel")

    }

    fun icAci (kenarSayisi : Int) : Int {

        var icaciTop = (((kenarSayisi - 2)*180)/kenarSayisi)

        return(icaciTop)
    }

    fun maasHesapla (kacgunCalistin : Int, kacsaatMesai : Int) {

        var maas = (kacgunCalistin*320)+(kacsaatMesai*80)

        if (kacgunCalistin < 19) {

            maas=maas-(kacsaatMesai*80)

        }
        println("$kacgunCalistin gün çalıştınız ve maaşınız $maas")
    }

    fun otoPark (kacSaatpark : Int) : Int {

        var fatura = 50

        if (kacSaatpark>1) {

            fatura = ((kacSaatpark-1)*10)+50

        }
        return(fatura)
    }

    fun timePark (time : Int) {

        var faturaniz = 0

        if (time == 1) {
            faturaniz = 50
        } else {
            faturaniz = ((time-1)*10)+50
        }
        println("Otoparkımızda kalmış olduğunuz $time saat boyunca faturanız $faturaniz olarak hesaplanmıştır.")
    }

}