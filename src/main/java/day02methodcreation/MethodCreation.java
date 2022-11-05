package day02methodcreation;

public class MethodCreation {

    //main methodun icinde kullandiginiz her sey static olmalidir

    public static void main(String[] args) {


        //void: bu method yeni bir data uretmiyor. ornegin ekrana bir sey yazdirma veya bir tusa tiklama methodu gibi

        System.out.println(toplamaYap(1.2, 5));
        System.out.println(ucSayiyiCarp(2, 1.2, 6));
        System.out.println(ilkIkiyiToplaUcuncuIleCarp(2, 8, 3.2));

        //ekrana bir sey yazdirmak icin sout(system.out.println) kullaniriz bir digeri de system.out.print
        //"println" kullanirsak satirbasi yapar
        //"print" kullanirsak tek bir satirda devam eder


    }
    //Example1 : toplama islemei yapan bir method olusturunuz

    public static double toplamaYap(double a, double b){
        return a+b;
    }

    //Example2 : uc sayiyi birbir ile carpan bir method olusturunuz

    public static double ucSayiyiCarp(double a, double b, double c){
        return a*b*c;
    }
    //Example3 : uc sayidan ilk ikisini toplayip ucuncu ile carpan bir method olusturunuz

    public static double ilkIkiyiToplaUcuncuIleCarp(double a, double b, double c){
        return (a+b) * c;
    }



}
