package day26exeptions;

public class Exeptions04 {

    public static void main(String[] args) {

        int age = 205;

        try{
         printAge(age);}
        catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }

    }
    //yasi ekrana yazdiran bir method olustururnuz
    public static void printAge (int age){

       // if(age>0){//if yazarsak application durmaz devam eder. fakat durmasi lazim. mesela girdigimiz username yanlis
                      // fakat siz para cekmeye devam edersiniz. bu yuzden try cath kullanir ki code calismasi dursun
        //System.out.println(age);}else
          //  System.out.println("Yas negatif olamaz");

        if (age<0 || age>200){
            throw new IllegalArgumentException("Yas negatif olamaz veya 200'den buyuk olamaz"); // yas negatif ise application duracak ve exeption atacak
        }
        System.out.println(age);

    }


}
