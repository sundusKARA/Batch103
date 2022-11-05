package day03typcastingwrapperscanner;

public class TypeCasting01 {

    /*
    typre casting bir numeric data tipini diger numeric data typena cevirmek demektir.


        byte < short < int < long < float < double

        auto widening : kucuk alan kaplayandan buyuk alan kaplayana giden islem
        expilicit narrrowing (acikca daraltma)   : buyuk data typni kucuk dataya cevirmeye denir.

        notev :  byte iki tane anlami vardir biri 8 bit olna bir digeri de data type olan. bu yuzden burada bit yok
                burada sadece data typelari var

     */

    public static void main(String[] args) {
        byte age = 23;
        int newAge = age;
        long population = 1234;
        int newPopulation = (int)population;

        //example01 : shortu doubla cevirem code yaziniz

        short numOfStudent = 235;
        double newNumOfStudent = numOfStudent;

        //flaoti byte cevir

        float price  = 12.99F;
        byte newPrice = (byte)price;

        System.out.println(newPrice); // java ondalik sayiyi tam sayiyiya ceviriken yuvarlama yapmaz.
                                        // java ondalik sayiyi tam sayiyiya cevirirken ondalik kismi siler
        int number = 515;
        byte newNumber = (byte)number;
        System.out.println(newNumber); //3 > java 515i 256(byte daki sayilarin sayisi) ya boldu kalani return etti.

        int num = 510;
         byte newNun = (byte) num; // ..> -2 sonucu cikar.



    }

}
