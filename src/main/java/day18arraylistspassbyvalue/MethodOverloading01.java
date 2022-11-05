package day18arraylistspassbyvalue;

public class MethodOverloading01 {
    /*

    Method Overloading nasil yapilir?
    1.method isismleri ayni olmalidirr
    2.method parametreleri farkli olmalidir
        i)parametre sayilari degistirelebilir
        ii)parametrelerin data tiplerini degistirebiliriz
        iii) parametrelerin yerlerini degistirebilirsiniz ancak data tipleri farkli ise.
     3. method ismi +parametreler = method signatur
     method signatur disinda ne degistirirseniz degistirin java o methodlari farkli kabul etmez


     */

    
    public static void main(String[] args) {

    add(3,5);//hata vermez ilkini secer

    add(3,5.0);// int ve double

   //  add(3.0,4.0); hata verir cunku iki parametreye uyumlu yok




    }public static void add(int a, int b){
        System.out.println(a+b);}

    public static void add(int a, int b, int c){
        System.out.println(a+b+c);}

    public static void add(int a, double b){ //burada auotoweiding var yani int icine doubli java otomatik atar java tam mutlu degil
        System.out.println(a+b);}

    public static void add(double a, int b){//burada auotoweiding var yani int icine doubli java otomatik atar java tam mutlu degil
        System.out.println(a+b);}           // eger ilk codu kapatirsak bu ikisis arasuinda kalir ve hata verir

}
