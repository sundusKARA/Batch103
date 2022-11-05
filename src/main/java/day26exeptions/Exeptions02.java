package day26exeptions;

public class Exeptions02 {
    public static void main(String[] args) {

        char ch1 = getCharFromString("Java", 2);
        System.out.println(ch1);

        char ch2 = getCharFromString("Selenium", 8);
        System.out.println(ch2); //StringIndexOutOfBoundsException: eger bir stringden bir character veya characterler
        // alirken olmayan bir index kullanilirsa "StringIndexOutOfBoundsException" alinir.


    }

    public static char getCharFromString(String str, int idx) {
        char c =' ';

        try{
            c=str.charAt(idx);

        }catch (StringIndexOutOfBoundsException e){

            System.out.println("Index ile ilgili bir problem olustu. " + e.getMessage() ); //her exeption icicn javanin bir notu var

            System.out.println(e.getMessage());// javanin mesaji

            e.printStackTrace(); // bu methodun kendissi print ediyor. bu method daha detayli ("log" applicationin adim
                                // adim neler yaptigini gostetrir,yani hatayi adim adim gosterir) hata raporu verir.genellikle bu kullanilir
        }

        return c;

    }
}
