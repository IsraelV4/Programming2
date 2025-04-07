package Project;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Vote extends JFrame implements ActionListener{

    /*
2. Request what party a voter wish to vote for in presidential election
3. Request for the party in Senate, House and Governorship elections
     */

    JPanel panel = new JPanel();
    JButton button = new JButton("Confirm");
    String[] choices = { "---", "Republican: Jerry Irwin", "Democratic: Israel John", "Conservative: Angilina Amelia", "Green: Samantha Scones", "Independent: ChatGPT" };
    int cycle = 0;
    JLabel label = new JLabel("Select a Presidential Candidate and press Confirm to vote for them");
    JComboBox<String> cb = new JComboBox<String>(choices);
    String selected = "---";
    JLabel er = new JLabel();
    JButton results = new JButton("See Results");



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
        setVisible(true);
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
            if (cycle==0) {
                choices = new String[] { "---", "Republican: Jive Jay", "Democratic: Alethea Velazquez", "Conservative: Blue Bird", "Green: Bushra Ray", "Independent: Alexander the Great" };
                cb.removeAllItems();
                for (int i=0; i<choices.length; i++) {
                    cb.addItem(choices[i]);
                }
                cycle++;
                label.setText("Select a Senate Candidate and press Confirm to vote for them");
            }
            else if (cycle==1) {
                choices = new String[] { "---", "Republican: Sam Syer", "Democratic: Alan Turner", "Conservative: Carry Carlson", "Green: Anigla Bell", "Independent: Bond, James Bond" };
                cb.removeAllItems();
                for (int i=0; i<choices.length; i++) {
                    cb.addItem(choices[i]);
                }
                cycle++;
                label.setText("Select a House Candidate you'd like to vote for and press Confirm to vote for them");
            }
            else if (cycle==2) {
                choices = new String[] { "---", "Republican: Berry Vad", "Democratic: Veary Gud", "Conservative: Allsoh tareibil", "Green: Raven Yeng", "Independent: Bruce Wayne" };
                cb.removeAllItems();
                for (int i=0; i<choices.length; i++) {
                    cb.addItem(choices[i]);
                }
                cycle++;
                label.setText("<html> Select a Governship Candidate you'd like to vote for and press Confirm to vote for them </html>");
            }
            else {
                label.setText("<html>Excellent, your vote and information has been successfully recorded. Thank you for contributing!<br><br><br> If you'd like to see the results, please press the 'See Results' button</html>");
                panel.remove(cb);
                panel.remove(button);
                panel.add(results);
                panel.revalidate();
                panel.repaint();
            }
        }
        else if (e.getSource()==cb && cb.getSelectedItem()!=null) {
            selected = (String)cb.getSelectedItem();
        }
        else if (e.getSource()==results) {


            /*
             * 
             * 
             * RUN Result JFrame here
             * 
             * 
             * 
             */



        }
        else {
            er.setText("Invalid choice, please try again");
        }
    }
}