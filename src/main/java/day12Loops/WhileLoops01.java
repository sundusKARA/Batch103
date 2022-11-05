package day12Loops;

import java.util.Scanner;

public class WhileLoops01 {
    public static void main(String[] args) {
        //example1: 3ten 10a kadar tamsayilari ayni satira ekrana yazdiran kodu yaziniz
//1.yol
        for(int i=3; i<11; i++){System.out.print(i + " ");}
        System.out.println();
        //2.yol
        int i=3 ;
        while(i<11){System.out.print(i + " ");  i++;}
        System.out.println();

//example2: 17den 4e kadar tum cift sayilari ekrana ayni satira yazdiran kodu yazdirin

            int k=17;
            while (k>3){
            if(k%2==0){System.out.print(k + " ");}
            k--;}

            System.out.println();
            //example3: 12den 67e kadar yailarin toplamini veren kodu yaziniz
            int sum = 0;
            int m =12;
            while (m<68){ sum=sum+m;
            m++;
            System.out.println(sum);}

        System.out.println();
            //example4: size verilen bir tam sayinin rakamlari toplamini ekrana yazdiran kodu yaziniz

        int sonuc = 0;
        int sayi =385;
        while(sayi>0){sonuc =sonuc + sayi%10; sayi = sayi/10;}
        System.out.println(sonuc);

        //example5: kullanicidan aldiginiz bir sayinin carpim tablosunu ekrana yazdiriniz
        Scanner input = new Scanner(System.in);
        System.out.println("carpim tablosunu gormek icin bir sayi giriniz");

        int say = input.nextInt();
        int n=1;

        while (n<11){
        System.out.println( say + "x" + n + "=" + say*n); n++;}





    }
}
