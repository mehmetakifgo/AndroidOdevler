package com.example.kotlindersleri.nesnetabanli

fun main() {

    val od=Odev2()
    od.kmtoMile(10.0)

    od.dikdortgen(5,10)

    var faktor = od.faktor(5)
    println("Girilen sayının faktöriyeli: $faktor")

    od.kaceVar("Muvaffakiyetsizleştirememek")

    od.faktori(8)

    val icacittt = od.icAci(4)
    println("Girdiğiniz kenar sayısı iç açı toplamı: $icacittt")

    od.maasHesapla(18,10)

    val faturam = od.otoPark(1)
    println("Girdiğiniz saatin park faturası: $faturam")

    od.timePark(5)

}