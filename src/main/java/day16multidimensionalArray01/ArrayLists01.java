package day16multidimensionalArray01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayLists01 {
    /*
    ArrayListsler ayni data tipine sahip birden fazla datayi depolamak icin kullanilir
    Array ile ArrayListsin farki :
    1-Array olusturuken arrayin icine kac tane eleman koymamiz gerektigini soylemeliyiz ve soyledigimiz eleman sayisindan fazla eleman koyamayiz
    Arrayler eleman sayisinda "fixtir" yani degistirilemez.

    *ArrayListleri olustururken eleman sayisi soylemeye gerek yok cunku ArrayListler eleman sayisinda "flexible"(esnek)tir.

    2-Arraylerin icine "primitive" ve "reference"lar konabilir
      * ArrayListlerin icine ise sadece "non-primitive"ler konulabilir.

    3- Arrayler super fast, Arrayler memory cok az kullanilir.

    Note: Eleman sayisi kesin belli olan coklu datalari depolamak icin Array kullaniriz, ama eleman
    sayisi degisken olan coklu datalar icin Array kullanma riskini almayin


     */




    public static void main(String[] args) {

        //ArrayList nasil olusturulur
        //1.yol
       ArrayList<Integer> ages = new ArrayList<Integer>();

        //2.yol
        ArrayList<Integer> heights = new ArrayList<>();

        //3.yol
        List<Integer> nums = new ArrayList<>();


        //ArrayListler nasil yazdirilir
        System.out.println(nums);//bos list []

        //ArrayListlere nasil eleman eklenir
        //add() methodu her zaman elemani en sona ekler(insertion order(yerlestirme sirasi))
        //add boolean veriri yani true veya false aliriz. eger true olursa gorev tamam. false verirse yerlestirmedi
        nums.add(21);
        nums.add(18);
        nums.add(20);
        System.out.println(nums);//[21,18,20] bunlarin arasina 50yi yerlestirmek istiyorum

        nums.add(1,50);//elemani istedigimiz indexe ekleyebilirriz
        System.out.println(nums);

        List<Integer>prices = new ArrayList<>();
        prices.add(23);
        prices.add(185);

        nums.addAll(prices); // liste list ekleyebiliriz.
        System.out.println(nums);
        System.out.println(prices);


        nums.addAll(2,prices);//istedigin listi sectigimiz listin icinde istedigimiz indexe yerlestirebiliriz
        System.out.println(nums);

        //arrayListlerin eleman sayisi nasil bulunur
         int elemanSayisi = nums.size();//eleman sayisini verecegi icin intiger veriri
         System.out.println(elemanSayisi);

         //ArrayListlerde herhangi bir eleman nasil secilir
     int el1 = nums.get(3);//indexi kullanarak elemani veriri yani istedigimiz indexteki elemani alabilirirz
     System.out.println(el1);

     //ArrayListin bos olup olmadigini nasil anlariz
     boolean bos1 = nums.isEmpty();
     System.out.println(bos1);

     boolean bos2 = ages.isEmpty();//yukaridaki arraylisti kullandik eleman atamadigimiz icin bos olur ve true verir
     System.out.println(bos2);

      //ArrayListte bir eleman nasil degistirirlir
     nums.set(3,200);//var olan bir degeri degistiririz
     System.out.println(nums);//[21, 50, 23, 200, 18, 20, 23, 185]


     //Example1: nums arraylistindeki tum tek sayilari 11 artirdiktan sonra ekrana yazdirirniz

     for (int w:nums) {if(w%2!=0){nums.set(nums.indexOf(w),w+11);}

     }
     System.out.println(nums);

     // remove() methodunu icine tamsayi koyarsaniz java onu index olarak kabul eder

     //Example 2 : ArrayListten 34 elemaninin ilk gorunumunu siliniz
     //Note1: Tum sayilarJava icin aksi soylemedikce primitivedir, yani int'dir
     //note2: "primitive"ler ArrayListlerin elemani olamazlar
     //Note3: "primitive"i "Wrapper Class"a ceviriseniz, non-primitiveler ArrayListlerin elemani olur, index olmaz

     Integer sayi = 34;
     nums.remove(sayi);
     System.out.println(nums);























































































    }
}
