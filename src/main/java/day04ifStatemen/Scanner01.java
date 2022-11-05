package day04ifStatemen;

import java.util.Scanner;

public class Scanner01 {
    public static void main(String[] args) {

        //1. yol

        //example: kullanicadan ilk ismini, son ismini orta isimini kimlik numarasini asagidaki formatta yazdiriniz

Scanner input = new Scanner(System.in);

//        System.out.println("ilk isminizi giriniz");
//        String ilkIsim = input.next();
//
//        //note: next metodu kullanicidan string datasi almak icin kullanilir
//        System.out.println("orta isminizi giriniz");
//        String ortaIsim = input.next();
//
//        System.out.println("soy isiminizi giriniz");
//        String soyIism = input.next();
//
//        System.out.println("kimlik numaranizi giriniz");
//        String kimlikNo = input.next();
//
//        System.out.println(ilkIsim + " " +ortaIsim + " " +soyIism);
//        System.out.println(kimlikNo);

        //2.yol
//      System.out.println("ilk orta ve soy ve kimlik nonuzu isminizi giriniz");
//        String ilk = input.next();
//        String orta = input.next();
//        String soy = input.next();
//        String kimlik = input.next();
//        System.out.println(ilk + " " +orta + " " +soy);
//        System.out.println(kimlik);

        /*
        next() ile nextline() in farki
        next() methodu kullaniccidan gelen stringi sadece ilk kelimisini alir
        nextLine() methodu kullanicidan gelen stringin tamamini alir
         */

        //3. yol

        System.out.println("ilk, orta ve soy isimizi giriniz");
        String tamIsim = input.nextLine();
        System.out.println(tamIsim);
        System.out.println("kimlik numaranizi giriniz");
        String kimlikNumarasi = input.next();
        System.out.println(kimlikNumarasi);







    }
}
