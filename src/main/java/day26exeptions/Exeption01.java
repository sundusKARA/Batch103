package day26exeptions;

public class Exeption01 {
    public static void main(String[] args) {
        String str = "123";
        int result = convertStringToInteger(str);
        System.out.println(result + 5);
    }

   public static int convertStringToInteger(String str) {

        int i = 0;
        try {
            i = Integer.valueOf(str);
            System.out.println("Burasi try bolumu");


        }catch (NumberFormatException e){
            System.out.println("Rakam olmayan karakter iceren Stringler Integera cevrilmez");
        }
        return i;
   }
}
