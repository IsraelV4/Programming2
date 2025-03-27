package Labs.lab01GetSetConstructor;

public class Main {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();
        Rectangle r2 = new Rectangle(4.0, 40.);

        System.out.println(" Area for r1: "+ r1.getArea());
        System.out.println(" Perimeter for r2: "+ r2.getPerimeter());
        System.out.println();System.out.println();

        Cylinder c1 = new Cylinder();
        Cylinder c2 = new Cylinder(12, 40);
        System.out.println("SA: " + c1.getSArea());
        System.out.println("Vol: " + c2.getVolume());
    }
}