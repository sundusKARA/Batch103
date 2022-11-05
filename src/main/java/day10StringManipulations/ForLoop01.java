package day10StringManipulations;

public class ForLoop01 {
    public static void main(String[] args) {
        //example01: ekrana bes kere "hi" yazdiriniz

        System.out.println("hi");
        System.out.println("hi");
        System.out.println("hi");
        System.out.println("hi");
        System.out.println("hi");

        // tekrarli isler icin "loop" kullaniriz
        //dort cesit "loop" vardir i) for loop
        //                         ii)while-loop
        //                         iii) do-while-loop
        //                         iv) for-each-loop

        //i) for-loop
        // example 2: ekrana 5 kerte "hi" yazdiriniz

        //ilk bolume baslangic degeri //ikinci bolume loop hangi sart altinda calisacak
        // ucuncu bolume incerement(artirma) veya decrement(azaltmayi) yazacagiz

        for( int i=1 ; i<6 ;i=i+1  ){System.out.println("hi");}

//example02: 4ten 7 e kadar tum tamsayilari ekrana yazdirin
        for(int i=4; i<8; i=i+1)
            System.out.print(i + " ");

            System.out.println();

            //example4 : 14den 5e kadar tum sayilari ekrana yazdiriniz

            for (int i = 14; i > 4; i--)
                System.out.print(i + " ");

            System.out.println();
            //example5: 14ten 5e kadar tum cift sayilari yazdiriniz

//            for (int i = 14; i > 4; i = i - 2) ;
//            System.out.println(i + " ");
//            //2.yol
//            for (int i = 14; i > 4; i--) ;
//            if (i % 2 == 0)
//                System.out.println(i + " ");




            //example06: 28den 157e kadar tum tek sayilari yaziniz
        for(int i=128; i<158; i++){if(i%2!=0) System.out.print(i+" ");}


        System.out.println();
        //example7: "java" stringini "j*a*v*a*" stringine ceviren kodu yaziniz
        String str = "java";
        for(int i=0; i<str.length(); i++){System.out.print(str.charAt(i) + "*" );}

        //example8: size verilen stringde tekrarsiz karakterleri ekrana yazdiriniz
        //"Hello Ali"








        }}




