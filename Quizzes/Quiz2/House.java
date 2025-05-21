package Quizzes.Quiz2;

public class House {

    //Q1
    private String name, color, address;
    private int rooms;
    private double height;

    //Q2
    public House() {
        name = "Abode";
        color = "Blue";
        address = "yes";
        rooms = 37;
        height = 15.2;
    }

    public House(String Name, String Color, String Address, int Rooms, double Height) {
        name = Name;
        color = Color;
        address = Address;
        rooms = Rooms;
        height = Height;
    }

    //Q3
    public String getname() {
        return name;
    }
    public void setname(String v) {
        name = v;
    }

    public String getcolor() {
        return color;
    }
    public void setcolor(String v) {
        color = v;
    }

    public String getaddress() {
        return address;
    }
    public void setaddress(String v) {
        address = v;
    }

    public int getrooms() {
        return rooms;
    }
    public void setrooms(int v) {
        rooms = v;
    }

    public double getheight() {
        return height;
    }
    public void setheight(double v) {
        height = v;
    }

    //Q4
    public String toString() { // Combine all the FIELDS
        return "name: " + name + "\ncolor: " + color + "\naddress: " + address + "\nrooms: " + rooms + "\nheight: " + height;
    }

}
