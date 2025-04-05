package Labs.lab06ErrorHandling;

import java.util.*;

public class three {
    public static void main(String[] args) throws Exception{
        ArrayList<Integer> a = new ArrayList<>();
        System.out.println("Send me your numbrs");
        System.out.println();
        Scanner input = new Scanner(System.in);
        String tmp = input.nextLine();
        String[] arr = tmp.split(" ");
        input.close();
        for (int i=0; i<arr.length; i++) {
            int n = Integer.parseInt(arr[i]);
            if (a.contains(n)) {
                throw new Exception("No duplicates please");
            }
            a.add(n);
        }
    }
}
