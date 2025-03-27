package Quizzes;
//File 4
public class Driver {
    public static void main(String[] args) {
        //Q10
        CCNY a = new CCNY("CCNY", "123 Street", 100, 2.7);

        //Q11
        NYIT b = new NYIT("NYIT", "234", 101, 2.4);

        //Q12 and Q13
        System.out.println(a.sameGPA(a.getGPA(), b.getGPA()));
    }
}
