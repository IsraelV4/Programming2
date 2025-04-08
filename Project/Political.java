package Project;


import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

import javax.swing.*;

public class Political extends JFrame implements ActionListener {

    /*
    A - Check
1. Request some information from voter

    B - Check
2. Request what party a voter wish to vote for in presidential election
3. Request for the party in Senate, House and Governorship elections

    AB - Check
4. Disallow double voting

    BC
5. Display number of people voted, democratic votes, republican vote and others
6. Display the political party that wins in each election
     */

    //
    JTextField[] info = new JTextField[11];

    JButton button = new JButton("Send");
    String[] data = new String[] {"First name", "Middle name (Optional)", "Last name", "SSN", "phone number", "address line 1", "address line 2 (Optional)", "street address"," zip code", "city", "state"};
    JLabel error = new JLabel("");
    int action = 0;
    String[] tmp;
    ArrayList<String[]> voters = new ArrayList<>();

    public Political(String name) {
        super(name);
        setLocation(0,0);
        setSize(500,500);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        

        setLayout(new GridLayout(info.length+2, 3, 5, 5));
        add(new JLabel("Please enter"));
        add(new JLabel("your information")); add(new JLabel("                  here"));
        for (int i=0; i<info.length; i++) {
            info[i] = new JTextField();
            add(new JLabel( " "+data[i]));
            add(new JLabel());
            add(info[i]);
        }
        button.addActionListener(this);
        add(button);
        add(error);
    }

    public Political(String name, ArrayList<String[]> v) {
        super(name);
        voters = v;
        setLocation(0,0);
        setSize(500,500);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        

        setLayout(new GridLayout(info.length+2, 3, 5, 5));
        add(new JLabel("Please enter"));
        add(new JLabel("your information")); add(new JLabel("                  here"));
        for (int i=0; i<info.length; i++) {
            info[i] = new JTextField();
            add(new JLabel( " "+data[i]));
            add(new JLabel());
            add(info[i]);
        }
        button.addActionListener(this);
        add(button);
        add(error);
    }

    
    public static void main(String[] args) {
        Political frame = new Political("Political Project");
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==button) {
            tmp = new String[info.length];
            for (int i=0; i<tmp.length; i++) {
                tmp[i] = info[i].getText();
                if (i!=1 && i!=6 && tmp[i].equals("")) {
                    error.setText("<html>"+"Invalid information, please fix your [" + data[i] + "]" + "</html>");
                    return;
                }
            }
            if (!Result.canVote(tmp, voters)) {
                error.setText("<html>Invalid information, already voted");
                return;
            }
            error.setText("");
            setVisible(false);
            action = 1;
        }
        else {
            throw new UnsupportedOperationException("Unimplemented method 'actionPerformed'");
        }
    }
}