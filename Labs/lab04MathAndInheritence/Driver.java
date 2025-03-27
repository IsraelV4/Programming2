package Labs.lab04MathAndInheritence;

public class Driver {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();
        r1.l = 5; r1.w = 10;
        Circle c1 = new Circle();
        c1.radius = 5;
        Triangle t1 = new Triangle();
        t1.base = 3; t1.height = 4; t1.side = new int[] {3, 4, 5};
        Shape[] arr = new Shape[] {r1, c1, t1};
        for (int i=0; i<arr.length; i++) {
            System.out.println("Area of Shape: " + arr[i].getArea());
            System.out.println("Perimeter of Shape: " + arr[i].getPerimeter());
            System.out.println();
        }
    }
}
