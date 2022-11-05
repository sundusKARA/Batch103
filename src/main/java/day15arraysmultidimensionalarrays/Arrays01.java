package day15arraysmultidimensionalarrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Arrays01 {
    public static void main(String[] args) {

        //binarySearch() metod: bu methodu kullanarak bir elemanin Arrayde olup olmadigini anlariz.
        //                      binarySearch() metodunu kullanmadan once mutlaka Arrays.sort() kullanilmalidir.
        //                      binarySearch() metodu aradiginiz elean arrayde varsa o elemanin indeksini return eder
        //                      binarySearch() metodu aradiginiz elean arrayde yoksa "-a" seklinde bir negatif sayi alirdiniz
        //                      bu sayidaki "-" isaretinin anlami bu eleman Arrayde yok demektir,"a"nin anlami olsaydi kacinci sirada olurdu demektir.
        //                      Arrayde sayi varsa indexini verir eger yoksa kacinci sirada olurdu olsaydiyi verir.
        //                      binarySearch() metodu tekrarlayan elemanlar icin kullanilmaz




        int arr[] = {12,31,43,14};
        int sayi = 43;
        Arrays.sort(arr);//[12,14,31,43]
        int idx1= Arrays.binarySearch(arr,sayi);
        System.out.println(idx1);



        int sayi2 = 58;
        int sonuc= Arrays.binarySearch(arr,sayi2);
        System.out.println(sonuc);//-5 (eksi isareti yok. 5 ise yukaridaki eleamlarin en sonuncusu olacagindan 5. eleman olacakti o yuzden 5 geldi)
                                  //arrayin sort edilmis siralanmis haline bakacagiz












    }
}
