package HW.HW2;

public class CollegeStudent extends Student {

    String major, grade;
    
    public CollegeStudent(String name, String SSN, boolean notdead, int Age, String ID, double GPA, String Major, String Grade) {
        super(name, SSN, notdead, Age, ID, GPA);
        major = Major;
        grade = Grade;
    }

    
    public String getmajor() {
        return major;
    }
    public void setmajor(String v) {
        major = v;
    }
    
    public String getgrade() {
        return grade;
    }
    public void setgrade(String v) {
        grade = v;
    }

    public String toString() {
        return super.toString() + "\nThis student goes to college, and their current major is: " + major + "\nHere's their current grade: " + grade;
    }
}
