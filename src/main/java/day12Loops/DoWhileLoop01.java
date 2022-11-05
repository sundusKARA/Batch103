package day12Loops;

public class DoWhileLoop01 {
    public static void main(String[] args) {

        //note while loop bazi durumlarda hic calismaybabilir.yani while loop icin zero axecution mumkundur.
        //once dusunur sonra hareket eder
        int i = 1;
        while (i<1){System.out.println("while loop");
            i++;}

        //
        //note: do-while loop kullandiginizda loop bodysi icindeki kod en az bir kere calisir.
        //yani do-while loop icin zero execution icin mumkun degildir
        //once hareket eder sonra dusunur
        int k = 1;
        do{System.out.println("do-while loop"); k++;}
        while(k<1);

        //example1:bir analitik sayinin ondalik kismindaki rakakmlarinin toplamini bulunuz
        // 24.5673 ==> 5+6+7+3=23

        double num =24.5673;
        //String.valueOf(num) methodu paratezin icine konulan datanin tipine string yapar
        String str = String.valueOf(num);
        System.out.println(str);

        //regex icin nokta kullandigimizda onune "\\" bunu koyunuz.yani nokta su sekilde kullanilir "\\."
        String decimalPart = str.split("\\.")[1];
        System.out.println(decimalPart);

       int decimalInt =  Integer.valueOf(decimalPart);
        System.out.println(decimalInt);

        int sum =0;
        do{sum=sum+decimalInt%10;
        decimalInt=decimalInt/10;}
        while(decimalInt>0);
        System.out.println(sum);








    }
}
