import java.util.*;
import java.io.*;

public class factorial {
    public static int Fact(int n) {
        if (n>1) {
            System.out.print(n + " * ");
            return n*Fact(n-1);
        }
        else if (n==1) {
            System.out.print(n);
            return n*Fact(n-1);
        }
        return 1;
    }

    public static void main(String[] args) {
        System.out.print("Enter a factorial number: ");
        int n = input.nextInt();
        int total = Fact(n);
        System.out.print(" = " + total);
        input.close();
    }
}