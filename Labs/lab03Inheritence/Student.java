package Labs.lab03Inheritence;
public class Student extends Person{
    String stuid, grade;
    double gpa;

    public Student(String id, String grades, double gpas, String name, String ssn, int age, boolean isalive) {
        super(name, ssn, age, isalive);
        stuid = id;
        grade = grades;
        gpa = gpas;
    }

    public String getstuid() {
        return stuid;
    }
    public void setstuid(String v) {
        stuid = v;
    }

    public String getgrade() {
        return grade;
    }
    public void setgrade(String v) {
        grade = v;
    }

    public double getgpa() {
        return gpa;
    }
    public void setgpa(double v) {
        gpa = v;
    }

    public String toString() {
        return super.toString() + "\nStudent ID: " + stuid + "\nGPA: " + gpa + "\nGrade: " + grade;
    }

}
