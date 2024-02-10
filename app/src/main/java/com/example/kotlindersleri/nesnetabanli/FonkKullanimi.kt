package com.example.kotlindersleri.nesnetabanli

fun main() {

    val f = Fonksiyonlar()

    f.isminNe("Mehmet")

    val toplama = f.topla(24,36)
    println("toplam=  $toplama")

    f.giris("eagle",123424)

    val sonuc = 8 carpim 8
    println("64 mü?: $sonuc")


}

infix fun Int.carpim(sayi:Int) : Int {

    return this * sayi

}