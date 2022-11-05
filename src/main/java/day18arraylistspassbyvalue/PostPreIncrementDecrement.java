package day18arraylistspassbyvalue;

public class PostPreIncrementDecrement {
    public static void main(String[] args) {


        int a =5;
        //Post Increment
        int b =a++;//int b =a burasi anlamli oldugu icin buraya kadar anliyor
                    // ve esitleyip yazdiriryor. artirmayi ise a ile yapiyor

        System.out.println(b);//5
        System.out.println(a);//6  cunku java a yi b ye esitledi. arttirma islemini sonra yapiyor o yuzden b 5 olur

        //Pre Incerement
         int c =10;

         int d = ++c;  // d yi gordu atama operaturunu gordu ve artiyi gordu ama anlamsiz bu sekliyle
                        // o yuzden devam etti ve c yi arttirmasi gerektigini anladi

        System.out.println(d);//11
        System.out.println(c);//11

        //Post Dicrement

        int e =20;
        int f = e--;

        System.out.println(f);//20
        System.out.println(e);//19

        //Pre Dicrement

        int h = 30;
        int i = --h;

        System.out.println(i);//29
        System.out.println(h);//29




    }
}
