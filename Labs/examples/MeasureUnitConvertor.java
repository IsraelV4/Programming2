package Labs.examples;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MeasureUnitConvertor extends JFrame implements ActionListener{
    JTextField a = new JTextField();
    JTextField b = new JTextField();
    JButton button = new JButton("Convert");
    JButton button2 = new JButton("Clear");

    public MeasureUnitConvertor() {
        super("Measure Unit Converter");
        setLocation(300,200);
        setSize(300,250);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);


        setLayout(new GridLayout(3, 2, 5, 5));
        add(new JLabel(" Pounds"));
        add(a);
        add(new JLabel(" Kilo"));
        add(b);

        
        button.addActionListener(this);
        add(button);
        button2.addActionListener(this);
        add(button2);
        
    }

    public static void main(String[] args) {
        MeasureUnitConvertor m = new MeasureUnitConvertor();
        m.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() instanceof JButton) {
            if (e.getSource()==button) {
                double d;
                String tmp1 = a.getText();
                String tmp2 = b.getText();
                if (tmp1.equals("")) {
                    d = Double.parseDouble(tmp2);
                    d/=2.205;
                    a.setText(""+d);
                }
                else {
                    d = Double.parseDouble(tmp1);
                    d*=2.205;
                    b.setText(""+d);
                }
            }
            else {
                a.setText("");
                b.setText("");
            }
        }
        else {
            throw new UnsupportedOperationException("Unimplemented method 'actionPerformed'");

        }
    }
}
