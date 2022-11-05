package day23inheritancepolymorphism;

public class Math extends Courses{

    public void practice(){
        System.out.println("Solve questions");
    }public Math(){
        super("Second");
        System.out.println("Constructor 1");}

    public Math(int a){
        //super();//bu parenttaki constructori getirir
        this(); //ayni classin icicnde diger Constructori kullanir // bu thisi yazmassak super gorunmez olarak calisisr ve parenttaki bos conctructri kullanir
        System.out.println("Constructor 2");}

}
