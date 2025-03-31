package Project;


import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Political extends JFrame implements ActionListener {

    /*
1. Request some information from voter --> 
2. Request what party a voter wish to vote for in presidential election
3. Request for the party in Senate, House and Governorship elections
4. Disallow double voting
5. Display number of people voted, democratic votes, republican vote and others
6. Display the political party that wins in each election
     */

    //
    JTextField[] info = new JTextField[11];

    JButton button = new JButton("Send");
    String[] data = new String[] {"First", "Middle", "Last", "SSN", "number", "address line 1", "address line 2", "street"," zip code", "city", "state"};

    public Political(String name) {
        super(name);
        setLocation(0,0);
        setSize(500,500);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);

        setLayout(new GridLayout(info.length+2, 3, 5, 5));
        add(new JLabel("Please enter your information here"));
        add(new JLabel()); add(new JLabel());
        for (int i=0; i<info.length; i++) {
            info[i] = new JTextField();
            add(new JLabel( " "+data[i]));
            add(new JLabel());
            add(info[i]);
        }
        add(button, BorderLayout.SOUTH);
    }

    
    public static void main(String[] args) {
        Political frame = new Political("Political Project");
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'actionPerformed'");
    }
}