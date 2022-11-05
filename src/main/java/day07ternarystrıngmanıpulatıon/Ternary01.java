package day07ternarystrıngmanıpulatıon;

public class Ternary01 {
    public static void main(String[] args) {

        // example:bir sayinin pozitif olup olmadigini erkanan yazdiran kode yazinin
        //1.yol: if-else
        int a = -12;
        if (a>0){System.out.println("pozitif");}
        else{System.out.println(("pozitif degil"));}
            //2.yol:ternary
            String sonuc = a>0 ? "pozitif" : "pozitif degil";
            System.out.println(sonuc);

            //ewample : 2iki sayidan kucuk olani secen kodu yaziniz
    int b = 120;
    int c = 23;
    int min = b<c ? b : c;
    System.out.println(min);


    //example3: verilen bir sayinin mutlak degerini hesaplayan kodu yaziniz
        //pozitif sayilarin ve sifirin mutlak degeri kendileridir
        //negatif sayilarin mutlak degeri -1 ile carpilmis halleridir

        int d = -45;
        int abs = d<0 ? -1*d : d;
        System.out.println(abs);

        //example4: iki tane sayi ayi isaretliye bu sayilari carpiniz farkli isaretliyse "islem yapamam" mesajini veriniz

//ternary farkli data tiplerinde sonuc return ederse sonucun dat "object" yapiniz.
int e = 12;
int f = -10;
       Object islem = (e>0 && f>0)|| (e<0 && f<0) ? e*f : "islem yapamam";
        System.out.println(islem);

// note: javada her classin en az bir tane "parent" classi vardir.
        //sadece "object" classin "parent" classi yoktur




}}
