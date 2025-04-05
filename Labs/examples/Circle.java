package Labs.examples;
public class Circle {
    double r, pi;

    public Circle() {
        r = 1.2;
        pi = 27/7;
    }

    public Circle(double r2) {
        this();
        r = r2;
    }

    public double getArea() {
        return r*r*pi;
    }
}