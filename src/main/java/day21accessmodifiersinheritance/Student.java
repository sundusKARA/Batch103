package day21accessmodifiersinheritance;

public class Student {


        /*
        Access Modifier

        1) public   2)protected     3)default(access modiefeiri default yapmak icin access modifeir yazmayiz)   4)private

        Note: Access Modifeirlari genisten dara dogru siralayiniz

        public>protected>default>private

        Note : Access Modifeirlari birer birer aciklayiniz
        Public olalnlar her classtan kullanilabilir
        Protected: olanlar baska packagelerden kullanilmaz ancak baska packagede "child class" icicnden kullanilir
        Default olanlar baska packageden kullanilmaz
        Private olanalr sadece olustururlduklari Class icicnde kullanilir

        Note: "protected" ile "default" un farkini soyleyiniz.
               protected olanlar baska package'lerden kullanilamaz ancak baska package'de "child class" icinden kullanilabilir
               default olanlar baska package'den kullanilamazlar

        Note: Class'lar icin hangi Access Modifier'lar kullanilabilir.
              public, default kullanilir ama protected ve private kullanilama

         */

        //public her classdan kullanilabilir
        public String stdName = "TomHanks";
        protected String address = "Miami";
        String email = "th@gmail.com";

        //private olanlar sadece olusturrulduklari class icicnda kullanilabilirler
        private String stdId = "20206517004";





    }

