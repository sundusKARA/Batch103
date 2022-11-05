package day13LoopsArrays;

import java.util.Scanner;

public class DoWhileLoop01 {
    public static void main(String[] args) {
        //example1: kullanicidan bir sayi aliniz sayi 100 den kucuk ise ekrana kazandin yazdirin.
        //aksi halde ekrana kaybettin yazdiriniz
        //kullanici kazandikca oyun devam etmeli


        Scanner input = new Scanner(System.in);
//        int sayi =0;
//
//        do{System.out.println("bir sayi giriniz");
//            sayi=input.nextInt();
//        if(sayi<100){ System.out.println("kazandiniz!");}
//        }
//        while(sayi<100);
//        System.out.println("kaybettiniz!");
//example2: kullanicidan ismini aliniz ilk harfin buyuk olup olmadigini kontrol ediniz


        do{System.out.println("isminizi giriniz");

        char ilkHarf = input.next().charAt(0);

        if(ilkHarf>='A' && ilkHarf<='Z'){System.out.println("isim basariyla girdiniz");}
        else {System.out.println("ismi yanlis girdiginiz icin isleminiz iptal edilmistir");
        break;}}

        while (true);

        //sonsuz donguye sebep olan durumlar
        //Infinite loop : sonsuz dongu
        // artirma azatma kisminda hata yaparsaniz "infinite loops sorunsali" olusur.
        // forun veya whilen icindeki i++ veya i-- dedigimiz yer
        // azaltma artirma kismini da yazmazsak yine "infinite loops sorunsali" olusur.








    }}

