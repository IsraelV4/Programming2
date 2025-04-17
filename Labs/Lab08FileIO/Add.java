package Labs.lab08FileIO;

import java.util.*;
import java.util.Arrays;


public class Add {
    
    public static int add(int n, int stop) {
        if (n>stop) {
            System.out.print(n + " + ");
            return n + add(n-1, stop);
        }
        if (n==stop) {
            System.out.print(n);
            return n + add(n-1, stop);
        }
        else {
            System.out.print(" = ");
            return 0;
        }
    }

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

    public static void HCF(int n, int n2, int n3) {
        if ((n2/n)*n==n2 && (n3/n)*n==n3) {
            System.out.println(n + " is the HCF");
            return;
        }
        HCF(n-1, n2, n3);
    }

    public static int F(int n) {
        if (n<=0) {
            return 0;
        }
        else if (n==1) {
            return 1;
        }
        return F(n-1) + F(n-2);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] choices = new String[] {"add", "Factorial", "HCF", "Fib"};
        System.out.print("What would you like to do?\n" + Arrays.toString(choices) + ": ");
        String hold = input.next();
        if (hold.equals(choices[0])) {
            System.out.print("Starting Number: ");
            int n1 = input.nextInt();
            System.out.print("End number: ");
            int n2 = input.nextInt();
            int[] arr = new int[] {n1, n2};
            Arrays.sort(arr);
            int total = add(arr[1], arr[0]);
            System.out.print(total);
            input.close();
        }
        else if (hold.equals(choices[1])) {
            System.out.print("Enter a factorial number: ");
            int n = input.nextInt();
            int total = Fact(n);
            System.out.print(" = " + total);
            input.close();
        }
        else if (hold.equals(choices[2])) {
            System.out.print("Enter the first number: ");
            int n1 = input.nextInt();
            System.out.print("Enter the second number: ");
            int n2 = input.nextInt();
            int[] arr = new int[] {n1, n2};
            Arrays.sort(arr);
            HCF(arr[0], arr[0], arr[1]);
        }
        else if (hold.equals(choices[3])) {
            System.out.print("Enter Fib number: ");
            int n = input.nextInt();
            for (int i=0; i<n; i++) {
                System.out.println("Fib number " + i + ": " + F(i));
            }
        }
        else {
            System.out.println("Invalid input. Please try again");
            main(args);
        }
    }

}
