import javax.swing.*;
public class UpperCaseConverter extends JFrame {
    public UpperCaseConverter() {
        super("Upper Case Converter");
        setLocation(100,100);
        setSize(480,320);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
    
    public static void main(String[] args) {
        UpperCaseConverter u = new UpperCaseConverter();
        u.setVisible(true);

    }
}
