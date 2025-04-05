package Labs.lab05AbstractClass;

public class TA extends Employee {

    public TA(String n, String s, String d, int o, int p) {
        super(n, s, d, o, p);
    }

    public double getPay() {
        return pay;
    }

    public int getDaysOff() {
        return off;
    }
    
}
