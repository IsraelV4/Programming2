package Labs.lab01GetSetConstructor;

public class Dealer {
    private String make;
    private double rev;
    private Car[] StockList;

    public Dealer( String m, double r, Car[] List) {
        make = m;
        rev = r;
        StockList = List;
    }

    public String getmake() {
        return make;
    }

    public void setrev(double v) {
        rev = v;
    }

    public double getrev() {
        return rev;
    }

    public void setStockList(Car[] v) {
        StockList = v;
    }

    public Car[] getStockList() {
        return StockList;
    }

    public void setmake(String v) {
        make = v;
    }

    public String toString() {
        String tmp = "";
        tmp += make + "\n" + "Annual Revenue: "+rev+"\n\n";

        for (int i=0; i<StockList.length; i++) {
            tmp+=StockList[i]+"\n";
        }

        return tmp;
    }

    public static void main(String[] args) {
        Car a = new Car("Vin thing", "A model here", 52);
        Car b = new Car("Vin thingy", "A models here", 51);
        Car c = new Car("Vin thinger", "A model herey", 50);
        Car e = new Car("Vin thinged", "The model here", 27);
        Car[] list = new Car[] {a,b,c,e};
        Dealer d = new Dealer("Some Make here", 1234567.89, list);
        System.out.println(d);
    }
}
