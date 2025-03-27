package Labs.Lab05AbstractClass;

public class B extends Marks {

    public B(double a, double b, double c, double d, String n) {
        grades = new double[] {a,b,c, d};
        name = n;
    }

    public double getPercentage() {
        double total = 0;
        for (int i=0; i<grades.length; i++) {
            total+=grades[i];
        }
        return total/grades.length;
    }
    
    public String toString() {
        return "This is " + name + ", they have a GPA of " + getPercentage();
    }
}
