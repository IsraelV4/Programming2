package HW.HW2;

public class Course {
    
    Professor Instructor;
    CollegeStudent[] Students;
    String Name;

    public Course(Professor instructor, CollegeStudent[] students, String name) {
        Instructor = instructor;
        Students = students;
        Name = name;
    }

    
    public Professor getInstructor() {
        return Instructor;
    }
    protected void setInstructor(Professor v) {
        Instructor = v;
    }
    
    public CollegeStudent[] getStudents() {
        return Students;
    }
    protected void setStudents(CollegeStudent[] v) {
        Students = v;
    }
    
    public String getName() {
        return Name;
    }
    protected void setName(String v) {
        Name = v;
    }

    public String toString() {
        String tmp = "This is a course, and it's called: " + Name + "\nThis course has an instructor: " + Instructor + "\nAnd it also has some students within it\n\n{\n";

        for (int i=0; i<Students.length; i++) {
            tmp+=Students[i];
            if (i!=Students.length-1) {
                tmp+="\n,\n";
            }
        }
        tmp+= "\n}";


        return tmp;
    }
}
