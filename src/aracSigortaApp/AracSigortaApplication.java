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
    public static void main(String[] args) {        // Atomik yapı==> sapsade dupduru hal

        // 1. Uygulamayı başlatan bir method yazacağız(method yazmamızın sebebi tekrar tekrar kullanabilmemiz)
        start();
    }
    public static void start(){    //main method içerisinde obje kullanmadan bir methodu (start'ı)çağırmak istiyorsak static olmalı

        // 2. kullanıcıdan bilgi alma
        Scanner input = new Scanner(System.in);
        boolean isAgain;

        // 3. tekrar tekrar menü gösterilsin. bu yüzden while ya da Do while kullanırız. do while bir kere baştan çalışır direkt.


        do {
            System.out.println("----Zorunlu Arac Sigorta Primi Hesaplama");
            System.out.println("Tarife Dönemi Giriniz");
            System.out.println("1. Haziran 2023");
            System.out.println("2. aralık 2023");


            int term =input.nextInt();//====>> bu kullanıcının değer verebilmesini almamızı sağlar
            String termName=term==1?"Haziran 2023":"Aralık 2023";


            int select;
            // tarife dönemi doğru girilirse işleme devam et hatalı ise uyarı mesajı ver ve yeniden form gönder
            if (term==1||term==2){

                // 4.arac objesi oluşturalım
                Arac arac =new Arac(); //default .......consructor(yapıcı method)
                System.out.println("arac tipini giriniz");
                System.out.println("otomobil,kamyon,otobüs,motosiklet");
                arac.type=input.next();//kamyon
                arac.countPrim(term);//Prim set edildi. Diğer Araba class ında ki countPrim methoduna bağlanacak.
                //prim=0 ise hatalı giriş yeni işlem seçeneği
                //prim>0 ise hesaplama başarılı; sonucu görüntüle
                if (arac.prim>0){
                    System.out.println("---------------------------------------");
                    System.out.println("Arac Tipi :"+arac.type);
                    System.out.println("Tarife Dönemi "+ termName);
                    System.out.println("Aracınızın ilgili dönem sigorta primi: "+ arac.prim);
                    System.out.println("---------------------------------------");


                    System.out.println("Yeni işlem için 1  ,Cıkış için 0 seciniz:   ");
                    select=input.nextInt();

                    isAgain=select==1 ?true:false;


                }else {
                    System.out.println("Hesaplama basarisiz,tekrar deneyiniz.  ");
                    System.out.println("Yeni işlem için 1  ,Cıkış için 0 seciniz:   ");
                    select=input.nextInt();

                    isAgain=select==1 ?true:false;
                }

            }else { //hatalı girişte
                System.out.println("Hatalı Giriş!");
                isAgain=true;
            }

        }while (isAgain); // bunun değeri TRUE olursa döngü başa döner FALSE olursa döngü biter
        System.out.println("İYİ GÜNLER DİLERİZ..");


    }










}