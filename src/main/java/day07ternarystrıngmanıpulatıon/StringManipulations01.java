package day07ternarystrıngmanıpulatıon;

public class StringManipulations01 {
    public static void main(String[] args) {
    /* String class methodlari
    1) equals() : i ) iki tane stringin ayni olup olmadigini anlamamiza yarar.
                  ii) equals() methodu "boolean" return eder
    2) equalsIgnoreCase() : i) iki tane stringin ayni olup olmadigini buyuk harfe dikkat etmeden anlamamiza yarar.
                            ii) equalsIgnoreCase() methodu "boolean" return eder
    3) toLowerCase() :      i) bir stringdeki tum harfleri kucuk harfe cevirmek icin kullanilir
                            ii) toLowerCase() methodu "string" return eder
    4) toUpperCase() :      i) bir stringdeki tum harfleri buyuk harfe cevirmek icin kullanilir
                            ii) toUpperCase() methodu "string" return eder
    5) charAt() :           i) bir strinden belli bir indexdeki characteri almak icin kullanilir.
                            ii) charAt() methodu "char" return eder
     6) Length() :          i) bir strinde kac tane karakter kullanildigini ogrenmek icin kullanilir
                            ii) length() methodu "int" return eder.
    7) contains() :         i) bir stringte belli bir karakterin veya karakterlerin var olup olmadigini anlamak icin kullanilir.
                            ii) contains() methodu "boolean" return eder
    8) split() :            i) bir stringi istedigimiz karakterden parlamaya yarar.
                            ii) split() methodu "array" return eder.
     */

/*
bir passwordun gerli olup olmadigibni asagidaki kurallara gore kontrol eden kodu yaziniz.

        i) en az 8 karakter icermeli
        ii) space karakteri icermemeli
        iii)ilk harfi "M" veya "m"olmali
        iv)son karakteri "?" olmali

 */

String pwd = "Manisa12?";
        //i) en az 8 karakter icermeli
boolean first = pwd.length()>7;
        //ii) space karakteri icermemeli
boolean second =  !pwd.contains(" ");
       // iii)ilk harfi "M" veya "m"olmali
boolean third = pwd.charAt(0)=='M' || pwd.charAt(0)=='m';
       // iv)son karakteri "?" olmali
boolean fourth = pwd.charAt(pwd.length()-1)=='?';

        System.out.println(first&&second&&third&&fourth);


    }
}
