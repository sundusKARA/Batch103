package day15arraysmultidimensionalarrays;

import java.util.Arrays;

public class Arrays03 {
    public static void main(String[] args) {
        //example: Bir Stringdeki sesli harflerin sayisini bulan kodu yaziniz
        // a-e-o-i-u-A-E-O-I-U
        String str= "Java ogrenince para kazanmak kolay, ogrenmeyince ne kolay ki.";

        str=str.toLowerCase();//swich icinde sesli harfleri tekrar buyuk yazmamak icin burada tum harfleri kucuk gor dedik ve halloldu

        String harfler[] = str.split("");

        int counter = 0;

        System.out.println(Arrays.toString(harfler));

        for (String w:harfler) {

            switch (w){
                case "a":
                case "e":
                case "i":
                case "o":
                case "u":counter++;} //sonuncuya koydugum icin breaki de kaldirabilirim ve boylede hepsinde artirma yapar
        }
        System.out.println(counter);











    }
}
