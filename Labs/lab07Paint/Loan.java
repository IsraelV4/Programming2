package Labs.lab07Paint;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;

public class Loan extends JFrame implements ActionListener {
    JButton button = new JButton("<html>"+"Compute Payment"+"</html>");
    JTextArea a = new JTextArea();
    JTextArea b = new JTextArea();
    JTextArea c = new JTextArea();
    JTextArea d = new JTextArea();
    JTextArea e = new JTextArea();

    public Loan() {
        setTitle("Paint");
        setSize(300, 250);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(7, 2, 5, 5));
        add(new JLabel("<html>"+"Enter loan amount, interest rate, and year"+"<html>"));
        add(new JLabel());
        add(new JLabel("Annual Interest Rate"));
        a.setBackground(Color.YELLOW);
        add(a);
        add(new JLabel("Number of years"));
        b.setBackground(Color.YELLOW);
        add(b);
        add(new JLabel("Loan Amount"));
        c.setBackground(Color.YELLOW);
        add(c);
        add(new JLabel("Monthly Payment"));
        add(d);
        add(new JLabel("Total Payment"));
        add(e);
        add(new JLabel());

        add(button);
        button.addActionListener(this);
        setVisible(true);
    }

    public static void main(String[] args) {
        Loan l = new Loan();
        l.setVisible(true);
    }
/*
 * M = P [ i(1 + i)^n ] / [ (1 + i)^n – 1], where M is the monthly payment, 
 * P is the loan amount, i is the monthly interest rate (annual rate divided 
 * by 12), and n is  the total number of payments (years * 12)
 */
    @Override
    public void actionPerformed(ActionEvent f) {
       double i = Double.parseDouble(a.getText())/1200;
       int n = Integer.parseInt(b.getText())*12;
       double p = Double.parseDouble(c.getText());
       double mp = p * (i*Math.pow(1+i,n))/(Math.pow(1+i,n)-1);
       double total = mp*n;
       d.setText(""+Math.round(mp*100)/100.0);
       e.setText("" + Math.round(total*100)/100.0);
    }
         
}
