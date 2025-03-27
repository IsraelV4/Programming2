package HW.HW2;

public class Student extends Person {

    String id;
    double gpa;
    public Student(String name, String SSN, boolean notdead, int Age, String ID, double GPA) {
        super(name, SSN, notdead, Age);
        id = ID;
        gpa = GPA;
    }
        
    public String getid() {
        return id;
    }
    public void setid(String v) {
        id = v;
    }
        
    public double getgpa() {
        return gpa;
    }
    public void setgpa(double v) {
        gpa = v;
    }

    public String getCourseName(Course course) {
        return course.getName();
    }
    public Professor getCourseInstructor(Course course) {
        return course.getInstructor();
    }
    public CollegeStudent[] getCourseStudents(Course course) {
        return course.getStudents();
    }

    
    public Professor getDepartmentchair(Department dep) {
        return dep.getchair();
    }
    public Professor[] getDepartmentfaculty(Department dep) {
        return dep.getfaculty();
    }
    public Course[] getDepartmentcourses(Department dep) {
        return dep.getcourses();
    }

    public void setDepartmentchair(Department dep, Professor newChair) throws Exception {
        throw new Exception("Student should not access this method");
    }
    public void setDepartmentfaculty(Department dep, Professor[] newfaculty) throws Exception {
        throw new Exception("Student should not access this method");
    }
    public void setDepartmentcourses(Department dep, Course[] newcourses) throws Exception {
        throw new Exception("Student should not access this method");
    }
    public void setCourseName(Course course, String name) throws Exception {
        throw new Exception("Student should not access this method");
    }
    public void setCourseInstructor(Course course, Professor prof) throws Exception {
        throw new Exception("Student should not access this method");
    }
    public void setCourseStudents(Course course, CollegeStudent[] stud) throws Exception {
        throw new Exception("Student should not access this method");
    }

    public String toString() {
        return super.toString() + "\nThey are a student, and their ID is: " + id + "\nYou can check on their GPA here: " + gpa;
    }
}
