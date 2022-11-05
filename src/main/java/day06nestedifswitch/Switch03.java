package day06nestedifswitch;

import java.util.Scanner;
import java.util.concurrent.SynchronousQueue;

public class Switch03 {
    public static void main(String[] args) {
        //kullanicidan islem ve iki tane sayi alarak islemin sonucunu ekrana yazdiran basit bir hesap makinesi yapiniz
        //switchde yani parantezin icinde sadece int byte short char ve string data typelari kullanilabilir, boolean float double kullanamayiz
        //eger ucten fazla durum varsa switch kullanirim(kisisel tercih)
        Scanner input = new Scanner(System.in);
        System.out.println("islemi giriniz : + , - . * . / .%");
        char islem = input.next().charAt(0);

        System.out.println("ilk sayiyi giriniz");
        double ilk = input.nextDouble();

        System.out.println("ikinci sayiyi giriniz");
        double ikinci = input.nextDouble();

        switch (islem) {
            case '+':
                System.out.println(ilk + ikinci);
                break;
            case '-':
                System.out.println(ilk - ikinci);
                break;
            case '*':
                System.out.println(ilk * ikinci);
                break;
            case '/':
                System.out.println(ilk / ikinci);
                break;
            case '%':
                System.out.println((ilk * ikinci) / 100);
                break;
            default:
                System.out.println("bu islem tanimlanmamistir");}


    }
}
