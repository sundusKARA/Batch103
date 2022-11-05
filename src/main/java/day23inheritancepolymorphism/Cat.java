package day23inheritancepolymorphism;

public class Cat extends Mammal{
    public void meow(){
        System.out.println("Cat meow");
    }

    @Override //bu eat() methodu sififrdan olustururlmamistir parent classtan alinmistir
              // alinan bu methodda yaptigimiz degisiklige de override denir
            //bas kisimdaki o ve ok isareti olan yere tiklarsak hangi parenttan aldigimiziz bulururz
    public void eat() {
        System.out.println("Cats eat");
    }

    @Override
    public int add(int a, int b) {
        return a+b+1;
    }

    @Override
    public Integer multiply(int a, int b) {
        return (a*b)+1;
    }
//asagidaki method "Overriding method" olarak adlandirirlir
    @Override
    public Animal create() {
        return new Mammal();
    }
    /*
    1) Override yaparken methodun bodysi degistirilir ( System.out.println("Cats eat");)
    2)Override yaparken asla method signature'a dokunulmaz(eat() )
    yani isism ve paremetre(parentezin icinde ne varsa o kullanilir. bossa bostur) degistirilemez
    3)Override yaparken inharitance olmak zorundadir. on sartiddir bu. yani parent ve child class olmak zorunda
    4) Overide yaparken access modifierlar belli kurallara gor farklilastirilabilirle4r
        i) private methodlar override edilemezler
        ii) child classtaki override edilen methodun access modiferi parents classtaki
        methodun access modiferi ile ayni veya genis olmaliddir
        iii) default methodlar ayni package icicndeyse override edilebilirler fakat
        farkli packageden override edilemezler
    5)Parent clastaki methodun return type voit ise retun type degistirirlemez
    6)Parent clastaki methodun return type primitive ise retun type degistirirlemez
    7)Parent clastaki methodun return type Wrapper ise retun type degistirirlemez
    8)Parent clastaki methodun return type Parent Class ise retun type Childlardan birir olabilir
    note: Child Classtaki return type Parent clastakinden genis olamaz
    note: Aralarinda Parent Child iliskiasi olmayan claslar overridingde return type degisisminde kullanilmaazlar.
    mesela "short""Integer"dan kucuktur fakat aralarinda paretn child iliskisi
    olmadigindan integer yerine short kullanamazsiniz
    note: Chilttaki methodun return typindan parentaki metodhun return typina gidiste "IS-A" Relationship olmali
    tam tersi yondeki gididse de "HAS-A"
    Note: Aralarinda "IS-A" Relationship olan Data Typelara "Covariant" denir
    10) "final"  methodlar override edilemezler cunku overridingde method body degistirirlir
    fakat final method body degisikligigne izin vermez
    11)Polymorphism = Overloading+Overriding
        (coklu yapi)
        note: Polymorphism nedir? derlerse Overloding ve Overridingi anlatin
    12) Overloading ve Overriding arasinda farklar nelerdir
    i)Overloading icin inheritance gerekmez fakat overriding icin gerekir(zaten overridingi parenttan aliyoruz parent olmazsa nereden alacagiz alinmaz)
    ii)"Private" methodlar overload edilebilir, Override edilemezler(overlood bir classta oldugu icicn ayni clastan ulasabilrisin. fakat override child classindan oldugu icicn baska clastan. o yuzden  )
    iii)"Final" methodlar overlood edilebilir. override edilemezler
    iv)"Overloading" static polymorphism olarak, overriding dinamic polymorphism olarak adalndirilir.(cunku static methodlar overlood edilenilir. override edilemezler)


     */


}

