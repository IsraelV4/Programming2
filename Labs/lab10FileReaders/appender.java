package Labs.lab10FileReaders;

import java.io.*; 

public class appender {
    public static void main(String[] args) {
        
        try {
            String file = System.getProperty("user.dir") + "/classwork2.txt";
            FileOutputStream a = new FileOutputStream(file);
            String data = "This is my first OutputStream data";
            if (args.length>0) {
                for (int i=0; i<3; i++) {
                    data = data + "\n\n" + data;
                }
            }
            a.write(data.getBytes());
            a.close();
        } 
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
