package HW.HW2;

public class Professor extends Teacher {

    String specialty, researchArea, rank;
    boolean tenured;

    public Professor(String name, String SSN, boolean notdead, int Age, String ID, int Sal, int Yr, String special, String research, String Rank, boolean notworking) {
        super(name, SSN, notdead, Age, ID, Sal, Yr);
        specialty = special;
        researchArea = research;
        rank = Rank;
        tenured = notworking;
    }
    
    public String getspecialty() {
        return specialty;
    }
    public void setspecialty(String v) {
        specialty = v;
    }
    
    public String getresearchArea() {
        return researchArea;
    }
    public void setresearchArea(String v) {
        researchArea = v;
    }
    
    public String getrank() {
        return rank;
    }
    public void setrank(String v) {
        rank = v;
    }
    
    public boolean gettenured() {
        return tenured;
    }
    public void settenured(boolean v) {
        tenured = v;
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

    public void setDepartmentchair(Department dep, Professor newChair) {
        dep.setchair(newChair);
    }
    public void setDepartmentfaculty(Department dep, Professor[] newfaculty) {
        dep.setfaculty(newfaculty);
    }
    public void setDepartmentcourses(Department dep, Course[] newcourses) {
        dep.setcourses(newcourses);
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

    public void setCourseName(Course course, String name) {
        course.setName(name);
    }
    public void setCourseInstructor(Course course, Professor prof) {
        course.setInstructor(prof);
    }
    public void setCourseStudents(Course course, CollegeStudent[] stud) {
        course.setStudents(stud);
    }

    public String toString() {
        return super.toString() + "\nThis teacher is a professor, and their specialty/research Area is: " + specialty +" and " + researchArea + " respecitvely\nTheir current ranke is: " + rank +"\nAnd you can see their tenured status here: " + tenured;
    }
}
