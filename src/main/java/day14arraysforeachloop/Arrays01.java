package day14arraysforeachloop;

import java.util.Arrays;
import java.util.Scanner;

public class Arrays01 {
    public static void main(String[] args) {
        //arraylerin icine primitiv data tipleri ve referencelar konabilir

        String str[] = new String[3];
        str[0] = "Java";
        str[1] = "did";
        str[2] = "surprise you";
        System.out.println(Arrays.toString(str));
        //String bir array olusturunuz ve "Tom" ve "Tom"dan onceki tum elemanlari yazdiriniz

        String arr[] = {"Jane", "Mark","Christopher","Tom","Ali","Rojda"};
        for(String w : arr){
            System.out.print(w + " ");if(w.equals("Tom")){break;}}

        System.out.println();
        //example 2 : Strin bir array olusturunuz "Tom" ve "Jane" haric tum elemanlari ekrana yazdiriniz
        String brr[] = {"Jane", "Mark","Christopher","Tom","Ali","Rojda"};
    for(String w : brr)
    {if(w.equals("Jame")|| w.equals("Tom")){continue;}
        System.out.print(w +" ");}

        System.out.println();
    //example3:bir ogretmenin sinifindaki ogrencilerin isimlerini applicotion'a yuklemesini saglayan kodu yaziniz
        // (Kullanici ile beraber bir array olusturunuz ve icine data ekleyiniz)
        Scanner input = new Scanner(System.in);
        System.out.println("Kac ogrenci ismi gireceksiniz");

        int  numOfStd = input.nextInt();

        String names[] = new String[numOfStd];

        System.out.println("Girisi sonlandirmak icin Q harfinr bas.");

        for (int i=1; i<=numOfStd ; i++)

        {System.out.println("Lutfen" + i + ". ogrenci ismini giriniz");

         String stdName= input.next();

         if(stdName.equalsIgnoreCase("Q")){break;}

         names[i-1] = stdName;}

        System.out.println(Arrays.toString(names));















    }
}
