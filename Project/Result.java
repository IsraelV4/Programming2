package Project;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;

public class Result extends JFrame implements ActionListener {

    String[] Parties = new String[] {"Republican", "Democratic", "Conservative", "Green", "Independent", "Total Votes"};
    int[][] votes = new int[4][6]; // {R, D, C, G, I, T},
    ArrayList<String[]> voters = new ArrayList<String[]>();
    JLabel[][] text = new JLabel[votes.length+1][Parties.length+2];
    String[] Category = new String[] {"Presidency", "Senate", "House", "Governance"};
    JButton button = new JButton("<html>New Vote</html>");


    public Result(String name) {
        super(name);
        setLocation(0,0);
        setSize(500,500);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setLayout(new GridLayout(text.length+1, text[0].length, 5, 5));

        text[0][0] = new JLabel("Election Type: ");
        for (int i=0; i<Parties.length; i++) {
            text[0][i+1] = new JLabel(Parties[i]);
        }
        text[0][text[0].length-1] = new JLabel("Winner of Election");

        for (int i=0; i<votes[0].length; i++) {
            for (int j=0; j<votes.length; j++) {
                text[j+1][0] = new JLabel(Category[j]);
                text[j+1][i+1] = new JLabel(""+votes[j][i]);
                text[j+1][text[j].length-1] = new JLabel("N/A");
            }
        }

        for (int i=0; i<text.length; i++) {
            for (int j=0; j<text[0].length; j++) {
                text[i][j].setText("<html>" + text[i][j].getText()+"</html>");
                add(text[i][j]);  
            }
        }
        button.addActionListener(this);
        add(new JLabel());add(new JLabel());add(new JLabel());
        add(button);
        add(new JLabel());add(new JLabel());add(new JLabel());add(new JLabel());
    }

    public void recieveVoter(String[] arr) {
        voters.add(Arrays.copyOf(arr, arr.length));
    }

    public boolean canVote(String[] arr) {
        for (int i=0; i<voters.size(); i++) {
            if (Arrays.equals(voters.get(i),arr)) {
                return false;
            }
        }
        recieveVoter(arr);
        return true;
    }

    public void recieveVote(int i, String vote) {
        votes[i][vote.charAt(1)-'0']++;
        votes[i][5]++;
        if (i==votes.length) {
            updateVote();
        }
    }

    public void updateVote() {
        for (int i=0; i<votes[0].length; i++) {
            for (int j=0; j<votes.length; j++) {
                text[j+1][i+1] = new JLabel(""+votes[j][i]);
            }
        }
    }

    public static void main(String[] args) {
        Result frame = new Result("Results Page");
        frame.setVisible(true);


        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==button) {

        }
    }

}