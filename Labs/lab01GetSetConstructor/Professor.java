package Labs.lab01GetSetConstructor;

public class Professor {
    private String name, department;
    private double salary;
    private int years;

    public Professor(Professor a) {
        name = a.getname();
        department = a.getdepartment();
        salary = a.getsalary();
        years = a.getyears();
    }

    public Professor(String n1, String n2, double n3, int n4) {
        name = n1;
        department = n2;
        salary = n3;
        years = n4;
    }

    public String getname() {
        return name;
    }
    public void setname(String n) {
        name = n;
    }
    public void setdepartment(String n) {
        department = n;
    }
    public void setsalary(double n) {
        salary = n;
    }
    public void setyears(int n) {
        years = n;
    }

    public String getdepartment() {
        return department;
    }

    public double getsalary() {
        return salary;
    }

    public int getyears() {
        return years;
    }

    public String toString() {
        return "Name: " + getname() + "\ndepartment: " + getdepartment() + "\nsalary: " + getsalary()+"\nyears: "+ getyears();
    }
}
