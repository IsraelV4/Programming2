package Labs.examples;

import java.io.*;

public class randomAccessFileExample {
    static final String path = System.getProperty("user.dir") + "/output.txt";
    public static void main(String[] args) {
        try {
            System.out.println(new String(readFromFile(path, 0, 52)));
            writetoFile(path, "I love my country and my people", 55);
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
    private static void writetoFile(String path2, String string, int position) throws IOException{
        RandomAccessFile r = new RandomAccessFile(path2, "rw");
        r.seek(position);
        r.write(string.getBytes());
        r.close();
    }
    private static byte[] readFromFile(String path2, int position, int size) throws IOException {
        RandomAccessFile r = new RandomAccessFile(path2, "r");
        r.seek(position);
        byte[] bytes = new byte[size];
        r.read(bytes);
        r.close();
        return bytes;
    }
}
