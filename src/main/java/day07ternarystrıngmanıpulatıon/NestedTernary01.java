package day07ternarystrıngmanıpulatıon;

public class NestedTernary01 {
    public static void main(String[] args) {
        /*
        verilen yilin "leap year(artik yil)" olup olmadigini kontrol eden kodu yaziniz.
        i)yil 100e bolunurse 400e de bolunmelidir==> 1600 artik yildri cunku hem 100e hem de400e bolunur bu yuzden artik yildir
        ii) yil 100e bolunmezse 4e bolunmelidir==> 1996 yuze bolunmez ama 4ebolunur bu artik yildir 2001 artik yil degildir
         */
        int year = 1600;
        String leap = year%100==0 ? (year%400==0 ? "leap year" : "leap year degil") : (year%4==0 ? "leap year" : "leap year degil");

        System.out.println(leap);

        /*Asagidaki kurallara gore password'un gecerli oilup olmadigini kontrol eden kodu yaziniz
        i)Sekiz karakterden fazla veya sekiz karakter varsa ilk harfi 'i' olmalidir
        ii)Sekiz karakterden az karakter varsa ilk harfi 'K' olmalidir

         */

        String pwd = "a3ed54";
        char ilkHarf = pwd.charAt(0);
        String gecerli =  pwd.length()<8 ?  (ilkHarf=='K' ? "gecerli" : "gecersiz") : (ilkHarf=='i' ? "gecerli" : "gecersiz");
        System.out.println(gecerli);









    }
}
