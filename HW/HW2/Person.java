package HW.HW2;

public class Person {
    String name, ssn;
    boolean alive;
    int age;

    public Person(String name, String SSN, boolean notdead, int Age) {
        this.name = name;
        ssn = SSN;
        alive = notdead;
        age = Age;
    }

    public String getname() {
        return name;
    }
    public void setname(String v) {
        name = v;
    }
    
    public String getssn() {
        return ssn;
    }
    public void setssn(String v) {
        ssn = v;
    }
    
    public boolean getalive() {
        return alive;
    }
    public void setalive(boolean v) {
        alive = v;
    }
    
    public int getage() {
        return age;
    }
    public void setage(int v) {
        age = v;
    }

    public String toString() {
        return "This is: " + name+"\nThey are " + age + " years old\nSSN is: " + ssn + "\nAnd their alive status is said to be: " +alive;
    }
}
