package Labs.Lab05AbstractClass;

public class A extends Marks {
    public A(double a, double b, double c, String n) {
        grades = new double[] {a,b,c};
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
