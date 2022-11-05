package day03typcastingwrapperscanner;

public class WrapperClass01 {
    public static void main(String[] args) {
        /*
        note: java primitivelere method ekleyerek yeni bir yapi olusturdu bu yapiya "wrapper class"

        primitive         wrapper

        byte               Byte
        short              Short
        **int                 Integer
        long                Long
        float               Float
        double              Double
        boolean             Boolean
        **char             Character

         note: wrapper classlar da bir non-primitivedir
        */
        byte primitiveByte = 12;
        //primitiveByte. yapinca hic method cikmiyor,cunku primitiveler method icermez sadece deger icerir

        Byte wrapperByte = 12;
        //wrapperByte. yapinca kullanacagiz bir suru method cikar.cunku wrapperlar method ve deger icerir

        // example01 :byte data typenin en kucuk ve en buyuk degerlerini ekrana yazdiriniz
        // byte bir pirimitivedir bu yuzden method goremeyiz. o zaman wrappera ceviririz ve soutun icine yazariz ve sonuc cikar

        System.out.println(Byte.MIN_VALUE);//128
        System.out.println(Byte.MAX_VALUE);//127

        //example 02: short int long data typlerin en buyuk ve en kucuk degerlerini ekrana yazdiriniz

        System.out.println(Short.MIN_VALUE);
        System.out.println(Long.MIN_VALUE);
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Short.MAX_VALUE);
        System.out.println(Long.MAX_VALUE);
        System.out.println(Integer.MAX_VALUE);

        // "primitivler nasil wrapperlara cevrilir buna "autoboxing" denir

        float f1 = 12.99F;
        Float wrapperF1 = f1;

        // wrapperlar primitivilere nasil cevrilir buna da unboxing denir

        Character w1 = 's';
        char primitiveW1 = w1;
    //note: autoboxing ve unboxing java tarafindan otomatik olarak yapilir.


    }
}


