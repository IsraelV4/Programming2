import java.awt.BorderLayout;
import javax.swing.*;

public class BorderLayoutExample extends JFrame {
    public BorderLayoutExample(String n) {
        super(n);
        setSize(300, 300);
        add(new JButton("NORTH"), BorderLayout.NORTH);
        add(new JButton("EAST"), BorderLayout.EAST);
        add(new JButton("SOUTH"), BorderLayout.SOUTH);
        add(new JButton("WEST"), BorderLayout.WEST);
        add(new JButton("CENTER"), BorderLayout.CENTER);
    }

    public static void main(String[] args) {
        BorderLayoutExample b = new BorderLayoutExample("Ex");
        b.setVisible(true);
    }
}