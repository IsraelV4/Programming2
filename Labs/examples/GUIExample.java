package Labs.examples;
import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class GUIExample {
    public static void main(String[] args) {
        JFrame f = new JFrame("Chat Screen");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(400, 400);
        JMenuBar mb = new JMenuBar();
        JMenu m = new JMenu("File");
        JMenu mh = new JMenu("Help");
        mb.add(m);
        mb.add(mh);

        JMenuItem I1 = new JMenuItem("new file");
        JMenuItem I2 = new JMenuItem("Save as");

        mb.add(I1);
        mb.add(I2);

        JTextArea t = new JTextArea();

        JPanel p = new JPanel();







        JButton s = new JButton("Send");
        JButton r = new JButton("Reset");
        p.add(t);
        p.add(r);
        p.add(s);

        f.getContentPane().add(BorderLayout.SOUTH, p);
        f.getContentPane().add(BorderLayout.NORTH, mb);
        f.getContentPane().add(BorderLayout.CENTER, t);

        f.setVisible(true);

    }
}
