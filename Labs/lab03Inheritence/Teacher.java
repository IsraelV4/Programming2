package Labs.lab03Inheritence;

public class Teacher extends Person {
    String id;
    int salary, years;

    public Teacher(String ID, int sal, int years_working, String name, String ssn, int age, boolean alive) {
        super(name, ssn, age, alive);
        id = ID;
        salary = sal;
        years = years_working;
    }

    public int getsalary() {
        return salary;
    }
    public void setsalary(int v) {
        salary = v;
    }

    public String getid() {
        return id;
    }
    public void setid(String v) {
        id = v;
    }

    public int getyears() {
        return years;
    }
    public void setyears(int v) {
        years = v;
    }

    public String toString() {
        return super.toString() + "\nID: " + id + "\nSalary: " + salary + "\nYears worked: " + years;
    }

}
