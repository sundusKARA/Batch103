package day08stringmanipulations01;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class StringMnipulations02 {
    public static void main(String[] args) {

        //example01: bir strindeki space haric kac tane character kullanildigini gosteren kodu yazaniz
        //"ali okula gitt"
        String str = "ali okula gitt";

        //replace() methodu bir stringdeki herhangi bir karakteri veya karakterleri degistirmek icin kullanilir
        int num = str.replace("", "").length();
        System.out.println(num);

        //example2: bir stringdeki tum 'a' harflerini 'A'ya ceviriniz
        String s = "Ankaranin tasina gozlerimin yasina bak";
        String yeniS = s.replace("a","A");
        System.out.println(yeniS);

        //EXAMPLE3: bir strindeki "kara" kelimelerin yerine "*" koyunuz
        String t = "Kara kara dusunme ankara";
        String yeniT = t.replace("kara", "*");

        //example4: bir stringdeki tum sayilari "*" ceviriniz
        String stdId= "AC202117004";
        String yeniStdID = stdId.replaceAll("[0-9]","*");
        System.out.println(yeniStdID);

        /*
        bir grup datayi ifade eden codelara  "regex" denir.
        "regex" regular expressions in kisaltilmis halidir

        1) tum rakamlar == [0-9]
        2) tum kucuk harfler == [a-z]
        3) tum buyuk harfler == [A-Z]
        4) tum harfler = [a-zA-Z]
        5) sesli harfler == [aeiouAEIOU]
        6) space charachteri == [ ]
        7) tum rakamlar ve tum harfler [0-9a-zA-Z]
        8) tum noktalama isaretleri == \\p{Punct}

        1) rakamlar haric tum karakterler == [^0-9]
        2) kucuk harfler haric tum karakterler == [^a-z]
        3) buyuk harfler haric tum karakterler == [^A-Z]
        4) TUM harfler haric tum karakterler == [^A-Za-z]
        5) space haric ]] [^ ]


         */

        //example5: verilen bir stringde kullanilan buyuk harfleri noktalama isratei ve rakamlar ve space karakteri haric
        // tum karakterlerin sayisini bulan kodu yaziniz
        String u = "Ali 12 yasinda, dersem inanma!...";
        int sonuc =u.
                replaceAll("[0-9]","").
                replace(" ","").
                replaceAll("\\p{Punct}","").
                length();
        System.out.println(sonuc);



        //example6: bir passwordun gecerli olup olmadigini asagidaki kurallara gore test eden kodu yaziniz
        // i) space haric en az 8 character olmali
        //ii) en az bir sembol icermeli
        //iii) en az bir rakam
        //iv) en az bir buyuk harf icermeli
        //v) en az bir kucuk harf icermeli

        String pwd = "878c? K!m";

        // i) space haric en az 8 character olmali
        boolean first = pwd.replace(" ", "").length()>7;

        //ii) en az bir sembol icermeli
        boolean second = pwd.replaceAll("[0-9A-Za-z ]","").length()>0;

        //iii) en az bir rakam
       boolean third = pwd.replaceAll("^0-9","").length()>0;

        //iv) en az bir buyuk harf icermeli
        boolean forth = pwd.replaceAll("^A-Z","").length()>0;

        //v) en az bir kucuk harf icermeli
        boolean fifth = pwd.replaceAll("^a-z", "").length()>0;

        boolean pwdGcerli = first && second && third && forth && fifth;
        if(pwdGcerli){ System.out.println("passwordunuz gecerlidir");}
        else {System.out.println("passwordunuz gecerli");}

        //example7: bir stringdeki noktalama isaretleri haric charcter sayisini gosteren kodu write
        String cumle = "Sen yapmazsan, ben yapmazsam, o yapmazsa kim yapacak?...";
        int number = cumle.replaceAll("[^\\p{Punct}]","").length();
        System.out.println(number);

        //example8: verilan bir string "al" ile basliyor ve "x" ile bitiyorsa ekrana "harika" yazdirin aksi halde "normal " yazdirin

        String v = "kalex";
        boolean baslangic = v.startsWith("al");
        boolean bitis = v.endsWith("x");
        String result = baslangic && bitis ? "harika" : "normal";
        System.out.println(result);































    }
}
