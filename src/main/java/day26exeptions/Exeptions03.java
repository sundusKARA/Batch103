package day26exeptions;

public class Exeptions03 {
    public static void main(String[] args) {


      // double d = divideStringByTheNumOfTheChar("124");
       // System.out.println(d);



    }
    // Stringdeki character sayissini bulunuz. Stringi integre ceviriniz. Sonra da Integeri karakter sayisisna bolunuz.
    public static double divideStringByTheNumOfTheChar(String str){

      //  int length = str.length(); //strin karakter sayisisni buldu

        //int i = Integer.valueOf(str);//sitringi intigera donusturduk

       // return  i / length;

        int lengt = 0 ;
        int i = 0;
        double sonuc = 0;

        try {

            lengt = str.length();//NullPointerException "null" String ile "length" kullanildiginda alinir

            i = Integer.valueOf(str);//NumberFormatException  icicnde rakamdan farkli character olan Stringlere  valeof() ile kullanildidiginda

            sonuc = i / lengt;//ArithmeticException bolen sayi sififr oldugunda alinir

        }catch (NullPointerException e){
            System.out.println("==> " +e.getMessage());

        }catch (NumberFormatException e){
            System.out.println(e.getMessage());

        }catch (ArithmeticException e){
            System.out.println(e.getMessage());

        }return  sonuc;}

        public static double divideStringByTheNumOfTheCharter(String str){


            int lengt = 0 ;
            int i = 0;
            double sonuc = 0;

            try {

                lengt = str.length();//NullPointerException "null" String ile "length" kullanildiginda alinir

                i = Integer.valueOf(str);//NumberFormatException  icicnde rakamdan farkli character olan Stringlere  valeof() ile kullanildidiginda

                sonuc = i / lengt;//ArithmeticException bolen sayi sififr oldugunda alinir

            }catch (Exception e){

            System.out.println(e.getMessage());

             }return sonuc;}

    public static double divideStringByTheNumOfTheCharters(String str){


        int lengt = 0 ;
        int i = 0;
        double sonuc = 0;

        try {

            lengt = str.length();//NullPointerException "null" String ile "length" kullanildiginda alinir

            i = Integer.valueOf(str);//NumberFormatException  icicnde rakamdan farkli character olan Stringlere  valeof() ile kullanildidiginda

            sonuc = i / lengt;//ArithmeticException bolen sayi sififr oldugunda alinir

        }catch (NullPointerException e){ // Child exeptioni yukari koymak dogru yerlestirmedir. eger pareti basa chil exeptioni alta yazarsak "Unreachable Code" yazar yani ulasilamaz code ve hata verir
            System.out.println("NullPointera ozel. ");
        }

        catch (Exception e){//bu parentter diger exeptionlar ise child olur. en kapsamlisis Exeptiondur digerleri nokta atissidir
            System.out.println("Diger tum Exeptionlar icin ...");

        }return sonuc;}

    }
