package day13LoopsArrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Arrays01 {
    /*
    1)ayni data tipinde coklu datayi depolamak icin javanin olusturdugu yapilar vardir
    bu yapilardan birsi de "Array"lerdir.
     */

    public static void main(String[] args) {

        //aray nasil olusturulur
       int stdAges[] = new int[7];
       //aray nasil yazdirilir
        //sout ile array sinifindan toStringi alip bunun icine olusturdugumuz arrayi koyariz


        //Arraylere elemanlar nasil eklenir
        stdAges[1]=11;
        stdAges[0]=12;
        stdAges[2]=13;
        stdAges[3]=14;
        stdAges[4]=10;
        stdAges[5]=12;
        stdAges[6]=12;
        System.out.println(Arrays.toString(stdAges));

        //Arraydeki herhangi bir elemani yazdirabilirz
        System.out.println(stdAges[4]);

        //example1: arraydaki en kucuk ve en buyuk elemanin toplamini ekrana yazdirin
        Arrays.sort(stdAges);
        System.out.println(Arrays.toString(stdAges));

        int ilk = stdAges[0];

        //note: length() stringlerde kullanilir, "length" arraylerde kullanilir
        int son = stdAges[stdAges.length-1];
        System.out.println(ilk + son);

        //example2: stdAges arrayinin icindeki tum elemanlatrin toplamini ekrana yazdiran kodu yaziniz.
       //1.yol: for-loop
        int sum =0;
        for (int i=0; i<stdAges.length; i++){sum = sum + stdAges[i];}
        System.out.println(sum);
    //2. yol: while

     int i =0;
     int toplam =0;

     while(i<stdAges.length) {toplam=toplam+stdAges[i];
     i++;}
        System.out.println(toplam);
     //3.yol: do while
     int k=0;
     int s =0;

     do{   s=s+stdAges[k];   k++;}

     while(k<stdAges.length);

     System.out.println(s);

    //4.yol: for each loop Arraylerde Collectionlarda kullanilir
     int t=0;
     for (int w : stdAges){t=t+w;}
     System.out.println(t);

     //example3: Strin bir array olusturunuz
     //bu arraye 5 tane isim yerlestiriniz "ali,tom,kemal,veli,cem"
     //bu isimlerdeki karakter sayilarinin toplamini ekrana yazdiriniz

     String stdName[]=new String[5];
     stdName[0]="Ali";
     stdName[1]="Tom";
     stdName[2]="Veli";
     stdName[3]="Kemal";
     stdName[4]="Cem";
     int karakterSayilariToplami=0;
     for(String w : stdName){karakterSayilariToplami=karakterSayilariToplami+w.length();}
     System.out.println(karakterSayilariToplami);


     //example4: char bir aray olusturunuz
     //bu arraye 5 elaman ekleyiniz
     // bu arraydeki sadece buyuk harfleri ekrana yazdiriniz

     char ch[] = {'A' , 'c', 'D', 'k' , 'M'};
     for(char w : ch)
     {if (w>='A' && w<='Z'){System.out.print(w + " ");}}







    }
}
