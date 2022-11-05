package day01variables;

public class Variables01 {
    //Variable nasil olusturulur
    //1) Access Modifier 2) Data Type 3) Variable Ismi 4) = 5) Deger  6) ;
    //Javada noktali virgul ingilizcedeki nokta gibidir
    //Ingilizcede "cumle" deriz, javada "statement" deriz
    //"=" sembolu "Assignment Operatoru" olarak adlandirilir
    //"Assignment Operatoru" sagdaki degeri alir soldaki variablen icine atar
    public int age = 13;
    public int height = 183;

                           //Javada Data Typelari
    /*
                               Primitive Data Types

    1)int: integerin kisaltmasi. integer tam sayidir/ momery = 32 bit yer kullanir
           Matematik'te tam sayilarin basi ve sonu yoktur fakat javada tam sayilarinbasi ve sonu vardir.
           En kucuk int = -2,147,483,648
           En buyuk int =  2,147,483,647

    2)byte: Tamsayilar icin kullanilir / memory = 8 bit yer kullanir
             En kucuk byte = -128
             En buyuk byte = 127

    3)short: tamsayilar icin / memory = 16 bit yer kullanir.
               En kucuk short = -32768
               En buyuk short = 32767

    4)Long: Tmasayilar icindir. / memory = 32 bit yer kullanir.
              int.in yetmedigi yerlerde kullanilir
              En kucuk long = -9,223,372,036,854,755,808
              En buyuk long =  9,223,372,036,854,755,807

    5) virgullu yani ondalikli sayilar icin iki cesit data vardir
           i) "float" virgulden sonra 7 basamak icerebilir
               float degerlerinde kucuk "f" veya buyuk "F" koymaliyiz
               memoryde 32 bit yer kaplar
           ii) "double" virgulden sonra 16 basamak icerebilir.
               memoryde 64 bit yer kaplar
    6)Boolean: true veya false degerleri icin kullanilir
              memoryde 1 b't yer kaplar

    7)Char: tek karakterler icin kullanilir
            A , C , = , Bunlar tek karakterdir
            memoryde 16 bit yer kaplar
            note: charlara deger verirken degeri tek tirnak icinde vermeliyiz yoksa hata verir


     note:Numeric Data Types: byte < short < int < long < float < double
          Numeric Olmayan Data Types: boolean - char

                        Non-Primitive Data Types
      String: isim,adres. kimlik no gibi bir veya birden fazla karakter iceren degerlerde kullanilir.
              String degerleri mutlaka cift tirnak arasinda verilir yoksa hata aliriz
              string non-primitivedir. yani bir string olusturdugumuzda size bir suru methot verir.

               Primitive ile Non-Primitivelerin farki nedir
              1) non-primitive data typlerinda degerim yaninda methidlar vardir.
              primitive data typelarinda ise sadece deger vardur methid yoktur
              2) primitive data typlari java tarafindan olusturulmustur toplam 8 tanedir biz primitive data olusturumayiz.
              non-primitive data typlari java tarafindan da olusturulmustur biz de olusturabiliriz.
              non-primitiveler sayilamaycak kadar coktur cunku her developer non-primitive data type olusturulabilir.
              3)primitive data type isimleri kucuk harfle baslar
                non-primitive data type isimleri buyuk harfle baslar
              4) primitive data typler memoryde farkli buyuklukte yerler kullanir
                 non-primitivlerin hepsi memoryde ayni buyuklukte yer kullanirlar
     */
    public byte price = 12;
    public short populationOfVillage = 23000;
    public float priceOfShirt = 13.99F;
    public double weightOfCell = 0.000012045;

    //Siz "Long" demem'ze ragmen java verilen sayiyi int kabul eder
    //Bu yuzden long bir variablea int araliginin disinda bir sayi verirseniz mutlaka sonuna "L" koyunuz
    public long populationOfWorld = 7000000000L;

    //Bueada "L" koymadigimiz halde problem yok cunku "1234" araligina uyar.
    public long x = 1234;
    public boolean isOld = true;
    public boolean isRich = false;

    //
    public char initial = 'S';

    public String name = "Tom Hanks"; }


    //main method arabanin motoru gibidir. main method calismadan hicbir sey calismaz





