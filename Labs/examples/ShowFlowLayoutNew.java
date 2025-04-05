package Labs.examples;
import javax.swing.JFrame;
import javax.swing.*;
import java.awt.Container;
import java.awt.FlowLayout;

public class ShowFlowLayoutNew extends JFrame {

    public ShowFlowLayoutNew() {
        Container c = getContentPane();
        c.setLayout(new FlowLayout(FlowLayout.LEFT, 10, 20));

        c.add(new JLabel("First Name"));
        c.add(new JTextField(10));
        c.add(new JLabel("MI"));
        c.add(new JTextField(4));
        c.add(new JLabel("Last Name"));
        c.add(new JTextField(15));
    }

    public static void main(String[] args) {
        ShowFlowLayoutNew f = new ShowFlowLayoutNew();
        f.setSize(500, 100);
        f.setVisible(true);
       
    }

    
    
}
