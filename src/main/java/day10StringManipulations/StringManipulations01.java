package day10StringManipulations;

public class StringManipulations01 {
    public static void main(String[] args) {
        String a = "Java kolaydir  ";

        //startsWith("kola",5) kodu ilk 5 karakterden sonra stringin kola ile baslayip baslamadigini kontrol eder.
        //kola ile baslarsa true baslamazsa false return eder.
        boolean b = a.startsWith("kola",5);
        System.out.println(b);

        //replaceFirst("a", "*") kodu stringdeki ilk "a" yi "*" e cevirir.
        //replace  kodu ise stringdeki tum "a"lari "*"e ceviri
        String c = a.replaceFirst("a", "*");
        System.out.println(c);


//concat methodu iki tane stringi birbirine yapistirmaya yarar.
       //concat methodu her zaman en sona ekler
        String d =a.concat(" anladin mi");
        System.out.println(d);
//concat methodu yerine "+" koysak da olur. hangisi daha iyi olur. eger bir konuyla alakali javanin methodu varsa "+" kullanilmaz

        System.out.println( a + " anladin mi");

        //trim() bir stringin bas ve sonundaki space karaterlerini siler aradaki space karakterlerine dokunmaz.

        String e = "    tom hanks     ";
        System.out.println(e);
        String f = e.trim();
        System.out.println(f);
// compareTo() methodu iki tane stringi alfabetik(lexicographic)  olarak karsilastiri
 //buyuk har kucuk harfe duyarlidir. eger dikkat etmeden devam etmesini istersek compareToIgnoreCasse kullanilir.
 //bu kodda "h"nin alfabetik sirasindan "i"nin alfabetik sirasi cikarilir.
     String h = "Java";
     String i = "Java";
    int k = h.compareTo(i);
    System.out.println(k);


    //repeat() methodu yazmis oldugumuz stringi parantezin icin kac yazarsak yan yana  o kadar yapistirir
        // bir methodun ne dondurugunu iki sekilde goruruz
        //i) methodu yazarken acilan kutudaki en soagdaki kisim
        //ii) windows == ctrl ve e basili tutun
    String n = a.repeat(3);
        System.out.println(n);

    }
}
