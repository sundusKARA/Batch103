package day04ifStatemen;

import java.util.Scanner;

public class Scanner02 {

    /*
    not: char variablerini matematiksel islemlerde kullanirsaniz java onklarin ascii degerlerini kullanir
    ornegin: System.out.println('a' + 'c') yerine 196 yazar
    not: javada arti sembolunun iki anlami vardir  i) toplama islemi  ii) birlestirme islemi (concatenation)
    java + sembolu gorunce once toplamaya calisir yapamazsa birlestirme islemi yapmaya calisir.o da olmazsa hata verir
     */

    public static void main(String[] args) {
        //kullanicidan ilk ve soy isimini aliniz ilk ve soy isminin ilk harflerini ekrana yazdiriniz

        Scanner input = new Scanner(System.in);
        //1.yol
//        System.out.println("ilk isiminizi giriniz");
//        char ilk = input.next().charAt(0);
//
//        System.out.println("soy isiminizi giriniz");
//        char soy = input.next().charAt(0);
//
//        System.out.println("" + ilk + soy);

    // 2.yol
    // kulanicidan tam isminizi giriniz

        System.out.println("tam isiminizi girin");
        String tamIsim = input.nextLine();

      char ilkHarf = tamIsim.charAt(0);
       System.out.print(ilkHarf);

       char soyIisimIlkHarfi = tamIsim.split(" ")[1].charAt(0);
       System.out.println(soyIisimIlkHarfi);





















    }
}
