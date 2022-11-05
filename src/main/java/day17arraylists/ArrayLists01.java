package day17arraylists;

import java.util.ArrayList;
import java.util.List;

public class ArrayLists01 {
    public static void main(String[] args) {

        List<String> names = new ArrayList<>();
        names.add("Tom");
        names.add("Thomas");
        names.add("Tahsin");
        names.add("Trump");
        names.add("Taceddin");
        System.out.println(names);

        List<String> cities = new ArrayList<>();
        cities.add("Trump");
        cities.add("Tom");
        cities.add("Taceddin");

        names.removeAll(cities);//removeall kullandigimizda sadece ilk list degisir.parentezin icindeki list degismez
        System.out.println(names);
        System.out.println(cities);

        List<String> myNames = new ArrayList<>();
        myNames.add("Thomas");
        myNames.add("Tahsin");

        boolean sonuc1 = names.containsAll(myNames);//bir Listin icinde coklu elemanlarin var olup olmadigini kontrol eder
                                                    //hepsi varsa true,en az biri yoksa false verir
        System.out.println(sonuc1);

        List<String> a=new ArrayList<>();
        a.add("Shoes");
        a.add("Tv");
        a.add("Radio");
        a.add("Laptop");
        a.add("Shoes");
        a.add("Book");
        a.add("Shoes");

        //Example: "a" Listinde "shose" elemaninin ilk gorunumunu siliniz

        a.remove("Shoes");
        System.out.println(a);


        //Example2: "a" Listinde "shose" elemaninin tum gorunumunu siliniz

        //removeAll() methodunu kullanabilmke icin yeni bir list olusturmak zorundayiz
        // tamamini sileceksek removeAll methodu eger birini sileceksek remove kullaniriz

        List<String> silinecekler = new ArrayList<>();
        silinecekler.add("Shose");

        a.removeAll(silinecekler);
        System.out.println(a);

        //Example3: Bir tane salary listi olusturun ,eger salary 1000'den az ise %20 10000 ve 10000'den cok ise %10 zam yapiniz
        //para kullanacagimiz zaman double kullaniriz. salary=maas

        List<Double> salary=new ArrayList<>();

        salary.add(12345.00);
        salary.add(8674.50);
        salary.add(15000.75);
        salary.add(9500.00);
        salary.add(20500.00);
        System.out.println(salary);

        for (Double w:salary)

        {if(w<10000)
        {salary.set(salary.indexOf(w), w*1.2);}

        else
        {salary.set(salary.indexOf(w),w*1.1);}
        }
        System.out.println(salary);


        //Example4: ikiArrayListin esit olup olmadigini kontrol eden kodu yaziniz
        //Iki ArrayListin esit olabilmesi icin; elemanlar esit olmali ve ayni elemanlar ayni indexte olmali

        List<Character> m = new ArrayList<>();
        m.add('x');
        m.add('y');
        m.add('z');
        m.add('t');

        List<Character> n = new ArrayList<>();
        n.add('x');
        n.add('y');
        n.add('z');

           //1.Yol
        int counter = 0;

        for(int i=0; i<m.size(); i++){

        if(m.size()!=n.size()){

        counter++;

        System.out.println("Listler esit degildir");}

        else if(m.get(i) !=n.get(i)){

        counter++;

        System.out.println("Listler esit degildir");

        break;}
        }
        if(counter==0){

        System.out.println("Listler esittir");
        }

        //2.Yol:

        boolean esitmi = m.equals(n);

        if(esitmi){
            System.out.println("Listler esittir");}
        else{
            System.out.println("Listler esit degildir");
        }


















    }
}
