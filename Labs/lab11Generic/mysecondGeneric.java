package Labs.lab11Generic;

public class mysecondGeneric<T, D> {
    T var1;
    D var2;
    public mysecondGeneric(T Var1, D Var2) {
        var1 = Var1;
        var2 = Var2;
    }

    public T getvar1() {
        return var1;
    }
    public void setvar1(T N) {
        var1 = N;
    }

    public D getvar2() {
        return var2;
    }
    public void setvar2(D N) {
        var2 = N;
    }

    public String toString() {
        return "This is variable 1: " + var1 + "\nAnd this is variable 2: " + var2;
    }

    public static void main(String[] args) {
        mysecondGeneric<String, String> a = new mysecondGeneric<String, String>("Hello World", "And then goodbye");
        System.out.println(a);
        a.setvar2("Remove");
        System.out.println("Getting var2: " + a.getvar2());
        System.out.println();

        mysecondGeneric<Integer, String> b = new mysecondGeneric<Integer, String>(52, "Fifty two");
        System.out.println(b);
        b.setvar1(47);
        System.out.println("Getting var1: " + b.getvar1());
    }
}
