package day06nestedifswitch;

import java.util.Scanner;

public class Switch01 {
    public static void main(String[] args) {

        /*
        kullanicidan gun sayisini aliniz ve gun ismini ekrana yazdiriniz.

         */

        Scanner input = new Scanner(System.in);
        System.out.println("gun numarasi giriniz");
        byte gunNo = input.nextByte();
        //1.YOL
//        if(gunNo==1){System.out.println("pazar");}
//        else if (gunNo==2) {System.out.println("pazartesi");}
//        else if (gunNo==3) {System.out.println("sali");}
//        else if (gunNo==4) {System.out.println("carsamba");}
//        else if (gunNo==5) {System.out.println("persembe");}
//        else if (gunNo==6) {System.out.println("cuma");}
//        else if (gunNo==7) {System.out.println("cumartesi");}
//        else {System.out.println("gecerli bir gun giriniz");}

        //2.Yol: switch ile cozum

        switch (gunNo){
            case 1: System.out.println("pazar" );
            break;
            case 2: System.out.println("pazartesi");
            break;
            case 3:System.out.println("sali");
            break;
            case 4: System.out.println("carsamba");
            break;
            case 5:System.out.println("persembe");
            break;
            case 6: System.out.println("cuma");
            break;
            case 7 : System.out.println("cumartesi");
            default :
            System.out.println("gecerli gun sayisi giriniz");

        }


    }
}
