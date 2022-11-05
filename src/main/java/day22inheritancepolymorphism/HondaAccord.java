package day22inheritancepolymorphism;

public class HondaAccord extends Honda {

    /*
    1)Siz Class oluşturduğunuzda Java otomatik olarak size görünmez bir Constructor verir, çünkü
      Java Class'ın bir kalıp olduğunu ve Object oluşturmak için yaratıldığını ve Object oluşturmak için
      Constructor'ın şart olduğunu bilir.
    2)Java'nın otomatik olarak oluşturduğu bu görünmez Constructor'a "default constructor" denir.
    3)Siz kendiniz herhangi bir Constructor oluşturduğunuzda Java "default constructor" ı siler.
    4)Bir Class'da birden fazla Constructor olabilir.Fakat bu Constructorlarin parametreleri farkli olmalididr
    5) "this" keyword "bu class" anlamindadir. "this.price" demek bi classtaki "price" isismli variable demektir
        "this.price" syntaxi constructorlarin icicnde kullanilir
    6)Constructor kullanarak variablelar uzerinde yaptiginiz degisimler sadece object uzerindeki variablelarin uzerindeki degerlerini degistirir
    Classtaki variable degerlerini degistiremez
 */

    public int price;
    public int year;
    public String make;
    public String model;

    public HondaAccord(){}
    public HondaAccord(int price){this.price = price;}

    public HondaAccord(int price, int year)
    {this.year=year;
        this.price=price;
        System.out.println("Honda Accord Constructor");}

    public HondaAccord(int price,int year, String make, String model){
        this.price=price;
        this.year=year;
        this.make=make;
        this.model=model;}









}
