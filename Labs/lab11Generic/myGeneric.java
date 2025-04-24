package Labs.lab11Generic;

public class myGeneric<T> {
    public T var1;
    public T var2;
    public myGeneric(T Var1, T Var2) {
        var1 = Var1;
        var2 = Var2;
    }

    public T getvar1() {
        return var1;
    }
    public void setvar1(T N) {
        var1 = N;
    }

    public T getvar2() {
        return var2;
    }
    public void setvar2(T N) {
        var2 = N;
    }

    public String toString() {
        return "This is variable 1: " + var1 + "\nAnd this is variable 2: " + var2;
    }

    public static void main(String[] args) {
        myGeneric<String> a = new myGeneric<String>("Hello World", "And then goodbye");
        System.out.println(a);
        a.setvar1("Remove");
        System.out.println("Getting var1: " + a.getvar1());
        System.out.println();

        myGeneric<Integer> b = new myGeneric<Integer>(52, 100);
        System.out.println(b);
        b.setvar2(99999);
        System.out.println("Getting var2: " + b.getvar2());
    }
}
