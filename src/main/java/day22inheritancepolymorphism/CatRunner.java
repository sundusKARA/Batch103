package day22inheritancepolymorphism;

public class CatRunner {
    public static void main(String[] args) {
        //methodlarla constructr olustururken aradaki farklar sunlardir:
        //-costructr olustururken public yazdiktan sonra return type yok(void gibi)
        //-Constructrlar classin ismi olmak zorunda baska bi isism koyamayiz
        //-construktarlar ilk harfi buyuk harfle yazilir
        //object olustururken parenttan clasa dogru olususr
        //*obje olustururken Cat() constructrini kullan dedik ve her constructrin basinda
        // *gorunmez bir super();(parent constructirri cagirmak icicn kullanilir) keywordu vardir
        //*her construcktrdaki super keywordunu kullanir ve yukari dogru tek tek bakarak cikar.daha sonra yukaridan asigiya dogru
        //*constructrlarin teker teker yazdirir

      /*  1)Java da Object olustururken Constructor'lar Parent'dan Child'a dogru calistirilir.
        2)Java en ust parent constructor'a cikabilmek icin "super()" kodunu kullanir.
        3)"super()" kodu her constructor'in "ilk satirinda" "gizli" olarak bulunur.
        4)"super()" kodunu isterseniz gorunur sekilde de yazabilirsiniz, Java kizmaz.
        5)"super()" kodunu gorunur sekilde de yazarsaniz sakin haaa ilk satir disinda bir satira koymayiniz, hata verir.
        6)"super()" kodu Parent Class'dan constructor cagirmaya yarar.  */


        Cat cat1 = new Cat();


















    }
}
