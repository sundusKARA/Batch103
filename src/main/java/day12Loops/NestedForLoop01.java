package day12Loops;

import java.util.Scanner;

public class NestedForLoop01 {
    public static void main(String[] args) {

        //example01:asagidaki sekli ekrana yazdiran kodu yaziniz
        //****
        //****
        //****

        Scanner input = new Scanner(System.in);
        System.out.println("satir sayisini giriniz");
        int satir= input.nextInt();

        System.out.println("sutun sayisini giriniz");
        int sutun = input.nextInt();

        System.out.println("karakter seciniz");
        char ch = input.next().charAt(0);

for(int i=1; i<=satir; i++){for(int k=1; k<sutun; k++) {System.out.print(ch);}  System.out.println();}
/*
example2: asagidaki sekli cize kodu yaziniz
    1
    12
    123
    1234
    12345
 */


for(int i=1; i<6; i++){for (int k=1; k<=i; k++){System.out.print(k + " ");}

    System.out.println();}
/*
example3: asagidaki sekli cize kodu yaziniz
* * * *
* * *
* *
*

 */
int satir2 = 4;
for(int i=1; i<=satir2; i++){for(int k=satir2; k>=i; k-- ){System.out.print("* ");}
    System.out.println();}



    }
}
