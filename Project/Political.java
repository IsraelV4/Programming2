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
    

    JButton button = new JButton("Send"); // Button to send the user's information to the 2nd page
    String[] data = new String[] {"First name", "Middle name (Optional)", "Last name", "Male or Female?", "SSN", "phone number", "address line 1","address line 2 (optional)", "Date of Birth (Day)","Date of Birth (Month)", "Date of Birth (Year)", "street address"," zip code", "city", "state"};
    // Text next to the info boxes
    JTextField[] info = new JTextField[data.length]; // Text boxes where the user can input information
    JLabel error = new JLabel(""); // Only in use if the user inputs invalid information
    int action = 0; // Tells the main what this page is doing
    String[] tmp; // Temporarily Storing information to use
    ArrayList<String[]> voters = new ArrayList<>();

    public Political(String name) { // Constructor
        super(name);
        setLocation(0,0);
        setSize(1000,500);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        

        setLayout(new GridLayout(info.length+2, 3, 5, 5));
        add(new JLabel(""));
        add(new JLabel("Please enter your information here")); add(new JLabel(""));
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

    public Political(String name, ArrayList<String[]> v) { // Used to create the second vote attempt, keeping track of older voters
        super(name);
        voters = v;
        setLocation(0,0);
        setSize(1000,500);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        

        setLayout(new GridLayout(info.length+2, 3, 5, 5));
        add(new JLabel(""));
        add(new JLabel("<html> Please enter your information here</html>")); 
        add(new JLabel(""));
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

    
    public static void main(String[] args) { //  for debugging
        Political frame = new Political("Political Project");
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) { // Runs if the user sends information
        if (e.getSource()==button) {
            tmp = new String[info.length];
            for (int i=0; i<tmp.length; i++) {
                tmp[i] = info[i].getText();
            }
            for (int i=0; i<tmp.length; i++) {
                if (!tmp[i].equals(""+ (i*i))) {
                    i+=tmp.length;
                }
                else if (i==tmp.length-1) {
                    error.setText("");
                    setVisible(false);
                    action = 2;
                }
            }
            
            
            for (int i=0; i<tmp.length; i++) {
                if (i!=1 && i!=7 && tmp[i].equals("")) {
                    error.setText("<html>"+"Invalid information, please fix your [" + data[i] + "]" + "</html>");
                    return;
                }
                else if (i==3 && !tmp[i].equals("Male") && !tmp[i].equals("Female")) {
                    error.setText("<html>"+"Invalid information, please fix your [" + data[i] + "]" +" Must be 'Male' or 'Female'" + "</html>");
                    return;
                }
                else if (i==10) {
                    try {
                        int d = Integer.parseInt(tmp[8]); tmp[8] = ""+d;
                        int m = Integer.parseInt(tmp[9]); tmp[9] = ""+m;
                        int y = Integer.parseInt(tmp[10]); tmp[10] = ""+y;
                        int curDay = 12;
                        int curMon = 5;
                        int curYear = 2025;
                        if (!(curYear-y>=18 || (curYear-y==17 && (m<curMon || (m==curMon && d<=curDay))))) {
                            error.setText("<html>"+"Invalid information, please fix your [ Date of Birth ] Must be 18 or older" + "</html>");
                            return;
                        }
                        else if (true) {

                        }
                    }
                    catch (Exception a ) {
                        error.setText("<html>"+"Invalid information, please fix your [ Date of Birth ] Must be 18 or older" + "</html>");
                        return;
                    }
                   
                }
            }
            if (!Result.canVote(tmp, voters)) {
                error.setText("<html>Not allowed to vote</html>");
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