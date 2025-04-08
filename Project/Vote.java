package Project;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class Vote extends JFrame implements ActionListener{

    /*
2. Request what party a voter wish to vote for in presidential election
3. Request for the party in Senate, House and Governorship elections
     */

    JPanel panel = new JPanel();
    JButton button = new JButton("Confirm");
    String[] choices = { "---", "(0) Republican: Jerry Irwin", "(1) Democratic: Israel John", "(2) Conservative: Angilina Amelia", "(3) Green: Samantha Scones", "(4) Independent: ChatGPT" };
    int cycle = 0;
    JLabel label = new JLabel("Select a Presidential Candidate and press Confirm to vote for them");
    JComboBox<String> cb = new JComboBox<String>(choices);
    String selected = "---";
    JLabel er = new JLabel();
    JButton results = new JButton("See Results");
    int action = 0;

    String prev = "";



    public Vote(String name) {
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

    public static void main(String[] args) {
        Vote frame = new Vote("Political Project part 2");
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        er.setText("");
        /*3. Request for the party in Senate, House and Governorship elections*/
        if (e.getSource()==button && !selected.equals("---")) {
            action = -1;
            prev = selected;
            if (cycle==0) {
                choices = new String[] { "---", "(0) Republican: Jive Jay", "(1) Democratic: Alethea Velazquez", "(2) Conservative: Blue Bird", "(3) Green: Bushra Ray", "(4) Independent: Alexander the Great" };
                cb.removeAllItems();
                for (int i=0; i<choices.length; i++) {
                    cb.addItem(choices[i]);
                }
                cycle++;
                label.setText("Select a Senate Candidate and press Confirm to vote for them");
            }
            else if (cycle==1) {
                choices = new String[] { "---", "(0) Republican: Sam Syer", "(1) Democratic: Alan Turner", "(2) Conservative: Carry Carlson", "(3) Green: Anigla Bell", "(4) Independent: Bond, James Bond" };
                cb.removeAllItems();
                for (int i=0; i<choices.length; i++) {
                    cb.addItem(choices[i]);
                }
                cycle++;
                label.setText("Select a House Candidate you'd like to vote for and press Confirm to vote for them");
            }
            else if (cycle==2) {
                choices = new String[] { "---", "(0) Republican: Berry Vad", "(1) Democratic: Veary Gud", "(2) Conservative: Allsoh tareibil", "(3) Green: Raven Yeng", "(4) Independent: Bruce Wayne" };
                cb.removeAllItems();
                for (int i=0; i<choices.length; i++) {
                    cb.addItem(choices[i]);
                }
                cycle++;
                label.setText("<html> Select a Governship Candidate you'd like to vote for and press Confirm to vote for them </html>");
            }
            else {
                cycle++;
                label.setText("<html>Excellent, your vote and information has been successfully recorded. Thank you for contributing!<br><br><br> If you'd like to see the results, please press the 'See Results' button</html>");
                panel.remove(cb);
                panel.remove(button);
                panel.add(results);
                results.addActionListener(this);
                panel.revalidate();
                panel.repaint();
            }
        }
        else if (e.getSource()==cb && cb.getSelectedItem()!=null) {
            selected = (String)cb.getSelectedItem();
        }
        else if (e.getSource()==results) {
            setVisible(false);
            action = 1;
        }
        else {
            er.setText("Invalid choice, please try again");
        }
    }
}