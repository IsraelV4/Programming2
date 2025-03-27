package HW.HW1;

public class Galaxy {
    public Star[] list;
    public String name;
    public double diameter;
    public int num; // number of stars

    public Galaxy(String name, double d, int num_stars, Star[] list) { // Constructor
        this.name = name;
        diameter = d;
        num = num_stars;
        this.list = list;
    }

    public Galaxy() { // default constructor
        name = "default";
        diameter = 52.0;
        num = 0;
        list = new Star[] {};
    }

    public String getname() { // Accessor for name variable
        return name;
    }
    public void setname(String v) { // Mutator for name variable
        name = v;
    }

    public Star[] getlist() { // Accessor for Star list variable
        return list;
    }
    public void setlist(Star[] v) { // Mutator for Star list variable
        list = v;
    }

    public double getdiameter() { // Accessor for diameter variable
        return diameter;
    }
    public void setdiameter(double v) { // Mutator for diameter variable
        diameter = v;
    }

    public int getstars() { // Accessor for num variable (number of stars)
        return num;
    }
    public void setstars(int v) { // Mutator for num variable (number of stars)
        num = v;
    }

    public String toString() { // toString method for printing
        String tmp = "Galaxy name: " + name + "\nDiameter of Galaxy: " + diameter + "\nNumber of Stars: " + num+"\n\n";

        for (int i=0; i<list.length; i++) {
            tmp += "Star " + (i+1) +":\n" + list[i]+"\n";
        }

        return tmp;
    }

    public static void main(String[] args) {
        // This Main creates Three stars, one of which (b) is a copy of another (a), with only a 
        // changed name 'Two'. I then create a galaxy and print all the objects out
        Star a = new Star("One", 100, 200, 12);
        Star b = new Star(a);
        b.setname("Two");
        Star c = new Star("Three", 300, 500, 60);
        Star[] list = new Star[] {a,b,c};
        Galaxy h = new Galaxy("Milky Way", 10000, 3, list);
        System.out.println(h);
    }
}