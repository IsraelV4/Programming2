package Quizzes.Quiz2;

import java.io.*;
import java.util.*;

public class Final {
    RandomAccessFile file;
    public Final(String filePath) throws Exception{
        file = new RandomAccessFile(filePath, "rw");
    }

// 1. You should create a sample.txt file in any location in your computer. (Check)

// 2. In the sample.txt file, manually write "This is the Final Exam of this Class". (Check)

// 2. You should define a method "writeTofile()" which can append "I love CSCI-185" into the sample.txt file. (Check - Even appends other things if you want it to)

// 3. You should define another method "readFromfile()" which can read "This is the Final Exam of this Class" from the sample.txt file. (Check - Even reads anything that was appended)

// Print out the result of the read file. (Check)

    public void writeTofile(String edit) throws Exception {
        file.seek(0);
        ArrayList<Byte> arr = new ArrayList<Byte>();
        byte tmp = 0;
        while (tmp!=-1) {
            tmp = (byte)file.read();
            arr.add(tmp);
        }
        byte[] a = new byte[arr.size()];

        file.seek(0);
        file.read(a);
        file.write(edit.getBytes());
    }

    public void writeTofile() throws Exception {
        String edit = "I love CSCI-185";
        file.seek(0);
        ArrayList<Byte> arr = new ArrayList<Byte>();
        byte tmp = 0;
        while (tmp!=-1) {
            tmp = (byte)file.read();
            arr.add(tmp);
        }
        byte[] a = new byte[arr.size()];

        file.seek(0);
        file.read(a);
        file.write(edit.getBytes());
    }

    public void readFromFile() throws Exception {
        file.seek(0);
        ArrayList<Byte> arr = new ArrayList<Byte>();
        byte tmp = 0;
        while (tmp!=-1) {
            tmp = (byte)file.read();
            arr.add(tmp);
        }
        byte[] a = new byte[arr.size()];

        file.seek(0);
        file.read(a);
        System.out.println(new String(a));
    }

    public static void main(String[] args) {
        try {
            Final f = new Final(System.getProperty("user.dir") + "/sample.txt"); // Current directory the user is in in the terminal
            String append = "I love CSCI-185";
            f.readFromFile(); // Read the file
            f.writeTofile(); // Write's down specifically 'I love CSCI-185', I have another method that writes what you want writeToFile(String edit)
            // f.writeTofile(append);
            f.readFromFile(); // Read's the file and it's changes
        }
        catch (Exception e) {

        }
    }
}