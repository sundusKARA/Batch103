package day03typcastingwrapperscanner;

import java.util.Scanner;

public class Scaner01 {

        // scanner kullnicidan data almaya yarar, scanner kullanici ile etkilesim kurmamizi saglar
        //scanner bir java classidir bu classi kullanabilmek icin import etmek gerekir
        // scanner classi javanin util kutuphanesidir

        public static void main(String[] args) {

            //kulanicadan data almak icin yapilmasi gerekenler
            //i.adim scanner clasindan object olustur

           Scanner input = new Scanner(System.in);

            //2. adim: kullaniciya ne yapacagini soyle
            System.out.println("Hey kullanici yasini gir...");

            //3.adim: kullanicadan aldigimiz datayi bir variablenin icine koy
            byte age = input.nextByte();
            System.out.println("Hey kullanici senin yasin " + age);


        }
    }
