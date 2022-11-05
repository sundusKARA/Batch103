package day18arraylistspassbyvalue;

public class PassByValue01 {
    public static void main(String[] args) {

        /*
        gomlek=100tl
        ogrenci icin indirim = -10tl
        ogrenci gomlegi=90tl
        gazi icin indirim = -20tl
        gazi gomlegi = 80tl

        bazi islemelrde burada da oldugu gibi orijinal degeri korur
         */

        //methodlar main methodun disinda olusturulur


        int x=5;
        System.out.println(x);

        //Static metho olan "main method"un icindeki hersey static olmali o yuzden yazdigimiz methoddan once "static" yazmaliyiz
        change(x);
        System.out.println(x);

        //1.Java variablelarin orijinal degerlerini korumak ister.
        //2.Variable methodlar icinde kullanildiginda. Java methodun icin orijinal deger koymaz, o degerin kopyasini
       // uretir ve methoda o kopyayi yollar. Method kopya ustunde degisiklik yapar dolayisiyla variablein orjinal degeri korumuz
       // () -> olurbu sisteme "Pass By Value" denir.
       // Note: Java "Pass By Value" kullanir
        //Note: Bazi programlama dilleri orjinal degeri koruma altina almamistir.Bu isi Developer'lara birakmistir.
        //      Bu tarz diller Pass by Referance kullanir

        int ucret = 100 ;

        int kopya = indirim(ucret);    //Bunların yerine  ucret = indirim(ucret) yazılırsa orjinal değer değişir.
        System.out.println(kopya);     //

        System.out.println(ucret);


    }

    public static void change(int a){//return type belirlemliyiz/ethodun ismini yaz/methodun() koy/sonra{}koy main
        System.out.println(a*3);

    }public  static int indirim(int gomlekUcreti){return gomlekUcreti -10;}  //void disindaki return typelarda method
                                                                            // badisi icinde "return" keywordu kullanilmalidir.






}


