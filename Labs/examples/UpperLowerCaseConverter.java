import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class UpperLowerCaseConverter extends JFrame implements ActionListener {

    JTextField text = new JTextField(10);
    JTextArea a = new JTextArea();
    JButton button = new JButton("SEND");
    JButton button2 = new JButton("Clear");

    public UpperLowerCaseConverter() {
        super("Upper/Lower Case Converter");
        setLocation(0,0);
        setSize(600,500);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setLayout(new GridLayout(20, 10, 5, 5));
        add(new JLabel("Enter your text here, and I will change the Uppercases to lower cases and vice versa"));
        
        add(text);

        
        button.addActionListener(this);
        add(button);
        button2.addActionListener(this);
        add(button2);
        
        add(a);
    }

    public static void main(String[] args) {
        UpperLowerCaseConverter a = new UpperLowerCaseConverter();
        a.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        if (e.getSource() == text || e.getSource() instanceof JButton) {
            if (e.getSource()==button) {
                String input = text.getText();
                String tmp = " ";
                for (int i=0; i<input.length(); i++) {
                    if (Character.isUpperCase(input.charAt(i))) {
                        tmp+=""+(char)(input.charAt(i)-('A'-'a'));
                    }
                    else {
                        tmp+=""+(char)(input.charAt(i)+('A'-'a'));
                    }
                }
                a.setText(tmp);
                text.setText(""); // Clear the text field
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
