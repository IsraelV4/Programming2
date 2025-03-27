package Labs.lab04MathAndInheritence;

public class Person {
    int age;
    boolean alive;
    String name, ssn;

    String getPaid() {
        return "None";
    }

    String getVacation() {
        return "None";
    }

    public static void main(String[] args) {
        Professor a = new Professor();
        Secretary b = new Secretary();
        Student_Worker c = new Student_Worker();

        Person[] arr = new Person[] {a,b,c};

        for (int i=0; i<arr.length; i++) {
            System.out.println("How much does this person earn? " + arr[i].getPaid());
            System.out.println("How much time off does this person get? " + arr[i].getVacation());
            System.out.println();
        }
    }
}
