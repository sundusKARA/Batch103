package day21accessmodifiersinheritance;

import day20stringbuilderstringbuffer.Varliklar;

public class Animal{
    /*
    Multilevel inheritance : apartman gibi olustururlan birbirine bagli olanlar. animal==mammals==cat==van cat
    Hierarchical interance : bir parents birden fazla child varsa buna denir. animal==mammal=cat
                                                                                ||        |
                                                                                birds     dog

    Multiple inheritance : java bunu kabul etmez ve kullanamayiz.     anne + baba  = ali
                                                                     paren1+parent2=child class

                            cunku anne parentin icicne eat() koyuyoruz ve sebze yesin
                                    baba parent iccine de eat() koyuyoruz ve et ye diyoruz
                                    ali child class ise kafasi karisacak ve ne yazarsa yazsin java kizacak
     Single Inharetance: bir child classlar icin bir Parent class demektir. java bunu kabul eder

     */



    public void eat(){
        System.out.println("Animals eat ...");
    }
    public void drink (){
        System.out.println("Animals drink...");
    }

}
