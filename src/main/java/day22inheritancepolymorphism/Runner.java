package day22inheritancepolymorphism;

public class Runner {
    public static void main(String[] args) {

        //Inheritanceda variablelar secilirken java objectin data typena bakar.
        //oncelikle istediginiz variablein objectin data type olan classta arar.
        //o vlassta bulunmazsa Parent Classlara bakar
        //Hicbir Parent Classda bulunmazsa hata verir

        Cat cat1 = new Cat();
        System.out.println(cat1.a); //data tipine bakar cat oldugug icicn catteki a nin degerini verir
        System.out.println(cat1.b);//ilk basta cat classina gidecek 'b' yok java o zaman parenta gider ve 'b'yi bulur kullanir
        System.out.println(cat1.c);//ilk basta cat classina gidecek 'c' yok java o zaman parenta gider ve 'c'yi bulur kullanir

        Mammal cat2 =new Cat();
        System.out.println(cat2.a);// data tipi mammal oldugu icicn oradaki degeri verir


        Animal cat3 = new Cat();
        System.out.println(cat3.a);// data tipi animal oldugu icicn oradaki degeri verir

        //object olusturruken obcektin data typi child classlardan secilemez. once buyuk olan yani parents sonra child gelir

        //inheritanceda methodlar secilirken java constructora bakar
        //oncelikle istediginiz methodu constructriri kullanilan classtan alir
        //O Classta bulamazsa Parent Classlara bakar
        //hicbir yerde o methodu bulamazsa hata verir
        // variable ve methodlardaki inheritance farki ilk kullanimda var. variable obje hangi classta. methodda ise constructra bakiyoruz
        Cat cat4 = new Cat();
        cat4.eat();
        cat4.drink();

        Mammal cat5 = new Mammal();
        cat5.eat();

        Animal cat6 = new Animal();
        cat6.eat();









    }
}
