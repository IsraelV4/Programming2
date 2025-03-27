package Labs.Lab05AbstractClass;

public class Professor extends Employee {

    public Professor(String n, String s, String d, int o, int p) {
        super(n, s, d, o, p);
    }

    public double getPay() {
        return pay;
    }

    public int getDaysOff() {
        return off;
    }
    
}
