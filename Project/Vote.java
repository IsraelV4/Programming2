package Project;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Vote extends JFrame implements ActionListener{

    /*
2. Request what party a voter wish to vote for in presidential election
3. Request for the party in Senate, House and Governorship elections
     */

    JPanel panel = new JPanel(); // Panel the User will see
    JButton button = new JButton("Confirm"); // Confirm button to confirm vote
    String[] choices = { "---", "(0) Republican: Jerry Irwin", "(1) Democratic: Israel John", 
    "(2) Conservative: Angilina Amelia", "(3) Green: Samantha Scones",
     "(4) Independent: ChatGPT" }; // Original choices to vote for. This will change in the future

    int cycle = 0; // Determines which election you're voting for (Presidential/Senate/House/Governship)
    JLabel label = new JLabel("Select a Presidential Candidate and press Confirm to vote for them");
    // Text the user will read to help them know what to do

    JComboBox<String> cb = new JComboBox<String>(choices); // Stores the choices
    String selected = "---"; // What choice the user has selected in the drop-box
    JLabel er = new JLabel(); // Only in use if the user makes an invalid choice "---"
    JButton results = new JButton("Submit vote"); // Button at the end to see the results of the election
    int action = 0; // Tells the main what this panel is doing

    String prev = ""; // Stores the candidate the user just voted for



    public Vote(String name) { // Consturcotr for the Panel where users can choose who to vote for
        super(name);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500, 500);
        setLocation(0, 0);

        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        label.setAlignmentX(Component.CENTER_ALIGNMENT);
        panel.add(label);
        
        cb.setMaximumSize(cb.getPreferredSize());
        cb.setAlignmentX(Component.CENTER_ALIGNMENT);
        panel.add(cb);

        button.setAlignmentX(Component.CENTER_ALIGNMENT);
        panel.add(button);
        
        
        button.addActionListener(this);
        cb.addActionListener(this);

        er.setAlignmentX(Component.BOTTOM_ALIGNMENT);
        panel.add(er);


        add(panel);
    }

    public static void main(String[] args) { // Not in use. Just for debugging
        Vote frame = new Vote("Political Project part 2");
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) { 
        // Runs when the user presses a "confirm", "see results" button, or selects an option in the drop-box
        er.setText(""); // Resets the error statement
        if (e.getSource()==button && !selected.equals("---")) {
            // Only runs if the user has selected a valid candidate and hits confirm
            action = -1;
            prev = selected;
            if (cycle==0) { // Sets the Senate Choices
                choices = new String[] { "---", "(0) Republican: Jive Jay", "(1) Democratic: Alethea Velazquez", "(2) Conservative: Blue Bird", "(3) Green: Bushra Ray", "(4) Independent: Alexander the Great" };
                cb.removeAllItems();
                for (int i=0; i<choices.length; i++) {
                    cb.addItem(choices[i]);
                }
                cycle++;
                label.setText("Select a Senate Candidate and press Confirm to vote for them");
            }
            else if (cycle==1) { // Sets the House choices
                choices = new String[] { "---", "(0) Republican: Sam Syer", "(1) Democratic: Alan Turner", "(2) Conservative: Carry Carlson", "(3) Green: Anigla Bell", "(4) Independent: Bond, James Bond" };
                cb.removeAllItems();
                for (int i=0; i<choices.length; i++) {
                    cb.addItem(choices[i]);
                }
                cycle++;
                label.setText("Select a House Candidate you'd like to vote for and press Confirm to vote for them");
            }
            else if (cycle==2) { // Sets the Governship choices
                choices = new String[] { "---", "(0) Republican: Berry Vad", "(1) Democratic: Veary Gud", "(2) Conservative: Allsoh tareibil", "(3) Green: Raven Yeng", "(4) Independent: Bruce Wayne" };
                cb.removeAllItems();
                for (int i=0; i<choices.length; i++) {
                    cb.addItem(choices[i]);
                }
                cycle++;
                label.setText("<html> Select a Governship Candidate you'd like to vote for and press Confirm to vote for them </html>");
            }
            else { // Once all candiates have been voted for, allows user to see the results
                cycle++;
                label.setText("<html>Excellent, your vote and information has been successfully recorded. Thank you for contributing!</html>");
                panel.remove(cb);
                panel.remove(button);
                panel.add(results);
                results.addActionListener(this);
                panel.revalidate();
                panel.repaint();
            }
        }
        else if (e.getSource()==cb && cb.getSelectedItem()!=null) { 
            //Runs if the user selects a candidate in the dropbox
            selected = (String)cb.getSelectedItem();
        }
        else if (e.getSource()==results) {
            // Runs if the "results" button is pressed
            setVisible(false);
            action = 1;
        }
        else {
            // Only runs if the confirm button is pressed and "---" is selected
            er.setText("Invalid choice, please try again");
        }
    }
}