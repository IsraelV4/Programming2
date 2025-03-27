package HW.HW2;

public class Department {
    Professor chair;
    Professor[] faculty;
    Course[] courses;

    public Department(Professor Chair, Professor[] Faculty, Course[] Courses) { 
        chair = Chair;
        faculty = Faculty;
        courses = Courses;
    }

    public Professor getchair() {
        return chair;
    }
    protected void setchair(Professor v) {
        chair = v;
    }
    
    public Professor[] getfaculty() {
        return faculty;
    }
    protected void setfaculty(Professor[] v) {
        faculty = v;
    }
    
    public Course[] getcourses() {
        return courses;
    }
    protected void setcourses(Course[] v) {
        courses = v;
    }

    public String toString() {
        String tmp = "This is a department, and here is its head: \n" + chair;

        tmp+="\n\nAnd here are it's professors:\n(\n";
        for (int i=0; i<faculty.length; i++) {
            tmp+=faculty[i];
            if (i!=faculty.length-1) {
                tmp+="\n,\n";
            }
        }
        tmp+= "\n)\n\nBut every department needs its courses:\n[\n";
        for (int i=0; i<courses.length; i++) {
            tmp+=courses[i];
            if (i!=courses.length-1) {
                tmp+="\n,\n";
            }
        }
        tmp+= "\n]";


        return tmp;
    }
}
