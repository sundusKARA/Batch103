package day11Loops;

public class ForLoop01 {
    public static void main(String[] args) {
        //example1: 3ten altiya kadar tam sayilarin toplamini bulan  kodu yaziniz
//
        int sum =0;
        for (int i=3; i<7;i++){sum=sum+i;};
        System.out.println(sum);
        // note: sout loopun diisna yazadirirsak sumin sadece son degeri yazdirir.
        // loopun icine yazdirirsa her bir loop sumin hangi degerleri aldigini yazdirir.

        //example2: 6dan 3e kadar tam sayilarin carpimini bulan kodu yazin

        int multiply = 1;
        for(int i=6; i>2; i--  ){multiply = multiply*i;}
        System.out.println(multiply);
//example3 : size verilen bir tamsayinin rakamlari toplamini bulunuz
        //note:javada tamsayiyi tamsayiya bolerseniz sonuc tam sayi olur

        int num = 385;

        int sonuc=0;
        for(int i=385; i>0; i=i/10){sonuc = sonuc +i%10;}
        System.out.println(sonuc);
        //example4: size verilen bir stringi ters ceviren codu yaziniz
        //  kaba== abak
        String str = "kaba";

        //concotenation yapacaksaniz "" kullanin

        String ters = "";


        for (int i=str.length()-1; i>=0; i--){char c= str.charAt(i); ters=ters+c;}
        System.out.println(ters);



    }
}
