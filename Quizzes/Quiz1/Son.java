package Quizzes.Quiz1;

//File 3
public class Son extends Father {
    String first_name, place_birth;
    int age;

    public Son(String last_name, String home_add, String origin, String first_name, int age, String place_birth) {
        super(last_name, home_add, origin);
        this.age = age;
        this.first_name = first_name;
        this.place_birth = place_birth;
    }

    public String toString() {
        return super.toString() + "\nfirst_name: " + first_name + "\nplace_birth: " + place_birth + "\nage: " + age;
    }
}
