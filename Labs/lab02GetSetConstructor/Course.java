package Labs.lab02GetSetConstructor;

public class Course {
    public String Name;
    private String num;
    public String insName;
    private Student[] Slist;

    public String getName() {
        return Name;
    }

    public void setName(String a) {
        Name = a;
    }
    public String getnum() {
        return num;
    }

    public void setnum(String a) {
        num = a;
    }
    public String getinsName() {
        return insName;
    }

    public void setinsName(String a) {
        insName = a;
    }
    public Student[] getSlist() {
        return Slist;
    }

    public void setSlist(Student[] a) {
        Slist = a;
    }

    public Course() {
        Name = "Random";
        num = "123";
        insName = "Teacher";
        Slist = new Student[] {};
    }

    public Course(String a, String b, String c, Student[] d) {
        Name = a;
        num = b;
        insName = c;
        Slist = d;
    }

    public String toString() {
        String tmp = "This is course: " + Name + "\nIn room: " + num +"\nProfessor: " + insName+" teaches this course\n\n";

        for (int i=0; i<Slist.length; i++) {
            tmp+=Slist[i];
        }

        return tmp;
    }

    public static void main(String[] args) {
        Student a = new Student();
        Student b = new Student("B", "023840", 4, 19);
        Student c = new Student("C", "832409384", 5, 18);
        Student d = new Student("D", "983824u283", 6, 20);
        Student[] l1 = new Student[] {a, b, c};
        Student[] l2 = new Student[] {b, c, d};

        Course c1 = new Course("Course 1", "515", "Jacob", l1);
        Course c2 = new Course("Course 2", "515b", "Jacobed", l2);
        System.out.println(c1 +"\n\n"+c2);
    }
}
