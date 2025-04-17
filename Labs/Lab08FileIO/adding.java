import java.util.*;
import java.util.Arrays;


public class adding {
    
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

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
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

}