package com.example.kotlindersleri.nesne_tabanli_programlama

fun main() {
    val odev2 = Odev2()
    val kilometre = 5.0
    val sonuc1 = odev2.kilometreyiMileCevirme(kilometre)

    println("$kilometre kilometre = $sonuc1 mildir.")

    odev2.dikdörtgenAlaniHesaplama(10.0,3.0)

    val sayi = 5
    val sonuc2 = odev2.faktoriyelHesaplama(sayi)
    println("$sayi! = $sonuc2")

    odev2.eSayaci("Eldiven")

    val kenarSayisi = 5
    val sonuc3 = odev2.icAciToplamiHesabi(kenarSayisi)
    println("İç açı toplamı $sonuc3 derecedir.")

    val gunSayisi= 20
    val ucret = odev2.maasHesaplama(gunSayisi)
    println("$gunSayisi Gün Maaşı = $ucret ₺")

    val otoparkSuresi = 5
    val otoparkUcreti = odev2.otoparkUcreti(otoparkSuresi)
    println("$otoparkSuresi Saat Otopark Ücreti = $otoparkUcreti ₺")

}