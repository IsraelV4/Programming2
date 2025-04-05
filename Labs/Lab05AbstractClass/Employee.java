package Labs.lab05AbstractClass;

public abstract class Employee {

    public Employee(String n, String s, String d, int o, int p) {
        name = n;
        ssn = s;
        date = d;
        off = o;
        pay = p;
    }

    abstract double getPay();

    abstract int getDaysOff();

    String name, ssn, date;
    int pay, off;

    public boolean sameDayOff(Employee a) {
        return a.off == off;
    }

    public boolean samePay(Employee a) {
        return a.pay == pay;
    }
}
