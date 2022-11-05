package day05IfStatment;

import java.util.Scanner;

public class IfStatetmen01 {
    public static void main(String[] args) {
        //example: kullanicidan alinana sayinin tek mi cift mi oldugunu yazin

        Scanner input = new Scanner(System.in);
        System.out.println("bir sayi giriniz");
        int s = input.nextInt();
    //1.yol
        if(s%2==0) {
            System.out.println("cift sayi");
        }

        //"!=" demek esit degil demektir
        if(s%2!=0){
            System.out.println("tek sayi");
        }
    //2.yol
       if(s%2==0){System.out.println("cift sayi");}else{System.out.println("tek sayi");}

       //example2: bir sayininnegatif pozitif veya notr oldugunu soyleyen code yazinin
        System.out.println("bir sayi giriniz");

        double num = input.nextDouble();
        if(num>0){
            System.out.println("bu sayi pozif");
        }else if(num==0){
            System.out.println("bu sayi notr");}else{
            System.out.println("bu sayi negatif");}




    }
}
