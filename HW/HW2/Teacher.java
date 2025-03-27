package HW.HW2;

public class Teacher extends Person {

    String id;
    int sal, yr;
    
    public Teacher(String name, String SSN, boolean notdead, int Age, String ID, int Sal, int Yr) {
        super(name, SSN, notdead, Age);
        id = ID;
        sal = Sal;
        yr = Yr;
    }
    
    public String getid() {
        return id;
    }
    public void setid(String v) {
        id = v;
    }
    
    public int getsal() {
        return sal;
    }
    public void setsal(int v) {
        sal = v;
    }
    
    public int getyr() {
        return yr;
    }
    public void setyr(int v) {
        yr = v;
    }

    public String toString() {
        return super.toString() + "\nThey are a teacher, their ID is: " + id + "\nAnd they have worked there for " +yr + " years and earn " + sal + " per year";
    }
}
