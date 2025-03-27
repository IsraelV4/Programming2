package Labs.Lab05AbstractClass;

public abstract class Bird {

    public Bird(boolean canfly, String food, String noise, int velocity) {
        fly = canfly;
        eat = food;
        sound = noise;
        speed = velocity;
    }

    abstract boolean fly();
    abstract int speed();
    abstract String eat();
    abstract String sound();

    boolean fly;
    String eat, sound;
    int speed;

    public boolean sameeat(Bird a) {
        return a.eat.equals(eat);
    }

    public boolean samespeed(Bird a) {
        return a.speed == speed;
    }

    public static void main(String[] args) {
        Eagle e1 = new Eagle(true, "null", "caw", 50);
        Eagle e2 = new Eagle(true, "null", "craw", 70);

        Hawk h1 = new Hawk(true, "seed", "caw", 70);
        Hawk h2 = new Hawk(true, "seed", "craw", 50);

        Bird[] arr = new Bird[] {e1, e2, h1, h2};

        for (int i=0; i<arr.length; i++) {
            for (int j=i+1; j<arr.length; j++) {
                System.out.println("Same Speed between " +i + " and " + j + "?: " + arr[i].samespeed(arr[j]));
            }

            for (int j=i+1; j<arr.length; j++) {
                System.out.println("Same diet between " +i + " and " + j + "?: " + arr[i].sameeat(arr[j]));
            }
            System.out.println();
        }
    }
}
