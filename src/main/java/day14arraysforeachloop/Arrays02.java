package day14arraysforeachloop;

import java.util.Arrays;
import java.util.Comparator;

public class Arrays02 {
    public static void main(String[] args) {
        //example1: [0,2,3,0,12,0] sifirlari en sona koyunuz
        //          [2,3,12,0,0,0]

        int orginal[]={0,2,3,0,12,0};
        int yeni[] = new int[orginal.length];

        int idx = 0;

        for(int i=0; i< orginal.length; i++){if(orginal[i]!=0){yeni[idx]=orginal[i];idx++;}}
            System.out.println(Arrays.toString(yeni));

        //example2: bir arrayin icinde herhangi bir elemanin olup olmadigini kontrol eden
        // ve kac kere tekrarlandigini gosteren  kodu yaziniz
        // [2,1,2,-3,2] ==> kullanici 2yi sordu==> 2 elemani var 3 kere tekraralndi
        //              ==> kullanici 6yi sordu==> 6 array'de yok
         int arr[] = {2,1,2,-3,2};

         int eleman = 2;

         int counter=0;// "flag": bazi durumlarin olup olmadigini kontrol etmek icin "flag" kullanilir.

         for(int w : arr){if(w==eleman){counter++;}

         if(counter>0){System.out.println(eleman + "array'de"+ counter + "defa var");}

         else {System.out.println(eleman + "array'de yok");}}

         //example3: size verilen bir cumledeki en uzun kelimeyi bulan kodu yaziniz.
        //          "Java kolaydir calisana, ne kolay ki calismayana" == >

        String sentece = "Java kolaydir calisana, ne kolay ki calismayana.";

         sentece.replaceAll("\\p{Punct}", "");

        String words[] = sentece.split(" ");
        // Arrays.sort(words); sort methodunu kullaninca sadece kelimeleri alfabestik siraya koyar

        Arrays.sort(words, Comparator.comparingInt(String::length));//burda sort+2 parametreliyi sectik
                                                                    // compar karsilastir demek bu kodda da length yani uzunluklarina gore

        System.out.println(Arrays.toString(words));
        System.out.println(words[words.length-1]);






















    }
}
