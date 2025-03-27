package Labs.lab03Inheritence;

public class Driver {
    public static void main(String[] args) {
        Student a = new Student("abc123", "A", 4.0, "Jack", "12345678", 18, true);
        Teacher b = new Teacher("CBA321", 100, 10, "James", "87654321", 40, true);
        System.out.println(a);
        System.out.println();
        System.out.println(b);
    }
}
