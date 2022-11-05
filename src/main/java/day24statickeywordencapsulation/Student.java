package day24statickeywordencapsulation;

//Encapsulation: Data hiding(gizlemek) demektir
// nicin? Datayi dis etkenklerden korumak icin
//nasil? access modifeirini private yaparak gizlerim (classin iccinden gorulur.disina cikinca gorulmez)
//datayi gizledikten sonra baska classlardan okumak istersen ne yaparsin?  "get" methodlar olusturularak gizledigimiz
// datalari okunur hala getirebilirirz.diger ismi "getter" denir
//datayi gizledikten sonra baska classlardan degistirmek istersen ne yaparsin? "set" methodlari olusturarark gizledigimiz
// datalari degistirebilirriz (setter)
//sag tus yap generate daha sonra getter mi setter mi yapacagini sec. tum getterlar publictir cunku ukasip okumak istiyorum.
//variablin data type ne ise gets methodun return type ayni olmalididr.
//get methodlar nasil isimlendirirlir: basa get koyup variablin ismini yazar
//fakat boolean data typlarinda ismin basina is'le baslar, cunku sonucu true veya false olacagindan "mi-mu-" soru ekini kullanmali. ingilizcedik mi-mi soru eki is'le yapilir
//isimlendirme bu sekilde de olabilir kendimiz de koyabilirirz. ancak kendimiziz koyarsak kurallara uymaliyiz yoksa grammar hatasi yapariz ama code calisisr
//setterlarin tum return typlari voidtir. cunku degisismi yapar ve birakir.isimlerdirme yontemi ayni
//tum degisismler obje ustunde olur classlarda degil
//bize lazim olan 4 obje var ve fazla obje olusturmak tehlikeliddir ve memoryyi doldururu.
// bu yuzden bir obje olustururuz ve o obje uzerinden set() methoduyla degissim yapariz. sonra yine yapariz istedigigmiz kadar degisism yapabilirirz

public class Student {

    public String stdName = "Tom Hanks"; //her data gizlenmez. // artkcharlar karar verir hangi datanin gizlenip gizlenmeyecegine
    private String stdId = "TH202201";
    private double gpa = 3.8;
    private boolean retired = false;

    public String getStdId() {
        return stdId;
    }

    public double getGpa() {
        return gpa;
    }

    public boolean isRetired() {
        return retired;
    }

    public void setStdId(String stdId) {
        this.stdId = stdId;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public void setRetired(boolean retired) {
        this.retired = retired;
    }
}
