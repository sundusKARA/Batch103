package day21accessmodifiersinheritance;

public class AnimalRunner {

                    /* 1) inheritance: cocuklarin ihtiyaclarini aileden giderebilmesine denir
                      -kodlarda tekrara sevilmediginden animal - cat- dag- bird claslarinda  ayni methodu
                      her birirnde ayri ayri yazmak istenilmez.
                      -bir clasta methodu yazirirz ve ordan methodu cagirri kullaniriz. boyleleikle methodlarda
                       degisiklik yapinca da tek bir clastan yaptiggimiz degisisklikler hepsine uygulanmis olur
                       -fakat inheritance hayata gecirebilmek icicn yani ortak method kullanabilmek icin "child class "

                       2) Bir classi baska bir classin child classi yapmak icicn "extends" keywordu kullanmaliyiz.
                       ilk yazilan Class Child ikinci yazilan Class Parent olur

                       3) Child Class objectleri Parent Classtan method ve variablelari kullanabilir

                       4) Parents Class objectleri Child C;asstan method ve variablelari kullanmazlar

                       5) Object Class her classin parentidir
                       javada  object class haric her classin parenti vardir
                       javada parenti olmayan tek class object classtir

                       6) private methot ve variablellar child classlar tarafindan kullanilamaz(inherit edilemez)
                       protected method ve variablelar child classlar tarafindan kullanilabilir(inherit edilebilir)
                       default method ve variablelar ayni packageteki child classlar tarafindan kullanilabilir(inherit edilebilir)
                       public method ve variablelar child classlar tarafindan kullanilabilir(inherit edilebilir)
                       Note: Child Classlar tarafindan kullanilabilir olmak inherit edilebilir demektir


                       */

    public static void main(String[] args) {

        Cat c1 = new Cat();  //bir obje olusturduk // catin icicnde sadece meow var fakat cocugu oldugu animals classindaki tum methodlari da kullanabilir
        c1.eat();
        c1.meow();
        c1.drink();

        Dog d1 =new Dog();
        d1.bark();
        d1.drink();
        d1.eat();







    }
}
