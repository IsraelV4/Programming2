package Labs.lab01GetSetConstructor;

public class Rectangle {
    double w = 1.0;
    double h = 1.0;

    public Rectangle() {

    }

    public Rectangle(double w2, double h2) {
        w = w2;
        h = h2;
    }

    public double getArea() {
        return w*h;
    }

    public double getPerimeter() {
        return w*2+h*2;
    }

    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();
        Rectangle r2 = new Rectangle(4.0, 4.);

        System.err.println(" Area for r1: "+ r1.getArea());
        System.err.println(" Area for r2: "+ r2.getArea());
    }
}
