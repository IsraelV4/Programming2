package Quizzes;
//File 1
public abstract class College {
    //Q1
    private String name, address;
    private int age;

    //Not a Q, just a helper method (Constructor)
    public College(String name, String address, int age) {
        this.name = name;
        this.address = address;
        this.age = age;
    }

    //Q2
    public abstract double getGPA();

    //Q3
    public boolean sameGPA(double one, double two) {
        return one==two;
    }

    //Not a Q, just a helper method (toString)
    public String toString() {
        return "Name: " + name + "\naddress: " + address + "\nage: " + age;
    }
    
}
