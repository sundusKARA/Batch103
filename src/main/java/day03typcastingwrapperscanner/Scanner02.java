package day03typcastingwrapperscanner;

import java.util.Scanner;

public class Scanner02 {
    public static void main(String[] args) {

        //example01: sayilari kullanicadan alan ve toplama islemi yapan code yaziniz

        //1/adim obje olustir
        Scanner input = new Scanner(System.in);
        //2adim kullaniciya mesaj ve ne yapacagini soyle
        System.out.println("ilk sayiyi giriniz...");
        double sayi1 = input.nextDouble();

        System.out.println("ikinci sayiyi giriniz...");
        double sayi2 = input.nextDouble();

        System.out.println(sayi1 + sayi2);
    }
}
