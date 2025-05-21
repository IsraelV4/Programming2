package Quizzes.Quiz2;

import java.util.*;

public class add {
    public static int adds(int i, int a) {
        if (i==0) {
            System.out.print(a + " = ");
            return a;
        }
        else {
            int adder = a-i;
            System.out.print(adder + " + ");
            return adder + adds(i-1,a);
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please input the first number");
        int a = input.nextInt();
        System.out.println("Please input the end number");
        int b = input.nextInt();
        System.out.println();
        System.out.println(adds(b-a, b));
        input.close();
    }
}
