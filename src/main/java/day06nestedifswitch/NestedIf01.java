package day06nestedifswitch;

public class NestedIf01 {
    public static void main(String[] args) {
        /*   Paswordun ilk harfi buyuk harf ise 'A' olursa gecerli password aksi halde gecersiz password.
        passwordun ilk harfi kucuk harf ise 'z' olursa gecerli password aksi halde gecersiz password.
        nested:ic ice girmis nesneler
        java nested codelari calistirirken cok zaman harcar.buna "time comlexity" denir.
        bu yuzden nested kullanmak onerilmez.
         */

        String pwd = "5xy12!";

            if(pwd.charAt(0)>='A' && pwd.charAt(0)<'Z'){
            if (pwd.charAt(0)=='A'){System.out.println("gecerli password");}
            else {System.out.println("gecersiz passwor");}

        } else if (pwd.charAt(0)>='a' && pwd.charAt(0)<'z')
        {if (pwd.charAt(0)=='z'){System.out.println("gecerli password");}
        else {System.out.println("gecersiz passwor");}}
        else {System.out.println("ilk karakter harf olmalidir");}





    }
}
