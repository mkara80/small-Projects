package aracSigortaApp;


import java.util.Scanner;

/*
       Tarife dönemi:Aralık 2023,Haziran 2023
          1.dönem :Haziran 2023               2.dönem:Aralık 2023
          otomobil: 2000                       otomobil: 2500
          kamyon:   3000                       kamyon:   3500
          otobüs: tip1: 4000 tip2: 5000        otobüs: tip1: 4500 tip2: 5500
          motosiklet: 1500                     motosiklet: 1750
 */
public class Arac {

    public String type;//otomobil

    public int prim;//taride dönemine ve tipine göre hesapla

    // 5. Prim heseplama
    public void countPrim(int term) {
        //tipe göre hesaplama
        switch (this.type) {
            case "otomobil":
                this.prim = term == 1 ? 2000 : 2500;
                break;
            case "kamyon":
                this.prim = term == 1 ? 3000 : 3500;
                break;
            case "otobüs": // burada iki tip var kullanıcıdan bilgi alınacak
                countBusPrim(term);
                break;
            case "motosiklet":
                this.prim = term == 1 ? 1500 : 1750;
                break;
            default:
                System.out.println("Hatalı Giriş!");
                this.prim = 0;
                break;

        }


    }

    //6. otobüs tipine göre prim hesaplama
    public void countBusPrim(int term) {
        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen otobüs tipini seçiniz");
        System.out.println("1. 18-30 koltuk arası ");
        System.out.println("2. 31 koltuk ve üzeri ");

        int busType = input.nextInt();
        switch (busType){
            case 1 :
                this.prim=term==1?4000:4500;
                break;
            case 2:
                this.prim=term==1?5000:5500;
                break;
            default:
                System.out.println("hatalı giriş");
                this.prim=0;
                break;


        }


    }








































}