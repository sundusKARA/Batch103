package day18arraylistspassbyvalue;

public class Varargs01 {
    /*
    1.Farkli sayilardaki parametrelerle calisabilen bir method olusturmak istersek Varrags kullanmaliyiz
    2.Varrags arka tarafta Array kullanir bu yuzden varragslarla calisisrken Arraylarla calisiyormus gibi davraniriz
    3.Varrags olusturmak icin "<data type> ... <varrags ismi>"
    4.Bir methodda Varragsin yaninda baska bir parametre kullanilabilir mi Varragsi en sona koyarsak kullanilabilir(String s,int... a)
    5.Bir methodda birden fazla Varragsi kullanamayiz cunku en sonda olmayan varrag olacagindan hata verir

     */
    public static void main(String[] args) {

        int r1 = add(2,3);
        System.out.println(r1);

        int r2 = add(2,3,4);
        System.out.println(r2);



    }//iki sayinin toplamini return eden bir method olustururnuz
//    public static int add(int a, int b){return a+b;}


    //Uc sayinin toplamini return eden bir method olustururnuz
//    public  static  int add(int a, int b, int c){return  a+b+c;}


    //Istedegimiz kadar sayiyi toplayabilecegimiz bir method olusturun
    public static int add(int... a){int sum=0;//int... a data typendan sonra uc nokta koyup bir varible verdigimiz
                                                // bu kullanima Varargs denir. sonsuz kere islem yapabilirirz
                                                // Varragsin arkasinda Array calisisr bu yuzden |Arrayl;e calisiyormus gibib
                                                // hareket edebilirirz bu yuzden de toplama yaptirabilmek icin foreach kullanilir
        for (int w:a){sum=sum+w;}return sum;}



}
