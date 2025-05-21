package Quizzes.Quiz1;

public class Cylinder {
    double radius = 7.0; 
    double height = 14; 
    double pi = 3.142; 

    //Q!
    public Cylinder() {}
    //Q2
    public Cylinder(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }
    //Q3
    public double getArea() {
        return 2 * pi * radius * (radius+height);
    }
    //Q4
    public double getVolume() {
        return pi * radius * radius * height;
    }

    public static void main(String[] args) {
    //Q5
    Cylinder one = new Cylinder();
    System.out.println("Area for default: " + one.getArea() + "\nVolume for default: " + one.getVolume());
    
    //Q6
    Cylinder two = new Cylinder(21, 42);
    System.out.println("Area for second: " + two.getArea() + "\nVolume for second: " + two.getVolume());
    }
}
