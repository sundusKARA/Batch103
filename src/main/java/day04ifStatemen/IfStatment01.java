package day04ifStatemen;

public class IfStatment01 {
    public static void main(String[] args) {

        //if it rains I will cancel the picnic
        // if statetmen belli codelari belli sartalra bagli olarak calistirmaya yarar
        //excample1: sayi pozitif ise ekrana pozitif yazdirin

        int s = 12;

        if (s > 0) {
            System.out.println("positive");
        }

        //example2 : verilen karakter buyuk harf ise ekrana buyuk harf yazdirin
        char ch = 'A';

        if (ch >= 'A' && ch <= 'Z') {
            System.out.println("Buyuk Harf");

            /*
            && And Islemi: sadece boolean ile kullanilir
            true && true = true verir.
            true && false = false
            false && true = false
            false && false = false
            && islemi mukemmelliyetcidir true sonucunu alabilmek icin her sey true olmalidir
            bir tane false varsa sonuc false demektir
          */
            int n = 123;

            n = Math.abs(n);

            if (n > 99 && n < 999) {
                System.out.println("uc basamakli");
            }
        //example 4: verilen bir sayi ise ekran cift sayi yazdiririniz.
            // = isareti atama operatorudur matematikteki esittir anlamina gelmez.
            // matematikteki esittir sembolu javada == seklindedir
            // 2+5 acaba bes mi esitligi soyle kontrol edecegiz 2+5 == 5 esitligi kontrol eder
            int p = -18;
            p = Math.abs(p); // mutlak degerini aldiriyor bu islem. bu yuzden de eksiler pozitife donuyor ve islem yapilabiliyor.
                               //bunu yapmasak da ikiye bolum sifirdir.burada kullanmasak da olur. ama gerekli yeri iyi tespit etmek lazim

                if(p%2==0){
                System.out.println("cift sayi");
            }
// example : verilen bir sayi 300den kucuk veya 1200de buyuk ise ekrana "harika sayi" yazdirin

            int r = 250;
                if(r<3000 || r>1200){
                    System.out.println("Harika sayi");
                }
/*
             || islemi sadece boolean ile kullanilir.
                  true || true = true
                  true || false= true
                  false || true= true
                  false || false= false
            Not: || isleminde false alabilmek icin herseyin false olmasi gerekir.
                 || isleminde sadece bir tane true sonucu true yapmaya yeter
         */





        }


    }
}