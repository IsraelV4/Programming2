package Labs.lab03Inheritence;

public class Department{

/* The basic feature of a department */
    private String deptName;
    private int numMajors;
    private Teacher[] listTeachers; //inherits from Person class
    private Student[] listStudents; //inherits from Person class

/* Construct a department object (at least TWO constructors) */

public Department(String name, int n, Teacher[] T, Student[] S) {
    deptName = name;
    numMajors = n;
    listStudents = S;
    listTeachers = T;
}

public Department(Department a) {
    setdeptName(a.getdeptName());
    setnumMajors(a.getnumMajors());
    setlistTeachers(a.getlistTeachers());
    setlistStudents(a.getlistStudents());
}

public String getdeptName() {
    return deptName;
}
public void setdeptName(String v) {
    deptName = v;
}


public int getnumMajors() {
    return numMajors;
}
public void setnumMajors(int v) {
    numMajors = v;
}

public Teacher[] getlistTeachers() {
    return listTeachers;
}
public void setlistTeachers(Teacher[] v) {
    listTeachers = v;
}

public Student[] getlistStudents() {
    return listStudents;
}
public void setlistStudents(Student[] v) {
    listStudents = v;
}

/* Accessors and mutators (one pair per each feature) */

public String toString() {
    String tmp = "";
    tmp+="Department name: " + deptName +"\n" + "Number of majors: " + numMajors + "\n";
    for (int i=0; i<listTeachers.length; i++) {
        tmp+=listTeachers[i] +"\n\n";
    }
    for (int i=0; i<listTeachers.length; i++) {
        tmp+=listTeachers[i]+"\n\n";
    }
    return tmp;
}


/*  Also write a main method that will use one of constructors to create two Department objects. 
Your main method should print out the details of these two Departments (each department with at least 5 students and 3 teachers).
*/
public static void main(String[] args) {
    Teacher a = new Teacher("12345", 500, 5, "James1", "123456789", 23, true);
    Teacher b = new Teacher("12345", 500, 5, "James2", "123456789", 23, true);
    Teacher c = new Teacher("12345", 500, 5, "James3", "123456789", 23, true);
    Teacher d = new Teacher("12345", 500, 5, "James4", "123456789", 23, true);

    Student e = new Student("null", "null", 0, "null0", "null", 0, false);
    Student f = new Student("null", "null", 0, "null1", "null", 0, false);
    Student g = new Student("null", "null", 0, "null2", "null", 0, false);
    Student h = new Student("null", "null", 0, "null3", "null", 0, false);
    Student i = new Student("null", "null", 0, "null4", "null", 0, false);
    Student j = new Student("null", "null", 0, "null5", "null", 0, false);

    Teacher[] t1 = new Teacher[] {a, b, c};
    Teacher[] t2 = new Teacher[] {b, c, d};

    Student[] s1 = new Student[] {e, f, g, h, i};
    Student[] s2 = new Student[] {f, g, h, i, j};

    Department d1 = new Department("Dep1", 5, t1, s1);
    Department d2 = new Department(d1);
    d2.setdeptName("Dep2");
    d2.setlistStudents(s2);
    d2.setlistTeachers(t2);

    System.out.println(d1);
    System.out.println("=======================================================");
    System.out.println(d2);

}

}

// Fill in the blanks above according to the guidelines in the comments. Also write a main method that will use one of constructors to create two Department objects. Your main method should print out the details of these two Departments (each department with at least 5 students and 3 teachers).