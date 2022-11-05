package day18arraylistspassbyvalue;

import java.util.ArrayList;
import java.util.List;

public class ArrayLists01 {
    public static void main(String[] args) {

        //Example1: Bir integer arraylisteki 7 haric tum elemanlari 2 artiriniz

        List<Integer> ages = new ArrayList<>();
        ages.add(12);
        ages.add(7);
        ages.add(21);
        ages.add(78);
        ages.add(9);

        for (Integer w:ages) { if(w==7){continue;}
           // w=w+2; == listler boyle update edilemezler yani degistiremezler
            ages.set(ages.indexOf(w), w+2);//ages indexine git wnin indexini bul ve onu artir

        }
        System.out.println(ages);

        //example2: Size verilen ArrayListte 8 ve 8den onceki tum elemanlari iki katina cikariniz

        List<Integer> nums = new ArrayList<>();
        nums.add(12);
        nums.add(7);
        nums.add(21);
        nums.add(8);
        nums.add(9);
        for (Integer w:nums) {
            nums.set(nums.indexOf(w),w*2); //Loopu kiracak sayiyi da update edeceksek ustune yazmaliyiz

            if (w==8){break;}


        }
        System.out.println(nums);





























    }
}
