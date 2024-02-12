package com.example.kotlindersleri.nesne_tabanli_programlama

class Odev2 {
    fun kilometreyiMileCevirme(kilometre:Double):Double{
        val mile = (kilometre * 0.621)
        return mile
    }

    fun dikdörtgenAlaniHesaplama(uzunKenar:Double ,kisaKenar:Double){
        if(uzunKenar>=kisaKenar){
            val alan = (uzunKenar * kisaKenar)
            println("Dikdörgen Alanı : $alan")
        }else{
            println("Uzun kenar bilgisi kısa kenardan daha kısa olamaz.")
        }
    }

    fun faktoriyelHesaplama(sayi:Int):Int{
        var sonuc=1

        if(sayi>1){
            for(i in 1..sayi){
                sonuc=sonuc*i
            }
        }
        return sonuc
    }

    fun eSayaci(kelime:String){
        var sayac=0
        var kucukHarfliKelime = kelime.lowercase()

        for (i in kucukHarfliKelime){
            if(i == 'e'){
                sayac++
            }
        }
        println("'$kelime' kelimesinde $sayac tane 'e' harfi geçmektedir.")
    }

    fun icAciToplamiHesabi(kenarSayisi:Int):Int{
        val icAci = ((kenarSayisi - 2) * 180)
        return icAci
    }

    fun maasHesaplama(günSayisi:Int):Int{
        val saat = günSayisi*8
        var maas = 0
        if(saat<150){
            maas = 40 * saat
        }
        else{
            maas = 40 * 150
            maas = maas + ((saat-150) * 80)
        }
        return maas
    }

    fun otoparkUcreti(otoparkSuresi:Int):Int{
        var otoparkUcreti = 0
        if(otoparkSuresi == 1){
            otoparkUcreti = 50
        }
        if(otoparkSuresi>1){
            for(i in 1..otoparkSuresi){
                if(i == 1){
                    otoparkUcreti = 50
                }else{
                    otoparkUcreti = otoparkUcreti + (50 + ((i-1) * 10))
                }
            }
        }

        return otoparkUcreti
    }

}