package day17arraylists;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ArrayList03 {
    public static void main(String[] args) {

        //Example 1: Bir Liste'deki elemanlarin birbirine en yakin olan ikisini bulunuz.
//
//     {12,15,19,30,21} ==> 19 ve 21


        List<Integer> a = new ArrayList<>();
        a.add(12);
        a.add(19);
        a.add(15);
        a.add(30);
        a.add(21);
        System.out.println(a);

        Collections.sort(a);            //Listleri sort (kucukten buyuge) yapabilmek icin Collections kullanmaliyiz
        System.out.println();

        int minFark = Integer.MAX_VALUE;        //Listeki sayilarin arasindaki fark secilebilsin diye minFarki integer alabilecegi en buyuk degeri verdik

        for(int i=1; i<a.size(); i++)           // i<a.size() = i a Listindeki eleman genisliginden buyuk olana kadar devam eder ve i en son 5 deyince loop kirilir ve code biter

        {minFark=Math.min(minFark,a.get(i))-a.get(i-1);} //index sirasindan bir ekigi derske bir gerisindekini secceek

        System.out.println(minFark);















    }
}
