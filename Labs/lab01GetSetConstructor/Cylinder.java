package Labs.lab01GetSetConstructor;

public class Cylinder {
    double r = 7;
    double h = 21;

    public Cylinder() {

    }

    public Cylinder( double r2, double h2) {
        r = r2;
        h = h2;
    }

    public double getVolume() {
        return h*r*r*Math.PI;
    }

    public double getSArea() {
        return 2*Math.PI*r*h + 2*Math.PI*r*r;
    }
}