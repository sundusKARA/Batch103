package day09stringmanipulations;

import java.util.Scanner;

public class StringManipulations01 {
    public static void main(String[] args) {

        //INDEXOF METODU VERILEN KARAKTER VEYA karakterlerin ilk gorunumunun indeksini verir.

        String str = "Kara kara dusunme Ankara.";
        int idxA1 = str.indexOf("kara");
        System.out.println(idxA1);

        //lastindexof methoduVERILEN KARAKTER VEYA karakterlerin son gorunumunun indeksini verir.
       int idxA2 = str.lastIndexOf("kara");
       System.out.println(idxA2);

       String s = "Missisissipi";
       int idxI = s.indexOf('i');//INDEXOF HEM STRING HEM DE CHAR ILE KULLANILABILRI
        System.out.println(idxI);

        int idxIss1 =  s.indexOf("iss");// ilk gorunumun ilk karakterin indexini verir.
        System.out.println(idxIss1);

        int idxIss2 =  s.lastIndexOf("iss");// son grounumun yine ilk karakterini verir
        System.out.println(idxIss2);


        //example1: bir stringdeki bir karakterin tekrarli veya tekrarsiz olup olmadigini gosteren kodu yaziniz
        // "helloooo" == h= tekrarsiz    e=tekraarsiz  l=tekrarli   o=tekrarli

        String t = "helloooo";
        char c = 'e';

        if (t.indexOf(c)==t.lastIndexOf(c)){
            System.out.println("tekrarsiz");}
        else {System.out.println("tekrarli");}

        String u = "Learn Java earn money";

        //indexof iki parametre ile kullanilirsa ikinci parametre de verilen sayi kadar karakteri gectikten
        // sonra istenen karakterin ilk gorunumunun indexi return eder.
        int sonuc = u.indexOf("n",5);
        System.out.println(sonuc);

        //lastindexof()iki parametre ile kullanilirsa ikinci parametrede verilen sayiyi index olarak kabul edip
        // en bastan bu indexe kadar olan karakterleri bir kutu icine aliriz ve lastindexof metodunu sadece
        // bu kutu icindeki strin icin kullanilir
         String m ="hello evryone!";
         int e = m.lastIndexOf("e", 7);
         System.out.println(e);

        String v = " ";
        //isEmpty methodu bir stringin bos olup olamdigini kontrol eder. eger stringde hic karakter yoksa isEmpty methodu true return eder.
        // herhangi bir cakarter varsa false return eder.
        //length()==0 demek isEmpty true verir demektir.
        // bir stringin bos olup olmadigini anlamak icin lenth()==0 kullanmasyan isEmpty() kulanin.
        boolean bosMu= v.isEmpty();
        System.out.println(bosMu);

        //isBlank() hem bos string icin hem de sadcee space iceren stringler icin true return eder.
        String x = " ";
        boolean blankMi=x.isBlank();
        System.out.println(blankMi);

        //example2: kullanicidan alinan isim mutlaka spaceten farkli en az bir karakter icermelidir
        Scanner input = new Scanner(System.in);
        System.out.println("ilk isminizi giriniz");
        String ilk = input.nextLine();
        if (ilk.isBlank()){System.out.println("sana ismini gir dedim");}
        else {System.out.println(ilk);}





    }
}
