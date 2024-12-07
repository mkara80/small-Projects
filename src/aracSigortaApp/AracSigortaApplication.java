package aracSigortaApp;

/*
Proje: Araç Sigorta Prim Hesaplama
       Araç tipleri:otomobil, kamyon, otobüs, motosiklet
                    -otobüs: 18-30 koltuk veya 31 ve üstü koltuk

       Tarife dönemi:Aralık 2023,Haziran 2023
          1.dönem :Haziran 2023               2.dönem:Aralık 2023
          otomobil: 2000                       otomobil: 2500
          kamyon:   3000                       kamyon:   3500
          otobüs: tip1: 4000 tip2: 5000        otobüs: tip1: 4500 tip2: 5500
          motosiklet: 1500                     motosiklet: 1750

        1-Tekrar tekrar kullanılan bir seçim menüsü(form) gösterelim.
        2-Tarife dönemi bilgisi,araç tipi bilgilerini kullanıcıdan alalım.
        3-Hatalı girişte hesaplama başarısız uyarısı verip tekrar menü(form) gösterilsin.
        4-Menüde yeni işlem veya çıkış için seçenek sunulsun .
        5-tarife dönemi ve araç tipine göre sigorta primi hesaplansın.
 */

import java.util.Scanner;

public class AracSigortaApplication {
    public static void main(String[] args) {

       //  1.Uygulamayi baslatan bir method yazilacak
       start();

    }

   public static void start() {
        // 2.Kullanicidan bilgi almak

       Scanner input = new Scanner(System.in);
       boolean isAgain;

       // 3.Tekrar tekrar menu gosterilsin

       do {
           System.out.println("----Zorunlu Arac Sigorta Primi Hesaplama----");
           System.out.println("Tarife Donemi Seciniz : ");
           System.out.println(" 1. Haziran 2024 : ");
           System.out.println(" 2. Aralik 2024 : ");

           int term = input.nextInt();
           String termName = term== 1 ? "Haziran 2024" : "Aralik 2024";

           // tarife donemi dogru girilirse isleme devam edilir hatali ise
           // uyari mesaji gosterilir ve yeniden form gosterilir.






       }while ();


   }





}
