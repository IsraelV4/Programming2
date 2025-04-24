package Labs.lab10FileReaders;

import java.io.*;

public class reader {
    public static void main(String[] args) {
        try {
            String path = System.getProperty("user.dir") + "/classwork1.txt";

            // System.out.println("Accessing classwork1 from : " + path);

            FileInputStream a = new FileInputStream(path);
            byte[] arr = a.readAllBytes();
            for (int i=0; i<arr.length; i++) {
                System.out.println(arr[i] + ": " + (char)arr[i]);
            }
            a.close();
        }
        catch (Exception e) {
            System.err.println(e);
        }
    }
}
