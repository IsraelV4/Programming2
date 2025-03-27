package Labs.lab01GetSetConstructor;

public class Car {
    private String vin;
    private String model;
    private int n;

    public Car(String v, String m, int num) {
        vin = v;
        model = m;
        n = num;
    }

    public String getvin() {
        return vin;
    }

    public void setvin(String v) {
        vin = v;
    }

    public String getmodel() {
        return model;
    }

    public void setmodel(String v) {
        model = v;
    }

    public int getnum() {
        return n;
    }

    public void setnum(int v) {
        n = v;
    }

    public String toString()  {
        return "VIN: " + vin + "\nModel: "+ model + "\nNumber of Doors: "+n+"\n";
    }
}
