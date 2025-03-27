package Labs.Lab06ErrorHandling;

import java.util.*;

public class Test {
    public static void main(String[] args) throws Exception{
        Scanner input = new Scanner(System.in);
        String tmp = input.nextLine();
        if (tmp.contains("a") || tmp.contains("e") || tmp.contains("i") || tmp.contains("o") || tmp.contains("u") || tmp.contains("A") || tmp.contains("E") || tmp.contains("I") || tmp.contains("O") || tmp.contains("U")) {
            System.out.println("You passed :D");
        }
        else {
            input.close();
            throw new Exception("No vowels detected");
        }
        input.close();
    }
}
