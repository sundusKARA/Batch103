package day05IfStatment;

import java.util.Scanner;

public class IfStatment03 {

    /*     iki tane stringin birbirine esit olup olmadigini anlamak icin "==" degil, "esquals() kullanilir"

     */
    public static void main(String[] args) {
        //example1:kullanicidan gun isimleri aliniz, o gunun hafta sonu mu hafta ici mi oldugunu kullaniciya soykeyiniz
        Scanner input = new Scanner(System.in);
        System.out.println("bir gun ismi giriniz");
        String gun = input.next();


        //equalIgnorCase bu da kucuk harf buyuk harf hatasini engellemez.ama sace equals olsaydi hata veriridi .

        //1.yol
//        if (gun.equalsIgnoreCase("Pazar")){System.out.println("hafta sonu");}
//        else if (gun.equalsIgnoreCase("Pazartesi")) {System.out.println("hafta ici");}
//        else if (gun.equalsIgnoreCase("Sali")) {System.out.println("hafta ici");}
//        else if (gun.equalsIgnoreCase("Carsamba")) {System.out.println("hafta ici");}
//        else if (gun.equalsIgnoreCase("Persembe")) {System.out.println("hafta ici");}
//        else if (gun.equalsIgnoreCase("Cuma")) {System.out.println("hafta ici");}
//        else if (gun.equalsIgnoreCase("Cumartesi")) {System.out.println("hafta ici");}
//        else{System.out.println("gecerli bir gun isim giriniz");}
//
//    //2.yol
//        //atomic: code yazarken code icerdigi islemlerin formullerin az olmasi
//
//        if(gun.equalsIgnoreCase("Pazar") || gun.equalsIgnoreCase("Cumartesi")){System.out.println("hafta sonu");}
//        else if ((gun.equalsIgnoreCase("Pazartesi")) ||  gun.equalsIgnoreCase("Sali") || gun.equalsIgnoreCase("Carsamba")||
//                gun.equalsIgnoreCase("Persembe")||gun.equalsIgnoreCase("Cuma")){System.out.println("hafta ici");}else{
//            System.out.println("gecerli bir gun ismi giriniz");}

        //3.yol
       boolean haftasonu =  gun.equalsIgnoreCase("Pazar") || gun.equalsIgnoreCase("Cumartesi");

       boolean haftaici = (gun.equalsIgnoreCase("Pazartesi")) ||
                        gun.equalsIgnoreCase("Sali") ||
                        gun.equalsIgnoreCase("Carsamba")||
                        gun.equalsIgnoreCase("Persembe")||
                        gun.equalsIgnoreCase("Cuma");



        if(haftasonu) {System.out.println("hafta sonu");}
        else if(haftaici) System.out.println("hafta ici");}
      {System.out.println("gecerli bir gun ismi giriniz");}



    }





