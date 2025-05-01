package Competitions.CalicoSpring2025;
import java.util.*;
import java.io.*;
public class One {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int T = Integer.parseInt(input.nextLine());
        while (T>0) {
            input.nextLine();
            String s = input.nextLine();
            int total = 0;
            int tmp = 1;
            for (int i=0; i<s.length(); i++) {
                if (s.charAt(i)=='T') {
                    total +=tmp;
                    tmp = 1;
                }
                else {
                    tmp*=2;
                }
            }
            System.out.println(total);
            T--;
        }
    }
}
