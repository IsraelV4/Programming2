package Labs.lab04MathAndInheritence;

public class Rectangle extends Shape{
    double l, w;
    public double getArea() {
        return l*w;
    }

    public double getPerimeter() {
        return 2*(l+w);
    }
}
