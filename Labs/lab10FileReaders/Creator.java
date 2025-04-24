package Labs.lab10FileReaders;

import java.io.*;
import java.util.*;

public class Creator {
    static String path = System.getProperty("user.dir") + "/access.txt";
    static int size = 0;

    public static void main(String[] args) throws Exception {
        RandomAccessFile a = new RandomAccessFile(path, "rw");
        Scanner input = new Scanner(System.in);
        String[] actions = new String[] {"read", "write", "quit"};
        System.out.println("What would you like to do? : " + Arrays.toString(actions));
        String tmp = input.nextLine();

        if (tmp.equals(actions[0])) {
            a.seek(0);
            byte[] bytes = new byte[size];
            a.read(bytes);
            System.out.println(new String(bytes));
        }
        else if (tmp.equals(actions[1])) {
            System.out.print("Write to the file: ");
            tmp = input.nextLine() + "\n";

            a.seek(size);
            a.write(tmp.getBytes());
            size+=tmp.getBytes().length;
        }
        else if (!tmp.equals(actions[2])) {
            System.out.println("Invalid input, please try selecting something from this list");
            System.out.println(Arrays.toString(actions));
        }
        if (!tmp.equals(actions[2])) {
            main(args);
        }
        else {
            a.close();
            input.close();
        }
    }
}
