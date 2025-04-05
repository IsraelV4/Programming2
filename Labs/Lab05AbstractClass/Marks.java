package Labs.lab05AbstractClass;

public abstract class Marks {
    abstract double getPercentage();
    public boolean samePercentage(Marks a) {
        return Math.round(a.getPercentage())==Math.round(getPercentage());
    }

    String name;
    double[] grades;

    public static void main(String[] args) {
        A a = new A(100, 75, 50, "James");
        B b = new B(25, 50, 75, 100, "Jeff");
        System.out.println(a);
        System.out.println(b);
        System.out.println("Do " +a.name + " and " + b.name+ "Have the same GPA?: " +a.samePercentage(b));
    }
}
