package day19datetime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;

public class DateTime03 {
    public static void main(String[] args) {

//        //Example1: Japonya ile Almanya arasindaki zaan farkini saat olarak hesaplayab kodu yaziniz
//
//        LocalDateTime alm=LocalDateTime.now(ZoneId.of("Europe/Germany"));
//        LocalDateTime jpn= LocalDateTime.now(ZoneId.of("Asia/Tokyo"));
//
//        Long fark = ChronoUnit.HOURS.between(alm,jpn);
//        System.out.println(fark);
//
//
//        //Example2: Sabit bir tarih olusturunuz
//
//        LocalDate myDate = LocalDate.of(2011, Month.APRIL,13);
//        System.out.println(myDate);

        //Example 3: USA icin "Woow!", UK icin "Big", "CANADA" icin "Cold", "TURKEY" icin "Vatan",
        // "GERMANY" icin "Araba", "RWANDA" icin "Cay"

Countries country = Countries.RWANDA;   // data tipi de olusturdugumuz enum olur

        switch (country){
            case USA:
            System.out.println("Woow!");
        break;
            case UK:
                System.out.println("Big");
                break;
            case CANADA:
                System.out.println("Cold");
                break;
            case TURKEY:
                System.out.println("Vatan");
                break;
            case GERMANY:
                System.out.println("Araba");
                break;
            case RWANDA:
                System.out.println("Cay");
                break;
            default:
                System.out.println("Tanimlanmamis ulke");

        }


    }
}
