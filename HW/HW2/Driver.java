package HW.HW2;

import java.util.*;

public class Driver {

    public static void printRepeat(String s, int n) {
        while (n!=0) {
            System.out.print(s);
            n--;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Professor p1 = new Professor("one", "12345678", true, 50, "12345678", 100, 0, "Math", "Math", "5", false);
        Professor p2 = new Professor("two", "12345678", true, 51, "12345678", 100, 0, "Scient", "Math", "3", false);
        Professor p3 = new Professor("three", "12345678", true, 53, "12345678", 100, 0, "Technology", "Math", "4", false);

        CollegeStudent s1 = new CollegeStudent("Sone", "12345678", true, 18, "12345678", 3.7, "CS", "A");
        CollegeStudent s2 = new CollegeStudent("Stwo", "12345678", true, 18, "12345678", 3.8, "CS", "A+");
        CollegeStudent s3 = new CollegeStudent("Sthree", "12345678", true, 18, "12345678", 3.9, "CS", "A++");
        CollegeStudent s4 = new CollegeStudent("Sfour", "12345678", true, 18, "12345678", 4, "CS", "A+++");

        CollegeStudent[] sArr1 = new CollegeStudent[] {s1, s2, s3};
        CollegeStudent[] sArr2 = new CollegeStudent[] {s2, s3, s4};
        CollegeStudent[] sArr3 = new CollegeStudent[] {s3, s4, s1};

        Professor[] fArr1 = new Professor[] {p1, p2};
        Professor[] fArr2 = new Professor[] {p2, p3};

        Course c1 = new Course(p3, sArr1, "Programming 1");
        Course c2 = new Course(p2, sArr2, "Programming 2");
        Course c3 = new Course(p1, sArr3, "Calculus 1");

        Course[] cArr1 = new Course[] {c1, c2};
        Course[] cArr2 = new Course[] {c2, c3};

        Department d1 = new Department(p1, fArr1, cArr1);
        Department d2 = new Department(p3, fArr2, cArr2);


        printRepeat("\n", 4);
        System.out.println("Please press enter to see the first department");
        printRepeat("\n", 4);
        if (args.length>0 && args[0].equals("pause")) {
            input.nextLine();
        }

        System.out.println("First Department: " + d1);

        System.out.println();
        printRepeat("=", 75);
        printRepeat("=", 75);
        printRepeat("=", 75);
        printRepeat("\n", 4);
        System.out.println("Please press enter to see the second department");
        printRepeat("\n", 4);
        if (args.length>0 && args[0].equals("pause")) {
            input.nextLine();
        }

        System.out.println("Second Department: " + d2);






        printRepeat("\n", 5);
        printRepeat("==", 50);
        printRepeat("==", 50);
        printRepeat("==", 50);
        printRepeat("\n", 5);




        System.out.println("Please press enter to see the Extra credit part");
        printRepeat("\n", 4);
        if (args.length>0 && args[0].equals("pause")) {
            input.nextLine();
        }
        




        System.out.println("Professors and students can access a departments and course's information using getDepartmentchair(Department dep), getDepartmentfaculty(Department dep), getDepartmentcourse(Department dep), as well as getCourseName(Course course), getCourseInstructor(Course course), and getCourseStudents(Course course)");
        System.out.println("\nHowever, only the professor class can use the set version of those functions, as shown\n\n");

        p1.setname("Professor");
        s1.setname("Student");

        System.out.println(p1.getname() + " will attempt to use getDepartmentchair");
        System.out.println(p1.getDepartmentchair(d1) + "\n\n");

        System.out.println(p1.getname() + " will attempt to use getDepartmentfaculty");
        System.out.println(Arrays.toString(p1.getDepartmentfaculty(d1)) + "\n\n");

        System.out.println(p1.getname() + " will attempt to use getDepartmentcourses");
        System.out.println(Arrays.toString(p1.getDepartmentcourses(d1)) + "\n\n");


        System.out.println(p1.getname() + " will attempt to use getCourseName");
        System.out.println(p1.getCourseName(c1) + "\n\n");

        System.out.println(p1.getname() + " will attempt to use getCourseStudents");
        System.out.println(Arrays.toString(p1.getCourseStudents(c1)) + "\n\n");

        System.out.println(p1.getname() + " will attempt to use getCourseInstructor");
        System.out.println(p1.getCourseInstructor(c1) + "\n\n");


        printRepeat("==", 50);
        System.out.println("Now here come the Student Attempts");
        printRepeat("==", 50);
        printRepeat("\n", 2);


        System.out.println(s1.getname() + " will attempt to use getDepartmentchair");
        System.out.println(s1.getDepartmentchair(d1) + "\n\n");

        System.out.println(s1.getname() + " will attempt to use getDepartmentchair");
        System.out.println(Arrays.toString(s1.getDepartmentfaculty(d1)) + "\n\n");

        System.out.println(s1.getname() + " will attempt to use getDepartmentchair");
        System.out.println(Arrays.toString(s1.getDepartmentcourses(d1)) + "\n\n");

        

        System.out.println(s1.getname() + " will attempt to use getCourseName");
        System.out.println(s1.getCourseName(c1) + "\n\n");

        System.out.println(s1.getname() + " will attempt to use getCourseStudents");
        System.out.println(Arrays.toString(s1.getCourseStudents(c1)) + "\n\n");

        System.out.println(s1.getname() + " will attempt to use getCourseInstructor");
        System.out.println(s1.getCourseInstructor(c1) + "\n\n");



        System.out.println("However, here we will test the set methods");
        printRepeat("\n", 4);
        System.out.println("Please press enter to see the set part");
        printRepeat("\n", 4);
        if (args.length>0 && args[0].equals("pause")) {
            input.nextLine();
        }

        try {
            System.out.println(p1.getname() + " will attempt to use setDepartmentchair");
            p1.setDepartmentchair(d1, p2);
            System.out.println(p1.getDepartmentchair(d1) + "\n\n");
        }
        catch(Exception e) {
            System.out.println(e);
            System.out.println();
        }
        try {
            System.out.println(p1.getname() + " will attempt to use setDepartmentfaculty");
            p1.setDepartmentfaculty(d1, fArr2);
            System.out.println(Arrays.toString(p1.getDepartmentfaculty(d1)) + "\n\n");
        }
        catch(Exception e) {
            System.out.println(e);
            System.out.println();
        }
        try {
        System.out.println(p1.getname() + " will attempt to use setDepartmentcourses");
        p1.setDepartmentcourses(d1, cArr2);
        System.out.println(Arrays.toString(p1.getDepartmentcourses(d1)) + "\n\n");
        }
        catch(Exception e) {
            System.out.println(e);
            System.out.println();
        }

        try {
            System.out.println(p1.getname() + " will attempt to use setCourseName");
            p1.setCourseName(c1, c2.getName());
            System.out.println(p1.getCourseName(c1) + "\n\n");
        }
        catch(Exception e) {
            System.out.println(e);
            System.out.println();
        }
        try {
            System.out.println(p1.getname() + " will attempt to use setCourseInstructor");
            p1.setCourseInstructor(c1, p2);
            System.out.println(p1.getCourseInstructor(c1) + "\n\n");
        }
        catch(Exception e) {
            System.out.println(e);
            System.out.println();
        }
        try {
        System.out.println(p1.getname() + " will attempt to use setCourseStudents");
        p1.setCourseStudents(c1, sArr2);
        System.out.println(Arrays.toString(p1.getCourseStudents(c1)) + "\n\n");
        }
        catch(Exception e) {
            System.out.println(e);
            System.out.println();
        }


        printRepeat("==", 50);
        System.out.println("Now here come the Student Attempts");
        printRepeat("==", 50);
        printRepeat("\n", 2);


        try {
            System.out.println(s1.getname() + " will attempt to use setDepartmentchair");
            s1.setDepartmentchair(d1, p2);
            System.out.println(s1.getDepartmentchair(d1) + "\n\n");
        }
        catch(Exception e) {
            System.out.println(e);
            System.out.println();
        }
        try {
            System.out.println(s1.getname() + " will attempt to use setDepartmentfaculty");
            s1.setDepartmentfaculty(d1, fArr2);
            System.out.println(Arrays.toString(s1.getDepartmentfaculty(d1)) + "\n\n");
        }
        catch(Exception e) {
            System.out.println(e);
            System.out.println();
        }
        try {
        System.out.println(s1.getname() + " will attempt to use setDepartmentcourses");
        s1.setDepartmentcourses(d1, cArr2);
        System.out.println(Arrays.toString(s1.getDepartmentcourses(d1)) + "\n\n");
        }
        catch(Exception e) {
            System.out.println(e);
            System.out.println();
        }

        try {
            System.out.println(s1.getname() + " will attempt to use setCourseName");
            s1.setCourseName(c1, c2.getName());
            System.out.println(s1.getCourseName(c1) + "\n\n");
        }
        catch(Exception e) {
            System.out.println(e);
            System.out.println();
        }
        try {
            System.out.println(s1.getname() + " will attempt to use setCourseInstructor");
            s1.setCourseInstructor(c1, p2);
            System.out.println(s1.getCourseInstructor(c1) + "\n\n");
        }
        catch(Exception e) {
            System.out.println(e);
            System.out.println();
        }
        try {
        System.out.println(s1.getname() + " will attempt to use setCourseStudents");
        s1.setCourseStudents(c1, sArr2);
        System.out.println(Arrays.toString(s1.getCourseStudents(c1)) + "\n\n");
        }
        catch(Exception e) {
            System.out.println(e);
            System.out.println();
        }

        System.out.println("These errors are meant to be here as I am testing the Students ability to set the department/course, and discovering that they are not able to");
        input.close();
    }
}
