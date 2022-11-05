package day23inheritancepolymorphism;

public class CourseRunner {
    public static void main(String[] args) {

        Math math = new Math(); //obje ismiyle class ismini ayni kullanilabilir ki genelikle oyle kullanilir

        math.liveSessions();
        math.practice();

        Math m = new Math(5);



    }
}
