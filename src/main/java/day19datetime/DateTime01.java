package day19datetime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;

public class DateTime01 {
    public static void main(String[] args) {

        //Example1: "Anlik tarih"(Current Date) ekrana yazdiran kodu yaziniz.

        LocalDate currenDate = LocalDate.now();
        System.out.println(currenDate); //200-10-21

        //Example2: "Anlik zamani"(Current Time) ekrana yazdiran kodu yaziniz.

        LocalTime currentTime = LocalTime.now();
        System.out.println(currentTime);//20:42:11.555394300

        //Example3: "Anlik zamani"(Current Time) ve "Anlik tarih"(Current Date) ekrana yazdiran kodu yaziniz.

        LocalDateTime currentDateTime = LocalDateTime.now();
        System.out.println(currentDateTime);//2022-10-21T20:45:19.761810100//aradaki "T" date bitti time basliyor demek

        //Example4: Japonyadaki  "Anlik zamani"(Current Time) ve "Anlik tarih"(Current Date) ekrana yazdiran kodu yaziniz.

        LocalDateTime currentDateTimeInJapan = LocalDateTime.now(ZoneId.of("Asia/Tokyo"));
        System.out.println(currentDateTimeInJapan);//2022-10-22T02:50:49.307567200

        //Example5: Istanbul "Anlik zamani"(Current Time) ve "Anlik tarih"(Current Date) ekrana yazdiran kodu yaziniz.

        LocalDateTime currentDateTimeInIstanbul = LocalDateTime.now(ZoneId.of("Europe/Istanbul"));
        System.out.println(currentDateTimeInIstanbul);

        //Example6: Bugunden 789 gun sonra emekli olacaginiza gore emeklilik tarihini hesaplayan kodu yaziniz.
        //LocalDate currentDate2 = LocalDate.now();//bu sekilde baslarsak eger sabit kalir yarin calistirdigimizda yine 789 gun veriri

        LocalDate countDate = LocalDate.of(2022, 10, 21); //belli bir tarihten (sabit tarih) baslayip devam ettirdigimiz
        // icin bunu haftaya acinca da program calisir ve gunler duser

        LocalDate retireDate = countDate.plusDays(789);// plusYear plusWeek de var
        System.out.println(retireDate);//2024-12-18

        //Example 7 : iki cocugunuzun dogum tarihleri arasindaki farki gun olarak hesaplayan kodu yaziniz

        LocalDate dobAli = LocalDate.of(2005, 5, 17);
        LocalDate dobVeli = LocalDate.of(2013, 2, 8);

        //between() methodu kullanildiginda daha eski olan tarih once yazilmalidir
        Long diff = ChronoUnit.DAYS.between(dobAli, dobVeli);
        System.out.println(diff);

        //Example 8 : Tom Aliden 3 yil 8 ay 13 gun sonra dogdu. Ali ise Veliden 1 yil 15 gun once dogdu.
        // Tomun dogum tarihi 18 kasim 2011 ise Ali ve Velinin dogum tarihlerini bulunuz

        LocalDate dobTom = LocalDate.of(2011, 11, 18);
        LocalDate dopOfAli = dobTom.minusYears(3).minusMonths(8).minusDays(13); // pes pese method koyarsak buna "Method Chain" method zinciri denir
        //minusYear methodunu kullanmamizin nedeni Tom kucuk oldugundan Tomdan kucultup Aliyi bulururz
        LocalDate dopOfVeli = dopOfAli.plusYears(1).plusDays(15);
        System.out.println("Velinin dogum tarihi : " + dopOfVeli + "  " + "Alinin dogum tarihi : " + dopOfAli);


        //Example 8: Istanbul'un fethi ile, Cumhuriyetin kurulmas?? aras??nda ka?? ay oldu??unu g??steren kodu yaz??n??z.
//           29 May??s 1453 ==> ??stanbul'un fethi           29 Ekim 1923 ==> Cumhuriyetin kurulu??u
        LocalDate republicDay = LocalDate.of(1923, 10, 29);
        LocalDate conquestOfIstanbul = LocalDate.of(1453, 5, 29);
        Long monthDifference = ChronoUnit.MONTHS.between(conquestOfIstanbul, republicDay);
        System.out.println(monthDifference);


        //Example 9 : verilen tarihin hangi burcta oldugunu gosteren kodu yaziniz
        //Ko?? Burcu
        //21 Mart- 20 Nisan
        //Bo??a Burcu
        //21 Nisan ??? 20 May??s
        //??kizler Burcu
        //21 May??s ??? 21 Haziran
        //Yenge?? Burcu
        //22 Haziran ??? 22 Temmuz
        //Aslan Burcu
        //23 Temmuz ??? 23 A??ustos
        //Ba??ak Burcu
        //24 A??ustos ??? 23 Eyl??l
        //Terazi Burcu
        //24 Eyl??l ??? 23 Ekim
        //Akrep Burcu
        //24 Ekim ??? 22 Kas??m
        //Yay Burcu
        //23 Kas??m ??? 21 Aral??k
        //O??lak Burcu
        //22 Aral??k ??? 20 Ocak
        //Kova Burcu
        //21 Ocak ??? 19 ??ubat
        //Bal??k Burcu
        //20 ??ubat ??? 20 Mart

        LocalDate myDate = LocalDate.of(1989, 12, 7);

        int day = myDate.getDayOfMonth(); //olusturdugumuz tarihteki sadece gunu alir
        int month = myDate.getMonthValue();//olusturdugumuz tarihteki ayi alabilir. hem isism olarak hem de kacinci ay sayi oloarak da alabilirz

        if (day >= 21 && month == 3) {
            System.out.println("Koc");
        } else if (day<=20 && month==4) {
            System.out.println("Koc");

        } else if (day>=21 && month == 4) {
            System.out.println("Boga");

        } else if (day<=20 && month==5) {
            System.out.println("Boga");}

        //2.yol
        if((day >= 21 && month == 3) || (day<=20 && month==4)){
            System.out.println("Koc");
        } else if ((day>=21 && month == 4)|| (day<=20 && month==5)) {
            System.out.println("Boga");}







    }}
