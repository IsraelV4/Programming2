package Labs.examples;

import java.io.*;

public class test {
    public static void main(String[] args) {
        String data = "This is a line of text inside the file";

        try {
            FileOutputStream a = new FileOutputStream("output.txt");
            BufferedOutputStream b = new BufferedOutputStream(System.out);

            byte[] arr = data.getBytes();

            b.write(arr);
            b.close();
        }
        catch (Exception e) {
            e.getStackTrace();
        }
    }
}
