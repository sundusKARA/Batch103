package day15arraysmultidimensionalarrays;

import java.util.Arrays;
import java.util.Map;

public class Arrays02 {
    public static void main(String[] args) {

        //Example 1: Size verilen pozitif ve naegatif sayilar iceren bir integer array'deki
        // "en buyuk negatif" ve "en kucuk pozitif" elemani bulunuz.
 int arr[] = {-12,18,-5,23,-2,0};

        Arrays.sort(arr);//[-12,-5,-2,0,18,23]

        int maxNegative = arr[0];
        int minPositive = arr[arr.length-1];


        for (int w:arr)

        {if(w<0)
        {maxNegative=Math.max(maxNegative,w);}

        if(w>0)
        {minPositive=Math.min(minPositive,w);}
        }

        System.out.println("en buyuk pozitif : "+ maxNegative );
        System.out.println("en bkucuk pozitif : "+ minPositive);














    }
}
