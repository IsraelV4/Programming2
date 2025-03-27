package Labs.lab01GetSetConstructor;

public class Student {
    private String name, stu_id;
    private int gpa, age;

    public Student() {
        name = "Default";
        stu_id = "000000000";
        gpa = -1;
        age = 18;
    }

    public Student(String n, String s, int g, int a) {
        name = n;
        stu_id =s;
        gpa = g;
        age = a;
    }

    public String getName() {
        return name;
    }

    public void setName(String n) {
        name = n;
    }

    public String getstu_id() {
        return stu_id;
    }

    public void setstu_id(String n) {
        stu_id = n;
    }

    public int getgpa() {
        return gpa;
    }

    public void setgpa(int n) {
        gpa = n;
    }

    public int getage() {
        return age;
    }

    public void setage(int n) {
        age = n;
    }

}
