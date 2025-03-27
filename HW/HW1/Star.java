package HW.HW1;

public class Star {
    public String name;
    public double diameter, temperature;
    public int age;

    public Star(String name, double d, double temp, int years) { // default constructor
        this.name = name;
        diameter = d;
        temperature = temp;
        age = years;
    }

    public Star(Star a) { // Copy constructor
        this.setname(a.getname());
        this.setdiameter(a.getdiameter());
        this.settemperature(a.gettemperature());
        this.setage(a.getage());
    }

    public String getname() { // Accessor for name variable
        return name;
    }
    public void setname(String v) { // Mutator for name variable
        name = v;
    }

    public double getdiameter() { // Accessor for diameter variable
        return diameter;
    }
    public void setdiameter(double v) { // Mutator for diameter variable
        diameter = v;
    }

    public double gettemperature() { // Accessor for temperature variable
        return temperature;
    }
    public void settemperature(double v) { // Mutator for temperature variable
        temperature = v;
    }

    public int getage() { // Accessor for age variable
        return age;
    }
    public void setage(int v) { // Mutator for age variable
        age = v;
    }

    public String toString() { // toString method for printing
        return "Name of Star: " + name + "\nDiameter of Star: " +diameter + "\nTemperature of Star: " + temperature + "\nAge of Star: " + age+"\n";
    }
}
