package day06nestedifswitch;

import java.util.Scanner;

public class IfStatement01 {
    public static void main(String[] args) {
        //Kullanicidan yas degerini alan ve yasin hangi evrede oldugunu asagidaki tabloya gore ekrana yazdiriniz
        //0 - 4 => bebek
        //5 - 12 => cocuk
        //13 - 20 => genc
        //21 - 30 => yetiskin
        //Tanimlanmamis evre
        //not 0 dan sonrasi icin is tanimlanmis ama 0 dan oncesi icin bir veri yok. bu yuzden oncesini de biz tanimlamaliyiz ki codeda bosluk kalmasin

        Scanner input = new Scanner(System.in);
        System.out.println("lutfen yasinizi giriniz");
        byte yas = input.nextByte();
        if(yas<0){System.out.println("gecerli yas giriniz");}
        else if (yas<=4) {System.out.println("bebek");}
        else if (yas<=12) {System.out.println("cocuk");}
        else if (yas<=20) {System.out.println("genc");}
        else if (yas<=30) {System.out.println("yetiskin");}
        else {System.out.println("tanimlanmamis evre");}


    }
}
