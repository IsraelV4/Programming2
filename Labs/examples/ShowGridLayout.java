package Labs.examples;
import javax.swing.*;
import java.awt.*;

public class ShowGridLayout extends JFrame {
    public ShowGridLayout() {
        setLayout(new GridLayout(3, 2, 5, 5));
        add(new JLabel("First Name"));
        add(new JTextField(10));
        add(new JLabel("MI"));
        add(new JTextField(4));
        add(new JLabel("Last Name"));
        add(new JTextField(15));
    }

    public static void main(String[] args) {
        ShowGridLayout g = new ShowGridLayout();
        g.setTitle("ShwoGridLayout");
        g.setSize(200, 125);
        g.setLocationRelativeTo(null);
        g.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        g.setVisible(true);
    }
}