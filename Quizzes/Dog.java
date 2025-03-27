package Quizzes;

public class Dog {
    //Q1
    private String name, bark;
    private int age, num_leg, weight;
    private double height;

    //Q2
    Dog() {
        name = "Ruffus Humpfree";
        bark = "BARKKK";
        age = 0;
        num_leg = 4;
        weight = 30;
        height = 16;
    }

    Dog(String name, String bark, int age, int num_leg, int weight, double height) {
        this.name = name;
        this.bark = bark;
        this.age = age;
        this.num_leg = num_leg;
        this.weight = weight;
        this.height = height;
    }

    //Q3
    public String getname() {
        return name;
    }
    public void setname(String v) {
        name = v;
    }
    
    public String getbark() {
        return bark;
    }
    public void setbark(String v) {
        bark = v;
    }
    
    public int getage() {
        return age;
    }
    public void setage(int v) {
        age = v;
    }
    
    public int getnum_leg() {
        return num_leg;
    }
    public void setnum_leg(int v) {
        num_leg = v;
    }
    
    public int getweight() {
        return weight;
    }
    public void setweight(int v) {
        weight = v;
    }
    
    public double getheight() {
        return height;
    }
    public void setheight(double v) {
        height = v;
    }

    //Q4
    public String toString() {
        return "Name: " + name + "\nbark: " + bark + "\nage: " + age + "\nnum_leg: " + num_leg + "\nweight: " + weight + "\nheight: " + height;
    }

    public static void main(String[] args) {
    //Q5
    Dog one = new Dog();
    Dog two = new Dog("Two", "brrr", 100, 6, 50, 100.12);

    //Q6
    Dog[] arr = new Dog[] {one, two};
    for (int i=0; i<arr.length; i++) {
        System.out.println(arr[i]);
        System.out.println(arr[i].getname());
        System.out.println(arr[i].getbark());
        System.out.println(arr[i].getage());
        System.out.println(arr[i].getnum_leg());
        System.out.println(arr[i].getweight());
        System.out.println(arr[i].getheight());

        arr[i].setname(""+i);
        arr[i].setbark("br"+i);
        arr[i].setage(i*10);
        arr[i].setnum_leg(i+5);
        arr[i].setweight(i*75+50);
        arr[i].setheight(i*32.5+100);

        System.out.println(arr[i]);
        System.out.println(arr[i].getname());
        System.out.println(arr[i].getbark());
        System.out.println(arr[i].getage());
        System.out.println(arr[i].getnum_leg());
        System.out.println(arr[i].getweight());
        System.out.println(arr[i].getheight());

    }
    }

}
