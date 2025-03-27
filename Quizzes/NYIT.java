package Quizzes;
//File 3
public class NYIT extends College {
    //Q8
    private double GPA;

    //Q9.6
    public NYIT(String name, String address, int age, double GPA) {
        super(name, address, age);
        this.GPA = GPA;
    }

    //Q9.6
    public double getGPA() {
        return GPA;
    }

    //Q9.7
    public String geString() {
        return super.toString() + "\nGPA: " + GPA;
    }
}
