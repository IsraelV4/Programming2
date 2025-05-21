package Quizzes.Quiz1;

public class Father {
    String last_name, home_add, origin;

    public Father(String last_name, String home_add, String origin) {
        this.last_name = last_name;
        this.home_add = home_add;
        this.origin = origin;
    }

    public String toString() {
        return "last_name: " + last_name + "\nhome_add: " + home_add + "\norigin: " + origin;
    }
}
