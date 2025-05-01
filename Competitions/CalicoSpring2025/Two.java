package Competitions.CalicoSpring2025;
import java.util.*;
import java.io.*;
public class Two {



    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        while (t>0) {
            long n = input.nextLong();
            String total = "u";

            int add = (int)((Math.sqrt(1+8*n)-1)/2);
            for (int i=add;i>0; i--) {
                if ((n-i*(1+i)/2)%i==0) {
                    for (int j=0; j<i; j++) {
                        total+="wu";
                    }
                    n-=(i*(1+i)/2);
                    n/=i;
                    for (int j=0; j<n; j++) {
                        total+="u";
                    }
                    System.out.println(total);
                    i=-1;
                }
            }
            t--;
        }
        input.close();
    }
}
