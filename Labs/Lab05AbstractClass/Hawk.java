package Labs.Lab05AbstractClass;

public class Hawk extends Bird {

    public Hawk(boolean canfly, String food, String noise, int velocity) {
        super(canfly, food, noise, velocity);
    }

    boolean fly() {
        return fly;
    }
    int speed() {
        return speed;
    }
    String eat() {
        return eat;
    }
    String sound() {
        return sound;
    }
    
}
