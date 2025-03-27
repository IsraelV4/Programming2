package Labs.lab04MathAndInheritence;

public class Triangle extends Shape{
    int base;
    int height;
    int[] side;
    public double getArea() {
        return base*height/2;
    }

    public double getPerimeter() {
        return side[0]+side[1]+side[2];
    }
}
