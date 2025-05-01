package Competitions.CalicoSpring2025;

import java.util.Scanner;

public class Checker {
    public static String solve(int n) {
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
                i=-1;
                return total;
            }
        }
        return "";
        
    }

    public static void main(String[] args) {
        int t = Integer.parseInt(args[0]);
        String storage = "";
        int ne = t-60000;
        while (t>ne) {
            String tmp = solve(t);
            // System.out.println(t + ": " + tmp);
            if (tmp.length()==0) {
                storage+=t + ", ";
            }
            if (t%1000==0) {
                System.out.println(t);
            }
            t--;
        }
        System.out.println("Numbers: " + storage);
    }
}
