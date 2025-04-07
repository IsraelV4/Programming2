package Competitions.TeamCodeSpring2025;

import java.util.*;
import java.io.*;

@SuppressWarnings("unused")
public class two {

    //a cell tower at (r,c) covers all houses (r′,c′), such that c ≤ c′, and r′+c′ ≤ r+c

    public static int solve(ArrayList<Integer> y, ArrayList<Integer> x, ArrayList<Integer> pair) {

        // Solve
        int c = Collections.min(x);
        int ans = Collections.max(pair) - c; // r

        return ans;
    }

    public static void split(ArrayList<Integer> y, ArrayList<Integer> x, ArrayList<Integer> pair, ArrayList<Integer> y1, ArrayList<Integer> x1, ArrayList<Integer> pair1) {
        int index = pair.indexOf(Collections.max(pair));
        y1.add(y.remove(index));
        x1.add(x.remove(index));
        pair1.add(pair.remove(index));
    }

    public static int recursion(ArrayList<Integer> y, ArrayList<Integer> x, ArrayList<Integer> pair, ArrayList<Integer> y1, ArrayList<Integer> x1, ArrayList<Integer> pair1) {

        
        int ans = solve(y,x,pair);
        split(y, x, pair, y1, x1, pair1);







        return -1;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = Integer.parseInt(input.nextLine()); // number of houses
        int[][] arr = new int[n][3];
        for (int i=0; i<n; i++) {
            arr[i][1] = input.nextInt();
            arr[i][2] = input.nextInt();
            arr[i][0] = arr[i][1]+arr[i][2];
        }
        myHeap.heapSort(arr);
        List<int[]> a = Arrays.asList(arr);

        for (int i=arr.length-1; i>0; i--) {
            int x = a.get(i)[2];
            int y = a.get(i)[1];
            int pair = a.get(i)[0];
            for (int j=i-1; j>=0; j--) {
                int x1 = a.get(j)[2];
                int y1 = a.get(j)[1];
                int pair1 = a.get(j)[0];
                if (pair1<=pair && x1>=x) {
                    a.remove(j);
                    i--;
                }
            }
        }
        ArrayList<int[]> b = new ArrayList<>();

        int[] ans = new int[n];
        int tracker = 0;
        int total = a.get(a.size()-1)[0];

        for (int i=0; i<n; i++) {
            int tmp = a.get(n-i-1)[0]-a.get(0)[2];
            if (i!=0) {
                tracker+=a.get(n-i)[1];
                int place = total-a.get(n-i)[2];
                if (place>=tracker) {
                    tmp+=tracker;
                }
                else {
                    tmp+=place;
                }
            }
            ans[i]=tmp;
        }
        
        
        

        


        input.close();
    }
    
}
