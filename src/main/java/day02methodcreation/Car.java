package day02methodcreation;

public class Car {
    public String marka = "Honda";
    public int fiyat = 20000;

    /*
     note: class ..>  variable ..> object ...> kullanacagiz objeye verdigimiz gorevi yerine getirecek
                      method
     */

    public static void main(String[] args) {

        //object nasil olusturukur
        //1)class ismini yaziniz  2)objeye isim verin  3) =    4)new keywordunu kullan  5)class ismi parantezle beraber
              Car                  myHonda               =         new                     Car();
        System.out.println(myHonda.fiyat);
        System.out.println(myHonda.marka);

        myHonda.hareketEt();
        myHonda.dur();


    }

     public void hareketEt(){
         System.out.println("Honda guzel hareket eder..");}
    public void dur(){
        System.out.println("Honda guvenli durur...");

    }
}


