package Labs.lab03Inheritence;

public class Person {
    String name, ssn;
    int age;
    boolean alive;

    public Person(String name, String SSN, int n, boolean isalive) {
        this.name = name;
        ssn = SSN;
        age = n;
        alive = isalive;
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

    public int getage() {
        return age;
    }
    public void setage(int v) {
        age = v;
    }

    public boolean getalive() {
        return alive;
    }
    public void setalive(boolean v) {
        alive = v;
    }

    public String toString() {
        return "Name: "+ name + "\nAge: " +age +"\nSSN: "+ssn+"\nIs alive?: " + alive;
    }
}
