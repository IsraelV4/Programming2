package Labs.lab05AbstractClass;

public class Eagle extends Bird {

    public Eagle(boolean canfly, String food, String noise, int velocity) {
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
