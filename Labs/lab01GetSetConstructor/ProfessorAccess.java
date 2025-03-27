package Labs.lab01GetSetConstructor;

public class ProfessorAccess {
    public static void main(String[] args) {
        Professor p1 = new Professor("p1", "cs", 10.0, 12);
        Professor p2 = new Professor(p1);
        Professor p3 = new Professor(p1);
        p2.setname("p2");
        p2.setdepartment("nothing");
        p2.setsalary(100);
        p2.setyears(1);

        Professor[] list = new Professor[] {p1, p2, p3};

        for (int i=0; i<list.length; i++) {
            System.out.println("Name: " + list[i].getname() + "\ndepartment: " + list[i].getdepartment() + "\nsalary: " + list[i].getsalary()+"\nyears: "+ list[i].getyears());
            System.out.println();
            System.out.println(list[i]);
            System.out.println(); System.out.println();
        }
    }
}
