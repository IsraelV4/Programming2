package Labs.lab01GetSetConstructor;

public class StudentAcess {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student();
        Student s3 = new Student("Israel", "0246810", 4, 18);
        Student[] list = new Student[] {s1, s2, s3};

        s2.setName("Randome name");
        s2.setage(37);
        s2.setgpa(2);
        s2.setstu_id("123456789");

        for (int i=0; i<list.length; i++) {
            System.out.println("Name of Student " + (i+1) + ": " + list[i].getName());
            System.out.println("stu_id of Student " + (i+1) + ": " + list[i].getstu_id());
            System.out.println("gpa of Student " + (i+1) + ": " + list[i].getgpa());
            System.out.println("age of Student " + (i+1) + ": " + list[i].getage());
            System.out.println(); System.out.println();
        }
    }
}
