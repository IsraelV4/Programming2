package Quizzes;
//File 2
public class CCNY extends College {
    //Q4
    private double GPA;

    //Q5
    public CCNY(String name, String address, int age, double GPA) {
        super(name, address, age);
        this.GPA = GPA;
    }

    //Q6
    public double getGPA() {
        return GPA;
    }

    //Q7
    public String geString() {
        return super.toString() + "\nGPA: " + GPA;
    }
}
