package day03typcastingwrapperscanner;

import java.util.Scanner;

public class Scanner03 {
    public static void main(String[] args) {
        //kullanicidan bir dikdortgenin en ve boyunu alip alan ve cevresini hesaplayan code yaziniz

        Scanner input = new Scanner(System.in);
        System.out.println("dikdortgenin kisa kenarini giriniz");
        int en = input.nextInt();

        System.out.println("Dikdortgenin uzun kenarini giriniz");
        int boy = input.nextInt();

        System.out.println("alan " + en*boy);
        System.out.println("cevre " + 2*(en+boy));


    }
}
