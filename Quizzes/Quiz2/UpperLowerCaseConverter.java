package Quizzes.Quiz2;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class UpperLowerCaseConverter extends JFrame implements ActionListener {

    JTextField text = new JTextField(10);
    JTextArea a = new JTextArea();
    JButton button = new JButton("UPPERCASE");
    JButton button2 = new JButton("CLEARCASE");
    JButton button3 = new JButton("LOWERCASE");

    public UpperLowerCaseConverter() {
        super("Upper/Lower Case Converter");
        setLocation(0,0);
        setSize(800,1000);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        JPanel p = new JPanel(null);
        p.setBackground(Color.PINK);
        
        JLabel info = new JLabel("ENTER TEXT");
        
        add(text);

        
        button.addActionListener(this);
        button.setBounds(100, 10, 150, 30);
        add(button);

        button3.addActionListener(this);
        button3.setBounds(280, 10, 150, 30);
        add(button3);

        button2.addActionListener(this);
        button2.setBounds(460, 10, 150, 30);
        add(button2);
        a.setBounds(140, 500, 500, 30);
        add(a);

        info.setBounds(40, 500, 100, 30);
        add(info);

        add(p);
    }

    public static void main(String[] args) {
        UpperLowerCaseConverter a = new UpperLowerCaseConverter();
        a.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == text || e.getSource() instanceof JButton) {
            if (e.getSource()==button) {
                a.setText(a.getText().toUpperCase());
            }
            else if (e.getSource()==button3) {
                a.setText(a.getText().toLowerCase());
            }
            else {
                a.setText("");
            }
        }
        else {
            throw new UnsupportedOperationException("Unimplemented method 'actionPerformed'");
        }
        
    }
}
