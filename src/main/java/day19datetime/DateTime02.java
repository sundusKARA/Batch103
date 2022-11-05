package day19datetime;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DateTime02 {
    public static void main(String[] args) {
        //Example1: Javadan aldiginiz date "ay/gun/yil" olarak yaziniz

        LocalDate currentDate = LocalDate.now();
        System.out.println(currentDate);//2022-10-21

        DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("MM/dd/yyyy");//tarih ve zamana format atmak degistirmek
                                                                          //uzun class isismlerinde ilk harflerini alarak obje olustururlar
        String formattetDate1 = dtf1.format(currentDate);
        System.out.println(formattetDate1);//10/21/2022

        DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("MMM/dd/yyyy");//Oct/21/2022
        String formattetDate2 = dtf2.format(currentDate);
        System.out.println(formattetDate2);

        DateTimeFormatter dtf3 = DateTimeFormatter.ofPattern("MMMM/dd/yyyy");//October/21/2022
        String formattetDate3 = dtf3.format(currentDate);
        System.out.println(formattetDate3);

        DateTimeFormatter dtf4 = DateTimeFormatter.ofPattern("M/dd/yyyy");//10/21/2022//digeriyle farki su 10 dan kucuck aylari 01 seklinde yazar tek M koyarsak 10 dan kucuk aylari 1 2 3 diye yazar
        String formattetDate4 = dtf4.format(currentDate);
        System.out.println(formattetDate4);

        DateTimeFormatter dtf5 = DateTimeFormatter.ofPattern("MM/dd/yy");//10/21/22
        String formattetDate5 = dtf5.format(currentDate);
        System.out.println(formattetDate5);

        DateTimeFormatter dtf6 = DateTimeFormatter.ofPattern("MM/d/yyyy");//10/21/2022
        String formattetDate6 = dtf6.format(currentDate);
        System.out.println(formattetDate6);

        //Example 2 : Javadan aldiginiz timein formatini degistirirniz
        LocalTime myTime = LocalTime.of(16,23,54,2345);
        System.out.println(myTime);
        DateTimeFormatter dtf7 = DateTimeFormatter.ofPattern("HH:mm");//"HH" 24 saat "h" 12saat sistemini kullanir
        String formattedMyTime1 = dtf7.format(myTime);
        System.out.println(formattedMyTime1);

        DateTimeFormatter dtf8 = DateTimeFormatter.ofPattern("hh:mm a");
        String formattedMyTime2 = dtf8.format(myTime);
        System.out.println(formattedMyTime2);







    }
}
