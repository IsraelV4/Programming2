package Labs.lab04MathAndInheritence;

public class Circle extends Shape{
    int radius;
    public double getArea() {
        return radius*radius*Math.PI;
    }

    public double getPerimeter() {
        return 2*Math.PI*radius;
    }
}
