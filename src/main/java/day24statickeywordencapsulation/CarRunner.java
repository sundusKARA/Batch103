package day24statickeywordencapsulation;

public class CarRunner {
    public static void main(String[] args) {



    Car car1 = new Car();
    Car car2 = new Car();
    Car car3 = new Car();
    Car car4 = new Car();


    //Static variablelara objeleri kullanarak ulasmak mumkun fakat tavsiye edilmez
    //Static variablelara class ismini kullanarak ulasilmalidir
        System.out.println(Car.counter);
        System.out.println(car1.price);

        System.out.println(Car.counter);
        System.out.println(car2.price);


        System.out.println(Car.counter);
        System.out.println(car3.price);

        System.out.println(Car.counter);
        System.out.println(car4.price);

        //Static : Classa baglanmis class elamanididr
        // static variablelar herkes tarafindan gorulur(gokteki ay gibidir)
        //Static class elemanlari butun objelerin ortak elemanidir
        //Staticler uzerinde yapilan degsiklikler tum objeler tarafindan gorulur ve hepsi etkilenir
        //Static class elemanlarine classlar uzeruinden ulasilmalididr. objeler staticlere ulasilmak icicn kullanilmaz. hata vermez fakat uzuzn yol oldugu icin tercih edilmez
        //Staticler override edilemez. cunku staatic olanlardaki degisiskler tum chil classlarinki degissir ve etkilenir. bu yuzden de override edilemez






}}
