package day20stringbuilderstringbuffer;

public class StringBuilder01 {
    /*
    1) StringBuilder Javada bir Classtir
    2) StrinBuilder , String olusturmaya yarar
    3) String Class varken nicin StrinBuildera ihtiyac duyariz?
        cunku String Class "Immutable Class"tir ama biz bazen "Mutable" Stringlere ihtiyac duyariz
        StrinBuilder bize "Mutable" String verir.
        "Immutable Class" : degisime kapali
        "Mutable" : degisime acik fakat orijinal deger korunmaz.

    4) Immutable Classlarda var olan deger degistirrilemez. siz var olan bir degiri degistirmek istedigimizde
        i) memoryde yeni bir variablr yeni deger olustutulur
        ii) eski variablein pointeri  yeni variable dosnustururlur
        iii) eger bir variable hicbir pointer gostermiyorsa o variable "Garbage Collector" tarafindan silinir
    5) -string Claslarin immutable yapisis security icin onemlidir
       - ayni degere sahip birden fazla string oldugunda java bir tane konteynir olusturur ve ayni degere sahip
        stringlerin bu konteynirir kullanmasini temin eder. bu memory korumak icicn iyidir. ancak konteynirdaki degeri
        -bir variable icin degistirdigimizde tum variablarin etkilenmesi tahlikesi vardir. bu tehlikeden kurtulmak icin
      java stringleri immutable yapmistir
        -Fakat herhangi birvariablein degerini degistirmek icin java bir yol bulmustur. degistirmek istediginiz variabl
        icin yeni bir konteyner olusturur ve variablen pointrini bu yeni variable yonlendirir boylelikle hem degisim
        saglanmis hem de digerleri etkilenmemis olur
     */

    public static void main(String[] args) {

        String str = "Java";
         str = "Super Java";
        System.out.println(str);


        //StringBuilder nasil olustururlur?:
        //1.Yol
        StringBuilder strb = new StringBuilder("Java");
        System.out.println(strb);

        //2.Yol
        StringBuilder strb2 = new StringBuilder();

       //yol a:
        strb2.append("Java");
        strb2.append(" is easy");
        strb2.append("!!!");
        System.out.println(strb2);

        //yol b:
        strb2.append("Learn").append(" Java earn").append(" money.");
        System.out.println(strb2);

        //StringBuilderlarda character sayissi nasil bulunur? ==> length() methodu ile bulunur
        StringBuilder strb3 = new StringBuilder();// her builder 16 capacity verir. eger 16 kutuyu yani capacity asinca varolanin 2 kat + 2 fazlaya cikar
        strb3.append("Cat");
        strb3.append("xxxxxxxxxxxxxxx");

        int numOfChar = strb3.length();//18
        System.out.println(numOfChar);

        int capacity = strb3.capacity();//34
        System.out.println(capacity);

        strb3.append("mmmmmmmmmmmmmmmmmmmmmm");
        int capacity2 = strb3.capacity();
        System.out.println(capacity2);//70 ==> 34*2+2

        //index 2deki characteri "r"ye cevirir == cat =car oldu
        strb3.setCharAt(2,'r');
        System.out.println(strb3);

        //delete() baslangic ve son characteri silmek istediklerimizzi yazariz
        strb3.delete(3,18); //ilk index dahil oldugu icin 3ten baslar son haric o yuzden 17 degil de 18 yazacagiz
        System.out.println(strb3);

        strb3.deleteCharAt(2); //bir karekteri siliyor
        System.out.println(strb3);

        strb3.reverse();//bu method stringbuilderi ters cevirir ali==ila
        System.out.println(strb3);
        //mutable olan strinbuilderlarda orijinal degeri degistirmek icicn methodu kullanmak yeterlididr
        //fakat immutablelar ise yani stringler ise sadece methodla degistirmeyiz arti konteynir acip atama yapmaliyiz
        String abc = "Java";
        abc=abc.replace("a","i");
        System.out.println(abc);

        String stringStrb3 = strb3.toString();//bu method StrinBuilderlari Stringe cevirir
        System.out.println(stringStrb3);

        //Strinden de StringBuildera dondurebiliriz
        StringBuilder strb4 = new StringBuilder(stringStrb3);
        System.out.println(strb4);

        strb4.insert(3,"XXX");
        System.out.println(strb4);// kacinci karakterden sonra neye cevirecegimiziz yazariz

        strb4.insert(3,"klmnopqrstu",5,8); //parantez icicndeki yazdigimiz stringin indexinden alip StrinBuildera yerlestirir
        System.out.println(strb4);

        StringBuilder a = new StringBuilder("Java");//iki Stringi karsilastirdigimizda bize integer verir. cunku alfabetik siraya sokuyor ve bize aradaki farki ascii derger yani sayi olarak verir
        StringBuilder b = new StringBuilder("Java");
        int sonuc = a.compareTo(b);
        System.out.println(sonuc);// StringBuilderlar tamamen ayni oldugu icin sonuc "0" cikardi












    }
}
